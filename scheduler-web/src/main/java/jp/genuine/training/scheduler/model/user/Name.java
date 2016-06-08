package jp.genuine.training.scheduler.model.user;

public class Name {
	private String value;

	public Name() {
		value = "";
	}

	public Name(String value) {
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
		return String.format("Name [value=%s]", value);
	}
}
