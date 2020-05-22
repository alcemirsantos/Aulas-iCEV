package br.com.somosicev.classes.aula15.abstratas.iu;

import br.com.somosicev.classes.aula15.abstratas.modelos.CoisaObservada;

public class ObservadorOctal extends ObservadorAbstrato{

	public ObservadorOctal(CoisaObservada subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" " + Integer.toOctalString(subject.getState()));
	}

}
