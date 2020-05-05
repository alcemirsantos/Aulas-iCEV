package br.com.somosicev.classes.aula15.interfaces.visao;

public class Portao implements EscutadorDeAlarme {

	public Portao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alarmar() {
		System.out.println("Fechar Portão!");
	}

}
