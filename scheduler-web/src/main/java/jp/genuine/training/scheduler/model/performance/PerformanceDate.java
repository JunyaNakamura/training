package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

public class PerformanceDate implements Serializable{

	private PerformanceDateRange performanceDateRange;
	private SuspendDateList suspendDateList;

	public PerformanceDate() {
		performanceDateRange = new PerformanceDateRange();
		suspendDateList = new SuspendDateList();
	}

	public PerformanceDate(PerformanceDateRange performanceDateRange, SuspendDateList suspendDateList) {
		super();
		this.performanceDateRange = performanceDateRange;
		this.suspendDateList = suspendDateList;
	}

	public PerformanceDateRange getPerformanceDateRange() {
		return performanceDateRange;
	}

	public SuspendDateList getSuspendDateList() {
		return suspendDateList;
	}

	public void setPerformanceDateRange(PerformanceDateRange performanceDateRange) {
		this.performanceDateRange = performanceDateRange;
	}

	public void setSuspendDateList(SuspendDateList suspendDateList) {
		this.suspendDateList = suspendDateList;
	}

	@Override
	public String toString() {
		return String.format("PerformanceDate [performanceDateRange=%s, suspendDateList=%s]", performanceDateRange,
				suspendDateList);
	}

	private static final long serialVersionUID = -5421923250629226084L;

}
