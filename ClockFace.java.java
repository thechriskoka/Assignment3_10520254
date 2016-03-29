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
public class ClockFace extends Canvas {
    public void paint (Graphics g){
        
        g.setColor(Color.black);
g.setFont(new Font(null));
for ( int X=0; X<800; X += 50 )
    g.drawString( String.valueOf(X), X, 50 );
for ( int Y=100; Y<600; Y += 50 )
    g.drawString( String.valueOf(Y), 28, Y );
// lines
g.setColor(Color.lightGray);
for ( int X=0; X<800; X += 50 )
    g.drawLine(X,0,X,599);    // horizontal
for ( int Y=0; Y<600; Y += 50 )
    g.drawLine(0,Y,799,Y);    // vertical


        //circle
        g.setColor(Color.black);
        g.drawOval(400,200,200,200);
        //numbers
        g.drawString("12", 495, 215);
        g.drawString("3", 590, 300);
        g.drawString("6", 495, 395);
        g.drawString("9", 405, 305);
        g.fillOval(495, 295, 10, 10);
        
        //seconds hands
        g.drawLine(500, 300, 420, 300);//minute hand
        g.drawLine(500, 300, 550, 250);//hour hand
        
        
    }
    
    public static void main(String[] args) {
        JFrame circle = new JFrame("Clock");
        circle.setSize(900,700);
        circle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        circle.add ( canvas );
        circle.setVisible(true);
    }
}
