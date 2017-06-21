package jp.genuine.training.scheduler.web;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonProcessingException;

import jp.genuine.training.scheduler.model.calendar.Event;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.schedule.ScheduleRegisterService;

@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	ScheduleRegisterService scheduleRegisterService;

	@RequestMapping(value="", method=RequestMethod.GET)
    public String show(Model model, HttpServletRequest request) throws JsonProcessingException{
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		// 全てのスケジュールを取得
		List<Schedule> scheduleList = scheduleRegisterService.selectAll(loginUser);
		List<Event> eventList = new ArrayList<>();

		// 取得したスケジュールをイベントオブジェクトに格納
		for (Schedule schedule : scheduleList){
			Event event = new Event();
			// イベントオブジェクト生成
			event.setId(Integer.toString(schedule.getScheduleId().getValue()));
			event.setTitle(schedule.getPerformanceName().getValue());

			// 日付変換
			String scheduleDate = DateTimeFormatter.ofPattern("yyyy-MM-dd").format(schedule.getScheduledDate().getValue());
			String startDate =  scheduleDate + "T" + schedule.getOpenTime().getOpen();
			String endDate = scheduleDate + "T" + schedule.getStartTime().getStart();
			event.setStart(startDate);
			event.setEnd(endDate);
			eventList.add(event);
		}

		// イベントリストをマッピング
		model.addAttribute("performanceIndex",eventList);

		return "/index/index";
	}

}
