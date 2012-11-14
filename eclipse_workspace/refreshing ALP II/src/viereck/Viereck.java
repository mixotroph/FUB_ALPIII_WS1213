// Viereck.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann  

package viereck;
import java.awt.*; // Klasse Point verfügbar machen

public class Viereck implements Figure {
	
	//Ein Viereck hat...
	private Point[] points= new Point[4];				// Array um Punkte zu speichern
	protected MyLine2D[] lines = new MyLine2D[6];		// Array um alle Linien zu speichern
	private MyLine2D d1, d2;							// zwei diaginale Linien

	// Vorannahmen
	// Um ein Vierck zu konstruieren müssen vier gültige (!) Punkte übergeben werden
	
	// Konstruktor für Viereck ohne Übergabe von Punkten
	public Viereck() {
		for (int i= 0; i< 4; i++)
			points[i]= new Point();
	}
	
	// Konstrutor für Übergabe eines Arrays
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
	// Falls man auf die Punkte zugreifen will
	public Point GetPoint(int i) {
		return this.points[i];
	}
	// Falls man auf die Linien zugreifen will
	public MyLine2D[] GetLines() {
		return this.lines;
	}
	
	// Alle Seiten und die Diagonalen erstellen
	public void FindLines() {
		int n=0;
		for(int i= 0; i<4;i++) {
			for(int j= i+1; j<4;j++) {			
				 this.lines[n]= new MyLine2D(points[i],points[j]);
				 n++;
			}
		}
		boolean cut, commonPoints;
		for (int i= 0; i<6; i++) {
			for (int j=i+1; j<6; j++) {
				// schneiden sich die Linien?
				cut= lines[i].cut(lines[j]);
				
				// besitzen die Linien gemeinsame Punkte?
				commonPoints= (lines[i].a==lines[j].a || lines[i].b==lines[j].b || 
						lines[i].a==lines[j].b || lines[i].b==lines[j].a);
				
				// wenn sich die Linien schneiden und keine gemeinsamen Punkte besitzen, sind es die Diagonalen
				if ( cut && !commonPoints) {
					d1= lines[i];
					d2= lines[j];
				}
			}
		}
	}
		
	public double angle(){
		//einzelne Winkel der Diagonalen berechnen
        double angle1= Math.atan2(d1.a.y - d1.b.y, d1.a.x - d1.b.x);
        double angle2= Math.atan2(d2.a.y - d2.b.y, d2.a.x - d2.b.x);
        
        //Winkel verrechnen
        return angle1-angle2;
	}
	
	// flaeche() berechnet den Flächeninhalt des Vierecks
	public double flaeche() {
		//einzelne Winkel der Diagonalen berechnen
        double angle1= Math.atan2(d1.a.y - d1.b.y, d1.a.x - d1.b.x);
        double angle2= Math.atan2(d2.a.y - d2.b.y, d2.a.x - d2.b.x);
        
        //Winkel verrechnen
        double angle= angle1-angle2;
        
        //Formel zur Berrechnung des Flächeninhalts
		return Math.abs((0.5*d1.length*d2.length)*Math.sin(angle));
	}
	
	// umfang() berechnet den Umfang des Vierecks
	public double umfang() {
		double u=0;
		// alle Seiten aufsummieren
		for (int i= 0; i<6; i++){
			u+=lines[i].length;
		}
		// Summe aller Seiten ohne die Diagonalen zurückgeben
		return u-d1.length-d2.length;
	}
	
	// ermöglicht zwei Vierecke zu vergleichen
	public int compareTo(Figure f){
		// z.B. Flächeninhalten als Vergliechskriterium
		if (this.flaeche() > f.flaeche())
			return 1;
		if (this.flaeche() < f.flaeche())
			return -1;
		return 0;
	}
}
