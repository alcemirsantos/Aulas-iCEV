package br.com.somosicev.tp.agenda.visao;

import br.com.somosicev.tp.agenda.controle.PessoaFisicaDAO;
import br.com.somosicev.tp.agenda.modelo.CPF;
import br.com.somosicev.tp.agenda.modelo.Documento;
import br.com.somosicev.tp.agenda.modelo.Endereco;
import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.Telefone;
import java.util.Scanner

public class AgendaPessoaFisica extends Agenda {
	
	public AgendaPessoaFisica() {
		dao = new PessoaFisicaDAO();
	}

	@Override
	protected void exibirMenuAcoes() {
		super.exibirMenuAcoes();
		System.out.println("[1] Adicionar Pessoa Física");
		System.out.println("[2] Listar");
		System.out.println("[3] Remover");
		System.out.println("[4] Alterar");	
    
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
		CPF umDocumento = IU.coletaCPF();
		return new PessoaFisica(umNome, umDocumento, umEndereco, umTelefone);
	}

  @Override
	protected Documento coletarParametroDeBusca() {
    return IU.coletaCPF();
	}

}

