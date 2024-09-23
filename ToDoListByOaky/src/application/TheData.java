package application;

import java.time.LocalDate;



public class TheData {

	private String theText;
	private LocalDate localdate;
	private boolean theBoolean;

	public boolean isTheBoolean() {
		return theBoolean;
	}

	public void setTheBoolean(boolean theBoolean) {
		this.theBoolean = theBoolean;
	}

	public String getTheText() {
		return theText;
	}

	public void setTheText(String theText) {
		this.theText = theText;
	}

	public LocalDate getLocalDate() {
		return localdate;
	}

	public void setLocalDate(LocalDate localdate) {
		this.localdate = localdate;
	}

	public TheData(String theText, LocalDate localDate, boolean b) {
		super();
		this.theText = theText;
		this.localdate = localDate;
		this.theBoolean=b;
	}

}
