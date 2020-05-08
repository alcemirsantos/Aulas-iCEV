package br.com.somosicev.tp.agenda.modelo.db;

import java.util.List;

import br.com.somosicev.tp.agenda.modelo.Pessoa;

public abstract class BD {

	protected abstract List<Pessoa> buscar(Pessoa p);
	protected abstract void adicionar(Pessoa nova);
	protected abstract void remover(Pessoa velha);
	protected void atualizar(Pessoa nova) {
		remover(nova);
		adicionar(nova);
	}

}
