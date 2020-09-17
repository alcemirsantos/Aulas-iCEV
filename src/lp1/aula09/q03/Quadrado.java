package lp1.aula09.q03;

public class Quadrado {

	double lado;

	
	public Quadrado() {
		this(1.0);
	}
	
	public Quadrado(double umLado) {
		this.lado = umLado;
	}

	public double area() {
		return lado * lado;
	}

	public double perimetro() {
		return 4 * lado;
	}

}
