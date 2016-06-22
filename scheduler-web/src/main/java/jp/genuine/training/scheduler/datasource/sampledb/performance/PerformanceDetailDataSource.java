package jp.genuine.training.scheduler.datasource.sampledb.performance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceDetailRepository;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.User;
@Repository
public class PerformanceDetailDataSource implements PerformanceDetailRepository{

	@Autowired
	public PerformanceDetailMapper performanceDetailMapper;

	@Override
	public Performance findBy(PerformanceId performanceId, User user) {
		Performance performanceDetail = performanceDetailMapper.findBy( performanceId, user );
		return performanceDetail;
	}

}
