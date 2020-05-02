package br.com.somosicev.classes.aula13;

public class Aquifero extends Animal {

	int idade;
	
	void hoo(){}

	@Override
	void passo1() {
		System.out.println("passo 1 aquifero");
	}

	@Override
	void passo2() {
		System.out.println("passo 2 aquifero");
	}

	@Override
	void passo3() {
		System.out.println("passo 3 aquifero");
	}
	
//	@Override
//	public String toString() {
//        return "@"+idade;
//    }
}
