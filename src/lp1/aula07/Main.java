package lp1.aula07;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palavra = "Palavra";
		
		
		CaixaDeSomPortatil doAlcemir = new CaixaDeSomPortatil();
		CaixaDeSomPortatil  doAsaph = new CaixaDeSomPortatil();
		CaixaDeSomPortatil doMarco = new CaixaDeSomPortatil();

		CaixaDeSomPortatil doDavi = new CaixaDeSomPortatil("DoDavi", "JBL", "Preto", "11h","10000mAh","100dB");
		
//		doDavi.nome= "DoDavi";
//		doDavi.marca = "JBL";
//		doDavi.cor = "Preto";
//		doDavi.tempoDeExecucaoDaBateria = "11h";
//		doDavi.potenciaDaBateria = "10000mAh";
//		doDavi.potenciaDoAutoFalantes = "100dB";
		
		doAlcemir.nome = "DoAlcemir";
		doAlcemir.marca = "JBL";
		doAlcemir.cor = "Preto";
		doAlcemir.tempoDeExecucaoDaBateria = "5h";
		doAlcemir.potenciaDaBateria = "3000mAh";
		doAlcemir.potenciaDoAutoFalantes = "30dB";
		
		CaixaDeSomPortatil[] caixas = new CaixaDeSomPortatil[4];

		caixas[0] = doDavi;
		caixas[1] = doAlcemir;
		
		caixas[0].marca = "Boombox";
		
		doMarco.ligar();
		doMarco.nome = "DoMarco";
		doMarco.desligar();
		doAsaph.desligar();
		doDavi.ligar();
		doAlcemir.desligar();
		
		System.out.println(doDavi);
	
	}
	
	
}
