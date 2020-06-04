package br.com.somosicev.agenda.models;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.somosicev.tp.agenda.visao.IU;

public class EnderecoTest {
	private IU iUsuario;
	private String endereco;

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
		endereco = "Alcemir Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...
		assertTrue("o nome deveria ter sido validado!", resultado);
		
	}
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigito() throws Exception {
		// Dado que...
		endereco = "Alcemir San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComEspacoNoFinal() throws Exception {
		// Dado que...
		endereco = "Alcemir Santos ";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComUmaPalavra() throws Exception {
		// Dado que...
		endereco = "Alcemir";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoSohNaPrimeira() throws Exception {
		// Dado que...
		endereco = "Alc2emir Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoNasDuasPalavras() throws Exception {
		// Dado que...
		endereco = "Alc2emir San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	
	@Test
	public void testNomeValidoComTrêsNomes() throws Exception {
		// Dado que...
		endereco = "Alcemir Rodrigues Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...
		assertTrue("o nome deveria ter sido validado!", resultado);
		
	}
	
	

	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoCom3() throws Exception {
		// Dado que...
		endereco = "Alcemir Rodrigues San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComEspacoNoFinalCom3() throws Exception {
		// Dado que...
		endereco = "Alcemir Rodrigues Santos ";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComUmaPalavraCom3() throws Exception {
		// Dado que...
		endereco = "Alcemir ";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoSohNaPrimeiraCom3() throws Exception {
		// Dado que...
		endereco = "Alc2emir Rodrigues Santos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	@Test(expected = Exception.class)
	public void testNomeInalidoComDigitoNasDuasPalavrasCom3() throws Exception {
		// Dado que...
		endereco = "Alc2emir Rodrigues San2tos";
		
		// Quando eu fizer... 
		boolean resultado  = iUsuario.validaNome(endereco);
		
		// Eu espero que...		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
