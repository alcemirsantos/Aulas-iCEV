package lp1.aula14.prova.q2;

public class ItemDeEstoque {

	int quantidade;
	Produto produto;

	public ItemDeEstoque(int i, Produto p) {
		setQuantidade(i);
		setProduto(p);
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
