package br.com.somosicev.listas.lista05;

public class Main {

	public static void main(String[] args) {
		/*
		 * 5. Escreva uma superclasse Trabalhador e subclasses TrabalhadorPorHora e
		 * TrabalhadorAssalariado. Cada trabalhador tem nome e salário pago
		 * mensalmente. Escreva um método calcularPagamento(int horas) que calcule o
		 * pagamento semanal de cada trabalhador. O trabalhador que ganha por hora é
		 * pago, obviamente, de acordo com o número de horas trabalhadas, sendo horas,
		 * no máximo, igual a 40. Se ele, trabalhou mais de 40 horas, cada hora
		 * excedentes é paga como uma hora e meia. O trabalhador assalariado é pago
		 * pela carga horaria de 40 horas, independentes de qual seja o número real de
		 * horas trabalhadas. Crie um programa de testes que utiliza polimorfismo para
		 * testar essas classes e métodos.
		 * 
		 */
		
		// valor pago pela hora trabalhada
		double valorHora = 30.0; 
		// quantidade de horas trabalhadas
		int qtdeHoras = 50;

		Trabalhador t1 = new TrabalhorPorHora(valorHora);
		Trabalhador t2 = new TrabalhorAssalariado(valorHora);
		Trabalhador t3 = new Trabalhador(valorHora);
		
		Trabalhador[] trabalhadores = {t1,t2,t3};
		
		for(Trabalhador tmp: trabalhadores) {
			
		}
		
		

		System.out.println(t1.calcularPagamento(qtdeHoras));
		System.out.println(t2.calcularPagamento(qtdeHoras));
		System.out.println(t3.calcularPagamento(qtdeHoras));
	}

}
