/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10513947;

import static assignment3_10513947.MonthName.month_name;
import static assignment3_10513947.MonthOffset.month_offset;
import java.util.Scanner;

/**
 *
 * @author Edwin Etornam
 */
public class WeekdayCalculator {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on "+weekday(mm,dd,yyyy));
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";

		// bunch of calculations go here
                yy=yyyy-1900;
                total=yy/4;
                total+=yy;
                total+=dd;
                total+=month_offset(mm);
                if(is_leap(yyyy) && ((month_name(mm).equals("January"))
                                    ||month_name(mm).equals("Feburary"))){
                    total+= -1;
                }
                
		date =  weekday_name(total%7) + ", " +month_name(mm) + ", "+ yyyy;

		return date;
	}


	// paste your functions from MonthName, WeekdayName, and MonthOffset here
		
	public static boolean is_leap( int year )
	{
		// years which are evenly divisible by 4 are leap years,
		// but years divisible by 100 are not leap years,
		// though years divisible by 400 are leap years
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;
	}

    public static String weekday_name(int dd) {
        String day="";
        if(dd==1){
            day="Sunday";
        }else if(dd==2){
            day="Monday";
        }else if(dd==3){
            day="Tuesday";
        }else if(dd==4){
            day="Wednessday";
        }else if(dd==5){
            day="Thursday";
        }else if(dd==6){
            day="Friday";
        }else if(dd==7){
            day="Saturday";
        }else{
            day="error";
        }
        return day;
    }
}
