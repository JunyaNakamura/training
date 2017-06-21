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

import jp.genuine.training.scheduler.model.schedule.OpenTime;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.schedule.StartTime;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.schedule.ScheduleDetailService;

@Controller
@SessionAttributes("scheduleModify")
@RequestMapping("/schedule/modify")
public class ScheduleModifyController {
	@Autowired
	private ScheduleDetailService scheduleDetailService;

	@RequestMapping(value="/{scheduleId}",method=RequestMethod.GET)
	public String modify(
			@PathVariable("scheduleId") Integer scheduleId,
		Model model,
		WebRequest request)
	{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		Schedule scheduleModify = scheduleDetailService.findBy(new ScheduleId(scheduleId),loginUser);

		// 開場時間の整形
		String openTime = scheduleModify.getOpenTime().getSubOpen();
		scheduleModify.setOpenTime(new OpenTime(openTime));

		// 開園時間の整形
		String startTime = scheduleModify.getStartTime().getSubStart();
		scheduleModify.setStartTime(new StartTime(startTime));

		model.addAttribute("scheduleModify",scheduleModify);
		return "/schedule/modify/form";
	}

	@RequestMapping(value="",method=RequestMethod.POST)
	public String execute(
			@Valid @ModelAttribute("scheduleModify") Schedule schedule,
			BindingResult bindingResult,
			@AuthenticationPrincipal LoginUser loginUser,
			Model model,
			HttpServletRequest httpServletRequest){

		model.addAttribute("scheduleModify",schedule);

		if(bindingResult.hasErrors())
			return "/schedule/modify/form";

		scheduleDetailService.modify(schedule);

		return "/schedule/modify/completed";

	}
}
