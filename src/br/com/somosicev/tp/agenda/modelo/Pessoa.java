package br.com.somosicev.tp.agenda.modelo;

public abstract class Pessoa {

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
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Pessoa)) return false;
		
		Pessoa tmp = (Pessoa) obj;
		
		if(this.getDocumento().equals(tmp.getDocumento())) return true;
		
		return false;
	}

}
