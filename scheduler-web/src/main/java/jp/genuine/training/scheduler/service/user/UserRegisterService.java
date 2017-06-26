package jp.genuine.training.scheduler.service.user;

import jp.genuine.training.scheduler.model.user.User;

public interface UserRegisterService {

	/**
	 * アカウントを登録します。
	 *
	 * @param user
	 */
	public void register(User user);

	/**
	 * userIDが使用中かどうかを返します。
	 *
	 * @param user
	 * @return
	 */
	public boolean isUnusedUserId(String userId);
}
