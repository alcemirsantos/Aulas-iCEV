package br.com.somosicev.listas.lista05.q07.modelos;

import java.util.ArrayList;
import java.util.List;

public class Familia {

	private List<Pessoa> membros;

	public void addPessoa(Pessoa nova) {
		if(membros == null)
			membros = new ArrayList<Pessoa>();			
		membros.add(nova);
	}
	
	
	public void addPessoa(String umNome, Emprego novoEmprego) {
		if(membros == null)
			membros = new ArrayList<Pessoa>();			
		membros.add(new Pessoa(umNome, novoEmprego));
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Familia alvo = (Familia) obj;
		
		// comparar todos membros desta familia (this) com os membros da familia (alvo)
		for(Pessoa p: membros) {
			for(Pessoa h: alvo.getMembros()) {
				p.equals(h);
			}
		}
		return super.equals(obj);
	}

	private List<Pessoa> getMembros() {
		return this.membros;
	}
}
