package viereck;
import java.awt.Point;
import java.lang.Math;

public class MyLine2D{
	// Eine Linie ist definiert durch...
	public Point a;						// einen Punkt
	public Point b;						// noch einen Punkt
	public double m, n, length;			// eine Steigung (m), einen y-Achsenschnittpunkt (n) und einer LŠnge
	
	// Konstruktoren
	
	public MyLine2D() {
		this.a= new Point(0,0);
		this.b= new Point(0,0);
		m= ((double)(a.y-b.y) / (double)(a.x-b.x));
		n= a.y-( ( (double)(b.y-a.y) / (double)(b.x-a.x) ) * a.x);
		
	}
	
	public MyLine2D(Point a, Point b){
		this.a= a;
		this.b= b;
		m= ((double)(a.y-b.y) / (double)(a.x-b.x));
		n= a.y-( ( (double)(b.y-a.y) / (double)(b.x-a.x) ) * a.x);
		length= Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2));
	}
	
	public double length(){
		// berechnet die LŠnge einer Linie
		return Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2));
	}
	

	public boolean cut(MyLine2D l){	
		// liefert true, wenn sich die Linien schneiden
		return java.awt.geom.Line2D.linesIntersect(this.a.x, this.a.y, this.b.x, this.b.y, 
				l.a.x, l.a.y, l.b.x, l.b.y);
	}
}
