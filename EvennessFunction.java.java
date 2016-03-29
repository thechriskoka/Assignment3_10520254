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
public class EvennessFunction {
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean isDivisbleBy3(int num){
        if(num%3==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        for(int i=1; i<=20;i++){
            if((isEven(i)==true)&&(isDivisbleBy3(i)==true)){
                System.out.println(i+" <=");
            }else if(isEven(i)==true){
                System.out.println(i+" <");
            }else if(isDivisbleBy3(i)==true){
                System.out.println(i+" =");
            }else{
                System.out.println(i);
            }
        }
    }
    
}
