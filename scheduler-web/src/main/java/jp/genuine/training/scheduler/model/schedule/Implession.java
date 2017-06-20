package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class Implession implements Serializable{

	private String value;

	public Implession() {
		value = "";
	}

	public Implession(String value) {
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
		return String.format("Implessions [value=%s]", value);
	}
	private static final long serialVersionUID = 6967269752538677743L;

}
