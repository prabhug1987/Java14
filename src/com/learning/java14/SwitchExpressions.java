package com.learning.java14;
public class SwitchExpressions 
{
    public static void main(String[] argv) 
    {
        System.out.println(isWeekDayV1_1(Day.MON));     //true
        System.out.println(isWeekDayV1_2(Day.MON));     //true
        System.out.println(isWeekDayV2(Day.MON));       //true
    }
     
    //1 - Return value directly
     
    enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN
    };
  
    public static Boolean isWeekDayV1_1 (Day day) 
    {
        Boolean result = switch(day) {
            case MON, TUE, WED, THUR, FRI -> true;
            case SAT, SUN -> false;
        };
        return result;
    }
     
    public static Boolean isWeekDayV1_2 (Day day) 
    {
        Boolean result = switch(day) {
            case MON, TUE, WED, THUR, FRI : yield true;
            case SAT, SUN : yield false;
        };
        return result;
    }
     
    //2 - Multiple statements
     
    public static Boolean isWeekDayV2 (Day day) 
    {
        Boolean result = switch(day) {
            case MON, TUE, WED, THUR, FRI ->
            { 
                System.out.println("It is WeekDay");
                yield true; 
            }
            case SAT, SUN ->
            { 
                System.out.println("It is Weekend");
                yield false; 
            }
        };
        return result;
    }
}