package stack;

public class StackArray <E> implements Stack <E> {
	private E[] sArray; //Im sArray werden die Stapelelemente gespeichert
	private int top; // top zeigt immer auf das oberste Element des Stapels
	
	// Drei Konstruktoren werden definiert, die das Array mit einer Anfangsgröße initialisieren 
	// und den top-Zeiger mit -1 (für leeren Stapel) initialisieren.
	
	public StackArray(E[] sArray){
		top= -1;
		this.sArray= sArray;
	}
	
	public StackArray(){
		top= -1;
		this.sArray= (E[]) new Object[100];	
	}
	
	public StackArray(int size){
		top= -1;
		this.sArray= (E[]) new Object[size];
	}
	
	public boolean empty() {
		return (top==-1);
	}
	
	public void push(E element){
		if (!full()) {
			top++;
			sArray[top]= element;
		} else {
			resizeArray();
			top++;
			sArray[top]= element;
		}
	}
	
	private boolean full() {
		return !(top < sArray.length-1);
	}
	
	private void resizeArray(){
		E[] temp= (E[]) new Object[sArray.length*2];
		for (int i= 0; i<sArray.length; i++){
			temp[i]= sArray[i];
		}
		sArray= temp;
	}
	
	public E pop() throws EmptyStackException {
		if (!empty()){
			top--;
			return sArray[top+1];
		} else throw new EmptyStackException(top);
	}
	
	public E peek() throws EmptyStackException {
		if (!empty()){
			return sArray[top];
		} else throw new EmptyStackException(top);		
	}

}
