package lp1.aula24.jogodavelha.controle.estados;

import lp1.aula24.jogodavelha.controle.comandos.ComandoMarcar;
import lp1.aula24.jogodavelha.entidades.Jogada;
import lp1.aula24.jogodavelha.entidades.Jogador;
import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.fronteira.IU;

public class PartidaEmAndamento implements Estado {

	@Override
	public void acao(Object contexto) {
		Partida atual = (Partida) contexto;

		Jogador daVez = atual.quemJoga();
		System.out.println("\n## Rodada "+atual.getRodadaAtual()+ " ##");
		System.out.println(">> "+daVez+ " joga.");
		
		IU.exibir(atual.getTabuleiro());
		// criar jogada
		
		Jogada nova = IU.coletaJogada(daVez);
		// TODO validar jogada
		// executar jogada
		ComandoMarcar comando = new ComandoMarcar(atual.getTabuleiro(), nova);
		Estado novo = comando.executar();
		atual.addJogadaAoHistorico(nova);
		atual.setEstado(novo);
	}

}
