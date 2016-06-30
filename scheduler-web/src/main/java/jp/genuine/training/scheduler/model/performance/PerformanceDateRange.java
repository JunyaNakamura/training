package jp.genuine.training.scheduler.model.performance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class PerformanceDateRange {
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate start;

	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
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

	public List<LocalDate> getDays() {
		LocalDate from = start;
		LocalDate to = end;
		Long dayCount = ChronoUnit.DAYS.between(from, to);
		List<LocalDate> days = new ArrayList<LocalDate>();
		LocalDate start = LocalDate.of(from.getYear(), from.getMonth(), from.getDayOfMonth());
		for (int i = 0; i <= dayCount; i++) {
			days.add(start);
			start = start.plusDays(1);
		}
		return days;
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
