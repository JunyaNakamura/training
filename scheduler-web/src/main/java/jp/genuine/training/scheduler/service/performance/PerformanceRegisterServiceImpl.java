package jp.genuine.training.scheduler.service.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceDetailRepository;
@Service
public class PerformanceRegisterServiceImpl implements PerformanceRegisterService{

	@Autowired
	private PerformanceDetailRepository performanceDetailRepository;

	@Override
	public void register(Performance performance) {
		performanceDetailRepository.register(performance);
	}



}
