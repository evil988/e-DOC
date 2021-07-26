package controller;

import view.DocTable;
import view.NewDoc;

public class DocControl implements Control<NewDoc, DocTable>{
	
	private static DocControl dc;
	
	private DocControl() {
		
	}
	
	public static DocControl getInstance() {
		if (dc == null)
			dc = new DocControl();
		return dc;
	}
	
	public void save(String values[]) {
		
	}	

	@Override
	public NewDoc getRegView() {
		return NewDoc.getInstance();
	}

	@Override
	public DocTable getTabView() {
		return DocTable.getInstance();
	}
}
