package br.com.somosicev.tp.agenda.modelo;

public class PessoaJuridica extends Pessoa {
	
	private PessoaFisica responsavel;
	private CNPJ cnpj;

	public PessoaJuridica(String umNome, CNPJ cnpj2, Endereco umEndereco, Telefone umTelefone) {
		setNome(umNome);
		setDocumento(cnpj2);
		setEndereco(umEndereco);
		setTelefone(umTelefone);
	}

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
