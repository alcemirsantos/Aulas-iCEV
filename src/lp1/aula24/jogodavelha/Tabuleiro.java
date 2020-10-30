package lp1.aula14.jogodavelha;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import br.com.alcemirsantos.tictactoe.models.Position;

public class Tabuleiro {

	// mapeamento da coordada do tabuleiro para o simbolo
	private Map<Coordenada, Character> mapa;

	public Tabuleiro() {
		this.mapa = new HashMap<Coordenada, Character>();
	}

	public boolean temVencedor() {
		// TODO Auto-generated method stub
		return false;
	}

	public void mostrarTabuleiro() {
		// TODO Auto-generated method stub

	}

	public void executar(Jogada nova) {
		Zona alvo = nova.getZona();
		Jogador jogador = nova.getJogador();
		marcar(alvo, jogador.getSimbolo());
	}

	private void marcar(Zona alvo, String simbolo) {
	}

	public String imprimeVencedor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		Character[][] map = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		for (Entry<Coordenada, Character> e : mapa.entrySet()) {
			map[e.getKey().getX()][e.getKey().getY()] = e.getValue();
		}

		StringBuilder sb = new StringBuilder("\t   0  1  2 \n");
		for (int linha = 0; linha < 3; linha++) {
			sb.append("\t" + linha + " [" + map[linha][0] + "][" + map[linha][1] + "][" + map[linha][2] + "]\n");
		}
		return sb.toString();
	}

}
