package br.com.somosicev.classes.aula05;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Boliche {

	Rodada[] rodadas;

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		Random r = new  Random();
		while(s.size()<20) {
			s.add(r.nextInt(101));
		}
		System.out.println(s);
	}
	
	public Boliche() {
		rodadas = new Rodada[12];
	}

	public int getPontuacaoFinal() {
		int contaRodadas = 0;
		int numRodadas = rodadas.length;
		int pontuacao = 0;
		
		while(contaRodadas<numRodadas-2) {
			Rodada rodadaAtual = rodadas[contaRodadas];
			if(rodadaAtual == null) break;
			Rodada rodadaSeguinte = rodadas[contaRodadas+1];
			Rodada rodadaAlemSeguinte = rodadas[contaRodadas+2];
			
			pontuacao += rodadaAtual.getPontuacaoParcial();

			if(rodadaAtual.ehUmSpare()) {
				pontuacao += rodadaSeguinte.um.getPinosDerrubados();
				
			}else if (rodadaAtual.ehUmStrike()) {
				if(rodadaSeguinte.ehUmStrike()) {
					pontuacao += rodadaSeguinte.getPontuacaoParcial();
					pontuacao += rodadaAlemSeguinte.um.getPinosDerrubados();
				}else {
					pontuacao += rodadaSeguinte.getPontuacaoParcial();
				}
			}
			contaRodadas++;
		}

		return pontuacao;
	}
	
	
	/**
	 *  processar entrada
	 * @param input
	 */
	void play(String input) {
		String[] entradas = input.split(" ");
		Arremesso a1=null;
		Arremesso a2=null;
		rodadas = entradas.length<11? new Rodada[entradas.length+2]: new Rodada[entradas.length] ;
		
 		for(int i=0; i<entradas.length; i++) {
			if(entradas[i].equals("X")) {
				a1 = new Arremesso(10);
				
			}else if(entradas[i].contains("/")){
				char aux = entradas[i].charAt(0);
				a1 = new Arremesso(Integer.parseInt(""+aux));
				a2 = new Arremesso(10-a1.pinos);				
			}else {
				char aux = entradas[i].charAt(0);
				a1 = new Arremesso(Integer.parseInt(""+aux));
				aux = entradas[i].charAt(1);
				a2 = new Arremesso(Integer.parseInt(""+aux));
			}
			Rodada r = new Rodada();
			r.um = a1;
			r.dois = a2;
			rodadas[i]= r;
		}
	}
}
