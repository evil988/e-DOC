package view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainWindow{
	
	public MainWindow() {
		
		JFrame mw = new JFrame("e-DOC");
		mw.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		mw.setBounds(0, 0, 600, 350);			
			
		new Menu(mw);
				
		mw.setVisible(true);	
		
	}
}
