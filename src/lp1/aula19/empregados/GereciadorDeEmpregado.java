package lp1.aula19.empregados;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class GereciadorDeEmpregado {

	public static void main(String[] args) {

		ArrayList<Empregado> bd = new ArrayList<Empregado>();

		// CRUD (criar, remover, atualizar, buscar)

		// ToDo's
		int opcao;
		do {
			// - exibir um menu;
			IU.exibirMenu();
			//
			// - coletar opção do usuário;
			opcao = IU.coletarOpcaoDoUsuario();
			// - processar/executar opção do usuário;
			switch (opcao) {
			case 1: // adicionar
				System.out.println("..escolheu adicionar!");

				Empregado nova = IU.criarNovoEmpregado();

				bd.add(nova);
				imprimirLista(bd);
				break;
			case 2: // buscar
				System.out.println("..escolheu buscar!");

				Empregado encontrada = buscarEmpregado(bd);
				if (encontrada != null)
					System.out.println("Fim dos resultados!");
				else
					System.out.println("Busca sem resultados!");

				break;
			case 3: // atualizar
				System.out.println("..escolheu atualizar!");

				Empregado aux = buscarEmpregado(bd);
				String novoNome = IU.coletarNomeDoEmpregado();
				double novoSalario = IU.coletarSalarioDoEmpregado();

				aux.setNome(novoNome);
				aux.setSalarioBase(novoSalario);

				imprimirLista(bd);

				break;

			case 4: // remover
				System.out.println("...escolheu remover!");

				System.out.println("Descreva a tarefa a ser removida:");
				Empregado tmp = IU.criarNovoEmpregado();

//				boolean flag = false;
//				for (Empregado t : bd) {
//					if (t.getNome().equals(tmp.getNome())) {
//						flag = true;
//						tmp = t;
//					}
//				}
//
//				if (flag)
//					bd.remove(tmp);

				if (bd.contains(tmp))
					bd.remove(tmp);

				imprimirLista(bd);
				break;

			default: // sair
				System.out.println("...pediu pra sair");
				break;
			}

		} while (!pediuPraSair(opcao)); // - repetir até que usuário pessa para sair;
		System.out.println("Tchau!");
		System.exit(0);
	}

	private static Empregado buscarEmpregado(ArrayList<Empregado> bd) {
		String nome = IU.coletarNomeDoEmpregado();
		for (Empregado t : bd) {
			if (t.getNome().equals(nome)) {
				System.out.println("Resultado da Busca:");
				imprimirEmpregado(t);
				return t;
			}
		}
		return null;
	}

	static boolean pediuPraSair(int opcao) {
		return (opcao < 1 || opcao > 4) ? true : false;
	}

	static void imprimirLista(ArrayList<Empregado> lista) {
		for (Empregado t : lista) {
			imprimirEmpregado(t);
		}
	}

	static void imprimirEmpregado(Empregado t) {
		System.out.println(
				t.getNome() + 
				"\n\t[Salario final: " + t.getSalarioFinal() + "]"
				+ "\n\t[Salário base: "+ t.getSalarioBase() + "]");
	}

}
