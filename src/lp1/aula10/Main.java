package lp1.aula10;

public class Main {

	public static void main(String[] args) {
		Agenda a1 = new Agenda();
		Agenda a2 = new Agenda();
		
		a1.anote(12,10,"dia das crionças");
		a2.anote(7,15, "independência do brasil");
		
		a1.motrarAnotacao();	
		a2.motrarAnotacao();
		
	}

}
