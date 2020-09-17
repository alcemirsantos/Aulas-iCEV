package lp1.aula10.intefaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Mamifero a = new Baleia();
		Mamifero b = new Carneiro();
		
		Aquatico c = new Baleia();
		Aquatico d = new Tubarao();
		
		Mamifero[] animaisMamiferos = new Mamifero[10];
		animaisMamiferos[0] = a;
		animaisMamiferos[1] = b;
		for(Mamifero m: animaisMamiferos) {
			// processar  
			m.mamar();
		}
		
		List<Mamifero> um = new  ArrayList<Mamifero>();
	}

}
