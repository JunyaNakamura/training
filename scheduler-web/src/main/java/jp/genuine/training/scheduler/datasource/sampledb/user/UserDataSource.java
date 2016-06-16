package jp.genuine.training.scheduler.datasource.sampledb.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.genuine.training.scheduler.model.user.User;
import jp.genuine.training.scheduler.model.user.UserId;
import jp.genuine.training.scheduler.model.user.UserRepository;
@Repository
public class UserDataSource implements UserRepository{
	@Autowired
	private UserMapper mapper;

	@Override
	public Optional<User> findBy(UserId userId) {
		User user = mapper.findBy(userId);
		return Optional.ofNullable(user);
	}

}
