package jp.genuine.training.scheduler.service.performance;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.LoginUser;

public interface PerformanceDetailService {
	public Performance findBy(PerformanceId performanceId,LoginUser loginUser);
	public void delete(Performance performance);
}
