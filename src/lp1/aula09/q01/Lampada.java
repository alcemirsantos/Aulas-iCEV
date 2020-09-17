package lp1.aula09.q01;

public class Lampada {
	
	boolean ligada;
	
	public void liga() {
		this.ligada = true;
	}
	
	public void desliga() {
		this.ligada = false;
	}

	public String observa() {
		return this.ligada? "ligada": "desligada";
	}
}
