package lp1.aula24.jogodavelha.controle.validadores;

import lp1.aula24.jogodavelha.controle.estados.PartidaEmAndamento;
import lp1.aula24.jogodavelha.controle.estados.PartidaEmpatada;
import lp1.aula24.jogodavelha.controle.estados.PartidaTemVencedor;
import lp1.aula24.jogodavelha.entidades.Tabuleiro;

public class ValidadorDeTabuleiro implements Validador<Tabuleiro> {

	Tabuleiro alvo;

	/**
	 * Deve validar uma jogada.
	 */
	@Override
	public Object validar(Tabuleiro t) {
		alvo = t;
		if (temVencedor())
			return new PartidaTemVencedor();
		else if (alvo.getMapa().size() == 9)
			return new PartidaEmpatada();
		return new PartidaEmAndamento();
	}

	private boolean temVencedor() {
		for (int i = 0; i < 3; i++) {
			if (getLinha(i).equals("XXX") || 
					getLinha(i).equals("OOO") ||
					getColuna(i).equals("XXX") ||
					getColuna(i).equals("OOO"))
				return true;
		}
		if (getDiagonal(1).equals("XXX") || getDiagonal(1).equals("OOO"))
			return true;
		if (getDiagonal(2).equals("XXX") || getDiagonal(2).equals("OOO"))
			return true;

		return false;
	}

	private String getLinha(int i) {
		Character[][] t = alvo.toMatriz();
		return "" + t[i][0] + t[i][1] + t[i][2];
	}

	private String getColuna(int i) {
		Character[][] t = alvo.toMatriz();
		return "" + t[0][i] + t[1][i] + t[2][i];
	}

	private String getDiagonal(int i) {
		Character[][] t = alvo.toMatriz();
		if (i == 1)
			return "" + t[0][0] + t[1][1] + t[2][2];
		return "" + t[0][2] + t[1][1] + t[2][0];
	}

}
