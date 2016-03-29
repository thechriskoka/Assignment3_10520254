/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3_10513947;

/**
 *
 * @author Edwin Etornam
 */
public class GraphingParabolas {
    public static void main( String[] args )
	{
		double y;
		double a, h, k;

		GraphPaper gp1 = new GraphPaper(10,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp1.drawPoint(x,y);
		}

		GraphPaper gp2 = new GraphPaper(320,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 1;
			h = 4; k = 5;
			y = a*Math.pow(x-h,2) + k;
			gp2.drawPoint(x,y);
		}

		GraphPaper gp3 = new GraphPaper(630,10);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 0.5;
			h = -1; k = -3;
			y = a*Math.pow(x-h,2) + k;
			gp3.drawPoint(x,y);
		}

		GraphPaper gp4 = new GraphPaper(10,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 3;
			h = 0; k = 0;
			y = a*Math.pow(x-h,2) + k;
			gp4.drawPoint(x,y);
		}

		GraphPaper gp5 = new GraphPaper(320,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = 3;
			h = -3; k = 4;
			y = a*Math.pow(x-h,2) + k;
			gp5.drawPoint(x,y);
		}

		GraphPaper gp6 = new GraphPaper(630,320);
		for ( double x = -10; x<=10; x+=0.01 )
		{
			a = -0.5;
			h = -5; k = 5;
			y = a*Math.pow(x-h,2) + k;
			gp6.drawPoint(x,y);
		}   
    }
}
