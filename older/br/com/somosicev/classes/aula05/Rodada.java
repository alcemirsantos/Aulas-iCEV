package br.com.somosicev.classes.aula05;

public class Rodada {
	Arremesso um;
	Arremesso dois;

	public int getPontuacaoParcial() {
		if (um == null) {
			System.out.println();
			return 0;
		} else if (dois == null) {
			return um.getPinosDerrubados();
		} else {
			return um.getPinosDerrubados() + dois.getPinosDerrubados();
		}
	}

	public boolean ehUmSpare() {
		if(!ehUmStrike() && getPontuacaoParcial()==10) 
			return true;
		return false;
	}

	public boolean ehUmStrike() {		
		return um.getPinosDerrubados()==10 ? true:false;
	}
	
}
