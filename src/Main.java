
public class Main {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		int contador = 0;
		for(Pessoa p: pessoas) {
			p = new Pessoa();
			pessoas[contador] = p;
			p.setNome("Pessoa "+(++contador));
		}
		
		Pessoa outraPessoa = pessoas[1];
		outraPessoa.setNome("Outra Pessoa");
	}

}
