package lp1.aula24.jogodavelha;

import java.util.Scanner;

import lp1.aula14.jogodavelha.Coordenada;
import lp1.aula14.jogodavelha.Jogada;
import lp1.aula14.jogodavelha.Jogador;
import lp1.aula14.jogodavelha.Tabuleiro;

public class IU {

	private static Scanner teclado;

	public static boolean jogadorAindaQuerJogar() {
		// TODO Auto-generated method stub
		return false;
	}

	public static Jogador[] coletaJogadores() {
		System.out.print("Nome do jogador 1: ");
		String nome1 = teclado.nextLine();
		System.out.print("Nome do jogador 2: ");
		String nome2 = teclado.nextLine();
		Jogador[] jogadores = new Jogador[2];
		jogadores[0] = new Jogador(nome1, 'O');
		jogadores[1] = new Jogador(nome2, 'X');
		return jogadores;
	}

	public static void exibir(Tabuleiro tabuleiro) {
		System.out.println("Estado atual do Tabuleiro:");
		System.out.println(tabuleiro);
	}

	public static void exibir(Jogador jogador) {
		System.out.println("Jogador:" + jogador + "começa!");

	}

	public static Jogada coletaJogada(Jogador quemJoga) {
		System.out.print("Digite a posição:");
		String[] posicao = teclado.nextLine().split(",");
		int x = Integer.valueOf(posicao[0]);
		int y = Integer.valueOf(posicao[1]);
		return new Jogada(new Coordenada(x,y), quemJoga);
	}
}
