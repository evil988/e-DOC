package controller;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import model.Pat;
import view.NewPat;

public class PatControl {
	
	public static void savePat(JTextField nome, JDateChooser dataDeNascimento, JTextField endereco, JTextField cpf, JTextField nAmbulatorial, JRadioButton possuiPlano, JTextField nomePlano) {
		Pat patient = new Pat(nome, dataDeNascimento, endereco, cpf, nAmbulatorial, possuiPlano, nomePlano);
		
	}
	
	public static void displayNewPat(JFrame mw) {
		NewPat.displayNewPat(mw);
	}

	public static void clearNewPat(JTextField textField, JDateChooser dateChooser, JTextField textField_1,
			JTextField textField_2, JTextField textField_3, JRadioButton rdbtnNo, JTextField textField_4) {
		textField.setText(null);
		dateChooser.setCalendar(null);
		textField_1.setText(null);
		textField_2.setText(null);
		textField_3.setText(null);
		rdbtnNo.doClick();
		textField_4.setText(null);		
	}
}
