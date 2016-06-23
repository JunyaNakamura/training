package jp.genuine.training.scheduler.model.performance;

import java.util.Optional;

import jp.genuine.training.scheduler.model.user.User;

public interface PerformanceDetailRepository {
	public Optional<Performance>findBy( PerformanceId performanceId, User user );
}
