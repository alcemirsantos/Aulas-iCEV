package br.com.somosicev.classes.aula15.abstratas.modelos;

import java.util.ArrayList;
import java.util.List;

import br.com.somosicev.classes.aula15.abstratas.iu.ObservadorAbstrato;

public class CoisaObservada {
	
	private List<ObservadorAbstrato> observers = new ArrayList<ObservadorAbstrato>();
	private int state;

	public void add(ObservadorAbstrato o) {
		observers.add(o);
	}

	public int getState() {
		return state;
	}

	public void setState(int value) {
		this.state = value;
		execute();
	}

	private void execute() {
		for (ObservadorAbstrato Observador : observers) {
			Observador.update();
		}
	}
}
