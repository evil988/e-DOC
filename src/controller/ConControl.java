package controller;

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
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

}
