package br.com.somosicev.classes.aula15.interfaces2;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO implements DAO {

	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	@Override
	public void salvar(Object o) {
		// Salvar um funcionario no banco de dados;
		funcionarios.add((Funcionario)o);
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
