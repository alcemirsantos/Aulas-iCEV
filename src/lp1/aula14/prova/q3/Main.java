package lp1.aula14.prova.q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * letra A
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	boolean fazTriangulo(double a, double b, double c) {
		if (a < b + c && a > Math.abs(b - c) && b < a + c && b > Math.abs(a - c) && c < a + b && c > Math.abs(b - a))
			return true;
		return false;
	}

	/**
	 * letra B
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	int tipoTriangulo(double a, double b, double c) {
		if (!fazTriangulo(a, b, c))
			return 0; // não faz triangulo
		if (a == b) {
			if (b == c)
				return 3; // equilatero
			else
				return 2; // isosceles
		} else if (b == c || a == c) 
			return 2; // isosceles
		return 1; // escaleno
	}

}
