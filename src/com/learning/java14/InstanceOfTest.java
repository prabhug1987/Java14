package com.learning.java14;

public class InstanceOfTest {

	public static void main(String[] args) {
		String obj = "";
		
		if(obj instanceof String s) {
			System.out.println("it is a string");
		}else
			System.out.println("itis a object");
		
		
		String str3 =	"hello";
		String textBlock = """ world """;
		String joinedString = str3+ textBlock;
			
		
		String str4 = null;
		
		System.out.println(str4.charAt(0));
		
	}

}
