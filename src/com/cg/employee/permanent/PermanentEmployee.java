package com.cg.employee.permanent;

import com.cg.employee.Employee;
import com.cg.util.*;

public abstract class PermanentEmployee extends Employee{

	private static int countOfPermanent;
	protected int yearsOfExperience;
	protected int mediclaimCoverage;
	protected Mediclaim mediclaim = new Mediclaim();
	public PermanentEmployee(String firstName, String lastName, String grade, String joiningMonth,int yearsOfExperience) {
		super(firstName, lastName, grade, joiningMonth);
		this.yearsOfExperience = yearsOfExperience;
	}
	
	{
		countOfPermanent = countOfPermanent + 1;
	}
	public static int getCountOfPermanent() {
		return countOfPermanent;
	}
	
}
