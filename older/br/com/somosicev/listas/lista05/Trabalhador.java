package br.com.somosicev.listas.lista05;

public class Trabalhador {

	String nome;
	double salario = 5.0;
	

	public Trabalhador(double valorHora) {
		salario = valorHora;
	}


	double calcularPagamento(int horas) {
		return horas * salario;
	};

}
