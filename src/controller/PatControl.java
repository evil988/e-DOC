package controller;

import javax.swing.JFrame;

import view.NewPat;
import view.PatTable;

public class PatControl implements Control{
	
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

	@Override
	public void RegView(Object mw) {
		NewPat.getInstance().initialize(mw);
	}

	@Override
	public void TabView(Object mw) {
		PatTable.getInstance().initialize(mw);
	}

	@Override
	public String[][] tabRows() {
		// TODO Auto-generated method stub
		return null;
	}
}
