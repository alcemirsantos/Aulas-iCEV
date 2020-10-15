package lp1.aula19.empregados;

public class Professor extends Empregado {


	public Professor(String novoNome, double salarioBase) {
		setNome(novoNome);
		setSalarioBase(salarioBase);
	}

	@Override
	public double getSalarioFinal() {
		return 1.5 * getSalarioBase();
	}

}
