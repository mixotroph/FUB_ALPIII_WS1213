package viereck;
import java.awt.Point;

public class Line2DTest {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point a= new Point(-3,-2);
		Point b= new Point(0,1);
		MyLine2D line= new MyLine2D(a,b);
		
		System.out.println(line.length());
		System.out.println(line.m);
		System.out.println(line.n);
		
	}

}
