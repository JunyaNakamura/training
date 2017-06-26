package jp.genuine.training.scheduler.datasource.sampledb.user;

import org.apache.ibatis.annotations.Param;

import jp.genuine.training.scheduler.model.user.User;
import jp.genuine.training.scheduler.model.user.UserId;

public interface UserMapper {
	User findBy(@Param("userId") UserId userId);
	public void register(@Param("userRegister") User user);
}
