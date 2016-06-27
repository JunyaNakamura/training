package jp.genuine.training.scheduler.datasource.sampledb.performance;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.scheduler.model.performance.Performance;
import jp.genuine.training.scheduler.model.performance.PerformanceId;
import jp.genuine.training.scheduler.model.user.User;

public interface PerformanceDetailMapper {
	Performance findBy(@Param("performanceId") PerformanceId performanceId, @Param("user") User user);
	PerformanceId nextId();
	void register(@Param("performance") Performance performance);
}
