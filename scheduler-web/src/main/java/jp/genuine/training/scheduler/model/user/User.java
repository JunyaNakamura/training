package jp.genuine.training.scheduler.model.user;

public class User {
	private String value;

	public User() {
		value = "";
	}

	public User(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("User [value=%s]", value);
	}

}
