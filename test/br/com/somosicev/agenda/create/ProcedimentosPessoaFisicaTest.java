package br.com.somosicev.agenda.create;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.somosicev.tp.agenda.modelo.CPF;
import br.com.somosicev.tp.agenda.modelo.Endereco;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.Telefone;
import br.com.somosicev.tp.agenda.modelo.enums.TipoLogradouro;
import br.com.somosicev.tp.agenda.modelo.enums.TipoTelefone;
import br.com.somosicev.tp.agenda.visao.AgendaPessoaFisica;

public class ProcedimentosPessoaFisicaTest {

	private AgendaPessoaFisica apf = new AgendaPessoaFisica(); 
	
	@Test
	public void testAddPFComDadosOK() {
		String nome  = "Alcemir";
		CPF cpf = new CPF("123.123.123-12");
		Endereco e = new Endereco(TipoLogradouro.RUA, "dos bobos", "0");
		Telefone t = new Telefone(TipoTelefone.CELULAR, "86", "1234-1234");
		PessoaFisica pf = new PessoaFisica(nome,cpf , e, t);
		assertTrue("A PF deveria ter sido adicionada.", apf.adicionar(pf));
	}
}
