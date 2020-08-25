package lp1.aula02;

import java.util.Scanner;

public class ListaExercicios1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a: ");
		String aa = entrada.nextLine();
		double a = Double.valueOf(aa);
		
		System.out.print("Digite b: ");
		String bb = entrada.nextLine();
		double b = Double.valueOf(bb);
		
		System.out.print("Digite c: ");
		String cc = entrada.nextLine();
		double c = Double.valueOf(cc);
		
		double delta = (b*b) - (4*a*c);
		double xUm = (-b + Math.sqrt(Math.abs(delta))) / 2*a;
		double xDois = (-b - Math.sqrt(Math.abs(delta))) / 2*a;
		
		System.out.println("x`: "+xUm);
		System.out.println("x``: "+xDois);
		
	}
	
	
	public static void q1() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor pago: ");
		String valorUmDigitado = entrada.nextLine();
		double valorUmConvertido = Double.valueOf(valorUmDigitado);
		
		
		System.out.print("Digite o valor de custo: ");
		String valorDoisDigitado = entrada.nextLine();
		double valorDoisConvertido = Double.valueOf(valorDoisDigitado);
		
		double troco = valorDoisConvertido - valorUmConvertido;
		System.out.print("O valor do troco é: "+troco);
		
	}

}
