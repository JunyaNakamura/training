package jp.genuine.training.scheduler.model.schedule;

import java.time.LocalDate;
import java.time.LocalTime;

import jp.genuine.training.scheduler.model.performance.PerformanceId;

public class Schedule {
	private LocalDate fix;
	private LocalTime open;
	private LocalTime start;
	private PerformanceId performanceId;
	private ScheduleId scheduleId;
	private ScheduledDate scheduledDate;
	private Budget budget;
	private TicketPrice ticketPrice;
	private Memo memo;
	private TentativeSchedule tentativeSchedule;
	private Implessions implessions;

	public Schedule() {
		fix = LocalDate.now();
		open = LocalTime.of(0, 0);
		start = LocalTime.of(0, 0);
		performanceId = new PerformanceId();
		scheduleId = new ScheduleId();
		scheduledDate = new ScheduledDate();
		budget = new Budget();
		ticketPrice = new TicketPrice();
		memo = new Memo();
		tentativeSchedule = new TentativeSchedule();
		implessions = new Implessions();
	}

	public Schedule(LocalDate fix, LocalTime open, LocalTime start, PerformanceId performanceId, ScheduleId scheduleId,
			ScheduledDate scheduledDate, Budget budget, TicketPrice ticketPrice, Memo memo,
			TentativeSchedule tentativeSchedule, Implessions implessions) {
		this.fix = fix;
		this.open = open;
		this.start = start;
		this.performanceId = performanceId;
		this.scheduleId = scheduleId;
		this.scheduledDate = scheduledDate;
		this.budget = budget;
		this.ticketPrice = ticketPrice;
		this.memo = memo;
		this.tentativeSchedule = tentativeSchedule;
		this.implessions = implessions;
	}

	public LocalDate getFix() {
		return fix;
	}

	public LocalTime getOpen() {
		return open;
	}

	public LocalTime getStart() {
		return start;
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

	public Implessions getImplessions() {
		return implessions;
	}

	public void setFix(LocalDate fix) {
		this.fix = fix;
	}

	public void setOpen(LocalTime open) {
		this.open = open;
	}

	public void setStart(LocalTime start) {
		this.start = start;
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

	public void setImplessions(Implessions implessions) {
		this.implessions = implessions;
	}

	@Override
	public String toString() {
		return String.format(
				"Schedule [fix=%s, open=%s, start=%s, performanceId=%s, scheduleId=%s, scheduledDate=%s, budget=%s, ticketPrice=%s, memo=%s, tentativeSchedule=%s, implessions=%s]",
				fix, open, start, performanceId, scheduleId, scheduledDate, budget, ticketPrice, memo,
				tentativeSchedule, implessions);
	}


}
