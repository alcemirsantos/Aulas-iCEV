package br.com.somosicev.listas.lista05;

public class TrabalhorPorHora extends Trabalhador {

	public TrabalhorPorHora(double d) {
		super(d);
	}

	@Override
	double calcularPagamento(int horas) {
		
		double pagamento;
		if(horas <= 40) {
			pagamento = horas * salario; 
		} else {
			int diff = horas - 40;
			pagamento = 40 * salario;
			pagamento += (diff * salario * 1.5);
		}
		return pagamento;
	}

}
