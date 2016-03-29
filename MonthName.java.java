/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment3_10520254;

/**
 *
 * @author Richmond Chris-Koka
 */
public class MonthName {
    
    public static String month_name( int month )
	{
		String result;
                
		// Your code goes in here.
                switch (month){
                    case 1: 
                       result = "January";
                        return result;
                        //break;
                    case 2: 
                        result = "February";
                        return result;
                       // break;
                    case 3:
                        result = "March";
                        return result;
                    case 4: 
                        result = "April";
                        return result;
                    case 5:
                        result = "May";
                        return result;
                    case 6:
                        result = "June";
                        return result;
                    case 7:
                        result = "July";
                        return result;
                    case 8:
                        result = "August";
                        return result;
                    case 9:
                        result = "September";
                        return result;
                    case 10:
                        result = "October";
                        return result;
                    case 11:
                        result = "November";
                        return result;
                    case 12:
                        result = "December";
                        return result;
                    default:
                        result = "error";
                        return result;
                                
                                
                }
               
		
		
	}


	public static void main( String[] args )
	{
		System.out.println( "Month 1: " + month_name(1) );
		System.out.println( "Month 2: " + month_name(2) );
		System.out.println( "Month 3: " + month_name(3) );
		System.out.println( "Month 4: " + month_name(4) );
		System.out.println( "Month 5: " + month_name(5) );
		System.out.println( "Month 6: " + month_name(6) );
		System.out.println( "Month 7: " + month_name(7) );
		System.out.println( "Month 8: " + month_name(8) );
		System.out.println( "Month 9: " + month_name(9) );
		System.out.println( "Month 10: " + month_name(10) );
		System.out.println( "Month 11: " + month_name(11) );
		System.out.println( "Month 12: " + month_name(12) );
		System.out.println( "Month 43: " + month_name(43) );
	}
        


}
