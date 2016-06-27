package jp.genuine.training.scheduler.datasource.sampledb.performance

import javax.sql.DataSource

import jp.genuine.test.util.LogbackHelper
import jp.genuine.training.TestConfig

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
public class PerformanceDetailDataSourceSpec extends Specification{
	@Autowired
	PerformanceDetailDataSource performanceDetailDataSource;

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
/*
	@Unroll
	def "<#TEST_NAME>find:データの取得->#TITLE"(){
		given:
			def formatter = DateTimeFormatter.ofPattern( "yyyy-MM-dd",Locale.JAPAN )
			def userId = new UserId( USER_ID )
			def userName = new Name( USER_NAME )
			def userPass = new Password( USER_PASS )
			def user = new User( userId,userName,userPass )
			def performanceId = new PerformanceId( PERFORMANCE_ID )

		expect:
			def resultPerformanceDetail = performanceDetailDataSource.findBy( performanceId, user )
			resultPerformanceDetail.performanceId.value == PERFORMANCE_ID
			resultPerformanceDetail.performanceName.value == PERFORMANCE_NAME
			resultPerformanceDetail.performanceUrl.value == SITE_URL
			resultPerformanceDetail.venue.venueName.value == PLACE_NAME
			resultPerformanceDetail.venue.venueUrl.value == PLACE_URL
			resultPerformanceDetail.performanceDate.performanceDateRange.start.format(formatter) == START_DATE
			resultPerformanceDetail.performanceDate.performanceDateRange.end.format(formatter) == END_DATE
			resultPerformanceDetail.performanceDate.suspendDateList.list.size() == HOLIDAY_LIST_SIZE
			resultPerformanceDetail.memo.value == MEMO

		where:
			TEST_NAME = this.class.name
			USER_ID = "yamada"
			USER_NAME ="山田太郎"
			USER_PASS ="pass#1234"

			PERFORMANCE_ID|PERFORMANCE_NAME|SITE_URL|PLACE_NAME|PLACE_URL|START_DATE|END_DATE|MEMO|HOLIDAY_LIST_SIZE
			1|"シェイクスピア"|"http:html"|"笹塚劇場"|""|"2016-03-15"|"2016-03-22"|"見たい"|2
	}
	*/

	@Unroll
	def "<#TEST_NAME>nextIdの動作確認->#TITLE"(){
		expect:
			def resultNextId = performanceDetailDataSource.nextId()
			resultNextId != null
	}

}
