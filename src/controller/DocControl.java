package controller;

import model.Doc;
import model.DocList;
import view.DocTable;
import view.NewDoc;

public class DocControl implements Control{
	
	private static DocControl dc;
	
	private DocControl() {}
	
	public static DocControl getInstance() {
		if (dc == null)
			dc = new DocControl();
		return dc;
	}
	
	@Override
	public void save(String values[]) {
		DocList.getInstance().add(new Doc(values[0], values[1], values[2], values[3]));
	}	

	@Override
	public void regView(Object mw) {
		NewDoc.getInstance().initialize(mw);
	}

	@Override
	public void tabView(Object mw) {
		DocTable.getInstance().initialize(mw);
	}

	@Override
	public String[][] tabRows() {		
		return DocList.getInstance().show();
	}

	@Override
	public void recObs(Observer obs) {
		DocList.getInstance().register(obs);		
	}

	@Override
	public void unRegObs(Observer o) {
		DocList.getInstance().unregister(o);
	}
}
