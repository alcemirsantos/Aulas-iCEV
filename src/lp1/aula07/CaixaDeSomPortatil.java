package lp1.aula07;

public class CaixaDeSomPortatil {

	String nome;
	String tempoDeExecucaoDaBateria;
	String marca;
	String cor;
	String potenciaDaBateria ;
	String potenciaDoAutoFalantes;
	
	
	/**
	 * Método construtor
	 */
	public  CaixaDeSomPortatil() {
		this(" ", "", "", "", "0mah", "" );
	}

	public CaixaDeSomPortatil(String umNome, String umaMarca, String umaCor, String umTempo, String umaPotenciaDeBateria,
			String umaPotenciaDeAutoFalantes) {
		this.nome = umNome;
		this.marca = umaMarca;
		this.tempoDeExecucaoDaBateria = umTempo;
		this.potenciaDaBateria = umaPotenciaDeBateria;
		this.cor = umaCor;
		this.potenciaDoAutoFalantes = umaPotenciaDeAutoFalantes;
	}

	void ligar() {
		System.out.println("ligando a caixa..."+ this.nome);
	}

	void desligar() {
		System.out.println("desligando a caixa..."+ this.nome);
	}

	void emitirSom() {
		System.out.println("tocando sua música favorita...");
	}

	void carregarBateria() {
		System.out.println("recarregando as baterias...");
	}

}
