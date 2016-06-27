package jp.genuine.training.scheduler.model.performance;

import java.io.Serializable;

import javax.validation.Valid;

import jp.genuine.training.scheduler.model.user.UserId;

public class Performance implements Serializable{
	@Valid
	private UserId userId;
	@Valid
	private PerformanceName performanceName;
	@Valid
	private PerformanceId performanceId;
	@Valid
	private PerformanceUrl performanceUrl;
	@Valid
	private Memo memo;
	@Valid
	private Venue venue;
	@Valid
	private PerformanceDate performanceDate;

	public Performance(PerformanceId performanceId,UserId userId){
		performanceName = new PerformanceName();
		performanceUrl = new PerformanceUrl();
		memo = new Memo();
		venue = new Venue();
		performanceDate = new PerformanceDate();
		this.performanceId = performanceId;
		this.userId = userId;
	}
	public Performance() {
		userId = new UserId();
		performanceName = new PerformanceName();
		performanceId = new PerformanceId();
		performanceUrl = new PerformanceUrl();
		memo = new Memo();
		venue = new Venue();
		performanceDate = new PerformanceDate();
	}
	public Performance(UserId userId, PerformanceName performanceName, PerformanceId performanceId,
			PerformanceUrl performanceUrl, Memo memo, Venue venue, PerformanceDate performanceDate) {
		this.userId = userId;
		this.performanceName = performanceName;
		this.performanceId = performanceId;
		this.performanceUrl = performanceUrl;
		this.memo = memo;
		this.venue = venue;
		this.performanceDate = performanceDate;
	}
	public UserId getUserId() {
		return userId;
	}
	public PerformanceName getPerformanceName() {
		return performanceName;
	}
	public PerformanceId getPerformanceId() {
		return performanceId;
	}
	public PerformanceUrl getPerformanceUrl() {
		return performanceUrl;
	}
	public Memo getMemo() {
		return memo;
	}
	public Venue getVenue() {
		return venue;
	}
	public PerformanceDate getPerformanceDate() {
		return performanceDate;
	}
	public void setUserId(UserId userId) {
		this.userId = userId;
	}
	public void setPerformanceName(PerformanceName performanceName) {
		this.performanceName = performanceName;
	}
	public void setPerformanceId(PerformanceId performanceId) {
		this.performanceId = performanceId;
	}
	public void setPerformanceUrl(PerformanceUrl performanceUrl) {
		this.performanceUrl = performanceUrl;
	}
	public void setMemo(Memo memo) {
		this.memo = memo;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public void setPerformanceDate(PerformanceDate performanceDate) {
		this.performanceDate = performanceDate;
	}
	@Override
	public String toString() {
		return String.format(
				"Performance [userId=%s, performanceName=%s, performanceId=%s, performanceUrl=%s, memo=%s, venue=%s, performanceDate=%s]",
				userId, performanceName, performanceId, performanceUrl, memo, venue, performanceDate);
	}

	private static final long serialVersionUID = 4733370403718151062L;

}
