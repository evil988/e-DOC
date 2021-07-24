package controller;

import javax.swing.JFrame;

public class Facade {
	
	private static PatControl pc;
	private static DocControl dc;
	
	public static void displayNewPat(JFrame mw) {	
		pc = PatControl.getInstance();
		pc.display(mw);
	}
	
	public static void displayPatTable(JFrame mw) {
		pc = PatControl.getInstance();
		pc.displayTable(mw);
	}
	
	public static void displayNewDoc(JFrame mw) {
		dc = DocControl.getInstance();
		dc.display(mw);
	}
	
	public static void displayDocTable(JFrame mw) {
		dc = DocControl.getInstance();
		dc.displayTable(mw);
	}

}
