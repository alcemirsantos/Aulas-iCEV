package br.com.somosicev.listas.lista05.q07;

import java.util.ArrayList;
import java.util.List;

import br.com.somosicev.listas.lista05.q07.enums.Trabalho;
import br.com.somosicev.listas.lista05.q07.modelos.EmpregoAssalariado;
import br.com.somosicev.listas.lista05.q07.modelos.EmpregoAutonomo;
import br.com.somosicev.listas.lista05.q07.modelos.EmpregoHorista;
import br.com.somosicev.listas.lista05.q07.modelos.Familia;
import br.com.somosicev.listas.lista05.q07.modelos.Pessoa;

public class Main {
	
	static final double PI = 3.14;
	
	// herança de tipo
	private static  List<Familia> familias = new ArrayList<Familia>();

	public static void main(String[] args) {
		
	
//		for(int i=0; i<2; i++) {
			// Criando a familia
//			Familia f = new Familia();
			
			// adicionando pessoas à familia
			Pessoa p1 = new Pessoa("Toin", null); // desempregado
			Pessoa p2 = new Pessoa("Ziraldo", new EmpregoAssalariado()); // assalariado
			Pessoa p3 = new Pessoa("Peralta",  new EmpregoHorista()); // horista
			Pessoa p4 = new Pessoa("Allejo", new EmpregoAutonomo()); // autonomo
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
			
//			
//			f.addPessoa(p1);
//			f.addPessoa(p2);
//			f.addPessoa(p3);
//			f.addPessoa(p4);
//			
//			
//			// selecionar o tipo de emprego
//			int opcao =0;
//			Trabalho t = null;
//			if(opcao == 0)
//				t = Trabalho.ASSALARIADO;
//			
//			switch (t) {
//			case ASSALARIADO:
//				
//				break;
//
//			case AUTONOMO:
//				break;
//				
//			case HORISTA:
//				break;
//			default:
//				break;
//			}
//		
//			
//			
//			
//		}
		
		
	}


}
