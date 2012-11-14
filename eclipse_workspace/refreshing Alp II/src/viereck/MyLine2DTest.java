// Lin2DTest.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann  

package viereck;
import java.awt.Point;

public class MyLine2DTest {
	
	public static void main(String[] args) {
		
		//Punkte festlegen
		Point a= new Point(-3,-2);
		Point b= new Point(0,1);
		//Linie erzeugen
		MyLine2D line= new MyLine2D(a,b);
		//Attribute ausgeben
		System.out.println(line.length());
		System.out.println(line.m);
		System.out.println(line.n);	
	}
}
