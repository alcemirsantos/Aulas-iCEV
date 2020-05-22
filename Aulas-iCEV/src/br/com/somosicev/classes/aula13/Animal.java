package br.com.somosicev.classes.aula13;

public abstract class Animal {

	private String cor;

	protected void setCor(String novacor) {
		this.cor = novacor;
	}
	
	protected String getCor() {
		return cor;
	}

	/**
	 * Template method
	 */
	void transformacao() {
		passo1();
		passo2();
		passo3();
	}
	
	abstract void passo1();
	abstract void passo2();
	abstract void passo3();
	
	@Override
	public String toString() {
        return "@"+cor;
    }

}
