package br.com.somosicev.tp.agenda.modelo.db;

import java.util.List;

import br.com.somosicev.tp.agenda.modelo.Pessoa;

public abstract class BD {

	/**
	 * Adiciona uma nova {@linkplain Pessoa} à base de dados.
	 * 
	 * @param nova
	 */
	public abstract void adicionar(Pessoa nova);
	/**
	 * Retorna uma lista de {@linkplain Pessoa} utilizando {@code Pessoa p} 
	 * como parâmetro.
	 * 
	 * @param p
	 * @return
	 */
	public abstract List<Pessoa> buscar(Pessoa p);
	/**
	 * Remove a {@code Pessoa velha} da base de dados.
	 * 
	 * @param velha
	 */
	public abstract void remover(Pessoa velha);
	
	/**
	 * Alterar uma pessoa da base de dados.
	 * @param nova
	 */
	public void atualizar(Pessoa velha, Pessoa nova) {
		remover(velha);
		adicionar(nova);
	}

}
