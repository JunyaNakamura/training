package jp.genuine.training.scheduler.datasource.sampledb.schedule;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.schedule.ScheduleRegisterRepository;
import jp.genuine.training.scheduler.model.user.User;

@Repository
public class ScheduleRegisterDataSource implements ScheduleRegisterRepository{

	@Autowired
	public ScheduleRegisterMapper scheduleRegisterMapper;

	@Override
	public Optional<Performance> findBy(PerformanceId performanceId, User user) {
		Performance performanceDetail = scheduleRegisterMapper.findBy( performanceId, user );
		return Optional.ofNullable(performanceDetail);
	}

	@Override
	public ScheduleId nextId() {
		ScheduleId scheduleNextId = scheduleRegisterMapper.nextId();
		return scheduleNextId;
	}

	@Override
	public void register(Schedule schedule) {
		scheduleRegisterMapper.register(schedule);
	}



}
