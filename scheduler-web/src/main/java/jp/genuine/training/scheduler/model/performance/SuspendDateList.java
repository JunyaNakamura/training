package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SuspendDateList implements Serializable{

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

	private static final long serialVersionUID = -8395635668863217025L;
}
