package br.com.somosicev.listas.agenda.modelo.bd;

import java.util.List;

import br.com.somosicev.listas.agenda.modelo.Pessoa;

public abstract class BD {

	protected abstract List<Pessoa> buscar(Pessoa p);
	protected abstract void adicionar(Pessoa nova);
	protected abstract void remover(Pessoa velha);
	protected void atualizar(Pessoa nova) {
		remover(nova);
		adicionar(nova);
	}

}
