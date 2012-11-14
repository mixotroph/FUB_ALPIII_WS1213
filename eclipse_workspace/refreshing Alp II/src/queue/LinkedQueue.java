package queue;
import java.util.LinkedList;

import LinkedList.Queue;


public class LinkedQueue<E> implements Queue <E>{
 
	private LinkedList<E> queue;  
	// private Variable des Types "LinkedList"
	
	public int size(){
		//auf die Methode "size" von "LinkedList" zugreifen
		// und Ergebnis zurückgeben
		return queue.size();
	}
	
	public boolean isEmtpy() {
		//auf die Methode "isEmtpy" von "LinkedList" zugreifen
		// und Ergebnis zurückgeben
		return queue.isEmpty();
	}
	public void enqueue ( E e ){
		//zum anfügen wird die Methode "add" von LinkedList genutzt
		queue.add(e);		
	}

	public E dequeue() throws EmptyQueueException {
		//zum entfernen wird die Methode "removeFirst von Linked List genutzt
		return queue.removeFirst();
	}	
}
