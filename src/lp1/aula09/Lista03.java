package lp1.aula09;

import java.util.ArrayList;
import java.util.Scanner;

import lp1.aula09.q01.Lampada;
import lp1.aula09.q03.Quadrado;

public class Lista03 {
	public static void main(String[] args) {

		/**
		 * Leia um valor inteiro N. Este valor será a quantidade de valores 
		 * inteiros X que serão lidos em seguida. Mostre quantos destes valores
		 *  X estão dentro do intervalo [10,20] e quantos estão fora do
		 *   intervalo, mostrando essas informações conforme exemplo (use a 
		 *   palavra "in" para dentro do intervalo, e "out" para fora do 
		 *   intervalo.*/
		 
		Scanner sc = new Scanner(System.in);
		// ler qtde de repeticoes N
		System.out.print("Repetições? ");
		int repeticoes = Integer.valueOf(sc.nextLine());
		
	
		
		// repetir a leitura de valores inteiros
		int[] valores = new int[repeticoes];
 		while(repeticoes > 0) {
			valores[repeticoes-1] = Integer.valueOf(sc.nextLine());
			repeticoes--;
		}
 		
		// julga valor in ou out
 		do {
 			System.out.print(valores[repeticoes]+":");
 			if(valores[repeticoes]>=10 && valores[repeticoes]<=20)
 				System.out.println("in");
 			else
 				System.out.println("out");
 			repeticoes++;
 		}while(repeticoes < valores.length);
		
		
	}	
	
	static void exemplo() {
		String[][] palavras = new String[2][10];
		ArrayList<String> listaDePalavras = new ArrayList<String>();

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				palavras[linha][coluna] = "Palavra (" + linha + ", " + coluna + ")";
				listaDePalavras.add( "Palavra (" + linha + ", " + coluna + ")");
			}
		}
	}

	static void q3() {
		Lampada l1 = new Lampada();
		l1.liga();
		String resposta = l1.observa();
		System.out.println(resposta);

		l1.desliga();
		resposta = l1.observa();
		System.out.println(resposta);
	}

	static void q4() {
		Quadrado q1 = new Quadrado(2.0);
		Quadrado q2 = new Quadrado(4.0);
		Quadrado q3 = new Quadrado(5.0);

		System.out.println(q1.perimetro());
		System.out.println(q1.area());

		System.out.println(q2.perimetro());
		System.out.println(q2.area());

		System.out.println(q3.perimetro());
		System.out.println(q3.area());
	}

}
