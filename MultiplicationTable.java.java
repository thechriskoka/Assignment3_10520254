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
public class MultiplicationTable {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 12; i++) {
            //System.out.print(i+" ");
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
            
        }
    }
    
}
