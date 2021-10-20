package com.learning.java14.record;

import java.io.Serializable;

/**
 * create employee record with constructors
 * @author Prabhu G
 *
 */
public record EmployeeRecord(Long id,String firstName, String lastName, String email, int age) implements Serializable{

	/*public EmployeeRecord() {
		if(age < 18) {
			throw new IllegalAccessException("you create a employee with age less than 18 ");
		}
	}*/
}

//public record EmployeeRecord(@Transient Long id,String firstName, String lastName, String email, int age){

//}
