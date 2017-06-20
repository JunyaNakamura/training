package jp.genuine.training.scheduler.model.calendar;

import java.io.Serializable;

public class Event implements Serializable{

	/** スケジュールid */
	private String id;
	/** 公演名 */
	private String title;
	/** 開園日時 */
	private String start;
	/** 開始日時 */
	private String end;

	/**
	 * コンストラクタ
	 */
	public Event() {
		id="";
		title = "";
		start = "";
		end = "";
	}
	public Event(String id, String title, String start, String end) {
		this.title = title;
		this.start = start;
		this.end = end;
	}

	// 以下getter/setter
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getStart() {
		return start;
	}
	public String getEnd() {
		return end;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return String.format(
				"Event [id=%s, title=%s, start=%s, end=%s]",
				id, title, start, end);
	}

	private static final long serialVersionUID = -546319281156951601L;

}
