package model;

import javax.swing.JTextField;

public class Doc {
	
	private String nome						= "";
	private String cpf						= "";
	private String especialidade	= "";
	private String crm						= "";
	
	public Doc(JTextField nome, JTextField cpf, JTextField especialidade, JTextField crm) {
		
		this.nome 					= nome.getText();
		this.cpf						= cpf.getText();
		this.especialidade	= especialidade.getText();
		this.crm						= crm.getText();
		
	}	
	
}
