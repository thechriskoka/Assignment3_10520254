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
public class AreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What shape do you want to calculate an area for? ");
        System.out.println("1.Circle \t 2. Rectangle \t 3. Square \t 4. Triangle \n (Choose numbers only)");
        
        int userChoice = input.nextInt();
        System.out.println();
        if (userChoice == 1){
            System.out.print("Input radius: ");
            int rad = input.nextInt();
            System.out.println("\nYour area is: "+area_circle(rad));
            
        }
        else if (userChoice == 2){
            System.out.print("Input Length: ");
            int len = input.nextInt();
            System.out.print("Input Width: ");
            int wid = input.nextInt();
            System.out.print("\nYour area is: "+area_rectangle(len, wid));
            
        }
        else if (userChoice == 3){
            System.out.print("Input side:");
            int sid = input.nextInt();
            System.out.print("\nYour area is: "+area_square(sid));
            
        }
        else if (userChoice == 4) {
            System.out.print("Input base: ");
            int bas = input.nextInt();
            System.out.print("Input height: ");
            int heig = input.nextInt();
            System.out.print("\nYour area is: " + area_triangle(bas, heig)); 
            
        }
        else{
            System.out.println("Sorry, wrong choice. \n Goodbye");
        }
    }
    
    
    public static double area_circle(int radius){
        double circArea = Math.PI*radius*radius;
        return circArea;
    }
    
    public static int area_rectangle(int length, int width){
        int rectArea = length*width;
        return rectArea;
    }
    
    public static int area_square(int side){
        int sqArea = side*side;
        return sqArea;
    }
    
    public static double area_triangle(int base, int height){
        double triArea = 0.5 * base * height;
        return triArea;
    }
}
