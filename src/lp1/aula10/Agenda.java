package lp1.aula10;

public class Agenda {
	private int dia;
	private int mes;
	private String anotacao;
	
	public int getDia() {
		return dia;
	}

//	public void setDia(int novoDia) {
//		this.dia = novoDia;
//	}

	public int getMes() {
		return mes;
	}

//	public void setMes(int mes) {
//		this.mes = mes;
//	}

	public String getAnotacao() {
		return anotacao;
	}

//	public void setAnotacao(String anotacao) {
//		this.anotacao = anotacao;
//	}

	/**
	 * add uma anotação para a data
	 * @param d
	 * @param m
	 * @param nota
	 */
	void anote(int novoDia, int novoMes, String novaNota) {
		dia = novoDia;
		mes =  novoMes;
		anotacao = novaNota;
		validar();
	}

	/**
	 * verificar se a data é válida
	 */
	void validar() {
		if((dia<1)|| (dia>31) || (mes<1)|| (mes>12) ) {
			dia = 0;
			mes = 0;
			anotacao = "anotação não inserida devido data inválida!";
		}
	}
	
	/**
	 * exibe a anotacao desta data
	 */
	void motrarAnotacao() {
		System.out.println(dia+"/"+mes+": "+ anotacao);
	}	

}
