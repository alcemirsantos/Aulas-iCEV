package lp1.aula24.jogodavelha.entidades;

public class Jogada {

	// posicao
	private Coordenada posicao;
	// quem jogou
	private Jogador jogador;
	
	public Jogada(Coordenada aPosicao, Jogador oJogador) {
		setPosicao(aPosicao);
		setJogador(oJogador);
	}

	public Coordenada getPosicao() {
		return posicao;
	}

	public void setPosicao(Coordenada posicao) {
		this.posicao = posicao;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

}
