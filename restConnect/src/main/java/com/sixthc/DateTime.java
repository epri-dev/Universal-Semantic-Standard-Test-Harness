package com.sixthc;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Time", namespace="http://sixthc.com/time")
public class DateTime {
	private Calendar calender;

	public Calendar getCalender() {
		return calender;
	}

	public void setCalender(Calendar calender) {
		this.calender = calender;
	}

}
