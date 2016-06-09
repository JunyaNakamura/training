package jp.genuine.training.scheduler.model.user;

import java.util.Optional;

public interface UserRepository {
	public Optional<User>findBy(UserId userId);
}
