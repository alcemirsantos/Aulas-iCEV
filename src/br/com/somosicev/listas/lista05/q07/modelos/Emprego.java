package br.com.somosicev.listas.lista05.q07.modelos;

import br.com.somosicev.listas.lista05.q07.enums.Trabalho;

public abstract class Emprego {

	Trabalho tipo;
	
	public Emprego() {
		
	}

	public Emprego(double salarioInicial) {
		
	}

	public Emprego(int qtdeHras, double salarioInicial) {
		
	}
	
	double getSalario() {
		switch (tipo) {
		case ASSALARIADO:
			// calcular salario de assalariado
			return 0;

		case AUTONOMO:
			// calcular salario de autonomo
			return 0;
			
		case HORISTA:
			// calcular salario de horista
			return 0;
		}
		return 0;
	}
	
	
}
