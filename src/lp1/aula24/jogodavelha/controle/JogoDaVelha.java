package lp1.aula24.jogodavelha.controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lp1.aula24.jogodavelha.controle.comandos.Comando;
import lp1.aula24.jogodavelha.controle.comandos.ComandoMarcar;
import lp1.aula24.jogodavelha.entidades.Jogada;
import lp1.aula24.jogodavelha.entidades.Jogador;
import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.entidades.Resultado;
import lp1.aula24.jogodavelha.entidades.Tabuleiro;
import lp1.aula24.jogodavelha.fronteira.IU;

public class JogoDaVelha {

	private static JogoDaVelha instancia;
	private List<Partida> historicoDePartidas;
	private List<Resultado> historicoDeResultados;
	private Partida atual;
	private int ultimoAJogar;

	private JogoDaVelha() {
		historicoDePartidas = new ArrayList<Partida>();
		
	}

	public static JogoDaVelha getInstancia() {
		if (instancia == null)
			instancia = new JogoDaVelha();
		return instancia;
	}

	public void iniciar(Partida nova) {
		atual = nova;

		int rodada = 1;
		// executar jogadas enquanto não tiver vencedor ou der velha
		while (!nova.temVencedor() || nova.deuVelha()) {
			// mostrar o tabuleiro
			IU.exibir(nova.getTabuleiro());

			// --- quem joga?
			Jogador daVez = quemJoga(rodada);
			IU.exibir(daVez);

			// coletar jogada
			Jogada novaJogada = IU.coletaJogada(daVez); // TODO passar o jogador da vez como parametro
			// executar jogada
			Comando comando = new ComandoMarcar(nova.getTabuleiro(), novaJogada);
			comando.executar();
//			nova.getTabuleiro().executar(novaJogada);

			rodada++;
		}

		// armazernar o resultado
		atual.setResultado(qualResultado());
		historicoDePartidas.add(nova);

	}

	public void iniciar() {
		System.out.println(">> Inciando a Partida #"+(historicoDePartidas.size()+1));
		Partida nova = new Partida(IU.coletaJogadores(), new Tabuleiro());
		Resultado r = nova.executar();
		historicoDePartidas.add(nova);
		historicoDeResultados.add(r);
		System.out.println(">> Partida #"+(historicoDePartidas.size()+1)+ " finalizada!");
	}
	
	
	private Resultado qualResultado() {
		// TODO Auto-generated method stub
		return null;
	}

	private Jogador quemJoga(int rodada) {
		if (rodada == 1) {
			// quem começa?
			Random r = new Random();
			ultimoAJogar = r.nextInt(2);
			return atual.getJogadores()[ultimoAJogar];
		} else {
			ultimoAJogar = (ultimoAJogar + 1) % 2;
			return atual.getJogadores()[ultimoAJogar];

		}
	}
}
