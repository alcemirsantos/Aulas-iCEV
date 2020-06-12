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
			Pessoa nova = criarPessoa(); 
			adicionar(nova);
			break;
		case 2:  // buscar
			Documento d = coletarParametroDeBusca();
			dao.buscar(d);
			Pessoa resultado = dao.buscar(d);
			System.out.println(resultado);
			break;
		case 3: // remover
			// pedir Documento
			Documento r = coletarParametroDeBusca();
			// buscar Pessoa
			Pessoa alvo = new Pessoa (null, r, null, null)
			System.out.printf("A pessoa a ser removida é: %n%s ?",dao.buscar(alvo));
			// confirmar pessoa a excluir
			confirmar q = IU.confirmar();
			// excluir de fato.
			(q==true)? dao.remover(alvo) : null;
			break;
      case 4: 
		      // coletando o documento da pessoa
		      Documento d = coletarParametroDeBusca();
		      // buscando a pessoa
		      Pessoa velha = dao.buscar(d);
		      // cofirmar exclusão  
		      System.out.println("deseja alterar essa pessoa");
		      System.out.println(velha);
		      boolean resposta = IU.confirmar();
		      // pedir dados da nova
		      Pessoa nova = coletaPessoaNova();
		      // alterar de fato
		      if(resposta==true)
		       dao.alterar.(velha, nova);
		      break;
		default:
			break;
		}
		System.out.println("=======");
	}

	public boolean adicionar(Pessoa nova) {
		try {
			dao.adicionar(nova);
		} catch (Exception e) {
			// TODO tratar exceção
			return false;
		}
		System.out.println("\nPessoa cadastra com sucesso!");
		System.out.println(nova);
		return true;
	}

	/**
	 * Cria uma objeto do tipo {@link Pessoa} com o objetivo de salvar na base de
	 * dados. Esta pode ser uma {@link PessoaFisica} ou {@link PessoaJuridica}.
	 * 
	 * @return
	 */
	protected abstract Documento coletarParametroDeBusca();

	/**
	 * Cria uma objeto do tipo {@link Pessoa} com o objetivo de salvar na base de
	 * dados. Esta pode ser uma {@link PessoaFisica} ou {@link PessoaJuridica}.
	 * 
	 * @return
	 */
	protected abstract Pessoa criarPessoa();

	protected Pessoa coletaPessoaNova() {
		nova = velha;
		System.out.pintln("o que deseja alterar ?");
	}
}
