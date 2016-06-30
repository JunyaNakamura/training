package jp.genuine.training.scheduler.datasource.sampledb.schedule;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.user.User;

public interface ScheduleRegisterMapper {
	Performance findBy(@Param("performanceId") PerformanceId performanceId, @Param("user") User user);
	ScheduleId nextId();
	void register(@Param("schedule") Schedule schedule);
}
