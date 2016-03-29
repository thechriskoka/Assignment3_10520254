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
public class Boxy1 extends Canvas{
    public void paint( Graphics g )
	{
            
             
		// this code draws a 100x100 box in blue at (200,300)
		g.setColor(Color.BLUE);
		g.fillRect(200,300,100,100);
		// this code "erases" the center of the box by painting over it in white
		g.setColor(Color.WHITE);
		g.fillRect(210,310,80,80);
		
		// draw three more boxes -- different colors, different places
                g.setColor(Color.RED);
                g.fillRect(100,100,100,100);
                //erase the middle and fill with white
                g.setColor(Color.WHITE);
                g.fillRect(110, 110, 80, 80);
                
                //box3
                g.setColor(Color.GREEN);
                g.fillRect(400,100,100,100);
                //erase the middle and fill with white
                g.setColor(Color.WHITE);
                g.fillRect(410, 110, 80, 80);
                
                //box4
                g.setColor(Color.YELLOW);
                g.fillRect(450, 400, 100, 100);
                //erase the middle and fill with white
                g.setColor(Color.WHITE);
                g.fillRect(460, 410, 80, 80);
	}       
        

	public static void main( String[] args )
	{
		Canvas canvas = new Boxy1();
		JFrame win = new JFrame("Boxy1 - make them manually");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
    
}
