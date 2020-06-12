package br.com.somosicev.classes.aula21;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conversor implements ActionListener {
	
	private JLabel lblTemperaturaF; 
	private JLabel lblTemperaturaC; 
	
	private JTextField txtTemperaturaF;
	private JTextField txtTemperaturaC;
	private JButton btnConverter; 
	private JLabel lblNewLabel;
	
	public Conversor() {
		// criei a janela e cofigurei
		JFrame janela = new JFrame("Conversor");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setPreferredSize(new Dimension(400, 200));
		janela.setResizable(true);

		// layout
		janela.getContentPane().setLayout(new GridLayout(3, 2));

		// componentes da janela
		// - label
		lblTemperaturaC = new JLabel("Digite a Temperatura em Celsius para F:");
		lblTemperaturaF = new JLabel("Digite a Temperatura em Faharenheit para C:");
		// - texto
		txtTemperaturaF = new JTextField();
		txtTemperaturaC = new JTextField();
		// - botão
		btnConverter = new JButton("Converter");
		btnConverter.addActionListener(this);

		janela.getContentPane().add(lblTemperaturaF);
		janela.getContentPane().add(txtTemperaturaF);
		janela.getContentPane().add(lblTemperaturaC);
		janela.getContentPane().add(txtTemperaturaC);
		
		lblNewLabel = new JLabel("");
		janela.getContentPane().add(lblNewLabel);
		janela.getContentPane().add(btnConverter);

		// exibe a janela
		janela.pack();
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new Conversor();
	}

	/**
	 * converter de Fahrenheit para Celcius.
	 * 
	 * @param tEmFahrenheit
	 * @return
	 */
	public double converterParaCelcius(double tEmFahrenheit) {
		return 5 * (tEmFahrenheit - 32) / 9;
	}

	/**
	 * converter de Celcius para Fahrenheit.
	 * 
	 * @param tEmFahrenheit
	 * @return
	 */
	public double converterParaFahrenheit(double tEmCelsius) {
		return (9 * tEmCelsius) / 5 + 32;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String tmpCDigitada = txtTemperaturaC.getText();
		String tmpFDigitada = txtTemperaturaF.getText();
		StringBuilder sb = new StringBuilder("Resultado: \n");

		double tmpCConvertida = 0;
		if(!tmpCDigitada.equals("")) {
			tmpCConvertida = converterParaFahrenheit(Double.valueOf(tmpCDigitada));
			sb.append("\tA temperatura em C convertida para F é: "+tmpCConvertida+ "\n");
		}
		
		double tmpFConvertida = 0;
		if(!tmpFDigitada.equals("")) {
			tmpFConvertida = converterParaCelcius(Double.valueOf(tmpFDigitada));
			sb.append("\tA temperatura em F convertida para C é: "+tmpFConvertida+ "\n");
		}
		
		JOptionPane.showMessageDialog(null, sb.toString());
	}
}
