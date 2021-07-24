package controller;

import javax.swing.JFrame;

public class Facade {	
	
	private static DocControl dc;
	
	public static void displayNewPat(JFrame mw) {	
		getPatControl().display(mw);
	}
	
	public static void displayPatTable(JFrame mw) {
		getPatControl().displayTable(mw);
	}
	
	public static void displayNewDoc(JFrame mw) {
		dc = DocControl.getInstance();
		dc.display(mw);
	}
	
	public static void displayDocTable(JFrame mw) {
		dc = DocControl.getInstance();
		dc.displayTable(mw);
	}
	
	private static PatControl getPatControl() {
		return PatControl.getInstance();
	}
}
