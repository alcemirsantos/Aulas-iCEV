package lp1.aula24.jogodavelha.entidades;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lp1.aula24.jogodavelha.controle.estados.Estado;
import lp1.aula24.jogodavelha.controle.estados.PartidaEmpatada;
import lp1.aula24.jogodavelha.controle.validadores.Validador;
import lp1.aula24.jogodavelha.controle.validadores.ValidadorDeTabuleiro;


public class Tabuleiro {

	// mapeamento da coordada do tabuleiro para o simbolo
	private Map<Coordenada, Character> mapa;
	
	public Tabuleiro() {
		this.mapa =new HashMap<Coordenada, Character>();
	}

	public Estado marcar(Coordenada c, Character s) {
		getMapa().put(c, s);
		Validador<Tabuleiro> v =  new ValidadorDeTabuleiro();
		return (Estado) v.validar(this);
	}
	
	public Character[][] toMatriz(){
		Character[][] map = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		for (Entry<Coordenada, Character> e : getMapa().entrySet()) {
			map[e.getKey().getX()][e.getKey().getY()] = e.getValue();
		}
		return map;
	}
	
	@Override
	public String toString() {
		Character[][] map = toMatriz();
		
		StringBuilder sb = new StringBuilder("\t   0  1  2 \n");
		for (int linha = 0; linha < 3; linha++) {
			sb.append("\t" + linha + " [" + map[linha][0] + "][" + map[linha][1] + "][" + map[linha][2] + "]\n");
		}
		return sb.toString();
	}

	public Map<Coordenada, Character> getMapa() {
		return mapa;
	}


}
