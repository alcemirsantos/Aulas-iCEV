package lp1.aula19.classesabstratas;

public class Palco {
	private AtorBipolar ator;

	public Palco() {
		this.ator = new AtorFeliz();
	}

	public void altera() {
		ator = new AtorTriste();
	}

	public void atuar() {
		this.ator.ato();
	}
}
