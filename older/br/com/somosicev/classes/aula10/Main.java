package br.com.somosicev.classes.aula10;

class Animal{
	
}

class Mam extends Animal{
	public Mam(){
		
	}
}
public class Main {
	public static void main(String[] args) {
		Animal a = new Mam();
		System.out.println(a);
//
//		Main.Aluno a = new Main.Aluno();
//
//		a.nome = "alcemir";
////		a.faculdade = "icev - a melhor";
////		Main.Aluno.faculdade = "icev - repaginado";
//
//		Main.Aluno b = new Main.Aluno();
//
//		b.nome = "ziraldo";
////		b.faculdade = "icev";
//		
//		double s = Math.sin(90);
//
//		
//		System.out.println(a.nome);
//		System.out.println(a.faculdade);
//		System.out.println("---");
//		System.out.println(b.nome);
//		System.out.println(b.faculdade);
		
		int[] data = Util.processaDadosData("23/34/2323");
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		
	}

	static class Aluno {
		static {
		}
		
		String nome;

	}
}
