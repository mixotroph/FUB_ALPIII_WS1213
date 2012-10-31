package viereck;
import java.awt.Point;
import java.lang.Math;

public class Line2D{
	
	public Point a;
	public Point b;
	public double m, n, length;
	
	public Line2D() {
		this.a= new Point(0,0);
		this.b= new Point(0,0);
		m= ((double)(a.y-b.y) / (double)(a.x-b.x));
		n= a.y-( ( (double)(b.y-a.y) / (double)(b.x-a.x) ) * a.x);
		
	}
	
	public Line2D(Point a, Point b){
		this.a= a;
		this.b= b;
		m= ((double)(a.y-b.y) / (double)(a.x-b.x));
		n= a.y-( ( (double)(b.y-a.y) / (double)(b.x-a.x) ) * a.x);
		length= Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2));
	}

	public double length(){
		return Math.sqrt(Math.pow((a.x-b.x), 2) + Math.pow((a.y-b.y), 2));
	}
	
	public boolean cut(Line2D l){				
		return java.awt.geom.Line2D.linesIntersect(this.a.x, this.a.y, this.b.x, this.b.y,a.x, a.y, b.x, b.y);
	}
}
