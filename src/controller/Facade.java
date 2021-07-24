package controller;

import javax.swing.JFrame;

public class Facade {	
			
	public static void displayNewPat(JFrame mw) {	
		getPatControl().display(mw);
	}
	
	public static void displayPatTable(JFrame mw) {
		getPatControl().displayTable(mw);
	}
	
	public static void displayNewDoc(JFrame mw) {
		getDocControl().display(mw);
	}
	
	public static void displayDocTable(JFrame mw) {
		getDocControl().displayTable(mw);
	}
	
	private static PatControl getPatControl() {
		return PatControl.getInstance();
	}
	
	private static DocControl getDocControl() {
		return DocControl.getInstance();
	}
}
