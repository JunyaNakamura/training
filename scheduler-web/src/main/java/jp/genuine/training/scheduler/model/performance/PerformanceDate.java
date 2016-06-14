package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;
import java.time.LocalDate;

public class PerformanceDate implements Serializable{

	private LocalDate start;
	private LocalDate end;
	private SuspendDateList suspendDateList;

	public PerformanceDate() {
		start = LocalDate.now();
		end = LocalDate.now();
		suspendDateList = new SuspendDateList();
	}
	public PerformanceDate(LocalDate start, LocalDate end, SuspendDateList suspendDateList) {
		this.start = start;
		this.end = end;
		this.suspendDateList = suspendDateList;
	}
	public LocalDate getStart() {
		return start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public SuspendDateList getSuspendDateList() {
		return suspendDateList;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	public void setSuspendDateList(SuspendDateList suspendDateList) {
		this.suspendDateList = suspendDateList;
	}
	@Override
	public String toString() {
		return String.format("PerformanceDate [start=%s, end=%s, suspendDateList=%s]", start, end, suspendDateList);
	}

	private static final long serialVersionUID = -5421923250629226084L;

}
