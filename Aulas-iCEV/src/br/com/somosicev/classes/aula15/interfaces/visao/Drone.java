package br.com.somosicev.classes.aula15.interfaces.visao;

public class Drone implements EscutadorDeAlarme {

	@Override
	public void alarmar() {
		System.out.println("  ligar pra polícia" );
	}

}
