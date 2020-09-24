package lp1.aula14.prova.q2;

public class Main {

	public static void main(String[] args) {
		Produto sabao = new Produto("Sabão", "Ace", 4.5, 7.0, 0.05);
		Produto sabao1 = new Produto("Sabão", "Omo", 4.5, 7.0, 0.05);
		Produto sabao2 = new Produto("Sabão", "Qualita", 4.5, 7.0, 0.05);
		Produto sabao3 = new Produto("Sabão", "Brilhante", 4.5, 7.0, 0.05);
		
		Produto leite = new Produto("Leite", "Piracanjuba", 2.25, 4.0, 0.15);

		
		ItemDeEstoque estoqueSabao = new  ItemDeEstoque(100, sabao);
		ItemDeEstoque estoqueLeite = new  ItemDeEstoque(300, leite);
	}

}
