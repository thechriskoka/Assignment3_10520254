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
public class Sierpinski extends Canvas{
    public void paint(Graphics g){
        Random r = new Random();
        int dx,dy;
        int x1 = 512, x2 = 146, x3 = 876;
        int y1 = 109, y2 = 654, y3 = 654;
        Polygon vert = new Polygon();
        vert.addPoint(x1,y1);
        vert.addPoint(x2,y2);
        vert.addPoint(x3,y3);
        int x = 512, y = 382;
        vert.addPoint(x,y);
        for (int i = 0; i < 49999; i++) {
            g.drawLine(x,y,x,y);
            int a = 1+r.nextInt(3);
            if (a == 1) {
                 dx = x - x1;
                 dy = y - y1;
            }
            else if (a == 2){
                 dx = x - x2;
                 dy = y - y2;
            }
            else{
                 dx = x - x3;
                 dy = y - y3;
            }
            x = x - dx/2;
            y = y - dy/2;
        }
        g.drawString("Sierpinski Triangle",462,484);
    }
    public static void main(String[] args) {
        JFrame gui = new JFrame();
        gui.setSize(1024,768);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.add (new Sierpinski ());
        gui.setVisible(true);
        
    }
}
