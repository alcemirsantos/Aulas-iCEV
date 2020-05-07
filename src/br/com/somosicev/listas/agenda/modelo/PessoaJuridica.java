package br.com.somosicev.listas.agenda.modelo;

public class PessoaJuridica extends Pessoa {
	
	private PessoaFisica responsavel;
	private CNPJ cnpj;

	@Override
	public Documento getDocumento() {
		return this.cnpj;
	}

	@Override
	public void setDocumento(Documento documento) {
		this.cnpj = (CNPJ) documento;
	}

	public PessoaFisica getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(PessoaFisica responsavel) {
		this.responsavel = responsavel;
	}

	
}
