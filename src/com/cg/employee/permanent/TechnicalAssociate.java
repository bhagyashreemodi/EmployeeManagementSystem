package com.cg.employee.permanent;

public class TechnicalAssociate extends PermanentEmployee{

	
	public TechnicalAssociate(String firstName, String lastName, String grade, String joiningMonth, int yearsOfExperience) {
		super(firstName, lastName, grade, joiningMonth,yearsOfExperience);
		calculateSalary();
	}

	public void calculateCoverage(TechnicalAssociate ta){
		 
		mediclaimCoverage = mediclaim.calculateCoverage(ta);
		
	}
	
	@Override
	public void calculateSalary() {
		
		salary = 5000 * yearsOfExperience;
	}
	
	
}

