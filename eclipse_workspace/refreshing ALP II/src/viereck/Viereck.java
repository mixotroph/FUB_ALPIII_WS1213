// Viereck.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann  

// alle Innenwinkel < 180

package viereck;
import java.awt.*; // Klasse Point verf�gbar machen
import java.util.*;

public class Viereck implements Figure {
	// Array um Punkte zu speichern
	private Point[] points= new Point[4];
	private Line2D[] lines = new Line2D[6];
	double area, umfang;
	
	// KONSTRUKTOREN
	// Konstruktor f�r Viereck ohne Ecken
	public Viereck() {
		for (int i= 0; i< 4; i++)
			points[i]= new Point();
	}
	
	// Konstrutor f�r �bergabe eines Arrays
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
	}
	
	// Punkte sortieren f�r Trapezformel?

	
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
	
	// flaeche() berechnet den Fl�cheninhalt des Vierecks
	public double flaeche() {
		
		//sortPoints();
		
		// falls Punkte in richtiger Reihenfolge eingegeben: Gau�'sche Trapezformel 
		double erg= ((points[0].y-points[2].y) * (points[3].x-points[1].x)) + 
				((points[1].y-points[3].y) * (points[0].x-points[2].x));
		return 0.5*Math.abs(erg);
	}
	
	// umfang() berechnet den Umfang des Vierecks
	public double umfang() {
		return 0;
	}
	
	// erm�glicht zwei Vierecke zu vergleichen
	public int compareTo(Figure f){
		// z.B. Differenz zwischen Fl�cheninhalten zur�ckgeben
		return 0;
	}

	public static double angleBetween2Lines(Line2D line1, Line2D line2)
    {    /* liefert den Winkel zwischen 
        double angle1 = Math.atan2(line1.getY1() - line1.getY2(),
                                   line1.getX1() - line1.getX2());
        double angle2 = Math.atan2(line2.getY1() - line2.getY2(),
                                   line2.getX1() - line2.getX2());
        return angle1-angle2;
    }  

}
