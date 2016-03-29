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
import java.awt.Polygon;
public class BoringTriangle extends Canvas {
    public void paint(Graphics g){
       
//         g.setColor(Color.black);
//g.setFont(new Font(null));
//for ( int X=0; X<800; X += 50 )
//    g.drawString( String.valueOf(X), X, 50 );
//for ( int Y=100; Y<600; Y += 50 )
//    g.drawString( String.valueOf(Y), 28, Y );
//// lines
//g.setColor(Color.lightGray);
//for ( int X=0; X<800; X += 50 )
//    g.drawLine(X,0,X,599);    // horizontal
//for ( int Y=0; Y<600; Y += 50 )
//    g.drawLine(0,Y,799,Y);    // vertical

        Polygon triangle = new Polygon();
        triangle.addPoint(400,100);
        triangle.addPoint(550,300);
        triangle.addPoint(400,300);
        
        Color myColor = new Color (204,102,204);
        g.setColor(myColor);
        g.fillPolygon(triangle);
    }
    
    public static void main(String[] args) {
        JFrame triangle = new JFrame("Boring Triangle");
        triangle.setSize(700, 500);
        triangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        triangle.add(new BoringTriangle());
        triangle.setVisible(true);
    }
    
}
