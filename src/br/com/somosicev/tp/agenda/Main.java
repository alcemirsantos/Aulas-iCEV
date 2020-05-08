package br.com.somosicev.tp.agenda;

import br.com.somosicev.tp.agenda.modelo.CPF;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;

public class Main {

	public static void main(String[] args) {

		
		PessoaFisica p = new PessoaFisica();
		System.out.println(p.equals(new PessoaFisica()));
	}

}
