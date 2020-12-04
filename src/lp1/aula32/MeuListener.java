package lp1.aula32;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import lp1.aula33.ConversorDeTemperatura;
import lp1.aula33.PainelConversor;

public class MeuListener implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		// coleta de temp em F.
		double tempF = 0;
		try {
			tempF = Double.parseDouble(PainelConversor.getInstancia().getText());
		} catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null,
					"Erro no formato do texto." + " Messagem:\n\t" + exception.getMessage());
		}

		// converter fahrenheit em celsius
		double tempC = 5 * (tempF - 32) / 9;

		DecimalFormat df2 = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null, tempF + "ºF equivalem a " + df2.format(tempC) + " em Celsius");

	}
}