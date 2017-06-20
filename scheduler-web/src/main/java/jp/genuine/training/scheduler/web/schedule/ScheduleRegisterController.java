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

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleRegisterFactory;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.schedule.ScheduleRegisterService;

@Controller
@SessionAttributes("schedule")
@RequestMapping("/schedule")
public class ScheduleRegisterController {
	@Autowired
	private ScheduleRegisterFactory scheduleRegisterFactory;

	@Autowired
	private ScheduleRegisterService scheduleRegisterService;


	@RequestMapping(value="/{performanceId}/register",method=RequestMethod.GET)
	public String form(
			@PathVariable("performanceId") Integer performanceId,
			Model performanceModel,
			Model shceduleModel,
			HttpServletRequest request
			){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();
		Performance performance = scheduleRegisterService.findBy(new PerformanceId(performanceId),loginUser);
		Schedule schedule = scheduleRegisterFactory.create(new PerformanceId(performanceId));
		performanceModel.addAttribute("performanceSchedule",performance);
		shceduleModel.addAttribute("schedule",schedule);

		return "/schedule/register/form";
	}
	@RequestMapping(value="",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("schedule") Schedule schedule,
			BindingResult bindingResult,
			@ModelAttribute("performanceSchedule")Performance performance,
			@AuthenticationPrincipal LoginUser loginUser,
			Model scheduleModel,
			Model performanceModel,
			HttpServletRequest httpServletRequest){
		scheduleModel.addAttribute("schedule",schedule);
		Performance performanceSchedule = scheduleRegisterService.findBy(schedule.getPerformanceId(),loginUser);
		performanceModel.addAttribute("performanceSchedule",performanceSchedule);

		if(bindingResult.hasErrors())
			return "/schedule/register/form";

		scheduleRegisterService.register(schedule);

		return "/schedule/register/completed";

	}
}
