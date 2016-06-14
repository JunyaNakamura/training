package jp.genuine.training.scheduler.model.schedule;

public class ScheduledDate {
	private String value;

	public ScheduledDate() {
		value = "";
	}

	public ScheduledDate(String value) {
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
		return String.format("ScheduledDate [value=%s]", value);
	}

}
