package br.com.somosicev.listas.agenda.modelo;

import br.com.somosicev.listas.agenda.modelo.enums.TipoLogradouro;

public class Endereco {

	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private int numero;

	public TipoLogradouro getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
