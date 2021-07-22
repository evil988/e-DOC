package model;

public class Pat {
	
	private String nome;
	private String dataDeNascimento;
	private String endereco;
	private String cpf;
	private String nAmbulatorial;
	private String nomePlano;
	private boolean possuiPlano;
	
	public Pat(String nome, String dataDeNascimento, String endereco, String cpf, String nAmbulatorial, boolean possuiPlano, String nomePlano) {
		this.nome							= nome;
		this.dataDeNascimento	= dataDeNascimento;		
		this.endereco					= endereco;
		this.cpf							= cpf;
		this.nAmbulatorial		= nAmbulatorial;
		this.possuiPlano			= possuiPlano;
		this.nomePlano				= nomePlano;
	}

}
