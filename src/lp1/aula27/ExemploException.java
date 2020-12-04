package lp1.aula27;

import lp1.aula24.jogodavelha.entidades.Coordenada;

public class ExemploException {
	public static void main(String[] args) {
		float result;
		int a, b;
		Coordenada[] v = new Coordenada[4];
		try {
			
//			String palavra = somar(v);
//			System.out.println(palavra);
//			
//			a = 3;
//			b = 0;
//			result = divisao(a, b);
//			System.out.println(result);
			
			imprimirNada();
		} catch (ArithmeticException e) {
			System.out.println("Aconteceu o seguinte erro: " + e.toString());
		} catch (MinhaExcecao m) {
			System.err.println(m);
		}finally {
			
		}
	}
	
	static float divisao(int a, int b){
		return a/b;
	}
	
	static String somar(Coordenada[] v){
		String soma="";
		for(int i=0; i<v.length; i++)
			soma+=v[i].toString();
		return soma;
	}
	
	static void imprimirNada() throws MinhaExcecao{
		throw new MinhaExcecao();
	}

}
