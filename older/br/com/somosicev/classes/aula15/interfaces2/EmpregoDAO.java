package br.com.somosicev.classes.aula15.interfaces2;

import java.util.ArrayList;
import java.util.List;

import br.com.somosicev.listas.lista05.q07.modelos.Emprego;

public class EmpregoDAO implements DAO {

	List<Emprego> empregos = new ArrayList<Emprego>();
	
	@Override
	public void salvar(Object o) {
		empregos.add((Emprego)o);
	}

	@Override
	public void atualizar(Object o) {

	}

	@Override
	public void deletar(int id) {

	}

	@Override
	public Object getById(int id) {
		return null;
	}

	@Override
	public List<Object> getAll() {
		return null;
	}

}
