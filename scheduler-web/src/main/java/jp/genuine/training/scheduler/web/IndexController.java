package jp.genuine.training.scheduler.web;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.genuine.training.scheduler.model.calendar.Event;
import jp.genuine.training.scheduler.model.enumeration.EnumCalendarType;
import jp.genuine.training.scheduler.model.performance.PerformanceOverview;
import jp.genuine.training.scheduler.model.performance.PerformanceOverviewList;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.service.performance.PerformanceOverviewListService;
import jp.genuine.training.scheduler.service.schedule.ScheduleRegisterService;

@Controller
@RequestMapping("/index")
public class IndexController {

	@Autowired
	ScheduleRegisterService scheduleRegisterService;

	@Autowired
	PerformanceOverviewListService performanceOverviewListService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String show(Model model, HttpServletRequest request) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		LoginUser loginUser = (LoginUser) authentication.getPrincipal();

		// 全てのスケジュールを取得
		List<Schedule> scheduleList = scheduleRegisterService.selectAll(loginUser);
		List<Event> eventList = new ArrayList<>();

		// 取得したスケジュールをイベントオブジェクトに格納
		for (Schedule schedule : scheduleList) {
			Event event = new Event();
			// イベントオブジェクト生成
			String eventId = Integer.toString(schedule.getScheduleId().getValue());
			event.setId(eventId);
			event.setTitle(schedule.getPerformanceName().getValue());
			event.setUrl("schedule/detail/" + eventId);

			// 日付変換
			String scheduleDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
					.format(schedule.getScheduledDate().getValue());
			String startDate = scheduleDate + "T" + schedule.getOpenTime().getOpen();
			String endDate = scheduleDate + "T" + schedule.getStartTime().getStart();
			event.setStart(startDate);
			event.setEnd(endDate);
			eventList.add(event);
		}

		// イベントリストをマッピング
		model.addAttribute("performanceIndex", eventList);

		return "/index/index";
	}

	@RequestMapping(value = "/{calendarType}", method = RequestMethod.GET)
	@ResponseBody
	public List<Event> doAjax(@PathVariable("calendarType") Integer calendarType,
			@AuthenticationPrincipal LoginUser loginUser, Model model, HttpServletRequest request) {

		List<Event> eventList = new ArrayList<>();

		// 全てのスケジュールを取得
		if (EnumCalendarType.SCHEDULE.equals(EnumCalendarType.valueOf(calendarType))) {
			List<Schedule> scheduleList = scheduleRegisterService.selectAll(loginUser);

			// 取得したスケジュールをイベントオブジェクトに格納
			for (Schedule schedule : scheduleList) {
				Event event = new Event();
				// イベントオブジェクト生成
				String eventId = Integer.toString(schedule.getScheduleId().getValue());
				event.setId(eventId);
				event.setTitle(schedule.getPerformanceName().getValue());
				event.setUrl("schedule/detail/" + eventId);

				// 日付変換
				String scheduleDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
						.format(schedule.getScheduledDate().getValue());
				String startDate = scheduleDate + "T" + schedule.getOpenTime().getOpen();
				String endDate = scheduleDate + "T" + schedule.getStartTime().getStart();
				event.setStart(startDate);
				event.setEnd(endDate);
				eventList.add(event);
			}
		} else if (EnumCalendarType.PERFORMANCE.equals(EnumCalendarType.valueOf(calendarType))) {
			PerformanceOverviewList PerformanceOverviewList = performanceOverviewListService.listOf(loginUser);

			// 取得した公演概要をイベントオブジェクトに格納
			for (PerformanceOverview performanceOverview : PerformanceOverviewList.getList()) {
				Event event = new Event();
				// イベントオブジェクト生成
				String eventId = Integer.toString(performanceOverview.getPerformanceId().getValue());
				event.setId(eventId);
				event.setTitle(performanceOverview.getPerformanceName().getValue());
				event.setUrl("performance/detail/" + eventId);

				// 日付変換
				String performanceStartDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
						.format(performanceOverview.getPerformanceDateRange().getStart());
				String performanceEndDate = DateTimeFormatter.ofPattern("yyyy-MM-dd")
						.format(performanceOverview.getPerformanceDateRange().getEnd());

				event.setStart(performanceStartDate);
				event.setEnd(performanceEndDate);

				eventList.add(event);
			}
		}

		// イベントリストをマッピング
		model.addAttribute("events", eventList);
		return eventList;
	}

}
