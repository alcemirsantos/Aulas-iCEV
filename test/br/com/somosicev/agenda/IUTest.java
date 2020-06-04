package br.com.somosicev.agenda;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.somosicev.agenda.models.CPFTest;
import br.com.somosicev.agenda.models.EnderecoTest;
import br.com.somosicev.agenda.models.NomeTest;
import br.com.somosicev.agenda.models.TelefoneTest;

@RunWith(Suite.class)
@SuiteClasses({
	NomeTest.class,
	EnderecoTest.class,
	TelefoneTest.class,
	CPFTest.class
})
public class IUTest {


}
