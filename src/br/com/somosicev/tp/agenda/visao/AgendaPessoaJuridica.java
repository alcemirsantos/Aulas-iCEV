package br.com.somosicev.tp.agenda.visao;

import br.com.somosicev.tp.agenda.controle.PessoaJuridicaDAO;
import br.com.somosicev.tp.agenda.modelo.CNPJ;
import br.com.somosicev.tp.agenda.modelo.Documento;
import br.com.somosicev.tp.agenda.modelo.Endereco;
import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.PessoaJuridica;
import br.com.somosicev.tp.agenda.modelo.Telefone;

public class AgendaPessoaJuridica extends Agenda {

	public AgendaPessoaJuridica() {
		dao = new PessoaJuridicaDAO();
	}
	
	@Override
	protected void exibirMenuAcoes() {
		super.exibirMenuAcoes();
		System.out.println("[1] Adicionar Pessoa Jurídica");
//		System.out.println("[2] Listar");
//		System.out.println("[3] Remover");	
	}

	@Override
	protected Pessoa criarPessoa() {
		System.out.println("\n=== Cadastro de Pessoa Física ===");
		// nome
		String umNome = IU.coletaNome();
		// endereco
		Endereco umEndereco = IU.coletaEndereco();
		// telefone
		Telefone umTelefone = IU.coletaTelefone(); 
		// documento
		CNPJ cnpj = IU.coletaCNPJ();
		
//		PessoaFisica responsavel = new PessoaFisica(umNome, umDocumento, umEndereco, umTelefone);
		return new PessoaJuridica(umNome, cnpj, umEndereco, umTelefone);
	}

	@Override
	protected Documento coletarParametroDeBusca() {
		// TODO Auto-generated method stub
		return null;
	}

}
