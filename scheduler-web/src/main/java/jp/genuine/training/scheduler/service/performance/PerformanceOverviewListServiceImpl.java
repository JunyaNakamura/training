package jp.genuine.training.scheduler.service.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.scheduler.model.performance.PerformanceOverviewList;
import jp.genuine.training.scheduler.model.performance.PerformanceOverviewRepository;
import jp.genuine.training.scheduler.model.user.LoginUser;
@Service
public class PerformanceOverviewListServiceImpl implements PerformanceOverviewListService{

	@Autowired
	private PerformanceOverviewRepository performanceOverviewRepository;

	@Override
	public PerformanceOverviewList listOf(LoginUser loginUser) {
		PerformanceOverviewList performanceOverviewList = performanceOverviewRepository.listOf(loginUser.getUser());
		return performanceOverviewList;
	}


}
