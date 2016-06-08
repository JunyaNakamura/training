package jp.genuine.training.scheduler.model.user;

public class UserId {
	private String value;

	public UserId() {
		value = "";
	}

	public UserId(String value) {
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
		return String.format("UserId [value=%s]", value);
	}

}
