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
public class NumberPuzzles1 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if (i%2==0 && j%2 == 0 && i+j==60 && i-j==14) {
                   System.out.print("("+i+","+j+")"); 
                }
               
                
            }
            System.out.println();
        }
        
    }
    
}
