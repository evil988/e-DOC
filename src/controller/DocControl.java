package controller;

import model.Doc;
import model.DocList;
import view.DocTable;
import view.NewDoc;

public class DocControl implements Control<NewDoc, DocTable>{
	
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
	public NewDoc getRegView() {
		return NewDoc.getInstance();
	}

	@Override
	public DocTable getTabView() {
		return DocTable.getInstance();
	}

	@Override
	public String[][] tabRows() {		
		return DocList.getInstance().show();
	}
}
