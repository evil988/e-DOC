package controller;

import javax.swing.JFrame;

import model.Pat;
import view.NewPat;
import view.PatTable;

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
	
	public static void displayPatTable(JFrame mw) {
		PatTable.displayPatTable(mw);
	}

	public static void yes() {
		NewPat.yes();		
	}
	
	public static void no() {
		NewPat.no();
	}
}
