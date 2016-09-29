package com.cg.employee;

public abstract class Employee {
	private static int EmpCount;
	private int id;
	private String firstName, lastName, grade;
	private String joiningDate;
	protected int salary;

	public Employee(String firstName, String lastName, String grade, String joiningDate) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.joiningDate = joiningDate;
		this.id = EmpCount;
		
	}

	{

		EmpCount = EmpCount + 1;

	}

	public static int getCount() {
		return EmpCount;
	}
	@Override
	public String toString() {
		String employee;
		employee = "Id : " + id + " Full name: " + this.firstName+" "+this.lastName + " Grade:" + this.grade + " Joining Date: " + this.joiningDate + " Salary: "+salary+"\n";
		return employee;
		
	}
	abstract public void calculateSalary();
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
	}
	
}
