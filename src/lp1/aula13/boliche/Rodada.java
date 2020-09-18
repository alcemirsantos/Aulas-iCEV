package lp1.aula13.boliche;

public class Rodada {
	public Arremesso um;
	public Arremesso dois;

	public Rodada() {
		this(null, null);
	}

	public Rodada(Arremesso primeiro, Arremesso segundo) {
		um = primeiro;
		dois = segundo;
	}

	public int getPontuacaoParcial() {
		if (um == null) {
			return 0;
		} else if (dois == null) {
			return um.getPinosDerrubados();
		} else {
			return um.getPinosDerrubados() + dois.getPinosDerrubados();
		}
	}

	public boolean foiSpare() {
		if (um == null || dois == null)
			return false;
		if (!foiStrike() && getPontuacaoParcial() == 10)
			return true;
		return false;
	}

	public boolean foiStrike() {
		return um.getPinosDerrubados() == 10 ? true : false;
	}

	@Override
	public String toString() {
		if (um == null)
			return "Esperando arremesso...";
		if (um.pinos == 10)
			return "X";
		if (um.pinos + dois.pinos == 10)
			return um.pinos + "+/";
		return um + "+" + dois;
	}
}
