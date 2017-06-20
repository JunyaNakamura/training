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

import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.schedule.ScheduleDetailService;

@Controller
@SessionAttributes("scheduleDetail")
@RequestMapping("/schedule/detail")
public class ScheduleDetailController {

	@Autowired
	private ScheduleDetailService scheduleDetailService;

	@RequestMapping(value="/{scheduleId}",method=RequestMethod.GET)
	public String detail(
			@PathVariable("scheduleId") Integer scheduleId,
		Model model,
		WebRequest request)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		Schedule scheduleDetail = scheduleDetailService.findBy(new ScheduleId(scheduleId),loginUser);
		model.addAttribute("scheduleDetail",scheduleDetail);
		return "/schedule/detail";
	}

	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("scheduleDetail") Schedule schedule,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest httpServletRequest){

		model.addAttribute("scheduleDetail",schedule);

		if(bindingResult.hasErrors())
			return "/schedule/detail";

		scheduleDetailService.delete(schedule);

		return "/schedule/delete/completed";

	}
}
