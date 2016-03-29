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
public class FindingPrimeNumbers {
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=2; i<=20; i++){
            if(isPrime(i)==true){
                System.out.println(i+" <");
            }else{
                System.out.println(i);
            }
        }
    }
}
