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
		
		String a= in.next();
		
		int[] Color= new int[3];
	
		for(int i=0;i<3;i++)
		Color[i]= in.nextInt();
		Color Color1 = new Color(Color[0],Color[1],Color[2]);
		StdDraw.setPenColor(Color1);
		Boolean b=in.nextBoolean();
			
		double x= in.nextDouble();
		double y= in.nextDouble();
		double halfWidth= in.nextDouble();
		double halfHeight= in.nextDouble();
			
		StdDraw.rectangle(x, y, halfWidth, halfHeight);
		
	}
}
