// ViereckTest.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann 

package viereck;
import java.awt.*; // Klasse Point verfügbar machen
	
public class ViereckTest {
	
	public static void main(String[] args) {
		
		Point[] points1= new Point[4];
		points1[0]= new Point(0,0);
		points1[1]= new Point(1,1);
		points1[2]= new Point(1,0);
		points1[3]= new Point(0,1);
		
		Point[] points2= new Point[4];
		points2[0]= new Point(0,1);
		points2[1]= new Point(0,-2);
		points2[2]= new Point(-1,0);
		points2[3]= new Point(0,1);
		
		Trapez viereck1= new Trapez(points1);
		Drachen viereck2= new Drachen(points2);
		
		
		System.out.println(viereck2.flaeche());
		System.out.println(viereck2.umfang());
		//System.out.println(viereck.p1.m);
		//System.out.println(viereck.p2.m);
		System.out.println(viereck1.compareTo(viereck1));

	}

}
