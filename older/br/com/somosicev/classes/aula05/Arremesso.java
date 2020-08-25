package br.com.somosicev.classes.aula05;

public class Arremesso {
	
	int pinos;
	
	public Arremesso() {
		this(0);
	}
	public Arremesso(int numPinos) {
		pinos = numPinos;
	}
	
	int getPinosDerrubados() {
		return pinos;
	}
}
