package controller;

public class Front implements Fac {
	private static final int PATIENT = 0, DOCTOR = 1, CONSULTATION = 2;
	
	private static Front front;
	
	private Front() {}
	
	public static Front getFront() {
		if (front == null)
			front = new Front();
		return front;
	}
	
	@Override
	public Control redirect(int type) {
		if (type == PATIENT)
			return PatControl.getInstance();
		else
			if (type == DOCTOR)
				return DocControl.getInstance();
			else
				if (type == CONSULTATION)
					return ConControl.getInstance();
			else
				return null;
	}

}
