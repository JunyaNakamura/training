package jp.genuine.training.scheduler.web.performanceregister;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceRegisterFactory;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.performance.PerformanceRegisterService;

@Controller
@SessionAttributes("performance")
@RequestMapping("/performance/register")
public class PerformanceRegisterController {
	@Autowired
	private PerformanceRegisterFactory performanceRegisterFactory;

	@Autowired
	private PerformanceRegisterService performanceRegisterService;

	@RequestMapping(value="",method=RequestMethod.GET)
	public String form(
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest request
			){
		Performance performance = performanceRegisterFactory.create(loginUser.getUser().getUserId());
		model.addAttribute("performance",performance);

		return "/performance/register/form";
	}

	@RequestMapping(value="",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("performance") Performance performance,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest httpServletRequest){

		model.addAttribute("performance",performance);

		if(bindingResult.hasErrors())
			return "/performance/register/form";

		performanceRegisterService.register(performance);

		return "/performance/register/completed";

	}
}
