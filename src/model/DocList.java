package model;

import java.util.ArrayList;

import controller.Observable;
import controller.Observer;

public class DocList implements Dao<Doc, String[][]>, Observable{
	private ArrayList<Doc> doclist;
	private static DocList dl;
	private ArrayList<Observer> obslist;
	
	private DocList() {
		doclist = new ArrayList<Doc>();
		obslist = new ArrayList<Observer>();
	}
	
	public static DocList getInstance() {
		if (dl == null)
			dl = new DocList();
		return dl;
	}

	@Override
	public void add(Doc obj) {
		doclist.add(obj);
		notifyObservers();
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
	public void register(Observer obs) {
		obslist.add(obs);
		System.out.println("add" + obs);
		notifyObservers();
	}

	@Override
	public void unregister(Observer obs) {
		obslist.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : obslist) {
			o.update();
		}
	}
}
