package lp1.aula15;

import java.util.Scanner;

public class Main {

	static Scanner sc;
	
	public static void main(String[] args) {
		
		System.out.println("...iniciando o main()");
		
//		Student um = new Student();
//		Student dois = new Student();
		
		Student um = new Student("Paulo", "Falculdade Um");
		Student dois = new Student("Fulano", "Faculdade Dois");
		
		Student.change();
		
		um.imprimir();
		dois.imprimir();
		
		foo();
		
		College novo = new Main.College();
		
	}
	
	public static void foo() {
		System.out.println("");
	}

	public static class College{
		String name;
	}
}
