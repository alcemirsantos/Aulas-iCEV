package lp1.aula10.intefaces;

public class Baleia implements Mamifero, Aquatico  {

	String raca;
	
	void comer() {}

	@Override
	public void nadar() {
		
	}

	@Override
	public void mamar() {
		System.out.println("baleia mamando");
		System.out.println("... bem mais rápido.");
		
	}
	
}
