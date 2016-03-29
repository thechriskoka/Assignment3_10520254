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
public class SmilingFace extends Canvas {
    public void paint(Graphics g){
        // labels
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


        //face outline
        g.setColor(Color.yellow);
        g.fillOval(300, 150, 300, 300);
        //eyes
        g.setColor(Color.blue);
        g.fillOval(380, 230, 40, 40);//left eye
        g.fillOval(480, 230, 40, 40);//right eye
        //smile
        g.setColor(Color.red);
        g.drawArc(410, 300, 70, 70, 200, 150);
        
   
    }
    
    public static void main(String[] args) {
        JFrame win = new JFrame("Smiling Face");
        win.setSize(900,700);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add ( canvas );
        win.setVisible(true);
    }
    
}
