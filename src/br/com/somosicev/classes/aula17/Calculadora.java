package br.com.somosicev.classes.aula17;

public class Calculadora {
	
	public static int soma(int a,  int b) {
		return a+b;
	}
	
	public static int divisao(int a,  int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// Dado que...
		int a = 1;
		int b = 1; 
		// Quando eu fizer... 
		int resultado = soma(a,b);
		// Eu espero que...
		System.out.println(resultado);
	}
}
