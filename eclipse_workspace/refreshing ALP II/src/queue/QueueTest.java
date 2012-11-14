// QueueTest.java
//
// ALP III WS 12/13 - Uebung No. 1 
// by Christoph van Heteren-Frese and Sven Wildermann 

package queue;

public class QueueTest {
	public static void main(String[] args) {
		QueueArray<Integer> queue= new QueueArray<Integer>(5);
		
		System.out.println( "isEmpty: "+queue.isEmpty() );
		System.out.println( "isFull: "+queue.full() );
		
		try{
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			
			System.out.println( queue.dequeue() );
			System.out.println( "isEmpty: "+queue.isEmpty() );
			System.out.println( "isFull: "+queue.full() );
			
		} catch (EmptyQueueException eq){
			
		}
	}
}
