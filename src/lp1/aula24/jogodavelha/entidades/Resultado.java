package lp1.aula24.jogodavelha.entidades;

import java.util.List;


public class Resultado {

	private TipoResultado tipo;
	private List<Jogador> vencedor;
	private Integer numeroDeRodadas;

	public Resultado(TipoResultado tipo, List<Jogador> jogadores, Integer numRodadas){
		this.tipo = tipo;
		this.vencedor = jogadores;
		this.numeroDeRodadas = numRodadas;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(tipo.toString());
		if(tipo== TipoResultado.VITORIA)
			sb.append(" do "+vencedor.get(0));
		else
			sb.append(" entre "+vencedor.get(0)+ " e "+vencedor.get(1));
		sb.append(" após " + numeroDeRodadas + " jogadas.");
		return sb.toString();
	}

}
