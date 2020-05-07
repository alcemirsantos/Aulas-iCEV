package br.com.somosicev.listas.agenda.modelo;

public class PessoaFisica extends Pessoa {

	private CPF cpf;
	
	@Override
	Documento getDocumento() {
		return this.cpf;
	}

	@Override
	public void setDocumento(Documento documento) {
		this.cpf = (CPF) documento;
	}

}
