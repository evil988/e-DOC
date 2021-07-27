package model;

import java.util.ArrayList;

import controller.DocControl;
import controller.Observable;

public class DocList implements Dao<Doc>, Observable{
	private ArrayList<Doc> doclist;
	private static DocList dl;
	
	private DocList() {
		doclist = new ArrayList<Doc>();
	}
	
	public static DocList getInstance() {
		if (dl == null)
			dl = new DocList();
		return dl;
	}

	@Override
	public void add(Doc obj) {
		doclist.add(obj);
		notifyObserver();
	}

	@Override
	public String[][] show() {
		String[][] rows = new String[doclist.size()][4];
		int i = 0;
		for (Doc doc : doclist) {
			rows[i][0] = doc.getNome();
			rows[i][1] = doc.getCpf();
			rows[i][2] = doc.getEspecialidade();
			rows[i][3] = doc.getCrm();
			i++;
		}
		return rows;
	}
	
	@Override
	public void notifyObserver() {
		DocControl.getInstance().change();
	}
}
