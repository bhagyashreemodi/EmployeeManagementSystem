package com.cg.employee;

import com.cg.util.JoiningDate;

public class EmployeeV2 {

	private static int id;
	private String firstName, lastName, grade;
	private JoiningDate joiningDate;
	protected int salary;

	public EmployeeV2(String firstName, String lastName, String grade, String joiningDate) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.joiningDate = new JoiningDate(joiningDate);
		

	}

	{

		id = id + 1;

	}

	public void setJoiningDate(String date){
		this.joiningDate.updateDate(date);
		
		
	}
	public void setJoiningMonth(String month){
		this.joiningDate.updateMonth(month);
	}
	public void setJoiningYear(String year){
		this.joiningDate.updateYear(year);
	}

	public static int getCount() {
		return id;
	}

	
}
