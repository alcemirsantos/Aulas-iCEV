package br.com.somosicev.classes.aula13;

public class Main {

	public static void main(String[] args) {
		Animal novoAnimal = new Aquifero();
		Animal novoAnimal2 = new Mamifero();
		
		novoAnimal.setCor("rosa");
		foo(novoAnimal);
		foo(novoAnimal2);
		
		novoAnimal.transformacao();
		novoAnimal2.transformacao();
		
		System.out.println(novoAnimal);
		System.out.println(novoAnimal2);
	}

	
	static void foo(Animal a) {
		if(a instanceof Aquifero) {
			Aquifero tmp = (Aquifero) a;
			
		}
		else if(a instanceof Mamifero) {
			Mamifero tmpe = (Mamifero) a;
			
		}
		
	}
}
