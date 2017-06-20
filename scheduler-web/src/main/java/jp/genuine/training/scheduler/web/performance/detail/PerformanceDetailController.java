package jp.genuine.training.scheduler.web.performance.detail;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.performance.PerformanceDetailService;

@Controller
@SessionAttributes("performanceDetail")
@RequestMapping("/performance/detail")
public class PerformanceDetailController {

	@Autowired
	private PerformanceDetailService performanceDetailService;

	@RequestMapping(value="/{performanceId}",method=RequestMethod.GET)
	public String detail(
			@PathVariable("performanceId") Integer performanceId,
		Model model,
		WebRequest request)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		Performance performanceDetail = performanceDetailService.findBy(new PerformanceId(performanceId),loginUser);
		model.addAttribute("performanceDetail",performanceDetail);
		return "/performance/detail";
	}

	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("performanceDetail") Performance performance,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest httpServletRequest){

		model.addAttribute("performanceDetail",performance);

		if(bindingResult.hasErrors())
			return "/performance/detail";

		performanceDetailService.delete(performance);

		return "/performance/delete/completed";

	}
}
