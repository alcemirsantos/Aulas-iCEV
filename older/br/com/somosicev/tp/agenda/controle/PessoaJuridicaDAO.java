package br.com.somosicev.tp.agenda.controle;

import br.com.somosicev.tp.agenda.modelo.db.BDPessoaJuridica;

public class PessoaJuridicaDAO implements DAO {

	private BDPessoaJuridica bd;

	public PessoaJuridicaDAO() {
		bd = new BDPessoaJuridica();
	}

	@Override
	public void adicionar(Object o) {
		// TODO Auto-generated method stub
		bd.get
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
