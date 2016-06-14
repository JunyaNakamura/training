package jp.genuine.training.scheduler.model.schedule;

public class ScheduleId {
	private Integer value;

	public ScheduleId() {
		value = new Integer(0);
	}

	public ScheduleId(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("ScheduleId [value=%s]", value);
	}


}
