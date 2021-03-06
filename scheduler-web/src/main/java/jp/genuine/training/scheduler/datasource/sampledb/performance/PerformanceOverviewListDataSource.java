package jp.genuine.training.scheduler.datasource.sampledb.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.scheduler.model.performance.PerformanceOverview;
import jp.genuine.training.scheduler.model.performance.PerformanceOverviewList;
import jp.genuine.training.scheduler.model.performance.PerformanceOverviewRepository;
import jp.genuine.training.scheduler.model.user.User;
@Repository
public class PerformanceOverviewListDataSource implements PerformanceOverviewRepository{
	@Autowired
	private PerformanceOverviewListMapper performanceMapper;

	@Override
	public PerformanceOverviewList listOf(User user) {
		List<PerformanceOverview> list = performanceMapper.listOf(user);
		return new PerformanceOverviewList(list);
	}

}
