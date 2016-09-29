package com.test;

public class EmployeeKey implements Comparable{

	private int id;
	private String suffix;
	public EmployeeKey(int id, String suffix) {
		
		this.id = id;
		this.suffix = suffix;
		
	}

	@Override
	public String toString() {
		return Integer.toString(this.id).concat("_").concat(this.suffix);
	
	}
	@Override
	public int hashCode() {
		return suffix.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(this.id == ((EmployeeKey)obj).id  &&  this.suffix.equals(((EmployeeKey)obj).suffix)){
			return true;
		}
		else
			return false;
	}
	@Override
	public int compareTo(Object o) {
	
		
		return ((this.id) - ((EmployeeKey)o).id) + (this.suffix.compareTo(((EmployeeKey)o).suffix));

		
	
	}
	
	
}
