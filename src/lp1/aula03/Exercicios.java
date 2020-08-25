package lp1.aula03;

public class Exercicios {

	public static void main(String[] args) {

		double s = 1 + 1 / fatorial(1) + 1 / fatorial(2) + 1 / fatorial(3);

		System.out.println(s);
	}

	public static long fatorial(int n) {
		long fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	
	public static long fatorial2(int n) {
		if(n==1)
			return 1;
		return n*fatorial2(n-1);
	}
	
}
