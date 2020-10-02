package lp1.aula15.todo;

import java.util.GregorianCalendar;

public class Tarefa {

	private String descricao;
	private GregorianCalendar dataLimite;
	private boolean status;
	
	public Tarefa(String descricao, GregorianCalendar dataLimite, boolean status) {
		super();
		this.descricao = descricao;
		this.dataLimite = dataLimite;
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public GregorianCalendar getDataLimite() {
		return dataLimite;
	}

	public void setDataLimite(GregorianCalendar dataLimite) {
		this.dataLimite = dataLimite;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
