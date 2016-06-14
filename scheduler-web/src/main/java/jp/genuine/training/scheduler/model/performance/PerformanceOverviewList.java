package jp.genuine.training.scheduler.model.performance;

import java.util.ArrayList;
import java.util.List;

public class PerformanceOverviewList {
	private List<PerformanceOverview> list;

	public PerformanceOverviewList() {
		list = new ArrayList<PerformanceOverview>();
	}

	public PerformanceOverviewList(List<PerformanceOverview> list) {
		this.list = list;
	}

	public List<PerformanceOverview> getList() {
		return list;
	}

	public void setList(List<PerformanceOverview> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return String.format("PerformanceOverviewList [list=%s]", list);
	}


}
