package controller;

import javax.swing.JFrame;

import view.DocTable;
import view.NewDoc;

public class DocControl {
	
	public static void displayNewDoc(JFrame mw) {
		NewDoc.displayNewDoc(mw);
	}
	
	public static void displayDocTable(JFrame mw) {
		DocTable.displayDocTable(mw);
	}
	
	public static void clearNewDoc() {
		NewDoc.clearNewDoc();
	}	
}
