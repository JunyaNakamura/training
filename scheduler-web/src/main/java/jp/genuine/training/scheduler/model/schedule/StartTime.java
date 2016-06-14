package jp.genuine.training.scheduler.model.schedule;

public class StartTime {
	private String value;

	public StartTime() {
		value = "";
	}

	public StartTime(String value) {
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
		return String.format("StartTime [value=%s]", value);
	}


}
