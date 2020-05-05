package br.com.somosicev.classes.aula15.interfaces2;

import java.util.List;

public interface DAO {

	public void salvar(Object o);

	public void atualizar(Object o);

	public void deletar(int id);

	public Object getById(int id);

	public List<Object> getAll();
}
