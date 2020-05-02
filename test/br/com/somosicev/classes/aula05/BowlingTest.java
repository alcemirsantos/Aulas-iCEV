package br.com.somosicev.classes.aula05;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BowlingTest {


	@Test
	public void testPontuacaoRodadaParcial() {
		// Dado que...
		Rodada r = new Rodada();
		Arremesso a = new Arremesso(4);
		Arremesso b = new Arremesso(3);

		// Quando eu...
		r.um = a;
		r.dois = b;

		// Espero que...
		assertTrue(r.getPontuacaoParcial() == 7);
	}

	@Test
	public void testIsSpare() {
		Rodada r1 = new Rodada();
		Arremesso a1 = new Arremesso(4);
		Arremesso a2 = new Arremesso(6);

		r1.um = a1;
		r1.dois = a2;

		assertTrue(r1.ehUmSpare());

	}
	
	@Test
	public void testIsStrike() {
		Rodada r1 = new Rodada();
		Arremesso a1 = new Arremesso(10);

		r1.um = a1;

		assertTrue(r1.ehUmStrike());

	}

	@Test
	public void testPontuacaoSpare() {
		Boliche b = new Boliche();
		Rodada r1 = new Rodada();
		Rodada r2 = new Rodada();
		Arremesso a1 = new Arremesso(4);
		Arremesso a2 = new Arremesso(6);
		Arremesso a3 = new Arremesso(6);

		r1.um = a1;
		r1.dois = a2;
		b.rodadas[0] = r1;

		r2.um = a3;
		b.rodadas[1] = r2;

		assertTrue(r1.getPontuacaoParcial() == 10);
		assertTrue(r2.getPontuacaoParcial() == 6);
		assertTrue(b.getPontuacaoFinal() == 22);
	}

	
	@Test
	public void testPontuacaoStrike() {
		Boliche b = new Boliche();
		Rodada r1 = new Rodada();
		Rodada r2 = new Rodada();
		Rodada r3 = new Rodada();
		Arremesso a1 = new Arremesso(10);
		Arremesso a2 = new Arremesso(6);
		Arremesso a3 = new Arremesso(4);
		Arremesso a4 = new Arremesso(4);

		// Strike (20)
		r1.um = a1;
		b.rodadas[0] = r1;

		// Spare (14)
		r2.um = a2;
		r2.dois = a3;
		b.rodadas[1] = r2;
		
		// 4 pinos (4)
		r3.um = a4;
		b.rodadas[2]= r3;

		assertTrue(r1.getPontuacaoParcial() == 10);
		assertTrue(r2.getPontuacaoParcial() == 10);
		assertTrue(r3.getPontuacaoParcial() == 4);
		assertTrue(b.getPontuacaoFinal() == 38);
	}
	
	@Test
	public void testPontuacaoFinalLendoEntrada() {
		// Dado que...
		Boliche b  = new Boliche();
		// Quando eu...
		b.play("X 2/ 23");
		// Espero que...
		assertTrue(b.getPontuacaoFinal() == 37);

	}

	@Test
	public void testPontuacaoFinalTudoStrike() {
		// Dado que...
		Boliche b  = new Boliche();
		// Quando eu...
		b.play("X X X X X X X X X X X X");
		// Espero que...
		assertTrue(b.getPontuacaoFinal() == 300);

	}
	

	@Test
	public void testPontuacaoFinalStrike() {
		// Dado que...
		Boliche b  = new Boliche();
		// Quando eu...
		b.play("X X X X X X X X X 34");
		// Espero que...
		assertTrue(b.getPontuacaoFinal() == 257);

	}
}
