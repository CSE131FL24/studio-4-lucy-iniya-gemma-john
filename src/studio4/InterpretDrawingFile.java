package studio4;

import java.awt.Color;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean bob = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		double a = in.nextDouble();
		
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(x, y, z, a);
		
		
		
		
	}
}
