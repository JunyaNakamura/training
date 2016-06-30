package jp.genuine.training.scheduler.model.schedule;

import java.util.Optional;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.User;

public interface ScheduleRegisterRepository {
	public Optional<Performance>findBy( PerformanceId performanceId, User user );
	public ScheduleId nextId();
	public void register(Schedule schedule);
}
