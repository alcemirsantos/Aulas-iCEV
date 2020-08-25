package br.com.somosicev.listas.lista04.q01;

public class Contato {
	
	private String nome;
	private String telefone;
	private String endereco;

	public Contato() {
		this("novo contato", "1234-1234", "rua dos anzóis,123");
	}

	public Contato(String nome) {
		this(nome, "  ", "  ");
	}
	
	public Contato(String nome, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
