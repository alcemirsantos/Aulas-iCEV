package lp1.aula19.empregados;

public class Coordenador extends Empregado{

	public Coordenador(String novoNome, double salarioBase) {
		nome = novoNome;
		super.salarioBase = salarioBase;
	}

	@Override
	public double getSalarioFinal() {
		return 2.0 * getSalarioBase();
	}

}
