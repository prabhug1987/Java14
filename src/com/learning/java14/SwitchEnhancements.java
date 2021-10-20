package com.learning.java14;

public class SwitchEnhancements {
	
	public static void main(String[] args) {
		int choice = 2;
		switch(choice) {
			case 1:
				System.out.println(choice);
			break;
			case 2:
				System.out.println(choice);
				break;
			case 3:
				System.out.println(choice);
				break;
			default:
				System.out.println("integer is greater than 3");
		
		}
		
		switch(choice) {
		case 1, 2, 3:
			System.out.println(choice);
			break;
		default:
			System.out.println("integer is greater than 3");
		}
		
		int x = switch(choice){
		case 1, 2, 3:
			yield choice;
			default:
				yield -1;
				
	};
		
		System.out.println("x = "+ x);
		
		
		
	}
	
	enum Day{
		SUN,MON,TUE;
	};

	public String getDay(Day d) {
		String day = switch(d) {
		case SUN -> "SUNDAY";
		case MON -> "MONDAY";
		case TUE -> "TUESDAY";
		};
		
		return day;
	}

}
