package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

import javax.validation.Valid;

import jp.genuine.training.scheduler.model.performance.PerformanceId;

public class Schedule implements Serializable{


	private PerformanceId performanceId;
	private ScheduleId scheduleId;
	@Valid
	private ScheduledDate scheduledDate;
	@Valid
	private Budget budget;
	@Valid
	private TicketPrice ticketPrice;
	private Memo memo;
	private TentativeSchedule tentativeSchedule;
	@Valid
	private OpenTime openTime;
	@Valid
	private StartTime startTime;
	private Implessions implessions;

	public Schedule(ScheduleId scheduleId,PerformanceId performanceId){
		this.scheduleId=scheduleId;
		this.performanceId=performanceId;
		scheduledDate = new ScheduledDate();
		budget = new Budget();
		ticketPrice = new TicketPrice();
		memo = new Memo();
		tentativeSchedule = new TentativeSchedule();
		openTime = new OpenTime();
		startTime = new StartTime();
		implessions = new Implessions();
	}

	public Schedule() {
		performanceId = new PerformanceId();
		scheduleId = new ScheduleId();
		scheduledDate = new ScheduledDate();
		budget = new Budget();
		ticketPrice = new TicketPrice();
		memo = new Memo();
		tentativeSchedule = new TentativeSchedule();
		openTime = new OpenTime();
		startTime = new StartTime();
		implessions = new Implessions();
	}

	public Schedule(PerformanceId performanceId, ScheduleId scheduleId, ScheduledDate scheduledDate, Budget budget,
			TicketPrice ticketPrice, Memo memo, TentativeSchedule tentativeSchedule, OpenTime openTime,
			StartTime startTime, Implessions implessions) {
		this.performanceId = performanceId;
		this.scheduleId = scheduleId;
		this.scheduledDate = scheduledDate;
		this.budget = budget;
		this.ticketPrice = ticketPrice;
		this.memo = memo;
		this.tentativeSchedule = tentativeSchedule;
		this.openTime = openTime;
		this.startTime = startTime;
		this.implessions = implessions;
	}

	public PerformanceId getPerformanceId() {
		return performanceId;
	}

	public ScheduleId getScheduleId() {
		return scheduleId;
	}

	public ScheduledDate getScheduledDate() {
		return scheduledDate;
	}

	public Budget getBudget() {
		return budget;
	}

	public TicketPrice getTicketPrice() {
		return ticketPrice;
	}

	public Memo getMemo() {
		return memo;
	}

	public TentativeSchedule getTentativeSchedule() {
		return tentativeSchedule;
	}

	public OpenTime getOpenTime() {
		return openTime;
	}

	public StartTime getStartTime() {
		return startTime;
	}

	public Implessions getImplessions() {
		return implessions;
	}

	public void setPerformanceId(PerformanceId performanceId) {
		this.performanceId = performanceId;
	}

	public void setScheduleId(ScheduleId scheduleId) {
		this.scheduleId = scheduleId;
	}

	public void setScheduledDate(ScheduledDate scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public void setBudget(Budget budget) {
		this.budget = budget;
	}

	public void setTicketPrice(TicketPrice ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public void setMemo(Memo memo) {
		this.memo = memo;
	}

	public void setTentativeSchedule(TentativeSchedule tentativeSchedule) {
		this.tentativeSchedule = tentativeSchedule;
	}

	public void setOpenTime(OpenTime openTime) {
		this.openTime = openTime;
	}

	public void setStartTime(StartTime startTime) {
		this.startTime = startTime;
	}

	public void setImplessions(Implessions implessions) {
		this.implessions = implessions;
	}

	@Override
	public String toString() {
		return String.format(
				"Schedule [performanceId=%s, scheduleId=%s, scheduledDate=%s, budget=%s, ticketPrice=%s, memo=%s, tentativeSchedule=%s, openTime=%s, startTime=%s, implessions=%s]",
				performanceId, scheduleId, scheduledDate, budget, ticketPrice, memo, tentativeSchedule, openTime,
				startTime, implessions);
	}
	private static final long serialVersionUID = -546319281156951601L;

}
