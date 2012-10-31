public class EmtpyQueueException extends Exception {
	
	
	public EmtpyQueueException(){
		super("Die Warteschlange enthält keine Elemente." +
				"Diese Operation ist daher nicht möglich");
	}

}
