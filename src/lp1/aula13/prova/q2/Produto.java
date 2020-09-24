package lp1.aula13.prova.q2;

public class Produto {

	String nome;
	String marca;

	double precoDeCompra;
	double precoDeVenda;
	double desconto;

	public Produto(String nome, String marca, double precoDeCompra, double precoDeVenda, double desconto) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.precoDeCompra = precoDeCompra;
		this.precoDeVenda = precoDeVenda;
		this.desconto = desconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecoDeCompra() {
		return precoDeCompra;
	}

	public void setPrecoDeCompra(double precoDeCompra) {
		this.precoDeCompra = precoDeCompra;
	}

	public double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
