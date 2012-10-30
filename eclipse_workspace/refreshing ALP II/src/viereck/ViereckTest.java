// ViereckTest.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann 

package viereck;
import java.awt.*; // Klasse Point verfügbar machen


public class ViereckTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point[] points= new Point[4];
		points[0]= new Point(0,0);
		points[1]= new Point(0,2);
		points[2]= new Point(2,2);
		points[3]= new Point(2,0);
		
		Viereck viereck= new Viereck(points);
		viereck.FindLines();
		System.out.println(viereck.flaeche());
		System.out.println(viereck.lines[1].m);

	}

}
