package br.com.somosicev.tp.agenda.modelo;

import br.com.somosicev.tp.agenda.modelo.enums.TipoTelefone;

public class Telefone {

	private TipoTelefone tipo;
	private String ddd;
	private String numero;

	public Telefone(TipoTelefone tipo, String ddd, String numero) {
		setTipo(tipo);
		setDdd(ddd);
		setNumero(numero);
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Tel: ("+getDdd()+") "+getNumero();
	}

}
