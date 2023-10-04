package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(0.5, 0.5, .4, .25);
		
		double[]x = new double[]{0.1, 0.1, 0.9};
		double[]y = new double[]{0.25, 0.5, 0.25};
		
		StdDraw.setPenColor(154,207,97);
		StdDraw.filledPolygon(x, y);
		
		double[]x2 = new double[]{0.5, 0.9, 0.9};
		double[]y2 = new double[]{0.75, 0.25, 0.75};
		
		StdDraw.setPenColor(230, 199, 44);
		StdDraw.filledPolygon(x2, y2);
		
		StdDraw.setPenColor(154,207,97);
		StdDraw.filledRectangle(.5, .5, .07, .07);
		
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledCircle(.5, .5, .07);
	}
}