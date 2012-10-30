package stack;

class ListNode<T> {
	T element;
	ListNode<T> next;
	
	// Konstruktoren
	
	ListNode( T element, ListNode<T> next ){
		this.element = element;
		this.next = next;
		}
	ListNode() { this( null, null ); }
	}