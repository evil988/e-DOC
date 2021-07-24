package controller;

import javax.swing.JFrame;

import view.NewPat;
import view.PatTable;

public class PatControl implements Control<String>{
	
	private static PatControl pc;
	private static NewPat np;
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
		np = NewPat.getInstance();
		np.initialize(mw);
	}

	public void clear() {
		np = NewPat.getInstance();
		np.clear();
	}
	
	public void displayTable(JFrame mw) {		
		pt = PatTable.getInstance();
		pt.initialize(mw);
	}

	public void yes() {
		np = NewPat.getInstance();
		np.yes();	
	}
	
	public void no() {
		np = NewPat.getInstance();
		np.no();
	}
}
