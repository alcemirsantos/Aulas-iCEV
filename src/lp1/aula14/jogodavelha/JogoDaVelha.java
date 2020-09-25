package lp1.aula14.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		// saber quem são os jogadores
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o nome do jogador 1?");
		String nomeJogadorUm = sc.nextLine();
		
		Jogador jogadorUm = new Jogador(nomeJogadorUm, "X");
		System.out.print("Qual o nome do jogador 2?");
		String nomeJogadorDois = sc.nextLine();
		Jogador jogadorDois = new Jogador(nomeJogadorDois, "O");
		
		// gerar o tabuleiro
		Tabuleiro t = new Tabuleiro();
		
		// enquanto jogadas <9 e não tiver vencedor fazer:
		int numJogadas = 1;
		while(numJogadas<9 && !t.temVencedor()) {
		// --- mostrar o estado atual tabuleiro
			t.mostrarTabuleiro();
		// --- quem joga?
			Jogador daVez = numJogadas %2 ==0 ? jogadorDois : jogadorUm;
		// --- qual a jogada? 
			Jogada nova = coletaJogada();
		// --- executar a jogada
			t.executaJogada(nova);
			
			numJogadas++;
		}
		// imprimir o resultado
		if(numJogadas>=9 && !t.temVencedor()) {
			System.out.println("Deu velha!");
		}else {
			System.out.println(t.imprimeVencedor());
		}
	}

	private static Jogada coletaJogada() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
