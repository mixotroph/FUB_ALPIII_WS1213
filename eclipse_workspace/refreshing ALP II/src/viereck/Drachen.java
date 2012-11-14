// Drachen.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann 

package viereck;
import java.awt.*; 

public class Drachen extends Viereck {
	
	// -Diagonalen senkrecht aufeinander, eine Diagonale wird durch die andere halbiert
	// -es gibt zwei Paare benachbarter Seiten, die jeweils gleich lang sind
	
	public Drachen(){
		super();
		}
	public Drachen(Point[] points){
		super(points);
		if (!(super.angle()==90))
			System.out.println("Kein Drache!");
		}

}
