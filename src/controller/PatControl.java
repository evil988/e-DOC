package controller;

import javax.swing.JFrame;

import view.NewPat;
import view.PatTable;

public class PatControl implements Control<String>{
	
	private static PatControl pc;
	
	private PatControl(){
		
	}
	
	public static PatControl getInstance() {
		if (pc == null)
			pc = new PatControl();
		return pc;		
	}
	
	public void save(String values[]) {		
		
	}
	
	public void display(JFrame mw) {
		getNewPat().initialize(mw);
	}

	public void clear() {
		getNewPat().clear();
	}
	
	public void displayTable(JFrame mw) {		
		getPatTable().initialize(mw);
	}

	public void yes() {
		getNewPat().yes();	
	}
	
	public void no() {
		getNewPat().no();
	}
	
	private static NewPat getNewPat() {
		return NewPat.getInstance();
	}
	
	private static PatTable getPatTable() {
		return PatTable.getInstance();
	}
}
