package jp.genuine.training;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import jp.genuine.training.scheduler.datasource.CoreDataSourceTestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    CoreDataSourceTestSuite.class
})
public class SchedulerSpockAllTestSuite
{
}
