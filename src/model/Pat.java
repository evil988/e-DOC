package model;

public class Pat {
	
	private String nome;
	private String dataDeNascimento;
	private String endereco;
	private String cpf;
	private String nAmbulatorial;
	private String nomePlano;
	private String possuiPlano;
	
	public Pat(String nome, String dataDeNascimento, String endereco, String cpf, String nAmbulatorial, String possuiPlano, String nomePlano) {
		this.nome							= nome;
		this.dataDeNascimento	= dataDeNascimento;		
		this.endereco					= endereco;
		this.cpf							= cpf;
		this.nAmbulatorial		= nAmbulatorial;
		this.possuiPlano			= possuiPlano;
		this.nomePlano				= nomePlano;
	}

	public String getNome() {
		return nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public String getnAmbulatorial() {
		return nAmbulatorial;
	}

	public String getNomePlano() {
		return nomePlano;
	}

	public String isPossuiPlano() {
		return possuiPlano;
	}

}
