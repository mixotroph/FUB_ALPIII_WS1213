
public interface Queue<E> {
	public int size();
	public boolean isEmtpy();
	public void enqueue(E e);
	public E dequeue() throws EmtpyQueueException;

}
