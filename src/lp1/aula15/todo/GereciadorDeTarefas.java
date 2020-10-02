package lp1.aula15.todo;

public class GereciadorDeTarefas {

	public static void main(String[] args) {

		// CRUD (criar, remover, atualizar, buscar)

		// ToDo's
		int opcao ;
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
				
				
				
				
				break;
			case 2: // buscar
				System.out.println("..escolheu buscar!");
				break;
			case 3: // atualizar
				System.out.println("..escolheu atualizar!");
				break;
			case 4: // remover
				System.out.println("...escolheu remover!");
				break;

			default: // sair
				System.out.println("...pediu pra sair");
				break;
			}

		} while (!pediuPraSair(opcao)); // - repetir até que usuário pessa para sair;
		System.out.println("Tchau!");
		System.exit(0);
	}
	
	static boolean pediuPraSair(int opcao) {
		return (opcao <1 || opcao >4) ? true: false;
	}

}
