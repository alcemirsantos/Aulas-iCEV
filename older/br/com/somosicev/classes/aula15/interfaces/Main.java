package br.com.somosicev.classes.aula15.interfaces;

import br.com.somosicev.classes.aula15.interfaces.modelo.SistemaDeSensores;
import br.com.somosicev.classes.aula15.interfaces.visao.Drone;
import br.com.somosicev.classes.aula15.interfaces.visao.EscutadorDeAlarme;
import br.com.somosicev.classes.aula15.interfaces.visao.Iluminacao;
import br.com.somosicev.classes.aula15.interfaces.visao.Portao;
import br.com.somosicev.classes.aula15.interfaces.visao.SistemaDeVigilancia;

public class Main {

	public static void main(String[] args) {
		SistemaDeSensores sistemaDeSensores = new SistemaDeSensores();
		
		sistemaDeSensores.registrar(new Portao());
		sistemaDeSensores.registrar(new Iluminacao());
		sistemaDeSensores.registrar(new SistemaDeVigilancia());
		sistemaDeSensores.registrar(new Drone());
		
		sistemaDeSensores.soarAlarme();
	}

	

	
}
