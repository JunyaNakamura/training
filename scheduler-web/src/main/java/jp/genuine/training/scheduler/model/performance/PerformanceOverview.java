package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class PerformanceOverview implements Serializable{

	private PerformanceId performanceId;
	private PerformanceName performanceName;
	private PerformanceDateRange performanceDateRange;

	public PerformanceOverview() {
		performanceId = new PerformanceId();
		performanceName = new PerformanceName();
		performanceDateRange = new PerformanceDateRange();
	}

	public PerformanceOverview(PerformanceId performanceId, PerformanceName performanceName,
			PerformanceDateRange performanceDateRange) {
		this.performanceId = performanceId;
		this.performanceName = performanceName;
		this.performanceDateRange = performanceDateRange;
	}

	public PerformanceId getPerformanceId() {
		return performanceId;
	}

	public PerformanceName getPerformanceName() {
		return performanceName;
	}

	public PerformanceDateRange getPerformanceDateRange() {
		return performanceDateRange;
	}

	public void setPerformanceId(PerformanceId performanceId) {
		this.performanceId = performanceId;
	}

	public void setPerformanceName(PerformanceName performanceName) {
		this.performanceName = performanceName;
	}

	public void setPerformanceDateRange(PerformanceDateRange performanceDateRange) {
		this.performanceDateRange = performanceDateRange;
	}

	@Override
	public String toString() {
		return String.format("PerformanceOverview [performanceId=%s, performanceName=%s, performanceDateRange=%s]",
				performanceId, performanceName, performanceDateRange);
	}

	private static final long serialVersionUID = -350230872925231014L;

}
