package jp.genuine.training.scheduler.model.schedule;

public class OpenTime {
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


}
