package br.com.somosicev.tp.agenda.modelo.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.somosicev.tp.agenda.modelo.Pessoa;

public class BDPessoaFisica extends BD {

	public BDPessoaFisica() {
		contatos = new HashMap<String, List<Pessoa>>();
	}

	@Override
	public Pessoa buscar(Pessoa p) {
    for(Entry<Integer, List<Pessoa>> entry : contatos.entrySet()) {
      List <Pessoa> listaPessoa = entry.getValue();
      if(entry.value.contains(p)){
        int id = entry.getValue.indexOf(p);
        return entry.value.get(i);
        // System.out.println(p);
      }else{
         System.out.println("Pessoa não encontrada");
         // TODO adicionar tratamento de exceções
        return null;
      }
      
    } 
   
	}

	@Override
	public void adicionar(Pessoa nova) {
		// "Alcemir"
		String letraInicial = String.valueOf(nova.getNome().toUpperCase().charAt(0));
		List<Pessoa> pessoasComEstaLetraInicial;
		if(contatos.get(letraInicial) == null)
			pessoasComEstaLetraInicial = new ArrayList<Pessoa>();
		else 
			pessoasComEstaLetraInicial = contatos.get(letraInicial);
		pessoasComEstaLetraInicial.add(nova);
		contatos.put(letraInicial, pessoasComEstaLetraInicial);
	}

	@Override
	public void remover(Pessoa pessoaVelha) {
		boolean controle = false;
    for(Entry<Integer, List<Pessoa>> entry : contatos.entrySet()) {
      List <Pessoa> pessoa = entry.getValue();
      if pessoa.contains(pessoaVelha) {
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
