/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10513947;

import java.util.Scanner;

/**
 *
 * @author Edwin Etornam
 */
public class Odometer {
    /*
        1)it works
    */
     public static void main( String[] args ) throws Exception
    {
        Scanner kb=new Scanner(System.in);
        System.out.print("Which base (2-10) : ");
        int ans=kb.nextInt();
        for ( int thous=0; thous<ans; thous++ )
        //{
            for ( int hund=0; hund<ans; hund++ )
           // {
                for ( int tens=0; tens<ans; tens++ )
                //{
                    for ( int ones=0; ones<ans; ones++ )
                    {
                        System.out.println( " " + thous + "" + hund + "" + tens + "" + ones + "\r" );
                        Thread.sleep(500);
                    }
                //}
          //  }
        //}

        System.out.println();
    }
}
