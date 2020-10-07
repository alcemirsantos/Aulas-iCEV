package lp1.aula15.todo;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Interface de Usuário (IU)
 * 
 * @author alcemirsantos
 *
 */
public class IU {

	private static Scanner sc = new Scanner(System.in);

	public static void exibirMenu() {
		System.out.println("\n== MENU ==");
		System.out.println("1: Adicionar;");
		System.out.println("2: Buscar; ");
		System.out.println("3: Atualizar;");
		System.out.println("4: Remover;");
		System.out.println("Outro número para SAIR!");
		System.out.println("===========");
	}

	public static int coletarOpcaoDoUsuario() {
		System.out.print("Digite uma opcao: ");
		return Integer.valueOf(sc.nextLine());
	}

	public static String coletarDescricaoDaTarefa() {
		System.out.print("Descreva a tarefa: ");
		return sc.nextLine();
	}

	public static String coletarDataDaTarefa() {
		System.out.print("Digite uma data: ");
		return sc.nextLine();
	}

	private static int converter(String num) {
		return Integer.valueOf(num);
	}

	public static GregorianCalendar criarDataDeFinalizacao() {
		int year;
		int month;
		int day;

		// 12/10/2020
		String dataEmTexto = coletarDataDaTarefa();
		String[] textoQuebrado = dataEmTexto.split("/"); // o que é o split?

		year = converter(textoQuebrado[2]);
		month = converter(textoQuebrado[1]);
		day = converter(textoQuebrado[0]);
		return new GregorianCalendar(year, month, day);
	}

	public static Tarefa criarNovaTarefa() {
		// pedir a descrição da tarefa
		String descricao = coletarDescricaoDaTarefa();
		// pedir data de finalização
		GregorianCalendar data = criarDataDeFinalizacao();

		return new Tarefa(descricao, data, false);
	}

	public static boolean coletarStatus() {
		System.out.print("Digite novo status: ");
		return sc.nextLine().equals("true")? true: false;
	}

}
