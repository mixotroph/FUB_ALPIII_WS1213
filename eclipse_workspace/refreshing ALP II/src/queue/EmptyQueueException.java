// EmptyQueueException.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann 


package queue;
public class EmptyQueueException extends Exception {
	
	public EmptyQueueException(){
		super("Die Warteschlange enthält keine Elemente." +
				"Diese Operation ist daher nicht möglich");
	}

}
