package jp.genuine.training.scheduler.service.performance;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.LoginUser;

public interface PerformanceModifyService {
	public Performance findBy(PerformanceId performanceId,LoginUser loginUser);
	public void modify(Performance performance);
}
