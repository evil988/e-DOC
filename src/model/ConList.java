package model;

import java.util.ArrayList;

import controller.ConControl;

public class ConList implements Dao<Consultation>, Observable{
	private ArrayList<Consultation> conList;
	private ConList cl;
	
	private ConList() {
		conList = new ArrayList<Consultation>();
	}
	
	public ConList getInstance() {
		if (cl == null) 
			cl = new ConList();
		return cl;
	}	
	
	@Override
	public void add(Consultation obj) {
		conList.add(obj);
		notifyObserver();
	}

	@Override
	public String[][] show() {
		String[][] rows = new String[conList.size()][4];
		int i = 0;
		for (Consultation cl : conList) {
			rows[i][0] = cl.getPatName();
			rows[i][1] = cl.getDocName();
			rows[i][2] = cl.getDate();
			rows[i][3] = cl.getTime();
			i++;
		}
		return rows;
	}

	@Override
	public void notifyObserver() {
		ConControl.getInstance().change();		
	}
}
