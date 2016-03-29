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
public class Refresher {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String name;
        int n=0;
        
        System.out.print("What is your name: ");
        name=kb.next();
        
        if(name.equals("Mitchell"))
            n=5;
        else
            n=10;
        
        for(int i=1; i<=n; i++)
            System.out.println(name);
    }
}
