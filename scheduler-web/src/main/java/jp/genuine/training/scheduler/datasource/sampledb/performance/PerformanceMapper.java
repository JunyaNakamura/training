package jp.genuine.training.scheduler.datasource.sampledb.performance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.scheduler.model.performance.PerformanceOverview;
import jp.genuine.training.scheduler.model.user.User;

public interface PerformanceMapper {
	List<PerformanceOverview> listOf(@Param("user") User user);
}
