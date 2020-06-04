package br.com.somosicev.agenda.models;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.somosicev.tp.agenda.visao.IU;

public class TelefoneTest {

	
	private IU iUsuario;

	@Before
	public void setUp() {
		iUsuario = new IU();
	}

	@After
	public void tearDown() {
		iUsuario = null;
	}
	
	/*
	 * Somente dígitos
	 * Deve ter no mínimo 8 dígitos
	 * Deve ter no máximo 9 dígitos
	 * Com um - no 5º ou 6º dígito
	 */
	
	@Test
	public void testTelefoneOKCom8() throws Exception {
		// Dado que...
		String numero =  "9999-9999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom8HifenMuitoCedo() throws Exception {
		// Dado que...
		String numero =  "999-99999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
	}
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom8HifenMuitoTarde() throws Exception {
		// Dado que...
		String numero =  "99959-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom7NoFim() throws Exception {
		// Dado que...
		String numero =  "9999-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom7NoInicio() throws Exception {
		// Dado que...
		String numero =  "999-9999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom8Mas2Hifens() throws Exception {
		// Dado que...
		String numero =  "999-99-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom8Mas2Hifens2() throws Exception {
		// Dado que...
		String numero =  "9-9999-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	
	@Test
	public void testTelefoneOKcom9() throws Exception {
		// Dado que...
		String numero =  "99999-9999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	

	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom9HifenMuitoCedo() throws Exception {
		// Dado que...
		String numero =  "9999-99999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
	}
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom9HifenMuitoTarde() throws Exception {
		// Dado que...
		String numero =  "999599-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom8NoFim() throws Exception {
		// Dado que...
		String numero =  "99999-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom8NoInicio() throws Exception {
		// Dado que...
		String numero =  "999-99999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom9Mas2Hifens() throws Exception {
		// Dado que...
		String numero =  "999-999-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
	
	@Test(expected = Exception.class)
	public void testTelefoneInvalidoCom9Mas2Hifens2() throws Exception {
		// Dado que...
		String numero =  "99-9999-999";// "000000000"

		// Quando eu fizer...
		boolean resultado = iUsuario.validaNumeroTelefone(numero);

		// Eu espero que...
		assertTrue(resultado);
	}
	
	
}
