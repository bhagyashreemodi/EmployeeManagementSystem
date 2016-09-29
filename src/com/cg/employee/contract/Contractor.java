package com.cg.employee.contract;

import com.cg.employee.Employee;

public class Contractor{
	private static int countOfContractBased;
	private String contractorName;
	
	
	public Contractor(String contractorName) {
		this.contractorName = contractorName;
	}
	
	abstract public class ContractBasedEmployee extends Employee{
	
		
		
		private int ratePerHour, numberOfHours;
		private String contractorName;
		
		
		public ContractBasedEmployee(String firstName, String lastName, String grade, String joiningDate,int ratePerHour, int numberOfHours) {
			super(firstName, lastName, grade, joiningDate);
			this.contractorName = Contractor.this.contractorName;
			this.ratePerHour = ratePerHour;
			this.numberOfHours = numberOfHours;
			calculateSalary();
		}
		{
			countOfContractBased = countOfContractBased + 1;
		}
		@Override
		public void calculateSalary() {
			
			if(numberOfHours <= 40){
				salary = ratePerHour * numberOfHours;
			}
			else
			{
				salary = 40 * ratePerHour + (numberOfHours - 40) * ratePerHour * 2;
			}
			
			
		}
		public String getContractorName() {
			return this.contractorName;
		}
		
		
	}
	public static int getCountOfContractBased() {
		return countOfContractBased;
	}
}