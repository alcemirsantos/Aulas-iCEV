package lp1.aula14.lista5;

import java.util.Date;

public class Documento {

	private long numero;
	private Date dataDeEmissao;
	private String nomeDoPai;
	private String nomeDaMae;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}

	public void setDataDeEmissao(Date dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}

	public String getNomeDoPai() {
		return nomeDoPai;
	}

	public void setNomeDoPai(String nomeDoPai) {
		this.nomeDoPai = nomeDoPai;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public Documento(long numero, Date dataDeEmissao, String nomeDoPai, String nomeDaMae) {
		super();
		this.numero = numero;
		this.dataDeEmissao = dataDeEmissao;
		this.nomeDoPai = nomeDoPai;
		this.nomeDaMae = nomeDaMae;
	}

}
