package lp1.aula24.jogodavelha.entidades;

public enum TipoResultado {
	VITORIA("Vitória "), VELHA("Vitória");

	String descricao;

	TipoResultado(String desc) {
		this.descricao = desc;
	}

	@Override
	public String toString() {
		return descricao;
	}
}