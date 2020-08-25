package br.com.somosicev.tp.agenda.modelo;

public abstract class Pessoa {

	private String nome;
	private Endereco endereco;
	private Telefone telefone;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	abstract Documento getDocumento();

	abstract public void setDocumento(Documento documento);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Pessoa))
			return false;

		Pessoa tmp = (Pessoa) obj;

		if (this.getDocumento().equals(tmp.getDocumento()))
			return true;

		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\t::"+getNome()+" ("+getDocumento()+")\n");
		sb.append("\t::"+getEndereco()+"\n");
		sb.append("\t::"+getTelefone()+"\n");
		return sb.toString();
	}
}
