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
public class Boxy3 extends Canvas{
    
    public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 220, 30, 150 );

		// draw six more boxes -- different colors, different places, different sizes
                 drawBox(window, Color.BLUE, 150, 100,70,90);
                drawBox(window, Color.ORANGE, 100,450,100,100);
                drawBox(window, Color.BLACK, 250, 450,40,80);
                drawBox(window, Color.MAGENTA, 350,150,80,80);
                drawBox(window, Color.DARK_GRAY, 450,200,60,40);
                drawBox(window, Color.PINK, 300,350,80,120);
	}
	
	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
            window.setColor(c);
            window.fillRect(x, y, w, h);
            //erase the centre and fill with white
            window.setColor(Color.WHITE);
            window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
