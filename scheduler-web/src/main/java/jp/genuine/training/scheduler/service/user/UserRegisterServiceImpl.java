package jp.genuine.training.scheduler.service.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.genuine.training.scheduler.model.user.User;
import jp.genuine.training.scheduler.model.user.UserId;
import jp.genuine.training.scheduler.model.user.UserRepository;

@Service
public class UserRegisterServiceImpl implements UserRegisterService{

	@Autowired
	UserRepository repository;

	@Override
	public void register(User user) {
		repository.register(user);
	}

	@Override
	public boolean isUnusedUserId(String userId) {
		Optional<User> usedUser = repository.findBy(new UserId(userId));

		// UserIDが取得できない場合
		if (!usedUser.isPresent() || usedUser.get().getUserId().getValue().isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
