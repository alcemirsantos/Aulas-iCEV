package br.com.somosicev.classes.aula15.interfaces2;

public class Main {
	public static void main(String[] args) {
		
		DAO funcionarioDAO = new FuncionarioDAO();
        
        if (funcionarioDAO instanceof DAO)
        funcionarioDAO.salvar(Funcionario001);
        else
            System.err.println("A Classe FuncionarioDAO não implementa BasicoDAO, nenhum procedimento foi realizado");
 
	}

}
