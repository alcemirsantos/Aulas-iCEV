package br.com.somosicev.classes.aula14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExemploCollections {

	public static void main(String[] args) {
		
		Map<String, Aluno> mapaDeAlunos = new HashMap<String, Aluno> ();

		Aluno a1 = new Aluno("André", 10.0);
		Aluno a2 = new Aluno("Antonio", 10.0);
		Aluno a3 = new Aluno("Matheus", 10.0);
		Aluno a4 = new Aluno("Maurício", 10.0);
		
		mapaDeAlunos.put("1234556234", a1);
		mapaDeAlunos.put("1343456234", a2);
		mapaDeAlunos.put("3455623234", a3);
		mapaDeAlunos.put("5622334", a4);

		for(Entry<String, Aluno> tmp: mapaDeAlunos.entrySet()) {
			
//			tmp.getKey();
//			tmp.getValue();
			tmp.setValue(a2);
			System.out.println(tmp);
		}
		
	}

}
