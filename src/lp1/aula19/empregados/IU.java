package lp1.aula19.empregados;

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

	public static double coletarSalarioDoEmpregado() {
		System.out.print("Digite o salário do empregado: ");
		return Double.valueOf(sc.nextLine());
	}

	public static String coletarNomeDoEmpregado() {
		System.out.print("Descreva o nome do Empregado: ");
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

	public static Empregado criarNovoEmpregado() {
		// qual tipo do empregado?
		System.out.println("Quer cadastrar (1) Professor ou (2) Coordenador?");
		int opcao = coletarOpcaoDoUsuario();

		// pedir a descrição da tarefa
		String nome = coletarNomeDoEmpregado();
		// pedir o salario
		double salario = coletarSalarioDoEmpregado();

//		
//		if(opcao == 1) {
//			return new Professor(nome, salario);
//		}else {
//			return  new Coordenador(nome, salario);
//		}
		return opcao == 1 ? 
				new Professor(nome, salario) : 
					new Coordenador(nome, salario);
	}

	public static boolean coletarStatus() {
		System.out.print("Digite novo status: ");
		return sc.nextLine().equals("true") ? true : false;
	}

}
