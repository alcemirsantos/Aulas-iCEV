package br.com.somosicev.tp.agenda.modelo;

public class CPF extends Documento {

	public CPF(String numero) {
		setNumero(numero);
	}

	@Override
	public String toString() {
		return "CPF: "+getNumero();
	}
}
