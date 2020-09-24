package lp1.aula13.lista5;

public class Telefone {

	private String codigoPais;
	private String ddd;
	private String numero;

	public Telefone(String codigoPais, String ddd, String numero) {
		super();
		this.codigoPais = codigoPais;
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
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

}
