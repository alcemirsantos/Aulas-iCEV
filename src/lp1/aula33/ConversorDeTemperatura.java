package lp1.aula33;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ConversorDeTemperatura {

	private JFrame janela;

	public ConversorDeTemperatura(String titulo) {
		janela = new JFrame(titulo);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.getContentPane().add(PainelConversor.getInstancia(), BorderLayout.NORTH);
		janela.pack();
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new ConversorDeTemperatura("Conversor iCEV");
	}

}
