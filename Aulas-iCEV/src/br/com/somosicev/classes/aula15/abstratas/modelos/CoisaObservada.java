package br.com.somosicev.classes.aula15.abstratas.modelos;

import java.util.ArrayList;
import java.util.List;

import br.com.somosicev.classes.aula15.abstratas.iu.ObservadorAbstrato;

public class CoisaObservada {
	
	private List<ObservadorAbstrato> observardores = new ArrayList<ObservadorAbstrato>();
	private int state;

	public void add(ObservadorAbstrato o) {
		observardores.add(o);
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		notificaObservadores();
	}

	private void notificaObservadores() {
		for (ObservadorAbstrato observador : observardores) {
			observador.update();
		}
	}
}
