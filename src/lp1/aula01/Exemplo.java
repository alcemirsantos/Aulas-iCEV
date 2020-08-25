package lp1.aula01;

import java.util.Scanner;

public class Exemplo {
	
	
//	int num1=0;
//	final int NUM = 1; // atributo (váriável instância)

	/**
	 * este é o método principal do meu programa.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Digite o seu nome: ");
		Scanner teclado = new Scanner(System.in);
		String nome = teclado.nextLine();
		System.out.println("O nome digitado foi: "+nome);
	}
	
//	void foo() {
//		num = 0;
//		outroNum=0;
//	}

}
