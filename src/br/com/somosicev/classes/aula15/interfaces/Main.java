package br.com.somosicev.classes.aula15.interfaces;

import br.com.somosicev.classes.aula15.interfaces.modelo.SistemaDeSensores;
import br.com.somosicev.classes.aula15.interfaces.visao.Iluminacao;
import br.com.somosicev.classes.aula15.interfaces.visao.Portao;
import br.com.somosicev.classes.aula15.interfaces.visao.SistemaDeVigilancia;

public class Main {

	public static void main(String[] args) {
		SistemaDeSensores SistemaDeSensores = new SistemaDeSensores();
		SistemaDeSensores.registrar(new Portao());
		SistemaDeSensores.registrar(new Iluminacao());
		SistemaDeSensores.registrar(new SistemaDeVigilancia());
		SistemaDeSensores.soarAlarme();
	}

}
