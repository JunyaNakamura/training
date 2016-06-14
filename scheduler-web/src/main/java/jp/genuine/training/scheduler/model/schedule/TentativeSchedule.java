package jp.genuine.training.scheduler.model.schedule;

public class TentativeSchedule {
	private ScheduleId scheduleId;

	public TentativeSchedule() {
		scheduleId = new ScheduleId();
	}

	public TentativeSchedule(ScheduleId scheduleId) {
		this.scheduleId = scheduleId;
	}

	public ScheduleId getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(ScheduleId scheduleId) {
		this.scheduleId = scheduleId;
	}

	@Override
	public String toString() {
		return String.format("TentativeSchedule [scheduleId=%s]", scheduleId);
	}


}
