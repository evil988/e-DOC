package controller;

public class Front implements Facade {	
	
	private static Front front;
	
	private Front() {}
	
	public static Front getFront() {
		if (front == null)
			front = new Front();
		return front;
	}	
	
	public PatControl getPatControl() {
		return PatControl.getInstance();
	}
	
	public DocControl getDocControl() {
		return DocControl.getInstance();
	}

}
