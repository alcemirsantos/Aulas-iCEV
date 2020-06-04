package br.com.somosicev.agenda.models;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.somosicev.tp.agenda.visao.IU;

public class NomeTest {

	
	private IU iUsuario;
	private String nome;

	@Before
	public void setUp() {
		iUsuario = new IU();
	}

	@After
	public void tearDown() {
		iUsuario = null;
	}
	
	
	/*
	 * Somente letras
	 * >2 letras
	 * >1 palavra
	 */
	@Test
	public void testNomeValidoComDoisNomes() throws Exception {
		// Dado que...
		nome = "Alcemir Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...
		assertTrue("o nome deveria ter sido validado!", resultado);
		
	}
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigito() throws Exception {
		// Dado que...
		nome = "Alcemir San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComEspacoNoFinal() throws Exception {
		// Dado que...
		nome = "Alcemir Santos ";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComUmaPalavra() throws Exception {
		// Dado que...
		nome = "Alcemir";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoSohNaPrimeira() throws Exception {
		// Dado que...
		nome = "Alc2emir Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoNasDuasPalavras() throws Exception {
		// Dado que...
		nome = "Alc2emir San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	
	@Test
	public void testNomeValidoComTrêsNomes() throws Exception {
		// Dado que...
		nome = "Alcemir Rodrigues Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...
		assertTrue("o nome deveria ter sido validado!", resultado);
		
	}
	
	

	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoCom3() throws Exception {
		// Dado que...
		nome = "Alcemir Rodrigues San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComEspacoNoFinalCom3() throws Exception {
		// Dado que...
		nome = "Alcemir Rodrigues Santos ";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComUmaPalavraCom3() throws Exception {
		// Dado que...
		nome = "Alcemir ";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoSohNaPrimeiraCom3() throws Exception {
		// Dado que...
		nome = "Alc2emir Rodrigues Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoNasDuasPalavrasCom3() throws Exception {
		// Dado que...
		nome = "Alc2emir Rodrigues San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(nome);
		
		// Eu espero que...		
	}
	
	
}
