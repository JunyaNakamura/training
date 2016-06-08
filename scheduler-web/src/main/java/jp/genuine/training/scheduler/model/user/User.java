package jp.genuine.training.scheduler.model.user;

public class User {
	private String userId;
	private String name;
	private String password;

	public User() {
		userId = "";
		name = "";
		password = "";
	}

	public User(String userId,String name,String password) {
		this.userId = userId;
		this.name = name;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("User [userId=%s, name=%s, password=%s]", userId, name, password);
	}

}
