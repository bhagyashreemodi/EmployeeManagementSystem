package com.cg.employee.permanent;

import com.cg.util.Mediclaim;

public class ProjectManager extends PermanentEmployee{

	
	public ProjectManager(String firstName, String lastName, String grade, String joiningMonth, int yearsOfExperience) {
		super(firstName, lastName, grade, joiningMonth,yearsOfExperience);
		calculateSalary();
	}
	
	public void calculateCoverage(ProjectManager pm){
		 
		mediclaimCoverage = mediclaim.calculateCoverage(pm);
		
	}
	@Override
	public void calculateSalary() {
		
		salary = 10000 * yearsOfExperience;
	}
	
	
}
