package jp.genuine.training.scheduler.datasource;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import jp.genuine.training.scheduler.datasource.sampledb.performance.PerformanceDataSourceSpec;
import jp.genuine.training.scheduler.datasource.sampledb.user.UserDataSourceSpec;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	UserDataSourceSpec.class,
	PerformanceDataSourceSpec.class

})

public class CoreDataSourceTestSuite {

}
