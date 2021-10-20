package com.learning.java14.record;

public class RecordExample {
	public static void main(String[] args) {
		
		//create employee record with values
		EmployeeRecord e1 = new EmployeeRecord(1L, "Prabhu", "Ganapthylingam", "prabhug1987@gmail.com", 38);
		//print id
		System.out.println(e1.id());
		//print email
		System.out.println(e1.email());
	//print the object
		System.out.println(e1);
		
		System.out.println();
	}

}
