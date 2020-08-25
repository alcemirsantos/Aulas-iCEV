package br.com.somosicev.listas.lista04.q02;

import java.util.GregorianCalendar;

public class Tarefa {

	private String descricao;
	private GregorianCalendar data;
	private boolean status;

	public Tarefa(String desc, GregorianCalendar cal) {
		setDescricao(desc);
		setData(cal);
		setStatus(false);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public GregorianCalendar getData() {
		return data;
	}

	public void setData(GregorianCalendar data) {
		this.data = data;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
