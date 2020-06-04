package br.com.somosicev.agenda.models;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.somosicev.tp.agenda.visao.IU;

public class CPFTest {

	
	private IU iUsuario;
	private String cpf;

	@Before
	public void setUp() {
		iUsuario = new IU();
	}

	@After
	public void tearDown() {
		iUsuario = null;
	}
	
	
	

	@Test
	public void testValidaCPFOK() throws Exception {
		// Dado que...
		cpf = "123.123.123-12";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
		assertTrue(resultado);
	}

	
	@Test(expected = Exception.class)
	public void testVallidaCPNErrado1() throws Exception {
		// Dado que...
//		cpf = "123.123.123-1a";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado2() throws Exception {
		// Dado que...
//		cpf = "123.123123-12";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado3() throws Exception {
		// Dado que...
//		String cpf = "12312312312";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado4() throws Exception {
		// Dado que...
		String cpf = "123123.123-12";

		// Quando eu fizer...
		boolean resultado =iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado5() throws Exception {
		// Dado que...
//		String cpf = "a23.123123-12";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado6() throws Exception {
		// Dado que...
//		String cpf = "123.123.123-122";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado7() throws Exception {
		// Dado que...
//		String cpf = "123.123.123.122";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}

	@Test(expected = Exception.class)
	public void testVallidaCPNErrado8() throws Exception {
		// Dado que...
//		String cpf = "123.1253.123.22";

		// Quando eu fizer...
		boolean resultado = iUsuario.validaCPF(cpf);

		// Eu espero que...
	}
}
