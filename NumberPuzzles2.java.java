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
public class NumberPuzzles2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int digit=0;
        do{
            System.out.println("1) Find two digit numbers <= 56 with sums of digits>10 \n"
                              +"2) Find two digit number minus number reversed which equals sum of digits\n"
                              +"3) Quit \n\n");
            System.out.print("> ");
            digit=input.nextInt();
            if(digit==1){
                findSumLess();
            }else if(digit==2){
                reversed();
            }
        }while(digit!=3);
    }
    
    public static void findSumLess(){
        for(int i=1; i<=9; i++){
              for(int j=0; j<=9; j++){
                  if(((i+j)>10)&&((i*10)+j)<65)
                    System.out.println(i+""+j);
              }
        }
        System.out.println("");
    }
    
    public static void reversed(){
       int diff=0;
        for(int i=1; i<=9; i++){
              for(int j=0; j<=9; j++){
                  diff=((i*10)+j)- ((j*10)+i);
                  if(diff==(i+j))
                    System.out.println(i+""+j);
              }
        }
        System.out.println("");
    }
    
}
