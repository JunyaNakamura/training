package jp.genuine.training.scheduler.model.user;

import javax.validation.Valid;

public class User {
	@Valid
	private UserId userId;
	@Valid
	private Name name;
	@Valid
	private Password password;

	public User() {
		userId = new UserId();
		name = new Name();
		password = new Password();
	}

	public User(UserId userId, Name name, Password password) {
		this.userId = userId;
		this.name = name;
		this.password = password;
	}

	public UserId getUserId() {
		return userId;
	}

	public Name getName() {
		return name;
	}

	public Password getPassword() {
		return password;
	}

	public void setUserId(UserId userId) {
		this.userId = userId;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("User [userId=%s, name=%s, password=%s]", userId, name, password);
	}

}
