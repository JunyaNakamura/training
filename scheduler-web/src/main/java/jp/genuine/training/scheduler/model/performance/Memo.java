package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class Memo implements Serializable{

	private String value;

	public Memo() {
		value = "";
	}

	public Memo(String value) {
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
		return String.format("Memo [value=%s]", value);
	}

	private static final long serialVersionUID = 1923612472329811011L;

}
