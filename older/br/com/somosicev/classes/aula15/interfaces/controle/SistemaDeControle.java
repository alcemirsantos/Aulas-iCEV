package br.com.somosicev.classes.aula15.interfaces.controle;

public class SistemaDeControle {

	// Padrão de projeto Template Method
	public void controlarSeguranca() {
		localizar();
		isolar();
		identificar();
	}

	protected void localizar() {
		System.out.println("   estabelecer o perímetro");
	}

	protected void isolar() {
		System.out.println("   isolar a área");
	}

	protected void identificar() {
		System.out.println("   identificar a fonte");
	}
}
