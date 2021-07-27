package controller;

import model.PatList;
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
	public void recObs(Observer o) {
		PatList.getInstance().register(o);		
	}

	@Override
	public void unRegObs(Observer o) {
		PatList.getInstance().unregister(o);		
	}	
}
