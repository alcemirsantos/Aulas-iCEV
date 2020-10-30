package lp1.aula24.jogodavelha.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lp1.aula24.jogodavelha.entidades.Jogada;
import lp1.aula24.jogodavelha.entidades.Jogador;
import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.entidades.Resultado;
import lp1.aula24.jogodavelha.fronteira.IU;

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
}
