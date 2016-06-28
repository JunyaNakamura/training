package jp.genuine.training.scheduler.datasource.sampledb.performance;

import java.util.Optional;

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
	public Optional<Performance> findBy(PerformanceId performanceId, User user) {
		Performance performanceDetail = performanceDetailMapper.findBy( performanceId, user );
		return Optional.ofNullable(performanceDetail);
	}
	@Override
	public PerformanceId nextId(){
		PerformanceId performanceNextId = performanceDetailMapper.nextId();
		return performanceNextId;
	}
	@Override
	public void register(Performance performance) {
		performanceDetailMapper.register(performance);
	}
	@Override
	public void modify(Performance performance) {
		performanceDetailMapper.modify(performance);
	}


}
