package lp1.aula24.jogodavelha.controle.estados;

public class PartidaFinalizada implements Estado {

	@Override
	public void acao(Object contexto) {
		System.out.println("Partida Finalizada!");
	}

}
