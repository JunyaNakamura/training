package jp.genuine.training.scheduler.model.schedule;

import java.util.Optional;

import jp.genuine.training.scheduler.model.user.User;

public interface ScheduleDetailRepository {
	public Optional<Schedule> findBy(ScheduleId scheduleId, User user);
	public void modify(Schedule schedule);
	public void delete(Schedule schedule);
}
