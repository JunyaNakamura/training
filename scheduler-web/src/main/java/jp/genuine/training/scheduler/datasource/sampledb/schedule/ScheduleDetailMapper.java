package jp.genuine.training.scheduler.datasource.sampledb.schedule;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.user.User;

public interface ScheduleDetailMapper {
	Schedule findBy(@Param("scheduleId") ScheduleId scheduleId, @Param("user") User user);
	void modify(@Param("scheduleModify") Schedule schedule);
	void delete(@Param("scheduleDelete") Schedule schedule);
}
