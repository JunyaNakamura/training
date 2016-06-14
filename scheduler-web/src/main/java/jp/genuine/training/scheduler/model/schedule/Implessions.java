package jp.genuine.training.scheduler.model.schedule;

public class Implessions {
	private String value;

	public Implessions() {
		value = "";
	}

	public Implessions(String value) {
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


}
