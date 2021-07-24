package controller;

import javax.swing.JFrame;

import view.DocTable;
import view.NewDoc;

public class DocControl implements Control<String>{
	
	private static DocControl dc;
	private static NewDoc nd;
	private static DocTable dt;
	
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
		nd = NewDoc.getInstance();
		nd.initialize(mw);
	}
	
	public void displayTable(JFrame mw) {
		dt = DocTable.getInstance();
		dt.initialize(mw);
	}
	
	public void clear() {
		nd = NewDoc.getInstance();
		nd.clear();
	}	
}
