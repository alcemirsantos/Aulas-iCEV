package lp1.aula24.jogodavelha.controle.estados;

import lp1.aula24.jogodavelha.entidades.Partida;
import lp1.aula24.jogodavelha.entidades.Resultado;
import lp1.aula24.jogodavelha.entidades.TipoResultado;
import lp1.aula24.jogodavelha.fronteira.IU;

public class PartidaTemVencedor implements Estado{

	@Override
	public void acao(Object contexto) {
		Partida atual = (Partida) contexto;
		int numJogadas = atual.getRodadas();
		Resultado r = new  Resultado(TipoResultado.VITORIA, atual.getListaDeJogadores(), numJogadas);
		atual.setResultado(r);
		IU.exibir(atual.getResultado());
		IU.exibir(atual.getTabuleiro());
		atual.setEstado(new PartidaFinalizada());
		
	}

}
