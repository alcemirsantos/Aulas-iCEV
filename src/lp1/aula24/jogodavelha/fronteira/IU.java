package lp1.aula24.jogodavelha.fronteira;

import java.util.Scanner;

import lp1.aula24.jogodavelha.entidades.Coordenada;
import lp1.aula24.jogodavelha.entidades.Jogada;
import lp1.aula24.jogodavelha.entidades.Jogador;
import lp1.aula24.jogodavelha.entidades.Resultado;
import lp1.aula24.jogodavelha.entidades.Tabuleiro;


public class IU {

	private static Scanner teclado = new Scanner(System.in);

	public static boolean jogadorAindaQuerJogar() {
		System.out.print("Continuar jogando? (s/n): ");
		String resposta = teclado.nextLine();
		return resposta.toLowerCase().equals("s")? true:false;
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
		System.out.println("Estado do Tabuleiro:");
		System.out.println(tabuleiro);
	}

	public static void exibir(Jogador jogador) {
		System.out.println("Jogador:" + jogador + "começa!");

	}
	
	public static void exibir(Resultado resultado) {
		System.out.println("========[ RESULTADO ]=======");
		System.out.println(resultado);
	}


	public static Jogada coletaJogada(Jogador quemJoga) {
		System.out.print(quemJoga + ", digite a posição:");
		String[] posicao = teclado.nextLine().split(",");
		int x = Integer.valueOf(posicao[0]);
		int y = Integer.valueOf(posicao[1]);
		return new Jogada(new Coordenada(x,y), quemJoga);
	}

	
}