// Viereck.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann  

// alle Innenwinkel < 180

package viereck;
import java.awt.*; // Klasse Point und anderes Zeug verfŸgbar machen
import java.util.*;

public class Viereck implements Figure {
	//Ein Viereck hat...
	private Point[] points= new Point[4];		// Array um Punkte zu speichern
	public Line2D[] lines = new Line2D[6];		// Array um Linien zu speichern
	Line2D d1, d2;								// diaginale Linien
	double area, umfang;						// FlŠche und Umfang
	
	// Vorannahmen
	// Um ein Vierck zu konstruieren mŸssen vier Punkte Ÿbergeben werden
	
	// Konstruktor fŸr Viereck ohne †bergabe von Punkten
	public Viereck() {
		for (int i= 0; i< 4; i++)
			points[i]= new Point();
	}
	
	// Konstrutor fŸr †bergabe eines Arrays
	public Viereck(Point[] points){
		if (points.length == this.points.length) {
			this.points= points;
			FindLines();
		}
		else System.out.println("Zu viele Punkte");
	}
	
	// getter and setter for Points
	public void SetPoint(int i, Point p) {
		this.points[i]= p;
		FindLines();
	}
	
	public Point GetPoint(int i) {
		return this.points[i];
	}
	
	// Seiten erstellen
	public void FindLines() {
		int n=0;
		for(int i= 0; i<4;i++) {
			for(int j= i+1; j<4;j++) {			
				 this.lines[n]= new Line2D(points[i],points[j]);
				 n++;
			}
		}
		
		for (int i= 0; i<6; i++) {
			for (int j=i+1; j<5; j++) {
				if (lines[i].cut(lines[j]) && !(lines[i].a==lines[j].a || lines[i].b==lines[j].b || 
						lines[i].a==lines[j].b || lines[i].b==lines[j].a)) {
					d1= lines[i];
					d2= lines[j];
				}
			}
		}
	}

	
	// Punkte sortieren fŸr Trapezformel?

	private void sortPoints() {
		int[] t= new int[4];
		Point[] temp= new Point[4];
		for (int i= 0; i < points.length; i++)
				t[i]= points[i].x;
		Arrays.sort(t);
		for (int i= 0; i < points.length; i++) {
			for (int j= 0; j < points.length; j++) {
			if  (t[i] == points[j].x)
					temp[i]= points[j];
			}		
			points= temp;
		}
		
	}
	
	// flaeche() berechnet den FlŠcheninhalt des Vierecks
	public double flaeche() {
		
		//sortPoints();
		
		// falls Punkte in richtiger Reihenfolge eingegeben: Gau§'sche Trapezformel 
		double erg= ((points[0].y-points[2].y) * (points[3].x-points[1].x)) + 
				((points[1].y-points[3].y) * (points[0].x-points[2].x));
		return 0.5*Math.abs(erg);
	}
	
	
	
	// umfang() berechnet den Umfang des Vierecks
	public double umfang() {
		return 0;
	}
	
	// ermšglicht zwei Vierecke zu vergleichen
	public int compareTo(Figure f){
		// z.B. Differenz zwischen FlŠcheninhalten zurŸckgeben
		return 0;
	}
}
