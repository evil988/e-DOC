package controller;

import view.NewPat;
import view.PatTable;

public class PatControl implements Control<NewPat, PatTable>{
	
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
	public NewPat getRegView() {
		return NewPat.getInstance();
	}

	@Override
	public PatTable getTabView() {
		return PatTable.getInstance();
	}
}
