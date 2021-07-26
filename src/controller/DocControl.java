package controller;

import javax.swing.JFrame;

import view.DocTable;
import view.NewDoc;

public class DocControl implements Control<String>{
	
	private static DocControl dc;
	
	private DocControl() {
		
	}
	
	public static DocControl getInstance() {
		if (dc == null)
			dc = new DocControl();
		return dc;
	}
	
	public void save(String values[]) {
		
	}
	
	public void display(JFrame mw) {
		getNewDoc().initialize(mw);
	}
	
	public void displayTable(JFrame mw) {
		getNewDocTable().initialize(mw);
	}	
	
	private static NewDoc getNewDoc() {
		return NewDoc.getInstance();
	}
	
	private static DocTable getNewDocTable() {
		return DocTable.getInstance();
	}
}
