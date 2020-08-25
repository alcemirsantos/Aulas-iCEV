package br.com.somosicev.classes.aula14;

public class Aluno {
	private String nome;
	private double nota;
	
	public Aluno(String umNome, double d) {
		this.nome = umNome;
		this.nota = d;
	}
	
	
	@Override
	public String toString() {
		return "["+this.nome+"]";
	}


	public String getNome() {
		return this.nome;
	}
	
}
