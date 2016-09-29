package com.cg.util;

public class JoiningDate {

	private String date,month,year;
	public JoiningDate(String joiningDate) {
		String[] tokens = joiningDate.split("/");
		this.date = tokens[0];
		this.month = tokens[1];
		this.year = tokens[2];
		
	}
	public void updateDate(String date){
		this.date = date;
		
	}
	public void updateMonth(String month){
		this.month = month;
		
	}
	public void updateYear(String year){
		this.year = year;
		
	}
	public String getDate() {
		return date;
	}
	public String getMonth() {
		return month;
	}
	public String getYear() {
		return year;
	}

}
