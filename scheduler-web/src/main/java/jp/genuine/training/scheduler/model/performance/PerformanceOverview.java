package jp.genuine.training.scheduler.model.performance;

public class PerformanceOverview {
	private PerformanceName performanceName;
	private StartDate startDate;
	private EndDate endDate;

	public PerformanceOverview() {
		performanceName = new PerformanceName();
		startDate = new StartDate();
		endDate = new EndDate();
	}
	public PerformanceOverview(PerformanceName performanceName, StartDate startDate, EndDate endDate) {
		this.performanceName = performanceName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public PerformanceName getPerformanceName() {
		return performanceName;
	}
	public StartDate getStartDate() {
		return startDate;
	}
	public EndDate getEndDate() {
		return endDate;
	}
	public void setPerformanceName(PerformanceName performanceName) {
		this.performanceName = performanceName;
	}
	public void setStartDate(StartDate startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(EndDate endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return String.format("PerformanceOverview [performanceName=%s, startDate=%s, endDate=%s]", performanceName,
				startDate, endDate);
	}


}
