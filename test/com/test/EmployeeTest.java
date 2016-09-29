package com.test;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.cg.employee.Employee;
import com.cg.employee.EmployeeNotFoundException;
import com.cg.employee.contract.Contractor;
import com.cg.employee.permanent.ProjectManager;
import com.cg.util.LinkedList;
import com.cg.util.LinkedList.Node;

public class EmployeeTest {

	//static Employee employees[] = new Employee[3];
	public static void main(String[] args) {
		
		
		
		Employee p1 = new ProjectManager("bhagyashree", "modi", "BA3", "01/08/2016", 5);
		Employee p2 = new ProjectManager("Ashwini", "Joshi", "BA3", "01/08/2016", 10);
		Employee p3 = new ProjectManager("Shilpa", "Chanshetty", "BA3", "01/08/2016", 12);
		EmployeeKey ek1 = new EmployeeKey(1, "PM");
		EmployeeKey ek2 = new EmployeeKey(2, "TA");
		EmployeeKey ek3 = new EmployeeKey(3, "PM");
		//Map<Integer, Employee> employees = new TreeMap<>();
		Map<EmployeeKey, Employee> employees = new TreeMap<>();
		employees.put(ek1, p1);
		employees.put(ek2, p2);
		employees.put(ek3, p3);
		Integer a;
		Set<Entry<EmployeeKey, Employee>> entries = employees.entrySet();
		System.out.println("Using Tree Map :\n");
		for(Entry<EmployeeKey, Employee> entry:entries){
			System.out.print(entry);
		}
		Employee e = employees.get(new EmployeeKey(2,"TA"));
		System.out.println(e);
//		USING HASH MAP
		/*HashMap<EmployeeKey, Employee> employeesMap = new HashMap<>();
		employeesMap.put(ek1, p1);
		employeesMap.put(ek2, p2);
		employeesMap.put(ek3, p3);
		System.out.println(employeesMap.get(new EmployeeKey(2, "TA")));
		
		EmployeeKey p5 = new EmployeeKey(2, "TA");*/
		
		/*employees.put(p1.getId(), p1);
		
		employees.put(p3.getId(), p3);
		employees.put(p2.getId(), p2);
		//employees.put(2, p3);
		Employee e = employees.get(new Integer(4));
		try{
			if(e != null){
				System.out.println(e);
			}
			else{
				//System.out.println("Employee with the given id does not exist\n");
				throw new EmployeeNotFoundException("employee with given id is not found");
			}
		}catch(EmployeeNotFoundException ex){
			ex.printStackTrace();
		}
		Collection<Employee> t = employees.values();
		
		for(Employee emp: t){
			
			System.out.println(emp);
		}
		
		Set<Entry<Integer, Employee>> p = employees.entrySet();
		for(Entry<Integer, Employee> entry :p){
			System.out.println(entry);
		}
		
		*//*Contractor c = new Contractor("Barclays");
		LinkedList employees = new LinkedList();
		Node node1 = employees.new Node(p1);
		employees.insert(node1);
		Node node2= employees.new Node(p2);
		employees.insert(node2);
		Node n = employees.getNode(1);
		employees.delete(2);*/
		
		
		
	/*	Employee c1 = c.new ContractBasedEmployee("aishwarya", "malpani", "BA3", "01/08/2016", 50,30);
		employees[0] = p1;
		employees[1] = c1;
		employees[2] = p2;
		
		
	try {
			searchEmployee(1);
			searchEmployee(3);
			searchEmployee(4);
			
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			System.out.println("Finally is executed..");
		}
		//System.out.println("Permanent employees count is "+PermanentEmployee.getCountOfPermanent());
		//System.out.println("Contract based employees count is "+Contractor.getCountOfContractBased());
		
	}

	private static void searchEmployee(int id) throws EmployeeNotFoundException{
		
		int i;
		boolean flag = false;
		for(i = 0; i < employees.length; i++){
			if(id == employees[i].getId()){
				flag = true;
				System.out.println(employees[i].toString());
			}
		}
		if(flag == false)
			throw new EmployeeNotFoundException("Employee with Id "+id+" is not found\n");
	}*/
}
}