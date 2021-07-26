package model;

public class Doc {
	
	private String nome;
	private String cpf;
	private String especialidade;
	private String crm;
	
	public Doc(String nome, String cpf, String especialidade, String crm) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.especialidade = especialidade;
		this.crm = crm;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public String getCrm() {
		return this.crm;
	}
	
}
