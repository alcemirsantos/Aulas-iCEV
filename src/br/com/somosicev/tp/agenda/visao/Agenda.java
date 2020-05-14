package br.com.somosicev.tp.agenda.visao;

import br.com.somosicev.tp.agenda.controle.DAO;
import br.com.somosicev.tp.agenda.modelo.Documento;
import br.com.somosicev.tp.agenda.modelo.Endereco;
import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.PessoaJuridica;
import br.com.somosicev.tp.agenda.modelo.Telefone;

public abstract class Agenda {

	protected DAO dao;
	
	public void inicia() {
		// Template Method
		exibirMenuAcoes();
		int acao = IU.coletarOpcaoEscolhida();
		executar(acao);
	}

	/**
	 * Exibe o menu principal da Agenda.
	 */
	protected void exibirMenuAcoes() {
		System.out.println("\n:: MENU DE AÇÕES ::");	
	}

	/**
	 * Executa a {@code acao} escolhida pelo usuário do programa.
	 *  
	 * @param acao
	 */
	protected void executar(int acao) {
		switch (acao) {
		case 1: // adicionar
			Pessoa p = criarPessoa(); 
			dao.adicionar(p);
			System.out.println("\nPessoa cadastra com sucesso!");
			System.out.println(p);
			break;
		case 2:  // buscar, remover, alterar
			Documento d = coletarParametroDeBusca();
			dao.buscar(d);
		case 3:
		default:
			break;
		}
		System.out.println("=======");
	}

	
	/**
	 * Cria uma objeto do tipo {@link Pessoa} com o objetivo de salvar na base 
	 * de dados. Esta pode ser uma {@link PessoaFisica} ou {@link PessoaJuridica}.
	 * @return
	 */
	protected abstract Documento coletarParametroDeBusca();

	/**
	 * Cria uma objeto do tipo {@link Pessoa} com o objetivo de salvar na base 
	 * de dados. Esta pode ser uma {@link PessoaFisica} ou {@link PessoaJuridica}.
	 * @return
	 */
	protected abstract Pessoa criarPessoa();
}
