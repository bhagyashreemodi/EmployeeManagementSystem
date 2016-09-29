package com.cg.employee.contract;

import com.cg.employee.contract.Contractor.ContractBasedEmployee;

public class TechnicalAssociate extends ContractBasedEmployee{

	public TechnicalAssociate(String firstName, String lastName, String grade, String joiningDate, int ratePerHour, int NumberOfHours,String contractor) {
		new Contractor(contractor).super(firstName, lastName, grade, joiningDate, ratePerHour,NumberOfHours);
		
	}
	
	
}
