package lp1.aula14.boliche;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		metodoUm();
		metodoDois();
		metodoTres();
		metodoQuatro();
		metodoCinco();
	}

	private static void metodoUm() {
		Boliche b = new Boliche();

		b.rodadas[0] = criaRodada(4, 6);

		b.rodadas[1] = criaRodada(10, 0);

		b.rodadas[2] = criaRodada(3, 3);

		Rodada r = criaRodada(0, 5);
		b.rodadas[3] = r;

		System.out.println(b);
	}

	private static void metodoDois() {

		Boliche b = new Boliche();

		for (int i = 0; i < 12; i++)
			b.rodadas[i] = criaRodadaAleatoria();

		System.out.println(b);
	}

	private static void metodoTres() {

		Boliche b = new Boliche();
		b.play("X X X X X X X X X 64 X");
		System.out.println(b);

	}

	private static void metodoQuatro() {
		Boliche b = new Boliche();
		Scanner sc = new Scanner(System.in);
		for (int rodada = 0; rodada < 10; rodada++) {
			System.out.print("Rodada " + (rodada + 1) + ": ");
			b.executaRodada(rodada, sc.nextLine());
			if (rodada == 9) {
				if (b.rodadas[rodada].foiSpare()) {
					System.out.print("Rodada Bônus: ");
					b.executaRodada(rodada + 1, sc.nextLine());
				} else if (b.rodadas[rodada].foiStrike()) {
					System.out.print("Rodada Bônus: ");
					b.executaRodada(rodada + 1, sc.nextLine());
					System.out.print("Rodada Bônus: ");
					b.executaRodada(rodada + 2, sc.nextLine());
				}
			}
		}
		System.out.println(b);
		sc.close();
	}

	private static void metodoCinco() {
		Scanner sc = new Scanner(System.in);
		Boliche b = new Boliche();
		int rodadas = 1;
		while (rodadas < 11) {
			System.out.println("[Rodada " + rodadas + "]:");
			System.out.print("(Arremesso 1):");
			Arremesso primeiro = new Arremesso(Integer.valueOf(sc.nextLine()));
			if (primeiro.getPinosDerrubados() == 10) {
				// foi strike.
				b.rodadas[rodadas - 1] = new Rodada(primeiro, null);
				rodadas++;
				continue;
			}
			System.out.print("(Arremesso 2):");
			Arremesso segundo = new Arremesso(Integer.valueOf(sc.nextLine()));
			b.rodadas[rodadas - 1] = new Rodada(primeiro, segundo);
			rodadas++;
		}
		if (b.rodadas[rodadas - 2].foiSpare()) {
			System.out.println("(Arremesso Bônus):");
			Arremesso bonus = new Arremesso(Integer.valueOf(sc.nextLine()));
			b.rodadas[rodadas-1] = new Rodada(bonus, null);
		} else if (b.rodadas[rodadas - 2].foiStrike()) {
			System.out.print("(Arremesso Bônus 1):");
			Arremesso bonusUm = new Arremesso(Integer.valueOf(sc.nextLine()));
			Arremesso bonusDois = null;
			if (bonusUm.getPinosDerrubados() == 10) {
				System.out.print("(Arremesso Bônus 2):");
				bonusDois = new Arremesso(Integer.valueOf(sc.nextLine()));
			}
			b.rodadas[rodadas-1] = new Rodada(bonusUm, null);
			b.rodadas[rodadas] = new Rodada(bonusDois, null);

		}
		System.out.println(b);
		sc.close();
	}
	/**
	 * Cria e retorna uma rodada baseado nos parâmetros
	 */
	private static Rodada criaRodada(int arremessoUm, int arremessoDois) {
		return new Rodada(new Arremesso(arremessoUm), new Arremesso(arremessoDois));
	}

	/**
	 * Cria e retorna uma rodada baseado nos parâmetros
	 */
	private static Rodada criaRodadaAleatoria() {
		Rodada result = new Rodada();
		Random r = new Random();
		int numPinos = r.nextInt(11);
		result.um = new Arremesso(numPinos);
		if (numPinos < 10) {
			numPinos = r.nextInt(11 - numPinos);
			result.dois = new Arremesso(numPinos);
		}
		return result;
	}
}
