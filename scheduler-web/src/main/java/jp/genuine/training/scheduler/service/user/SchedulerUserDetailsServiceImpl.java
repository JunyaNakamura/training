package jp.genuine.training.scheduler.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import jp.genuine.training.scheduler.model.user.LoginUser;
import jp.genuine.training.scheduler.model.user.User;
import jp.genuine.training.scheduler.model.user.UserId;
import jp.genuine.training.scheduler.model.user.UserRepository;

public class SchedulerUserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findBy(new UserId(username)).orElse(null);
		return new LoginUser(user);
	}

}
