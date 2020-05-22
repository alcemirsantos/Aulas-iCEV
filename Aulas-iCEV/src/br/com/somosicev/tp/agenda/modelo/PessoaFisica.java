package br.com.somosicev.tp.agenda.modelo;

public class PessoaFisica extends Pessoa {

	private CPF cpf;
	
	public PessoaFisica(String umNome, CPF umDocumento, Endereco umEndereco, Telefone umTelefone) {
		setNome(umNome);
		setDocumento(umDocumento);
		setEndereco(umEndereco);
		setTelefone(umTelefone);
	}

	@Override
	Documento getDocumento() {
		return this.cpf;
	}

	@Override
	public void setDocumento(Documento documento) {
		this.cpf = (CPF) documento;
	}

}
