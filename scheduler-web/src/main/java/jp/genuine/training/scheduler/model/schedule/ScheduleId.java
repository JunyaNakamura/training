package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class ScheduleId implements Serializable{

	private Integer value;

	public ScheduleId() {
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
	private static final long serialVersionUID = 2997842391829052923L;

}
