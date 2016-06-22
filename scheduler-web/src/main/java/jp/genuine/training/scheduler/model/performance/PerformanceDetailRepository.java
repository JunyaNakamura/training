package jp.genuine.training.scheduler.model.performance;

import jp.genuine.training.scheduler.model.user.User;

public interface PerformanceDetailRepository {
	public Performance findBy( PerformanceId performanceId, User user );
}
