package lp1.aula17;


/**
 * Um caixa é um Emprega
 * @author alcemirsantos
 *
 */
public class Caixa extends Empregado{
	
	public Caixa() {
		super("carteira de trabalho");
	}
	
	@Override 
	public  String getCarteiraDeTrabalho() {
		return super.getCarteiraDeTrabalho() + " nova carteira";
	}

}
