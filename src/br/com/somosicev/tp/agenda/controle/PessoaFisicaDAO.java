package br.com.somosicev.tp.agenda.controle;

import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.db.BDPessoaFisica;

public class PessoaFisicaDAO extends PessoaDAO {

	public PessoaFisicaDAO() {
		bd = new BDPessoaFisica();
	}
	
	@Override
	public void adicionar(Object o) {
		PessoaFisica nova = null;
		if(o instanceof PessoaFisica) {
			nova = (PessoaFisica) o;
			bd.adicionar(nova);
		}
	}

	@Override
	public void buscar(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remover(Object o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterar(Object velho, Object novo) {
		// TODO Auto-generated method stub

	}

}
