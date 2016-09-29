package com.cg.util;

import com.cg.employee.permanent.ProjectManager;
import com.cg.employee.permanent.TechnicalAssociate;

public class Mediclaim {
	
	public int calculateCoverage(ProjectManager pm){
		
		return (pm.getSalary() * 12);
	}
	public int calculateCoverage(TechnicalAssociate ta){
		return (ta.getSalary() * 12 * 2);
	}
}
