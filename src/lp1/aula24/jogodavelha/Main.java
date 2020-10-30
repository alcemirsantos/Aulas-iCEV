package lp1.aula24.jogodavelha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lp1.aula14.jogodavelha.JogoDaVelha;
import lp1.aula14.jogodavelha.Tabuleiro;

public class Main {
	
	public static void main(String[] args) {
		
		
		JogoDaVelha velha = new JogoDaVelha();
		
		while(IU.jogadorAindaQuerJogar()) {
			Partida nova = new Partida(IU.coletaJogadores(), new Tabuleiro());
			
			velha.iniciar(nova);
			
		}
		
	}




}
