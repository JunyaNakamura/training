package jp.genuine.training.scheduler.model.user;

public class Password {
	private String value;

	public Password() {
		value = "";
	}

	public Password(String value) {
		this.value=value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return String.format("Password [value=%s]", value);
	}

}
