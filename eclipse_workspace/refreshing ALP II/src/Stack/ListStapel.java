package stack;

public class ListStapel<T> implements Stack <T> {
		
	/* Instanzvariablen */
	private ListNode<T> head;
	
	/* Konstruktor */
	public ListStapel() {

	}
	
	public boolean empty() {
		// Der Stapel ist leer, wenn das head-Element auf die Konstante null zeigt
		return head == null; 
	}
	
	public void push(T element) {
		head= new ListNode<T>(element,head);
	}
	public T pop() throws EmptyStackException {
		if ( empty() )
			throw new EmptyStackException();
		T element = head.element;
		head = head.next;
		return element;
	}
}
		

