package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class OpenTime implements Serializable{

	private String value;

	public OpenTime() {
		value = "";
	}

	public OpenTime(String value) {
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
		return String.format("OpenTime [value=%s]", value);
	}
	private static final long serialVersionUID = -8974100009122064978L;

}
