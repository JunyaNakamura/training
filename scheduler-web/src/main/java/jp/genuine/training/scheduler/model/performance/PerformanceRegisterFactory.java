package jp.genuine.training.scheduler.model.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.genuine.training.scheduler.model.user.UserId;

@Component
public class PerformanceRegisterFactory {
	@Autowired
	private PerformanceDetailRepository performanceDetailRepository;

	public Performance create(UserId userId){
		PerformanceId performanceId = performanceDetailRepository.nextId();
		Performance performance = new Performance(performanceId,userId);
		return performance;
	}
}
