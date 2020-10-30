package lp1.aula24.jogodavelha;

import lp1.aula24.jogodavelha.controle.JogoDaVelha;
import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.entidades.Tabuleiro;
import lp1.aula24.jogodavelha.fronteira.IU;

public class Main {
	
	public static void main(String[] args) {
		
		while(IU.jogadorAindaQuerJogar()) {
			JogoDaVelha jogo = new JogoDaVelha();
		
			Partida partida = new Partida(IU.coletaJogadores(), new Tabuleiro());
			
			jogo.iniciar(partida);
			
			// imprimir o resultado
			System.out.println(partida.getResultado());
			
		}
		System.out.println("Jogo da Velha iCEV agrade a preferência! :-)");
	}




}
