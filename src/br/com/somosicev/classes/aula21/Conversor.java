package br.com.somosicev.classes.aula21;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;

public class Conversor implements ActionListener {

	private final static int LARGURA = 500;

	private final static int ALTURA = 300;

	private JLabel lblTemperaturaF;
	private JLabel lblTemperaturaC;

	private JTextField txtTemperaturaF;
	private JTextField txtTemperaturaC;
	private JButton btnConverterC2F;
	private JButton btnConverterF2C;
	private JPanel pnlC2F;
	private JPanel pnlF2C;
	private JTabbedPane pnlTabulado;

	public Conversor() {
		this("Conversor", ALTURA, LARGURA);
	}

	public Conversor(String nomeDaJanela) {
		this(nomeDaJanela, ALTURA, LARGURA);
	}

	public Conversor(String nomeDaJanela, int altura, int largura) {
		// criei a janela e cofigurei
		JFrame janela = new JFrame(nomeDaJanela);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setPreferredSize(new Dimension(largura, altura));
		janela.setResizable(true);

		// layout
		pnlTabulado = new JTabbedPane(JTabbedPane.TOP);
		janela.getContentPane().add(pnlTabulado);

		pnlC2F = new JPanel();
		pnlTabulado.addTab("Celsius", null, pnlC2F, "Converte Celsius para Fahrenheit");

		pnlC2F.setLayout(new GridLayout(3, 1));
		pnlC2F.setPreferredSize(new Dimension(390, 190));
		lblTemperaturaF = new JLabel("Digite a Temperatura em Faharenheit para C:");
		lblTemperaturaF.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		pnlC2F.add(lblTemperaturaF);
		// - texto
		txtTemperaturaF = new JTextField();
		pnlC2F.add(txtTemperaturaF);
		// - botão
		btnConverterC2F = new JButton("Converter Para Faharenheit");
		btnConverterC2F.addActionListener(this);
		pnlC2F.add(btnConverterC2F);

		pnlF2C = new JPanel();
		pnlTabulado.addTab("Fahrenheit", null, pnlF2C, "Converte Fahrenheit para Celsius");
		pnlF2C.setLayout(new GridLayout(3, 1));

		// componentes da janela
		// - label
		lblTemperaturaC = new JLabel("Digite a Temperatura em Celsius para F:");
		pnlF2C.add(lblTemperaturaC);
		txtTemperaturaC = new JTextField();
		pnlF2C.add(txtTemperaturaC);

		btnConverterF2C = new JButton("Converter para Celsius");
		btnConverterF2C.addActionListener(this);
		pnlF2C.add(btnConverterF2C);

		// exibe a janela
		janela.pack();
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new Conversor("Novo tilulo");
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

	/**
	 * conversão entre Celcius e Fahrenheit.
	 * 
	 * @param tEmFahrenheit
	 * @return
	 */
	public double converter(int tipo, double temperatura) {
		if (tipo == 0) { // converter em celsius
			return 5 * (temperatura - 32) / 9;
		}
		// converter em fahrenheit
		return (9 * temperatura) / 5 + 32;
	}

	/**
	 * conversão entre Celcius e Fahrenheit.
	 * 
	 * @param tEmFahrenheit
	 * @return
	 */
	public double converter(int tipo) {
		double t;
		if (tipo == 0) { // converter em celsius
			t = Double.valueOf(txtTemperaturaC.getText());
		}
		// converter em fahrenheit
		t = Double.valueOf(txtTemperaturaF.getText());
		return converter(tipo, t);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		StringBuilder sb = new StringBuilder("Resultado: \n");

		if (btnConverterF2C.equals(e.getSource())) {
			String tmpFDigitada = txtTemperaturaF.getText();
			double tmpFConvertida = 0;
			if (!tmpFDigitada.equals("")) {
				tmpFConvertida = converter(1);
				sb.append("\tA temperatura em F convertida para C é: " + tmpFConvertida + "\n");
			}
		} else {
			String tmpCDigitada = txtTemperaturaC.getText();
			double tmpCConvertida = 0;
			if (!tmpCDigitada.equals("")) {
				tmpCConvertida = converter(0);
				sb.append("\tA temperatura em C convertida para F é: " + tmpCConvertida + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, sb.toString());
	}
}
