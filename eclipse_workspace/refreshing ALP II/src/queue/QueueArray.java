//
// QueueArray.java
//
// ALP III Uebung No. 1
// by Christoph van Heteren-Frese on 23/10/12 
//

package queue;

public class QueueArray <E> implements Queue <E> {
	private E[] queue; //Im qArray werden die Stapeleente gespeichert
	private int head; // top zeigt immer auf das oberste eent des Stapels
	private int tail;
		
// Konstruktoren
	
	public QueueArray(E[] queue){
		head= 0;
		tail= 0;
		this.queue= queue;
	}
		
	public QueueArray(){
		head= 0;
		tail= 0;
		this.queue= (E[]) new Object[100];	
	}
		
	public QueueArray(int size){
		head= 0;
		tail= 0;
		this.queue= (E[]) new Object[size];
	}

	public int size(){
		// returns number of elements not capacity
		if (tail > head)
			return Math.abs(tail-head); // keine ML
		else return 0; 
	}
	
	public boolean isEmpty(){
		return head == tail;
	}
	
	public void enqueue ( E e ){
		if ( !full() ) {					// wenn die Warteschlange nicht voll ist...
		queue[tail] = e;
		if ( tail == (queue.length-1) )		// hier wird geprüft, ob tail am Ende des Feldes ist
		tail = 0;
		else tail++;
		} 
		//else throw new FullQueueException();
	}
	
	public E dequeue() throws EmptyQueueException {
		if ( !isEmpty() ) {					// Wenn die Warteschlange nicht leer ist...
			E e = queue[head];
			if ( head == (queue.length-1) )		// Wenn head am Ende des Feldes ist...
					head = 0;
					else head++;
					return e;
			} else
			throw new EmptyQueueException();
		}
	
	// Implementierung zusätzlicher Funktionen
	
	public boolean full () {
		return (( tail == queue.length-1 ) && ( head == 0 ))
		|| ( head == ( tail+1 )) ;
	}
	
	public E head(){
		return null;
		
	}
}

