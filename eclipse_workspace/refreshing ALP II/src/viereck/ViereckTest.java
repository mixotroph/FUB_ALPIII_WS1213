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
		
		Point[] points= new Point[4];
		points[0]= new Point(0,0);
		points[1]= new Point(0,2);
		points[2]= new Point(2,2);
		points[3]= new Point(2,0);
		
		Viereck viereck= new Viereck(points);
		viereck.FindLines();
		
		for (int i= 0; i<6;i++){
			System.out.println(viereck.lines[i].a.toString()+viereck.lines[i].b.toString());	
		}
		System.out.println(viereck.d1.a.toString()+viereck.d1.b.toString());
		System.out.println(viereck.d2.a.toString()+viereck.d2.b.toString());
		//System.out.println(viereck.lines[1].m);
		//if (viereck.d1.a==viereck.d1.a)
				System.out.println("JA");
	}

}
