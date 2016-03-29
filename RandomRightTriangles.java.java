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
import java.util.Random;
public class RandomRightTriangles extends Canvas {
     public void paint (Graphics g){
        Random r = new Random();
        for (int i = 0; i < 500; i++) {
            Polygon triangle = new Polygon();
            //choosing random vertices
            int x = 60 + r.nextInt(600);
            int y = 60 + r.nextInt(500);
            //plot triangles
            triangle.addPoint(x,y);
             //x = 1 + r.nextInt(700);
             //y = 1 + r.nextInt(600);
            triangle.addPoint(x+50,y+50);
             //x = 1 + r.nextInt(700);
             //y = 1 + r.nextInt(600);
            triangle.addPoint(x,y+50);
            
            //choosing random colours
            int a = 1 + r.nextInt(255);
            int b = 1 + r.nextInt(255);
            int c = 1 + r.nextInt(255);
            Color triColors = new Color(a,b,c);
            g.setColor(triColors);
            g.fillPolygon(triangle);
        }
    
       
    }
    public static void main(String[] args) {
        JFrame randoms = new JFrame ("Random Triangles");
        randoms.setSize(750,650);
        randoms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        randoms.add (new RandomRightTriangles());
        randoms.setVisible(true);
    }
}
