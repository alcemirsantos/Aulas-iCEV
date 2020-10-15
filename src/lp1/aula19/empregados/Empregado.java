package lp1.aula19.empregados;

import lp1.aula15.todo.Tarefa;

public abstract class Empregado {

	protected String nome;
	protected double salarioBase;

	@Override
	public String toString() {
		return this.nome + " (" + this.salarioBase + ")";
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setSalarioBase(double novoSalario) {
		this.salarioBase = novoSalario;
	}
	
	public  double getSalarioBase() {
		return this.salarioBase;
	}
	
	public abstract double getSalarioFinal();
	
	
	@Override
	public boolean equals(Object t) {
		if (t == null)
			return false;
		Empregado tmp;

		if (t instanceof Empregado) {
			tmp = (Empregado) t;
		} else {
			return false;
		}

		if (this.getNome().equals(tmp.getNome()))
			return true;
		return false;
	}

}
