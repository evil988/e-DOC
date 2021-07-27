package controller;

import model.Pat;
import model.PatList;
import view.NewPat;
import view.PatTable;

public class PatControl implements Control{
	
	private static PatControl pc;
	
	private PatControl(){}
	
	public static PatControl getInstance() {
		if (pc == null)
			pc = new PatControl();
		return pc;		
	}
	
	public void save(String values[]) {		
		PatList.getInstance().add(new Pat(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
	}

	@Override
	public void regView(Object mw) {
		NewPat.getInstance().initialize(mw);
	}

	@Override
	public void tabView(Object mw) {
		PatTable.getInstance().initialize(mw);
	}

	@Override
	public String[][] tabRows() {
		return PatList.getInstance().show();
	}	

	@Override
	public void change() {
		PatTable.getInstance().update();	
	}	
}
