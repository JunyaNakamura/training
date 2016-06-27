package jp.genuine.training.scheduler.datasource.sampledb.performance;

import java.time.format.DateTimeFormatter

import javax.sql.DataSource

import jp.genuine.test.util.LogbackHelper
import jp.genuine.training.TestConfig
import jp.genuine.training.scheduler.model.user.Name
import jp.genuine.training.scheduler.model.user.Password
import jp.genuine.training.scheduler.model.user.User
import jp.genuine.training.scheduler.model.user.UserId

import org.dbunit.database.DatabaseConnection
import org.dbunit.database.IDatabaseConnection
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.ConfigFileApplicationContextInitializer
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration

import spock.lang.Specification
import spock.lang.Unroll

@ActiveProfiles("test")
@ContextConfiguration(classes = TestConfig.class, initializers = ConfigFileApplicationContextInitializer.class)
public class PerformanceOverviewListDataSourceSpec extends Specification
{
	@Autowired
    PerformanceOverviewListDataSource performanceDataSource;

	@Autowired
    @Qualifier("sampleDBDataSource")
    DataSource sampleDBDataSource;

    private static IDatabaseConnection connection;

    def setupSpec(){
        LogbackHelper.loggingTestStart( this )
    }

    def setup(){
        LogbackHelper.countTestCase()
        connection = new DatabaseConnection( sampleDBDataSource.connection )
    }

    def cleanup(){
        connection.close()
    }

    def cleanupSpec(){
       LogbackHelper.loggingTestEnd()
    }

	@Unroll
    def "<#TEST_NAME>find:データの取得->#TITLE"(){
        given:
			def formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd",Locale.JAPAN )
			def userId = new UserId( USER_ID )
			def userName = new Name( USER_NAME )
			def userPass = new Password( USER_PASS )
			def user = new User( userId,userName,userPass )

		expect:
		def resultPerformanceList = performanceDataSource.listOf( user )
			resultPerformanceList.list.size() == 3
			resultPerformanceList.list[INDEX].performanceId.value == PERFORMANCE_ID
			resultPerformanceList.list[INDEX].performanceName.value == PERFORMANCE_NAME
			resultPerformanceList.list[INDEX].performanceDateRange.start.format(formatter) == START_DATE
			resultPerformanceList.list[INDEX].performanceDateRange.end.format(formatter) == END_DATE
        where:
            TEST_NAME = this.class.name
			USER_ID = "yamada"
			USER_NAME="山田太郎"
			USER_PASS="pass#1234"

			INDEX|PERFORMANCE_ID|PERFORMANCE_NAME|START_DATE|END_DATE
			0|1|"シェイクスピア"|"2016-03-15"|"2016-03-22"
			1|3|"地底からコンニチワ"|"2016-04-02"|"2016-04-09"
			2|2|"ロミオとジュリエット"|"2016-04-05"|"2016-04-12"

    }

}