package queue;

public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			
		} catch (FullQueueException fg ) {
			
		} catch (EmptyQueueException eq){
			
		}

	}

}
