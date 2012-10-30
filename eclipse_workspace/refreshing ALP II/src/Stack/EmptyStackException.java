package stack;

public class EmptyStackException extends Exception {
	Integer pos;
	public EmptyStackException(Integer pos) {
		super("Der Stapel ist leer!");
		this.pos= pos;
	}
	
	public EmptyStackException(){
		
	}
}
