package lp1.aula14.boliche;

public class Boliche {

	public Rodada[] rodadas;

	public Boliche() {
		// criei duas rodadas adicionais para os caso de spare/strike.
		rodadas = new Rodada[12];
	}

	public int getPontuacaoFinal() {
		int contaRodadas = 0;
		int pontuacao = 0;

		// executa 10 iterações
		while (contaRodadas < 10) {
			Rodada rodadaAtual = rodadas[contaRodadas];
			if (rodadaAtual == null)
				break;
			Rodada rodadaSeguinte = rodadas[contaRodadas + 1];
			Rodada rodadaAlemSeguinte = rodadas[contaRodadas + 2];

			pontuacao += rodadaAtual.getPontuacaoParcial();

			if (rodadaAtual.foiSpare()) {
				pontuacao += rodadaSeguinte.um.getPinosDerrubados();

			} else if (rodadaAtual.foiStrike()) {
				if (rodadaSeguinte.foiStrike()) {
					pontuacao += rodadaSeguinte.getPontuacaoParcial();
					pontuacao += rodadaAlemSeguinte.um.getPinosDerrubados();
				} else {
					pontuacao += rodadaSeguinte.getPontuacaoParcial();
				}
			}
			contaRodadas++;
		}

		return pontuacao;
	}

	/**
	 * processar entrada
	 * 
	 * @param input
	 */
	public void play(String input) {
		String[] entradas = input.split(" ");

		for (int rodada = 0; rodada < 10; rodada++) {

			executaRodada(rodada, entradas[rodada]);
			if (rodada == 9) {
				if (rodadas[rodada].foiSpare()) {
					executaRodada(rodada + 1, entradas[rodada + 1]);
				} else if (rodadas[rodada].foiStrike()) {
					executaRodada(rodada + 1, entradas[rodada + 1]);
					executaRodada(rodada + 2, entradas[rodada + 2]);
				}
			}
		}

	}

	public void executaRodada(int rodada, String valor) {
		Arremesso a1 = null;
		Arremesso a2 = null;
		if (valor.toUpperCase().equals("X")) {
			a1 = new Arremesso(10);

		} else if (valor.contains("/")) {
			char aux = valor.charAt(0);
			a1 = new Arremesso(Integer.parseInt("" + aux));
			a2 = new Arremesso(10 - a1.pinos);
		} else {
			char aux = valor.charAt(0);
			a1 = new Arremesso(Integer.parseInt("" + aux));
			aux = valor.charAt(1);
			a2 = new Arremesso(Integer.parseInt("" + aux));
		}
		rodadas[rodada] = new Rodada(a1, a2);
	}

	@Override
	public String toString() {
		String placar = "";
		for (int i = 0; i < 10; i++) {
			Rodada r = rodadas[i];
			if (r == null) {
				placar += " -";
				continue;
			}
			placar += " " + r;
			if (i == 9) {
				if (r.foiSpare()) {
					r = rodadas[i + 1];
					placar += r == null ? " -" : " " + r;
				} else if (r.foiStrike()) {
					r = rodadas[i + 1];
					placar += r == null ? " -" : " " + r;
					r = rodadas[i + 2];
					placar += r == null ? " -" : " " + r;
				}
			}
		}
		return placar + " [Total: " + getPontuacaoFinal() + "]";
	}
}
