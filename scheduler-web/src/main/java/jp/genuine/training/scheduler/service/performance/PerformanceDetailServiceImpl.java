package jp.genuine.training.scheduler.service.performance;

import org.springframework.beans.factory.annotation.Autowired;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceDetailRepository;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.LoginUser;

public class PerformanceDetailServiceImpl implements PerformanceDetailService{

	@Autowired
	public PerformanceDetailRepository performanceDetailRepository;

	@Override
	public Performance findBy(PerformanceId performanceId, LoginUser loginUser) {
		Performance performance = performanceDetailRepository.findBy(performanceId,loginUser.getUser());
		return performance;
	}

}
