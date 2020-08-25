package br.com.somosicev.tp.agenda.controle;

import java.util.List;

import br.com.somosicev.tp.agenda.modelo.db.BD;

public abstract class PessoaDAO implements DAO {

	protected BD bd;

	@Override
	abstract public void adicionar(Object o);

	@Override
	abstract public Object buscar(Object o);

	@Override
	abstract public void remover(Object o);

	@Override
	abstract public void alterar(Object velho, Object novo);

}
