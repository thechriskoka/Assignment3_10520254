/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10513947;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Edwin Etornam
 */
public class MotivationalPoster extends Canvas
{
    Image coolFace;
	
	public MotivationalPoster() throws Exception
	{
		coolFace = ImageIO.read( new File("src/assignment3_10518900/resources/mitch.png") );
                // Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
                g.setColor(Color.black);
                g.fillRect(0, 0, 800, 600);
                g.drawImage(coolFace, 200, 50, 480, 400, Color.white,this);
                
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
		g.setColor(Color.white);
                g.setFont(new Font("Calibri", Font.PLAIN+Font.BOLD, 60));
                g.drawString("MR, MITCHELL", 200,500);
                g.setFont(new Font("Calibri", Font.PLAIN, 30));
                g.drawString("NOT A CYBORG. PROBABLY", 230, 530);
	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("Motivational Poster");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}
    
}
