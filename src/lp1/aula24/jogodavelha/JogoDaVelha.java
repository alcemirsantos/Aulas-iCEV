package lp1.aula14.jogodavelha;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import lp1.aula24.jogodavelha.IU;
import lp1.aula24.jogodavelha.Partida;
import lp1.aula24.jogodavelha.Resultado;

public class JogoDaVelha {

	private List<Partida> historicoDePartidas = new ArrayList<Partida>();
	private Partida atual;
	private int ultimoAJogar;
	
	public JogoDaVelha() {
		historicoDePartidas = new ArrayList<Partida>();
	}
	
	public void iniciar(Partida nova) {
		atual = nova;
		
		int rodada = 1;
		// executar jogadas enquanto não tiver vencedor ou der velha
		while(!nova.temVencedor() || nova.deuVelha()) {
			// mostrar o tabuleiro
			IU.exibir(nova.getTabuleiro());
			
			// --- quem joga?
			Jogador daVez = quemJoga(rodada);
			IU.exibir(daVez);
				
			// coletar jogada
			Jogada novaJogada = IU.coletaJogada(daVez); // TODO passar o jogador da vez como parametro
			// executar jogada
			nova.getTabuleiro().executar(novaJogada);
		}
		
		// armazernar o resultado
		atual.setResultado(new Resultado());
		historicoDePartidas.add(nova);
	}

	private Jogador quemJoga(int rodada) {
		if(rodada == 1) {
			// quem começa?
			Random r = new Random();
			ultimoAJogar = r.nextInt(2);
			return atual.getJogadores()[ultimoAJogar];
		}else {
			ultimoAJogar = (ultimoAJogar + 1)%2;
			return atual.getJogadores()[ultimoAJogar];
			
		}
	}

	public static void main(String[] args) {
		// saber quem são os jogadores
		Scanner sc = new Scanner(System.in);

		// gerar o tabuleiro
		Tabuleiro t = new Tabuleiro();

		// enquanto jogadas <9 e não tiver vencedor fazer:
		int numJogadas = 1;
		while (numJogadas < 9 && !t.temVencedor()) {
			// --- mostrar o estado atual tabuleiro
			t.mostrarTabuleiro();
			// --- quem joga?
			Jogador daVez = numJogadas % 2 == 0 ? jogadorDois : jogadorUm;
			// --- qual a jogada?
			Jogada nova = coletaJogada();
			// --- executar a jogada
			t.executaJogada(nova);

			numJogadas++;
		}
		// imprimir o resultado
		if (numJogadas >= 9 && !t.temVencedor()) {
			System.out.println("Deu velha!");
		} else {
			System.out.println(t.imprimeVencedor());
		}
	}

	private static Jogada coletaJogada() {
		// TODO Auto-generated method stub
		return null;
	}

}
