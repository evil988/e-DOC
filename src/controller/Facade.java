package controller;

import javax.swing.JFrame;

public class Facade {
	
	public static void displayNewPat(JFrame mw) {
		PatControl.displayNewPat(mw);
	}
	
	public static void displayPatTable(JFrame mw) {
		PatControl.displayPatTable(mw);
	}
	
	public static void displayNewDoc(JFrame mw) {
		DocControl.displayNewDoc(mw);
	}
	
	public static void displayDocTable(JFrame mw) {
		DocControl.displayDocTable(mw);
	}

}
