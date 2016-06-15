package jp.genuine.training.scheduler.model.performance;

import java.time.LocalDate;

public class PerformanceDateRange {
	private LocalDate start;
	private LocalDate end;

	public PerformanceDateRange() {
		start = LocalDate.now();
		end = LocalDate.now();
	}

	public PerformanceDateRange(LocalDate start, LocalDate end) {
		this.start = start;
		this.end = end;
	}

	public LocalDate getStart() {
		return start;
	}

	public LocalDate getEnd() {
		return end;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public void setEnd(LocalDate end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return String.format("PerformanceDateRange [start=%s, end=%s]", start, end);
	}



}
