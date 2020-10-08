package lp1.aula17;

public class Empregado {
	
	protected String nome;
	protected String cateriraDeTrabalho;
	
	public Empregado() {
		this( "uma carteira de trabalho");
	}
	
	public Empregado(String umaCarteira) {
		this("um empregado", umaCarteira);
	}
	
	public Empregado(String umNome, String umaCarteira) {
		this.nome = umNome;
		this.cateriraDeTrabalho = umaCarteira;
	}
	
	public String getCarteiraDeTrabalho() {
		return this.cateriraDeTrabalho;
	}
	
	public String getCarteiraDeTrabalho(boolean caixaAlto) {
		return caixaAlto? this.cateriraDeTrabalho.toUpperCase(): getCarteiraDeTrabalho() ;
	}
	

	@Override 
	public String toString() {
		return this.nome + " ["+this.cateriraDeTrabalho+ "]";
//		StringBuilder sb = new StringBuilder();
//		sb.append(this.nome);
//		sb.append(" ["+this.cateriraDeTrabalho+ "]");
//		return sb.toString();
	}

}
