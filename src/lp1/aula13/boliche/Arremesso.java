package lp1.aula13.boliche;

public class Arremesso {
	
	int pinos;
	
	public Arremesso() {
		this(0);
	}
	public Arremesso(int numPinos) {
		pinos = numPinos;
	}
	
	int getPinosDerrubados() {
		return pinos;
	}
	@Override
	public String toString(){
		return String.valueOf(pinos);
	}
}
