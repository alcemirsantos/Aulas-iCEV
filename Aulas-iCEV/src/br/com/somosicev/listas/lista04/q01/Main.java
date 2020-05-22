package br.com.somosicev.listas.lista04.q01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static BaseDeDados bd = new BaseDeDados();

	public static void main(String[] args) {

		do {
			imprimeMenu();
			int opcao = coletarOpcaoDesejada();
			switch (opcao) {
			case 1: // adicionar
				Contato novoContato = criarContato();
				bd.adicionar(novoContato);
				break;
			
			case 2:// remover
				imprimeContatos();
				System.out.println("Você deve escolher uma das opções para remover");
				opcao = coletarOpcaoDesejada();
				bd.remover(opcao);
				break;
			
			case 3:// buscar

				break;
			case 4: // alterar

				break;

			case 0:
				System.exit(0);
			default:
				break;
			}
		} while (true);

	}

	private static void imprimeContatos() {

//		StringBuilder sb = new StringBuilder();

		for (int posicao = 0; posicao < bd.contatos.length; posicao++) {
//			sb.append(posicao+": ");			
//			sb.append("(");
//			sb.append(tmp.getNome()+",");
//			sb.append(tmp.getTelefone()+",");
//			sb.append(tmp.getEndereco());
//			sb.append(")");
//			System.out.println(sb.toString());

			if (bd.buscar(posicao) != null) {
				Contato tmp = bd.buscar(posicao);
				System.out.println(
						posicao + ": (" + tmp.getNome() + ", " + tmp.getTelefone() + ", " + tmp.getEndereco() + ")");
			}

		}

	}

	private static Contato criarContato() {
		System.out.print("Digite o nome:");
		String novoNome = sc.nextLine();
		System.out.print("Digite o telefone:");
		String novoTelefone = sc.nextLine();
		System.out.print("Digite o endereco:");
		String novoEndereco = sc.nextLine();

		return new Contato(novoNome, novoTelefone, novoEndereco);
	}

	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}

	static void imprimeMenu() {
		System.out.println("\n::: Agenda :::");
		System.out.println(":::- Menu -:::");
		System.out.println(":1: Adicionar novo contato :");
		System.out.println(":2: Remover novo contato :");
		System.out.println(":3: Buscar contatos:");
		System.out.println(":4: Alterar contato :");
		System.out.println(":0: Sair do programa :");
	}

}
