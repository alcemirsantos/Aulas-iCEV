package lp1.aula14.jogodavelha;

public class Jogador {

	private String nome;
	private Character simbolo;

	public Jogador(String umNome, Character umSimbolo) {
		this.nome = umNome;
		this.simbolo = umSimbolo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(Character simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return getNome()+ "("+getSimbolo()+")";
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		Jogador c = null;
		if (o instanceof Jogador)
			c = (Jogador) o;
		else
			return false;
		if (this.getNome().equals(c.getNome()) && this.getSimbolo().equals(c.getSimbolo()))
			return true;
		return false;
	}

}
