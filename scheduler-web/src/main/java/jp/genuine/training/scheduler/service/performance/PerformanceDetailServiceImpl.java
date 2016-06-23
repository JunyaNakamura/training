package jp.genuine.training.scheduler.service.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.scheduler.exception.ResourceNotFoundException;
import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceDetailRepository;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.LoginUser;
@Service
public class PerformanceDetailServiceImpl implements PerformanceDetailService{

	@Autowired
	private PerformanceDetailRepository performanceDetailRepository;

	@Override
	public Performance findBy(PerformanceId performanceId, LoginUser loginUser) throws ResourceNotFoundException{
		Performance performance = performanceDetailRepository.findBy(performanceId,loginUser.getUser()).orElseThrow(ResourceNotFoundException::new);
		return performance;
	}

}
