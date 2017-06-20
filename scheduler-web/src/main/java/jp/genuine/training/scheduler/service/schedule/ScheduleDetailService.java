package jp.genuine.training.scheduler.service.schedule;

import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.schedule.ScheduleId;
import jp.genuine.training.scheduler.model.user.LoginUser;

public interface ScheduleDetailService {
	public Schedule findBy(ScheduleId scheduleId,LoginUser loginUser);
	public void modify(Schedule schedule);
	public void delete(Schedule schedule);
}
