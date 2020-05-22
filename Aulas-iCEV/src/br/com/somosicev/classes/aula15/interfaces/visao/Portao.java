package br.com.somosicev.classes.aula15.interfaces.visao;

public class Portao implements EscutadorDeAlarme {


	@Override
	public void alarmar() {
		System.out.println("Fechar Portão!");
	}

}
