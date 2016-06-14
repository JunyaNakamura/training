package jp.genuine.training.scheduler.model.performance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SuspendDateList {
	private List<LocalDate> list;

	public SuspendDateList() {
		list = new ArrayList<LocalDate>();
	}

	public SuspendDateList(List<LocalDate> list) {
		this.list = list;
	}

	public List<LocalDate> getList() {
		return list;
	}

	public void setList(List<LocalDate> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return String.format("SuspendDateList [list=%s]", list);
	}

}
