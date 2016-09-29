package com.cg.util;

import com.cg.employee.Employee;

public class LinkedList {

	private int length = 0;
	Node head,tail;
	
	public class Node{
		
		Employee employee;
		Node next;

		public Node(Employee E) {
			this.employee = E;
			next = null;
			
		}
		
	} 
	public void insert(Node node){
		
		if(this.head == null){
			this.head = node;
			this.tail = node;
			
		}
		else
		{
			this.tail.next = node;
			this.tail = node;
			
		}
		this.length++;
		
	}
	public Node getNode(int id){
		
		Node n = searchNode(id);
		if(n != null){
			
			return n;
		}
		else
			return null;
		
	}
	private Node searchNode(int id) {
		Node n;
		n = this.head;
		for(int i = 0; i < this.length; i++){
			if(id == n.employee.getId())
			{
				return n;
			}
			else{
				n = n.next;
			}
		}
		return null;
		
	}
	public int getLength()
	{
		return this.length;
	}
	public void delete(int id){
		
		Node n,prev = null;
		n = this.head;
		for(int i = 0; i < this.length; i++){
			if(id == n.employee.getId())
			{
				
				if(this.length == 1){
					this.head = this.tail = null;
					
				}
				else if(n.equals(this.head)){
					
					this.head = n.next;
				}
				else if(n.equals(this.tail)){
					
					this.tail = prev;
				}
				else{
					prev.next = n.next;
					
				}
				n.next = null;
				this.length--;
			}
			prev = n;
			n = n.next;
			
		}
	}
	
}
