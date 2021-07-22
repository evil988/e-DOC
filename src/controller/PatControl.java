package controller;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import model.Pat;
import view.NewPat;

public class PatControl {
	
	public static void savePat(String nome, String dataDeNascimento, String endereco, String cpf, String nAmbulatorial, boolean possuiPlano, String nomePlano) {
		Pat patient = new Pat(nome, dataDeNascimento, endereco, cpf, nAmbulatorial, possuiPlano, nomePlano);
		
	}
	
	public static void displayNewPat(JFrame mw) {
		NewPat.displayNewPat(mw);
	}

	public static void clearNewPat() {
		NewPat.clearNewPat();
	}
}
