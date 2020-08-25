package br.com.somosicev.tp.agenda;

import br.com.somosicev.tp.agenda.visao.Agenda;
import br.com.somosicev.tp.agenda.visao.AgendaPessoaFisica;
import br.com.somosicev.tp.agenda.visao.AgendaPessoaJuridica;
import br.com.somosicev.tp.agenda.visao.IU;

public class Main {

	
	public static void main(String[] args) {

		// instanciação das agendas
		Agenda agendaPF =  new AgendaPessoaFisica();
		Agenda agendaPJ =  new AgendaPessoaJuridica();
		
		// laço de execução
		while(true) {
			IU.exibirMenuDeEscolhaDeTipoDePessoa();
			int opcao = IU.coletarOpcaoEscolhida();
			
			switch(opcao) {
			case 1: // trabalhar com pessoa fisica
				agendaPF.inicia();
				break;
			case 2: // trabalhar com pessoa jurídica
				agendaPJ.inicia();
				break;
			default: // sair do programa
				System.out.println("Obrigado por usar o programa!\n\t== Tchau! :-) ==");
				IU.close();
				System.exit(0);
			}
		}
		
	}
	

}
