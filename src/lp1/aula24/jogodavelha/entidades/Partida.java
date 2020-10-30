package lp1.aula24.jogodavelha.entidades;

public class Partida {
//	Jogadores
	private Jogador[] jogadores;
//	Tabuleiro
	private Tabuleiro tabuleiro;
//	Resultado
	private Resultado resultado;
	
	public Partida(Jogador[] jogadores, Tabuleiro tabuleiro) {
		this.jogadores = jogadores;
		this.tabuleiro = tabuleiro;
	}
	
	public Jogador[] getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}

	public boolean temVencedor() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deuVelha() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
