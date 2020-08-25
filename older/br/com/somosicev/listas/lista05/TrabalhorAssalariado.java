package br.com.somosicev.listas.lista05;

public class TrabalhorAssalariado extends Trabalhador {

	public TrabalhorAssalariado(double d) {
		super(d);
		salario = d;
	}

	@Override
	double calcularPagamento(int horas) {
		return 40 * salario;
	}

}
