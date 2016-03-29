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
import javax.swing.*;
public class Circle extends Canvas {
    public void paint(Graphics g){
        //green circle
        g.setColor(Color.green);
        g.fillOval(300, 150, 300, 300);
        
    }
    
    public static void main(String[] args) {
        JFrame box = new JFrame("My Green Circle GUI");
        box.setSize(800,600);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        box.add( canvas );
        box.setVisible(true);
        
    }
}
