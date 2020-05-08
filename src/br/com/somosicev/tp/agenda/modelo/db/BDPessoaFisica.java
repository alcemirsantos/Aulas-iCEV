package br.com.somosicev.tp.agenda.modelo.db;

import java.util.List;
import java.util.Map;

import br.com.somosicev.tp.agenda.modelo.Pessoa;

public class BDPessoaFisica extends BD {
	
	private Map<String, List<Pessoa>> contatos;

	@Override
	protected List<Pessoa> buscar(Pessoa p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void adicionar(Pessoa nova) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void remover(Pessoa velha) {
		// TODO Auto-generated method stub

	}

}
