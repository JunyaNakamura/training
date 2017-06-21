package jp.genuine.training.scheduler.service.schedule;

import java.util.List;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.schedule.Schedule;
import jp.genuine.training.scheduler.model.user.LoginUser;

public interface ScheduleRegisterService {
	public Performance findBy(PerformanceId performanceId,LoginUser loginUser);
	public void register(Schedule schedule);
	public List<Schedule> selectAll(LoginUser loginUser);
}
