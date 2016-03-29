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
import java.util.Scanner;
public class Keychains1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Ye Olde Keychain Shoppe");
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order"
                + "\n4. Checkout");
        System.out.print("Please enter your choice: ");
        
        int userChoice = input.nextInt();
        if (userChoice== 1){
            add_keychains();
        }
        else if (userChoice == 2){
            remove_keychains();
        }
        else if (userChoice == 3){
            view_order();
        }
        else if (userChoice == 4){
            checkout();
        }
        else {
            System.out.println("Invalid choice");
            System.out.print("Enter Input again: ");
        }
        
        while(userChoice!= 4){
            userChoice = input.nextInt();
            if (userChoice== 1){
            add_keychains();
        }
        else if (userChoice == 2){
            remove_keychains();
        }
        else if (userChoice == 3){
            view_order();
        }
        else if (userChoice == 4){
            checkout();
        }
        else {
            System.out.println("Invalid choice");
                System.out.print("Enter Input again: ");
        }
        }
        
    }
    public static void add_keychains(){
        System.out.println("ADD KEYCHAINS");
    }
    public static void remove_keychains(){
        System.out.println("REMOVE KEYCHAINS FROM ORDER");
    }
    public static void view_order(){
        System.out.println("VIEW ORDER");
    }
    public static void checkout(){
        System.out.println("CHECKOUT");
    }
}
