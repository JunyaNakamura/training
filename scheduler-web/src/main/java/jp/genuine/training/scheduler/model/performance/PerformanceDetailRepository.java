package jp.genuine.training.scheduler.model.performance;

import java.util.Optional;

import jp.genuine.training.scheduler.model.user.User;

public interface PerformanceDetailRepository {
	public Optional<Performance>findBy( PerformanceId performanceId, User user );
	public PerformanceId nextId();
	public void register(Performance performance);
	public void modify(Performance performance);
}
