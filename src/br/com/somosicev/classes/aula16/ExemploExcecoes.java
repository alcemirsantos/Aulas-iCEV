package br.com.somosicev.classes.aula16;

import java.util.Scanner;

public class ExemploExcecoes {

	public static void main(String[] args) {
		int a, b;
		float result;
		boolean ok = false;
		Scanner s = new Scanner(System.in);
		do {
			try {
				a = s.nextInt();
				b = s.nextInt();
				result = divisao(b, a);
			} catch (Exception e) {
				System.err.println("Error 2:" + e.getMessage());
				ok = true;
			} catch (ArithmeticException e) {
				// TODO: handle exception
			
			}

		} while (ok);
		System.out.println("Fim do Programa!");
		s.close();
	}

	private static Float divisao(int numerador, int denominador) throws MinhaException {
		float result;
		if (denominador == 0)
			throw new MinhaException();
		result = (float) numerador / denominador;
		return result;
	}

}
