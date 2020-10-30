package lp1.aula24.jogodavelha;

import java.util.List;

import lp1.aula14.jogodavelha.Jogador;

public class Resultado {
	
	private TipoResultado tipo;
	private List<Jogador> vencedor;
	private Integer numeroDeJogadas;
	
	
	enum TipoResultado{
		VITORIA, VELHA
	}

}
