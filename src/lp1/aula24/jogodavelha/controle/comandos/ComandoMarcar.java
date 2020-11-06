package lp1.aula24.jogodavelha.controle.comandos;

import lp1.aula24.jogodavelha.controle.estados.Estado;
import lp1.aula24.jogodavelha.entidades.Jogada;
import lp1.aula24.jogodavelha.entidades.Tabuleiro;

public class ComandoMarcar extends Comando {
	private Tabuleiro alvo;
	private Jogada acao;
	

	public ComandoMarcar(Tabuleiro tabuleiro, Jogada novaJogada) {
		this.alvo = tabuleiro;
		this.acao = novaJogada;
	}


	@Override
	public Estado executar() {
		return alvo.marcar(acao.getPosicao(), acao.getJogador().getSimbolo());
	}

}
