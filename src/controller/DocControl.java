package controller;

import javax.swing.JFrame;
import javax.swing.JTextField;

import view.NewDoc;

public class DocControl {
	
	public static void displayNewDoc(JFrame mw) {
		NewDoc.displayNewDoc(mw);
	}
	
	public static void clearNewDoc(JTextField textField, JTextField textField_1, JTextField textField_2, JTextField textField_3) {
		textField.setText(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);		
	}
}
