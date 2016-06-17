package jp.genuine.training.scheduler.service.performance;

import jp.genuine.training.scheduler.model.performance.PerformanceOverviewList;
import jp.genuine.training.scheduler.model.user.LoginUser;

public interface PerformanceOverviewListService {

	public PerformanceOverviewList listOf(LoginUser loginUser);
}
