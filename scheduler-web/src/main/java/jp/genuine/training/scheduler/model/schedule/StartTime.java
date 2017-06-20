package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.validation.constraints.AssertTrue;

public class StartTime implements Serializable{

	private String start;

	public StartTime() {
		start = "";
	}

	public StartTime(String start) {
		this.start = start;
	}

	public LocalTime getStartLocalTime(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return LocalTime.parse(start,formatter);
	}

	@AssertTrue(message="{jp.genuine.training.scheduler.timeFormatError.message}")
	public boolean isValid(){
		try{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime.parse(start,formatter);
		}catch(DateTimeParseException e){
			return false;
		}
		return true;
	}

	public String getStart() {
		return start.substring(0, 5);
	}


	public void setStart(String start) {
		this.start = start;
	}


	@Override
	public String toString() {
		return String.format("StartTime [start=%s]", start);
	}


	private static final long serialVersionUID = 7966960361119115551L;

}
