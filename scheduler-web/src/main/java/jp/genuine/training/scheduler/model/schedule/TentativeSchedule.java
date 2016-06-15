package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;

public class TentativeSchedule implements Serializable{

	private boolean tentative;

	public TentativeSchedule() {
		tentative = false;
	}


	public TentativeSchedule(boolean tentative) {
		this.tentative = tentative;
	}


	public boolean isTentative() {
		return tentative;
	}


	public void setTentative(boolean tentative) {
		this.tentative = tentative;
	}


	@Override
	public String toString() {
		return String.format("TentativeSchedule [tentative=%s]", tentative);
	}


	private static final long serialVersionUID = 9066996265746265469L;

}
