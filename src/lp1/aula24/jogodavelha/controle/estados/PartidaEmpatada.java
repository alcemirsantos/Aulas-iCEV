package lp1.aula24.jogodavelha.controle.estados;

import java.util.ArrayList;
import java.util.List;

import lp1.aula24.jogodavelha.entidades.Jogador;
import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.entidades.Resultado;
import lp1.aula24.jogodavelha.entidades.TipoResultado;
import lp1.aula24.jogodavelha.fronteira.IU;

public class PartidaEmpatada implements Estado {

	@Override
	public void acao(Object contexto) {
		Partida atual = (Partida) contexto;
		int numJogadas = atual.getRodadas();
		Resultado r = new Resultado(TipoResultado.VELHA, atual.getListaDeJogadores(), numJogadas);
		atual.setResultado(r);
		IU.exibir(atual.getResultado());
		IU.exibir(atual.getTabuleiro());
		atual.setEstado(new PartidaFinalizada());
	}

}
