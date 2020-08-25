package br.com.somosicev.listas.lista04.q02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static BaseDeDados bd = new BaseDeDados();
	
	public static void main(String[] args) {
		do {
			imprimeMenu();
			int opcao = coletarOpcaoDesejada();
			switch (opcao) {
			case 1: // adicionar tarefa
//				Contato novoContato = criarContato();
				Tarefa novaTarefa = criarTarefa();
				bd.adicionar(novaTarefa);
				break;
			
			case 2:// remover
				imprimeTarefas();
//				System.out.println("Você deve escolher uma das opções para remover");
//				opcao = coletarOpcaoDesejada();
//				bd.remover(opcao);
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

	private static Tarefa criarTarefa() {
		System.out.print("Digite a descrição:");
		String desc = sc.nextLine();
		System.out.print("Digite a data (DIA/MES/ANO):");
		String dadosData = sc.nextLine();
		
		int[] dadosConvertidos = processaDadosData(dadosData);
		
		GregorianCalendar data = new GregorianCalendar(dadosConvertidos[2], dadosConvertidos[1], dadosConvertidos[0]);
	
		Tarefa resposta = new Tarefa(desc, data);
		return resposta;
	}
	
	static int[] processaDadosData(String entrada) {
		
		// ex: [20][04][2020]
		String[] entradas = entrada.split("/");
		int[] data = new int[entradas.length];

		for(int p =0; p<entradas.length; p++) {
			data[p] = Integer.valueOf(entradas[p]);
		}
//		int dia  = Integer.valueOf(entradas[0]);
//		int mes  = Integer.valueOf(entradas[1]);
//		int ano  = Integer.valueOf(entradas[2]);
//		int[] data2 = {dia, mes, ano};
		
		
		return data;// data[0] == 20; data[1] == 04; data[2] = 2020;
	}
	
	

	private static void imprimeTarefas() {
		for(int p=0; p<bd.tarefas.length; p++) {
			Tarefa t = bd.tarefas[p];
			if(t!= null) {
				// 1:(20/04/2020, tarefa1, false);
				SimpleDateFormat fmt = new SimpleDateFormat("dd/MMM/yyyy");
				Date d = t.getData().getTime();
				System.out.println(p+": ("+fmt.format(d)+", "+t.getDescricao()+", "+t.getStatus()+");");
			}
		}
	}

	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}
	
	// expressões regulares
	// Matchers

	private static void imprimeMenu() {
		
		System.out.println("\n::: TODO App :::");
		System.out.println(":::- Menu -:::");
		System.out.println(":1: Adicionar novo TODO :");
		System.out.println(":2: Remover TODO :");
		System.out.println(":3: Listar TODO:");
		System.out.println(":4: Alterar TODO:");
		System.out.println(":0: Sair do programa :");
		
	}

}
