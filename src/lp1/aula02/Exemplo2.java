package lp1.aula02;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
	
		int a = 15, b = 10;
		boolean resultado;
		
		
		// if..else
		if(a<b) {
			resultado = true;
		}else {
			resultado = false;
		}
		System.out.println("Resultado: "+resultado);	
		
		
		// operador ternário
		resultado =  (a<b) ? true: false;
		
		System.out.println("Resultado: "+resultado);
		
		// switch
		Scanner teclado  = new Scanner(System.in);
		int opcao = Integer.valueOf(teclado.nextLine());
		
		switch (opcao) { // enum
		case 1:
			System.out.println("Usuário digitou 1");	
			break;
		case 2:
			System.out.println("Usuário digitou 2");
			break;
		default:
			System.out.println("Usuário digitou nem 1, nem 2");
			break;
		}
		
		String palavras[] = {"nova", "lista", "de", "valores" };
		String[] palavras2 = new String[10]; // todas as posições vazias. 
		
		int posicaoDoVetor = 0;
		int tamanhoDoVetor = palavras.length;
		do { //
			System.out.println(palavras[posicaoDoVetor++]);
		}while( posicaoDoVetor < tamanhoDoVetor );
		
		
		posicaoDoVetor = 0;
		while(posicaoDoVetor < tamanhoDoVetor) {
			System.out.println(palavras[posicaoDoVetor++]);
		}
		
		
		for(posicaoDoVetor=0; posicaoDoVetor<tamanhoDoVetor; posicaoDoVetor++) {
			System.out.println(palavras[posicaoDoVetor]);
		}
		
		for(String palavra: palavras) {
			System.out.println(palavra);
		}
		
	}

}
