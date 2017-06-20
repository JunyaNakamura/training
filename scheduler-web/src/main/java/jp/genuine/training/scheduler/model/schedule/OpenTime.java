package jp.genuine.training.scheduler.model.schedule;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.validation.constraints.AssertTrue;

public class OpenTime implements Serializable{

	private String open;

	public OpenTime() {
		open = "";
	}

	public OpenTime(String open) {
		this.open = open;
	}

	public String getOpen() {
		return open.substring(0, 5);
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public LocalTime getOpenLocalTime(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		return LocalTime.parse(open,formatter);
	}

	@AssertTrue(message="{jp.genuine.training.scheduler.timeFormatError.message}")
	public boolean isValid(){
		try{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
			LocalTime.parse(open,formatter);
		}catch(DateTimeParseException e){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("OpenTime [open=%s]", open);
	}


	private static final long serialVersionUID = -8974100009122064978L;

}
