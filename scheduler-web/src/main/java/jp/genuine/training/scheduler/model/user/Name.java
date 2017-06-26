package jp.genuine.training.scheduler.model.user;

import org.hibernate.validator.constraints.Length;

public class Name {

	@Length(min = 1, max = 20)
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
