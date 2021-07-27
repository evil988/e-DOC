package model;

import java.util.ArrayList;

import controller.Observable;
import controller.PatControl;

public class PatList implements Dao<Pat>, Observable{
	private static PatList pl;
	private ArrayList<Pat> patlist;
	
	private PatList() {
		patlist = new ArrayList<Pat>();
	};
	
	public static PatList getInstance() {
		if (pl == null)
			pl =  new PatList();
		return pl;
	}
	
	
	@Override
	public void add(Pat obj) {
		patlist.add(obj);
		notifyObserver();
	}

	@Override
	public String[][] show() {
		String[][] rows = new String[patlist.size()][7];
		int i =  0;
		for (Pat pat : patlist) {
			rows[i][0] = pat.getNome();
			rows[i][1] = pat.getDataDeNascimento();
			rows[i][2] = pat.getEndereco();
			rows[i][3] = pat.getCpf();
			rows[i][4] = pat.getnAmbulatorial();
			rows[i][5] = pat.isPossuiPlano();
			rows[i][6] = pat.getNomePlano();
		}
		return rows;
	}
	
	@Override
	public void notifyObserver() {
		PatControl.getInstance().change();		
	}
}
