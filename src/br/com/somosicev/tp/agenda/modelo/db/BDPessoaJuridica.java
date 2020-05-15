package br.com.somosicev.tp.agenda.modelo.db;

import java.util.List;
import java.util.Map;

import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.PessoaJuridica;

public class BDPessoaJuridica extends BD{
	
	private Map<PessoaFisica, List<PessoaJuridica>> cadastrosPJ;

  /*
  * Buscar pessoa juridica, entrada é um objeto PessoaJuridica.
  */
	@Override
	public List<Pessoa> buscar(Pessoa pj) {
    boolean controle = false;
    for(Entry<Integer, List<PessoaJuridica>> entry : contatos.entrySet()) {
      List<PessoaJuridica> listaPj = entry.getValue;
      if (entry.value.contains(pj)){
        return entry.value.get(entry.getValue.indexOf(pj));
      } else {
        System.out.println("Pessoa não encontrada");
        return null;
    }
		return null;
	}

  /*
  * Adicionar pessoa juridica, entrada é um objeto PessoaJuridica.
  */
	@Override
	public void adicionar(Pessoa nova) {
		String letraInicial = String.valueOf(nova.getNome().toUpperCase().charAt(0));
		List<PessoaJuridica> pessoasComEstaLetraInicial;
		  if(contatos.get(letraInicial) == null)
			  pessoasComEstaLetraInicial = new ArrayList<Pessoa>();
		  else 
			  pessoasComEstaLetraInicial = contatos.get(letraInicial);
		pessoasComEstaLetraInicial.add(nova);
		contatos.put(letraInicial, pessoasComEstaLetraInicial);
	}

  /*
  * Remover pessoa juridica, entrada é um objeto PessoaJuridica.
  */
	@Override
	public void remover(Pessoa velha) {
  boolean controle = false;
    for(Entry<Integer, List<PessoaJuridica>> entry : contatos.entrySet()) {
      List <PessoaJuridica> pj = entry.getValue();
      if pj.contains(pessoaVelha) {
        boolean controle = true;
        contatos.remove(pessoaVelha);
      }
    } 
    if(controle == true) {
      System.out.println("Pessoa removida com sucesso!");
    }
    else {
      System.out.println("Pessoa não localizada!");
    }
	}
	}
}
