package controller;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import model.Pat;

public class PatControl {
	
	public static void savePat(JTextField nome, JDateChooser dataDeNascimento, JTextField endereco, JTextField cpf, JTextField nAmbulatorial, JRadioButton possuiPlano, JTextField nomePlano) {
		Pat patient = new Pat(nome, dataDeNascimento, endereco, cpf, nAmbulatorial, possuiPlano, nomePlano);
		
	}

}
