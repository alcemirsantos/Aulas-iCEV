package br.com.somosicev.classes.aula13;

public class Mamifero extends Animal implements Corredor{

	private String nome;

	public Mamifero() {
		setCor("amarelo");
		this.nome = "Alcemir";
	}

	public Mamifero(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
        return "@"+nome;
    }

	@Override
	void passo1() {
		System.out.println("passo 1 mamifero");
	}

	@Override
	void passo2() {
		System.out.println("passo 2 mamifero");
	}

	@Override
	void passo3() {
		System.out.println("passo 3 mamifero");
	}

	@Override
	public void correr() {
		
	}

	
}
