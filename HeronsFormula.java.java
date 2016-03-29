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
public class HeronsFormula {
//    public static void main( String[] args )
//	{
//		int a, b, c;
//		double s, A;
//		
//		a = 3;
//		b = 3;
//		c = 3;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 3,3,3 has an area of " + A );
//
//		a = 3;
//		b = 4;
//		c = 5;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 3,4,5 has an area of " + A );
// 
//		a = 7;
//		b = 8;
//		c = 9;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 7,8,9 has an area of " + A );
//
//		a = 5;
//		b = 12;
//		c = 13;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 5,12,13 has an area of " + A );
//
//		a = 10;
//		b = 9;
//		c = 11;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 10,9,11 has an area of " + A );
//		
//		a = 8;
//		b = 15;
//		c = 17;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 8,15,17 has an area of " + A );
    
//              a = 9;
//		b = 9;
//		c = 9;
//		s = (a+b+c) / 2.0;
//		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
//		System.out.println("A triangle with sides 9,9,9 has an area of " + A );
//	}
    
    //HeronsFormula.java
    /*
    1. Yes, they produce the same output
    2. HeronsFormulaNoFunction is 50 lines long and HeronsFormula.java is 30 lines long
    3. It was easier to fix in the file that used a function
    */
    public static void main( String[] args )
	{
		double a;
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of " + a );

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of " + a );
 
		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7,8,9 has an area of " + a );
                
                a = triangleArea(9, 9, 9);
                System.out.println("A triangle with sides 9,9,9 has an area of " + a );
                /*
                It is easier to fix in the file with the function.
                */
		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17) );
	}
 
	public static double triangleArea( int a, int b, int c )
	{
		// the code in this function computes the area of a triangle whose sides have lengths a, b, and c
		double s, A;

		s = (a+b+c) / 2.0;
		A = Math.sqrt( s*(s-a)*(s-b)*(s-c) );

		return A;
		// ^ after computing the area, "return" it
	}
}
