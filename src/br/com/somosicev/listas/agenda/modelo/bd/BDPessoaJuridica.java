package br.com.somosicev.listas.agenda.modelo.bd;

import java.util.List;
import java.util.Map;

import br.com.somosicev.listas.agenda.modelo.Pessoa;
import br.com.somosicev.listas.agenda.modelo.PessoaFisica;
import br.com.somosicev.listas.agenda.modelo.PessoaJuridica;

public class BDPessoaJuridica extends BD{
	
	private Map<PessoaFisica, List<PessoaJuridica>> cadastrosPJ;

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
