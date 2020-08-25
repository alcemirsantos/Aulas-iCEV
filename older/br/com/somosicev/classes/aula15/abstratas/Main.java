package br.com.somosicev.classes.aula15.abstratas;

import java.util.Scanner;

import br.com.somosicev.classes.aula15.abstratas.iu.ObservadorBinario;
import br.com.somosicev.classes.aula15.abstratas.iu.ObservadorHexadeximal;
import br.com.somosicev.classes.aula15.abstratas.iu.ObservadorOctal;
import br.com.somosicev.classes.aula15.abstratas.modelos.CoisaObservada;

public class Main {

	public static void main(String[] args) {
		CoisaObservada sub = new CoisaObservada();
        
        new ObservadorHexadeximal(sub);
        new ObservadorOctal(sub);
        new ObservadorBinario(sub);
        
        
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("\nDigite um número: ");
            sub.setState(scan.nextInt());
        }
        scan.close();
	}

}
