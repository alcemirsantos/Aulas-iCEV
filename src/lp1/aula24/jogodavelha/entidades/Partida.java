package lp1.aula24.jogodavelha.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lp1.aula24.jogodavelha.controle.estados.Estado;
import lp1.aula24.jogodavelha.controle.estados.PartidaEmAndamento;
import lp1.aula24.jogodavelha.controle.estados.PartidaFinalizada;

public class Partida {
	private Estado estado;
	private Jogador[] jogadores;
	private Tabuleiro tabuleiro;
	private List<Jogada> historicoDeJogadas;
	private Resultado resultado;

	private int ultimoAJogar;

	public Partida(Jogador[] jogadores, Tabuleiro tabuleiro) {
		this.estado = new PartidaEmAndamento();
		this.historicoDeJogadas = new ArrayList<Jogada>();
		this.jogadores = jogadores;
		this.tabuleiro = tabuleiro;
	}

	public Jogador[] getJogadores() {
		return jogadores;
	}

	public List<Jogador> getListaDeJogadores() {
		List<Jogador> lista = new ArrayList<Jogador>();
		lista.add(jogadores[0]);
		lista.add(jogadores[1]);
		return lista;
	}

	public Jogador getJogador(int i) {
		return jogadores[i];
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

	@Deprecated
	public boolean temVencedor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Deprecated
	public boolean deuVelha() {
		// TODO Auto-generated method stub
		return false;
	}

	public Resultado executar() {
		// enquanto partida em andamento
		while (!(this.estado instanceof PartidaFinalizada)) {
			this.estado.acao(this);
		}
		// partida finalizada
		this.estado.acao(this);
		return this.resultado;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Jogador quemJoga() {

		if (getRodadaAtual() == 1) {
			// quem começa?
			Random r = new Random();
			ultimoAJogar = r.nextInt(2);
			return getJogadores()[ultimoAJogar];
		} else {
			ultimoAJogar = (ultimoAJogar + 1) % 2;
			return getJogadores()[ultimoAJogar];

		}
	}

	public List<Jogada> getHistoricoDeJogadas() {
		return historicoDeJogadas;
	}

	public int getRodadaAtual() {
		return getHistoricoDeJogadas().size() + 1;
	}
	
	public int getRodadas() {
		return getHistoricoDeJogadas().size();
	}

	public void addJogadaAoHistorico(Jogada nova) {
		this.historicoDeJogadas.add(nova);
	}
}
