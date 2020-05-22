package br.com.somosicev.tp.agenda.modelo;

import br.com.somosicev.tp.agenda.modelo.enums.TipoLogradouro;

public class Endereco {

	private TipoLogradouro tipoLogradouro;
	private String logradouro;
	private String numero;

	public Endereco(TipoLogradouro tipo, String logradouro, String numero) {
		setTipoLogradouro(tipo);
		setLogradouro(logradouro);
		setNumero(numero);
	}

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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return "Endereço: "+getTipoLogradouro()+" "+getLogradouro()+", "+getNumero();
	}

}
