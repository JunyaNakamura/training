package jp.genuine.training.scheduler.model.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.UserId;

@Component
public class ScheduleRegisterFactory {
	@Autowired
	private ScheduleRegisterRepository scheduleRegisterRepository;

	public Schedule create(PerformanceId performanceId, UserId userId){
		ScheduleId scheduleId = scheduleRegisterRepository.nextId();
		Schedule schedule = new Schedule(scheduleId,performanceId);
		return schedule;
	}
}
