package lp1.aula24.jogodavelha.controle.validadores;

/**
 * Contrato de validacao de objetos do Tipo T.
 * @author alcemirsantos
 *
 * @param <T>
 */
public interface Validador<T> {

	
 public Object validar(T t);
	
}
