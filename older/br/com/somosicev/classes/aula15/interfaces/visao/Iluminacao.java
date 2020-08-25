package br.com.somosicev.classes.aula15.interfaces.visao;

public class Iluminacao implements EscutadorDeAlarme {

	@Override
	public void alarmar() {
		System.out.println("Acender as Luzes!");
	}

}
