package br.com.somosicev.listas.agenda.modelo;

public abstract class Documento {

	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Documento))
			return false;

		Documento tmp = (Documento) obj;

		if (this.getNumero().equals(tmp.getNumero()))
			return true;

		return false;
	}

}
