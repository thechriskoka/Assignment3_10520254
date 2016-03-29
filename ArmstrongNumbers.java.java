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
public class ArmstrongNumbers {
    public static void main(String[] args) {
        double num=0.0;
        for(int i=1; i<10; i++){
           // System.out.println("Working on "+(i*100));
            for(int j=0; j<=9; j++){
             //   System.out.println("\tWorking on "+(j*10));
                for(int z=0; z<=9; z++){
               //     System.out.println("\t\tWorking on "+ z);
                    num=(Math.pow(z, 3))+(Math.pow(i, 3))+(Math.pow(j, 3));
                    if(num==((i*100)+(j*10)+z))
                        System.out.println(i+""+j+""+z);
                }
            }
        }
    }

}
