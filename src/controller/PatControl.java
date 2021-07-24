package controller;

import javax.swing.JFrame;

import view.NewPat;
import view.PatTable;

public class PatControl implements Control<String>{
	
	private static PatControl pc;	
	private static PatTable pt;
	
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
		pt = PatTable.getInstance();
		pt.initialize(mw);
	}

	public void yes() {
		getNewPat().yes();	
	}
	
	public void no() {
		getNewPat().no();
	}
	
	public static NewPat getNewPat() {
		return NewPat.getInstance();
	}
}
