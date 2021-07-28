package controller;

import model.ConList;
import model.Consultation;
import view.ConTable;
import view.NewCon;

public class ConControl implements Control{
	
	private static ConControl cc;
	
	private ConControl() {}
	
	public static ConControl getInstance() {
		if (cc == null)
			cc = new ConControl();
		return cc;
	}

	@Override
	public void save(String[] values) {
		ConList.getInstance().add(new Consultation(values[0], values[1], values[2], values[3]));		
	}

	@Override
	public String[][] tabRows() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void regView(Object mw) {
		NewCon.getInstance().initialize(mw);
	}

	@Override
	public void tabView(Object mw) {
		ConTable.getInstance().initialize(mw);
	}

	@Override
	public void change() {
		NewCon.getInstance().update();	
	}

}
