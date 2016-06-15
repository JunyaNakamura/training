package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class PerformanceOverview implements Serializable{

	private PerformanceName performanceName;
	private PerformanceDateRange performanceDateRange;

	public PerformanceOverview() {
		performanceName = new PerformanceName();
		performanceDateRange = new PerformanceDateRange();
	}

	public PerformanceOverview(PerformanceName performanceName, PerformanceDateRange performanceDateRange) {
		this.performanceName = performanceName;
		this.performanceDateRange = performanceDateRange;
	}

	public PerformanceName getPerformanceName() {
		return performanceName;
	}

	public PerformanceDateRange getPerformanceDateRange() {
		return performanceDateRange;
	}

	public void setPerformanceName(PerformanceName performanceName) {
		this.performanceName = performanceName;
	}

	public void setPerformanceDateRange(PerformanceDateRange performanceDateRange) {
		this.performanceDateRange = performanceDateRange;
	}

	@Override
	public String toString() {
		return String.format("PerformanceOverview [performanceName=%s, performanceDateRange=%s]", performanceName,
				performanceDateRange);
	}

	private static final long serialVersionUID = -350230872925231014L;

}
