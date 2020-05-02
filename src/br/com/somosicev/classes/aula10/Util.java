package br.com.somosicev.classes.aula10;

public class Util {

	static int[] processaDadosData(String entrada) {

		// ex: [20][04][2020]
		String[] entradas = entrada.split("/");
		int[] data = new int[entradas.length];

		for (int p = 0; p < entradas.length; p++) {
			data[p] = Integer.valueOf(entradas[p]);
		}

		return data;// data[0] == 20; data[1] == 04; data[2] = 2020;
	}

}
