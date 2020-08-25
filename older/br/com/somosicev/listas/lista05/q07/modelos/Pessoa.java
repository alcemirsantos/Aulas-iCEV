package br.com.somosicev.listas.lista05.q07.modelos;

public class Pessoa {
	private String nome;
	private Emprego emprego;

	public Pessoa(String umNome, Emprego umEmprego) {
		setNome(umNome);
		setEmprego(umEmprego);
	}

	public Emprego getEmprego() {
		return emprego;
	}

	public void setEmprego(Emprego emprego) {
		this.emprego = emprego;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		Emprego e = getEmprego();
		String tipoEmprego = e==null? "Desempregado": e.toString();
		return "Pessoa: "+getNome()+ "; Emprego: " +tipoEmprego;
	}
	
	
}
