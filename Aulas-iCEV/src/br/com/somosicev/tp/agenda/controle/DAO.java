package br.com.somosicev.tp.agenda.controle;

public interface DAO {

	/**
	 * Adiciona um <code>Object</code> na base de dados.
	 * 
	 * @param o
	 */
	void adicionar(Object o);

	/**
	 * Busca um <code>Object</code> na base de dados.
	 * 
	 * @param o
	 */
	void buscar(Object o);

	/**
	 * Remove um <code>Object</code> da base de dados.
	 * 
	 * @param o
	 */
	void remover(Object o);

	/**
	 * Alterar um <code>Object</code> {@code velho} utilizando um
	 * {@code Object novo} no base de dados.
	 * 
	 * @param velho
	 * @param novo
	 */
	void alterar(Object velho, Object novo);
}
