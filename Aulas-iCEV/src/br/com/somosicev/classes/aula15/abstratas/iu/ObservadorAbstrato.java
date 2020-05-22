package br.com.somosicev.classes.aula15.abstratas.iu;

import br.com.somosicev.classes.aula15.abstratas.modelos.CoisaObservada;

public abstract class ObservadorAbstrato {
	protected CoisaObservada subject;

	public abstract void update();
}
