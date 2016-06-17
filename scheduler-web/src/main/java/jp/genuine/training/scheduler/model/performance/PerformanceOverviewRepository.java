package jp.genuine.training.scheduler.model.performance;

import jp.genuine.training.scheduler.model.user.User;

public interface PerformanceOverviewRepository {
	public PerformanceOverviewList listOf(User user);
}
