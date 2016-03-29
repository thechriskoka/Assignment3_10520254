/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10513947;

/**
 *
 * @author Edwin Etornam
 */
public class NestedLoops {
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        /*
            1)n changes faster
            2)the letters change as the numbers remain constant
            3) it prints horizontally
            4)it prints space between every three prints
        */
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
             {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.println( a + "-" + b + " " );
            }
            // * You will add a line of code here.
            System.out.println("");
        }

        System.out.println("\n");

    }
    
}
