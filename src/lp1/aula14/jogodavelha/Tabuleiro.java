package lp1.aula14.jogodavelha;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tabuleiro {
	
	// mapeamento da coordada do tabuleiro para o simbolo
	private  Map<Coordenada, String> mapa;

	public Tabuleiro() {
		this.mapa = new HashMap<Coordenada, String>();
		
//		// mapeando (2,2) ao simbolo X
//		mapa.put(new Coordenada(2, 2), "X");
//		mapa.put(new Coordenada(1, 2), "X");
//		mapa.put(new Coordenada(0, 2), "X");
//		mapa.put(new Coordenada(2, 2), "O");
//		
//		// pedindo o simbolo da posicao (2,2)
//		mapa.get(new Coordenada(2,2)); // retornar X
//		
//		
//		for(Entry<Coordenada, String> aux : mapa.entrySet()) {
//			aux.getKey(); // me dá a coordenada
//			aux.getValue(); // me dá o simbolo
//		}
//		
//		
//		for(Coordenada aux : mapa.keySet()) {
//			aux.getX();
//			aux.getY();
//			
//			String str = mapa.get(aux);
//		}
//		
//		
//		for(String aux : mapa.values()) {
//			String str = mapa.get(aux);
//		}
		
	}
	
	public boolean temVencedor() {
		// TODO Auto-generated method stub
		return false;
	}

	public void mostrarTabuleiro() {
		// TODO Auto-generated method stub
		
	}

	public void executaJogada(Jogada nova) {
//		Zona alvo = nova.getZona();
//		Jogador jogador = nova.getJogador();
//		marcar(alvo, jogador.getSimbolo());
	}

//	private void marcar(Zona alvo, String simbolo) {
//	}

	public String imprimeVencedor() {
		// TODO Auto-generated method stub
		return null;
	}

}
