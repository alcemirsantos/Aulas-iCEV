package lp1.aula15.todo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GereciadorDeTarefas {

	public static void main(String[] args) {

		ArrayList<Tarefa> bd = new ArrayList<Tarefa>();
		Map<String, List<Tarefa>> bd2 = new HashMap<String, List<Tarefa>>(); 
		
		

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

				Tarefa nova = IU.criarNovaTarefa();

				bd.add(nova);
				imprimirLista(bd);
				break;
			case 2: // buscar
				System.out.println("..escolheu buscar!");

				Tarefa encontrada = buscarTarefa(bd);
				if (encontrada != null)
					System.out.println("Fim dos resultados!");
				else
					System.out.println("Busca sem resultados!");

				break;
			case 3: // atualizar
				System.out.println("..escolheu atualizar!");

				Tarefa aux = buscarTarefa(bd);
				String novaDescricao = IU.coletarDescricaoDaTarefa();
				GregorianCalendar novaData = IU.criarDataDeFinalizacao();
				boolean novoStatus = IU.coletarStatus();

				aux.setDescricao(novaDescricao);
				aux.setDataLimite(novaData);
				aux.setStatus(novoStatus);

				imprimirLista(bd);

				break;

			case 4: // remover
				System.out.println("...escolheu remover!");

				System.out.println("Descreva a tarefa a ser removida:");
				Tarefa tmp = IU.criarNovaTarefa();

				boolean flag = false;
				for (Tarefa t : bd) {
					if (t.getDataLimite().equals(tmp.getDataLimite()) && t.getDescricao().equals(tmp.getDescricao())) {
						flag = true;
						tmp = t;
					}
				}

				if (flag)
					bd.remove(tmp);

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

	private static Tarefa buscarTarefa(ArrayList<Tarefa> bd) {
		String descricao = IU.coletarDescricaoDaTarefa();
		for (Tarefa t : bd) {
			if (t.getDescricao().equals(descricao)) {
				System.out.println("Resultado da Busca:");
				imprimirTarefa(t);
				return t;
			}
		}
		return null;
	}

	static boolean pediuPraSair(int opcao) {
		return (opcao < 1 || opcao > 4) ? true : false;
	}

	static void imprimirLista(ArrayList<Tarefa> lista) {
		for (Tarefa t : lista) {
			imprimirTarefa(t);
		}
	}

	static void imprimirTarefa(Tarefa t) {
		System.out.println("[" + traduzGC(t.getDataLimite()) + "] " + t.getDescricao());
	}

	static String traduzGC(GregorianCalendar gc) {
		return gc.get(GregorianCalendar.DAY_OF_MONTH) + "/" + gc.get(GregorianCalendar.MONTH) + "/"
				+ gc.get(GregorianCalendar.YEAR);
	}
}
