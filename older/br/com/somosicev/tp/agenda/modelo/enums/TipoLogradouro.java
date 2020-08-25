package br.com.somosicev.tp.agenda.modelo.enums;

public enum TipoLogradouro {
	RUA("R."), AVENIDA("Av.");

	private String abreviacao;

	private TipoLogradouro(String abrev) {
		abreviacao = abrev;
	}

	public String getDescricao() {
		return abreviacao;
	}

	@Override
	public String toString() {
		return getDescricao();
	}
}
