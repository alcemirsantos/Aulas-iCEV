package br.com.somosicev.tp.agenda.visao;

import java.util.Scanner;

import br.com.somosicev.tp.agenda.modelo.CNPJ;
import br.com.somosicev.tp.agenda.modelo.CPF;
import br.com.somosicev.tp.agenda.modelo.Endereco;
import br.com.somosicev.tp.agenda.modelo.Telefone;
import br.com.somosicev.tp.agenda.modelo.enums.TipoLogradouro;
import br.com.somosicev.tp.agenda.modelo.enums.TipoTelefone;

public class IU {

	private static Scanner teclado;

	public static void exibirMenuDeEscolhaDeTipoDePessoa() {
		System.out.println("Vamos trabalhar com?");
		System.out.println("[1] Pessoa Fisica");
		System.out.println("[2] Pessoa Juridica");
		System.out.println("[?] Na verdade, quero terminar o programa. Tchau!");
	}

	private static void exibirMenuDeTipoDeEndereco() {
		System.out.println("Qual o tipo de endereço?");
		System.out.println("[1] Rua");
		System.out.println("[2] Avenida");
	}

	private static void exibirMenuDeTipoDeTelefone() {
		System.out.println("Qual o tipo de telefone?");
		System.out.println("[1] Fixo");
		System.out.println("[2] Celular");
		System.out.println("[3] Fax");
	}

	public static int coletarOpcaoEscolhida() {
		teclado = new Scanner(System.in);
		int opcao = 0;
		try {
			System.out.print("Digite sua opcao: ");
			opcao = Integer.valueOf(teclado.next());
		} catch (NumberFormatException e) {
			System.err.println("ERRO - Digite apenas numeros.");
		}
		return opcao;
	}

	private static String coletaEntradaDoTeclado() {
		teclado = new Scanner(System.in);
		System.out.print("Digite: ");

		String entrada = teclado.nextLine();
		return entrada;
	}

	public static String coletaNome() throws Exception {
		// TODO adicionar tratamento de exceções.
    //Matheus Magno esta fazendo...
    String nome="";
    boolean deuErro;
    do{
      deuErro = false;
      try{
        System.out.println("Qual o nome?");
        nome = coletaEntradaDoTeclado();
        if(!nome.matches("[a-zA-Z]{2,}"))// [a-zA-Z]
          throw new Exception("O nome deve ter ao menos 2 ou letras.");
      } catch(Exception e){
        System.err.println("Não é permitido numeros no nome" + e.getMessage());
        deuErro = true;
      }
    }while(deuErro);
    return nome;
  }

	public static Endereco coletaEndereco() {
		// TODO adicionar tratamento de exceções.
		exibirMenuDeTipoDeEndereco();
		int opcao = coletarOpcaoEscolhida();
		TipoLogradouro tipo = getTipoLogradouro(opcao);
		System.out.println("Qual do nome do logradouro?");
		String logradouro = coletaEntradaDoTeclado();
		System.out.println("Também precisamos do número do imóvel...");
		String numero = coletaEntradaDoTeclado();
		return new Endereco(tipo, logradouro, numero);
	}

	private static TipoLogradouro getTipoLogradouro(int opcao) {
		if (opcao == 2)
			return TipoLogradouro.AVENIDA;
		return TipoLogradouro.RUA;
	}

	public static Telefone coletaTelefone() throws Exception {
    boolean continuar = false;
    
    String ddd="", numero = "";
    TipoTelefone tipo = null;
    
    while (!continuar) {
      try {
        exibirMenuDeTipoDeTelefone();
        tipo = getTipoTelefone(coletarOpcaoEscolhida());
        System.out.println("Precisamos do código DDD...");
        ddd = coletaEntradaDoTeclado();
        if(!ddd.matches("[0-9]{0,1}[0-9]{2}")){
          throw new Exception("O DDD deve ter 2 ou 3 números");
        }
        System.out.println("Agora o número de seu telefone (sem o DDD ;-))...");
        numero = coletaEntradaDoTeclado();
        if (!numero.matches("\\d{8,9})")) // "[0-9]{4,5}-[0-9]{4}"
          throw new Exception("O número deve ter 8 ou 9 números");
        continuar =true;
      }catch (Exception e) {
        //tratar a exceção
        System.err.println("Telefone ou DDD inválido! Digite novamente! Erro:"+e.getMessage());
      }
      
    }
    return new Telefone(tipo, ddd, numero); 
    }
	
	
	public static boolean validaNumeroTelefone(String numero) throws Exception {
		if(!numero.matches("\\d{4,5}-\\d{4}")){
			throw new Exception();
		}
		return true;
	}

	private static TipoTelefone getTipoTelefone(int opcao) {
		if (opcao == 1)
			return TipoTelefone.FIXO;
		else if (opcao == 3)
			return TipoTelefone.FAX;
		return TipoTelefone.CELULAR;
	}

	/**
	*
	*/
	public static CPF coletaCPF() throws Exception {
		boolean deuErro = false;
		String numero = null;
		do {
			try {
				System.out.println("Qual o número do seu CPF?");
				numero = coletaEntradaDoTeclado();
				validaCPF(numero);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				deuErro = true;
			}
		} while (deuErro);
		return new CPF(numero);
	}

	public static boolean validaCPF(String cpf) throws Exception {
		if (!(cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")))
				throw new Exception("O CPF deve conter 11 dígitos");
		return true;
	}

	public static CNPJ coletaCNPJ() {
		// TODO adicionar tratamento de exceções.
		System.out.println("Qual o número do seu CNPJ?");
		String numero = coletaEntradaDoTeclado();
		return new CNPJ(numero);
	}

public static boolean confirmar(){
  teclado = new Scanner(System.in);
  System.out.println("digite 1 se sim digite 2 se não:");
  int a = Integer.valueOf(teclado.next());
  return (a==1)? true: false;
}

	public static void close() {
		teclado.close();
	}

	public boolean validaNome(String nome)throws Exception{
		if (!(nome.matches("([A-Z][a-z]+\\s)+([A-Z][a-z]+)")))
			throw new Exception("O Nome deve conter ao menos 2 palavras!");
		return true;
	}
}
