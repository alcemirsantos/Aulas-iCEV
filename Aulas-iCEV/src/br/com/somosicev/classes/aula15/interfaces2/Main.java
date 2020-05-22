package br.com.somosicev.classes.aula15.interfaces2;

import br.com.somosicev.listas.lista05.q07.modelos.Emprego;
import br.com.somosicev.listas.lista05.q07.modelos.EmpregoAssalariado;

public class Main {
	public static void main(String[] args) {
		
		DAO funcionarioDAO = new FuncionarioDAO();
        DAO empregoDAO = new EmpregoDAO();
        
		Funcionario funcionario001 = new Funcionario();
        funcionarioDAO.salvar(funcionario001);
 
        empregoDAO.salvar(new EmpregoAssalariado());
	}

}
