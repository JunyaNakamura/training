package jp.genuine.training.scheduler.web.schedule;

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
import jp.genuine.training.scheduler.service.performance.PerformanceModifyService;

@Controller
@SessionAttributes("scheduleModify")
@RequestMapping("/schedule/modify")
public class ScheduleModifyController {
	@Autowired
	private PerformanceModifyService performanceModifyService;

	@RequestMapping(value="/{performanceId}",method=RequestMethod.GET)
	public String modify(
			@PathVariable("performanceId") Integer performanceId,
		Model model,
		WebRequest request)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		Performance performanceModify = performanceModifyService.findBy(new PerformanceId(performanceId),loginUser);
		model.addAttribute("performanceModify",performanceModify);
		return "/performance/modify/form";
	}

	@RequestMapping(value="",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("performanceModify") Performance performance,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest httpServletRequest){

		model.addAttribute("performanceModify",performance);

		if(bindingResult.hasErrors())
			return "/performance/modify/form";

		performanceModifyService.modify(performance);

		return "/performance/modify/completed";

	}
}
