package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
/// String shapeType, int redComponent, int greenComponent, int blueComponent, boolean isFilled, double parameterOne, double parameterTwo, double parameterThree
/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double paramenterOne = in.nextDouble();
		double paramenterTwo = in.nextDouble();
		double paramenterThree = in.nextDouble();
		double paramenterFour = in.nextDouble();
		
		double paramenterFive = 0;
		double paramenterSix = 0;
		
		if (shapeType.equals("triangle")) {
			paramenterFive = in.nextDouble();
			paramenterSix = in.nextDouble();
		}
		
		double[]x = new double[]{paramenterOne, paramenterThree, paramenterFive};
		double[]y = new double[]{paramenterTwo, paramenterFour, paramenterSix};
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		//redComponent, greenComponent, blueComponent, isFilled,
		System.out.println(shapeType);
		if (shapeType.equals("rectangle") && !isFilled) {
			StdDraw.rectangle( paramenterOne, paramenterTwo, paramenterThree, paramenterFour);	
		}
		else if(shapeType.equals("rectangle")) {
			StdDraw.filledRectangle(paramenterOne, paramenterTwo, paramenterThree, paramenterFour);
		}
		else if(shapeType.equals("ellipse") && !isFilled) {
			StdDraw.ellipse(paramenterOne, paramenterTwo, paramenterThree, paramenterFour);
		}
		else if(shapeType.equals("ellipse")) {
			StdDraw.filledEllipse(paramenterOne, paramenterTwo, paramenterThree, paramenterFour);
		}

		else if(shapeType.equals("triangle") && !isFilled) {
			StdDraw.polygon(x,y);
		}
		else if(shapeType.equals("triangle")) {
			StdDraw.filledPolygon(x,y);
		}
		
		
		//System.out.println(shapeType+redComponent);
		
	}
}
