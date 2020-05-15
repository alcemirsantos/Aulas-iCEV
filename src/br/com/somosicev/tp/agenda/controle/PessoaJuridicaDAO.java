package br.com.somosicev.tp.agenda.controle;

import br.com.somosicev.tp.agenda.modelo.db.BDPessoaJuridica;

public class PessoaJuridicaDAO implements DAO {

	private BDPessoaJuridica bd;

	public PessoaJuridicaDAO() {
		bd = new BDPessoaJuridica();
	}

	@Override
	public void adicionar(Object o) {
    PessoaJuridica nova = null;
    if (o instanceof PessoaJuridica) {
			nova = (PessoaJuridica) o;
			bd.adicionar(nova);
	}

	@Override
	public PessoaJuridica buscar(Object o) {
    PessoaJuridica alvo = null;
    if (o instanceof PessoaJuridica) {
      alvo = (PessoaJuridica) o;
      bd.buscar(alvo)
    }
    return null;
	}

	@Override
	public void remover(Object o) {
    PessoaJuridica alvo = null;
    if (o instanceof PessoaJuridica) {
      alvo = (PessoaJuridica) o;
      bd.remover(alvo)
    }
	}

	@Override
	public void alterar(Object velho, Object novo) {
		// TODO Auto-generated method stub
    PessoaJuridica velha = null;
    PessoaJuridica nova = null;
    if (velho and novo instanceof PessoaJuridica) {
      velha = (PessoaJuridica) velho;
      nova = (PessoaJuridica) nova;
      bd.atualizar(velha,nova)
    }
	}
}
