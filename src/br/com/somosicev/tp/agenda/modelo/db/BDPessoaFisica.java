package br.com.somosicev.tp.agenda.modelo.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.somosicev.tp.agenda.modelo.Pessoa;

public class BDPessoaFisica extends BD {
	/*
	 * armazenar para cada letra, uma lista de objetos Pessoa.  
	 */
	private Map<String, List<Pessoa>> contatos;
	
	public BDPessoaFisica() {
		contatos = new HashMap<String, List<Pessoa>>();
	}

	@Override
	public List<Pessoa> buscar(Pessoa p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adicionar(Pessoa nova) {
		// "Alcemir"
		String letraInicial = String.valueOf(nova.getNome().toUpperCase().charAt(0));
		List<Pessoa> pessoasComEstaLetraInicial;
		if(contatos.get(letraInicial) == null)
			pessoasComEstaLetraInicial = new ArrayList<Pessoa>();
		else 
			pessoasComEstaLetraInicial = contatos.get(letraInicial);
		pessoasComEstaLetraInicial.add(nova);
		contatos.put(letraInicial, pessoasComEstaLetraInicial);
	}

	@Override
	public void remover(Pessoa velha) {
		// TODO Auto-generated method stub

	}

}
