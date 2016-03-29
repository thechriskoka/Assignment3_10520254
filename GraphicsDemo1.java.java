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
import java.awt.*;
import javax.swing.JFrame;
public class GraphicsDemo1 extends Canvas{
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.drawRect(50,20,100,200); //draw a rectangle
        g.fillOval(160,20,100,200); //draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20);// a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(500,400,150,150);
        
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.",500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
        
    }
    
    public static void main(String[] args) {
        //You can change the title or size her if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
  
    
}

/**
 * 1. The windows is 800 pixels wide and 600 pixels tall.
 * 2. The first two numbers stand for the x and y position which are the starting position
 *      and the other two numbers are the width and height of the rectangle.
 * 3. The first two numbers stand for the x and y position which are the starting position 
 *      and the other two numbers are the width and height which are the height and width of the oval
 * 4. They are the x and y (Starting position) of the string
 * 5. The second object covers the first.
 */
