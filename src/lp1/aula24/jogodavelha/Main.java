package lp1.aula24.jogodavelha;

import lp1.aula24.jogodavelha.controle.JogoDaVelha;
import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.entidades.Tabuleiro;
import lp1.aula24.jogodavelha.fronteira.IU;

public class Main {

	public static void main(String[] args) {

		JogoDaVelha jogo = JogoDaVelha.getInstancia();

		System.out.println("## Jogo da Velha do Prof. Alcemir! ##");
		System.out.println("\t Have fun!  :-)");
		do {
//			Partida partida = new Partida(IU.coletaJogadores(), new Tabuleiro());
//			jogo.iniciar(partida);

			jogo.iniciar();

			// imprimir o resultado
//			System.out.println(partida.getResultado());
		} while (IU.jogadorAindaQuerJogar());

		System.out.println("Prof. Alcemir agradece a preferência! :-)");
	}

}
