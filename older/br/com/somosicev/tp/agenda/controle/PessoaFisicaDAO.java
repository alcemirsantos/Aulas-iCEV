package br.com.somosicev.tp.agenda.controle;

import java.util.List;

import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.db.BDPessoaFisica;

public class PessoaFisicaDAO extends PessoaDAO {

	public PessoaFisicaDAO() {
		bd = new BDPessoaFisica();
	}

	@Override
	public void adicionar(Object o) {
		PessoaFisica nova = null;
		if (o instanceof PessoaFisica) {
			nova = (PessoaFisica) o;
			bd.adicionar(nova);
		}
	}

	@Override
	public List<Object> buscar(Object o) {
		PessoaFisica alvo = null;
		if (o instanceof PessoaFisica) {
			alvo = (PessoaFisica) o;
			return bd.buscar(alvo);
		}
		return null;
	}

	@Override
	public void remover(Object o) {
		PessoaFisica alvo = null;
		if (o instanceof PessoaFisica) {
			alvo = (PessoaFisica) o;
			bd.remover(alvo);
		}
	}

	@Override
	public void alterar(Object velho, Object novo) {
    PessoaFisica velha = null;
    PessoaFisica nova = null;
    if((velho instanceof PessoaFisica)&&()) {
      velha = (PessoaFisica) velho;
      nova = (PessoaFisica) novo;
      bd.atualizar(velha,nova);
    }
	}

}
