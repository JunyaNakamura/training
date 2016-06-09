package jp.genuine.training.scheduler.datasource.sampledb.user;

import java.util.Optional;

import jp.genuine.training.scheduler.model.user.User;
import jp.genuine.training.scheduler.model.user.UserId;
import jp.genuine.training.scheduler.model.user.UserRepository;

public class UserDataSource implements UserRepository{

	@Override
	public Optional<User> findBy(UserId userId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
