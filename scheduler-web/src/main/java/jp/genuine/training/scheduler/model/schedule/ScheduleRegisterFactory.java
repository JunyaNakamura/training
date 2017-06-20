package jp.genuine.training.scheduler.model.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.genuine.training.scheduler.model.performance.PerformanceId;

@Component
public class ScheduleRegisterFactory {
	@Autowired
	private ScheduleRegisterRepository scheduleRegisterRepository;

	public Schedule create(PerformanceId performanceId){
		ScheduleId scheduleId = scheduleRegisterRepository.nextId();
		Schedule schedule = new Schedule(scheduleId,performanceId, null);
		return schedule;
	}
}
