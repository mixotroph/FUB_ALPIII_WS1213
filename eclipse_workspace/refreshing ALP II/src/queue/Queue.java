//
// Queue.java
//
// ALP III Uebung No. 1
// by Christoph van Heteren-Frese on 23/10/12 
//

package queue;

public interface Queue<E>{
	
	// Funktionen laut Aufgabenstellung
	public int size();
	public boolean isEmpty();
	public void enqueue(E e) throws FullQueueException;
	public E dequeue() throws EmptyQueueException;
	
	// zusätzliche Funktionen
	public E head() throws EmptyQueueException;
	public boolean full();
	public String toString();
}
