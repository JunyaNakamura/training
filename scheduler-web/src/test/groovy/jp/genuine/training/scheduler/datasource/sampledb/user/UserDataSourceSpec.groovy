package jp.genuine.training.scheduler.datasource.sampledb.user;

import javax.sql.DataSource

import jp.genuine.test.util.LogbackHelper
import jp.genuine.training.TestConfig
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
public class UserDataSourceSpec extends Specification
{
	@Autowired
    UserDataSource userDataSource;

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
            def userId = new UserId( USER_ID )

        when:
            def resultUser = userDataSource.findBy( userId )

		then:
			def user = resultUser.get()
			user.userId.value == USER_ID
			user.name.value == USER_NAME
			user.password.value == PASSWORD
        where:
            TEST_NAME = this.class.name

			TITLE|USER_ID|USER_NAME|PASSWORD
			"存在するユーザーIDでユーザー情報が取得できること"	|"yamada"	|"山田太郎"	|"pass#1234"
    }

}