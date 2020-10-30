package lp1.aula24.jogodavelha;

/**
 * Contrato de validacao de objetos do Tipo T.
 * @author alcemirsantos
 *
 * @param <T>
 */
public interface Validador<T> {

	
 public boolean validar(T t);
	
}
