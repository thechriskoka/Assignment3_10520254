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
public class SmilingFaceFunction extends Canvas {
    public void paint( Graphics g )
	{
           
		drawSmilingFace(g,100,100);
		drawSmilingFace(g,400,350);
                drawSmilingFace(g,500,500);
                drawSmilingFace(g,500,100);
                drawSmilingFace(g,100,350);
                drawSmilingFace(g,200,450);
                drawSmilingFace(g,700,100);
                drawSmilingFace(g,600,350);
                drawSmilingFace(g,300,200);
		// etc
	}

	public void drawSmilingFace( Graphics g, int x, int y )
	{
		// Draws a smiling face on the screen, where the point (x,y) is
		//  the upper-left corner of a box containing the face.
                
		// draw circle for the head
         
           
                g.setColor(Color.yellow);
                g.fillOval(x,y,150, 150);

		// draw eyes
                g.setColor(Color.blue);
                g.fillOval(x+30,y+30, 25, 25);//left eye
                g.fillOval(x+100,y+30, 25, 25);//right eye

		// draw mouth
                g.setColor(Color.red);
                g.drawArc(x+50,y+70, 50, 50, 200, 150);
	}

	public static void main(String[] args)
	{
		// You can change the title or size here if you want.
		JFrame win = new JFrame("Smiling Face Function");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new SmilingFaceFunction() );
		win.setVisible(true);
	}
}
