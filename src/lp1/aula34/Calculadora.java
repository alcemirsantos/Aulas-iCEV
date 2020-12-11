package lp1.aula34;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Calculadora extends JFrame {
	private JTextField txtExibicao;
	private JTextField txtResultado;
	private List<String> valores;

	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panelExibicao = new JPanel();
		getContentPane().add(panelExibicao, BorderLayout.NORTH);

		valores = new ArrayList<String>();
		panelExibicao.setLayout(new GridLayout(0, 1, 0, 0));

		txtExibicao = new JTextField();
		panelExibicao.add(txtExibicao);
		txtExibicao.setBorder(null);
		txtExibicao.setEditable(false);
		txtExibicao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtExibicao.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		txtExibicao.setForeground(Color.YELLOW);
		txtExibicao.setBackground(Color.DARK_GRAY);
		txtExibicao.setPreferredSize(new Dimension(500, 100));

		txtResultado = new JTextField();
		panelExibicao.add(txtResultado);
		txtResultado.setBorder(null);
		txtResultado.setEditable(false);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setFont(new Font("Lucida Grande", Font.BOLD, 48));
		txtResultado.setForeground(Color.YELLOW);
		txtResultado.setBackground(Color.BLACK);
		txtResultado.setPreferredSize(new Dimension(500, 50));

		JButton btnNewButton = new JButton("Limpar");
		btnNewButton.setPreferredSize(new Dimension(25, 25));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtExibicao.setText("");
			}
		});
		panelExibicao.add(btnNewButton);

		JPanel panelComandos = new JPanel();
		panelComandos.setBackground(Color.DARK_GRAY);
		getContentPane().add(panelComandos, BorderLayout.CENTER);
		panelComandos.setLayout(new GridLayout(0, 4, 0, 0));

		JButton btnSete = new JButton("7");
		btnSete.setPreferredSize(new Dimension(75, 75));
		btnSete.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnSete);

		JButton btnOito = new JButton("8");
		btnOito.setPreferredSize(new Dimension(75, 75));
		btnOito.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnOito);

		JButton btnNove = new JButton("9");
		btnNove.setPreferredSize(new Dimension(75, 75));
		btnNove.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnNove);

		JButton btnDivisao = new JButton("/");
		btnDivisao.setPreferredSize(new Dimension(75, 75));
		btnDivisao.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnDivisao);

		JButton btnQuatro = new JButton("4");
		btnQuatro.setPreferredSize(new Dimension(75, 75));
		btnQuatro.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnQuatro);

		JButton btnCinco = new JButton("5");
		btnCinco.setPreferredSize(new Dimension(75, 75));
		btnCinco.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnCinco);

		JButton btnSeis = new JButton("6");
		btnSeis.setPreferredSize(new Dimension(75, 75));
		btnSeis.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnSeis);

		JButton btnMultiplicacao = new JButton(MULTIPLICACAO);
		btnMultiplicacao.setPreferredSize(new Dimension(75, 75));
		btnMultiplicacao.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnMultiplicacao);

		JButton btnUm = new JButton("1");
		btnUm.setPreferredSize(new Dimension(75, 75));
		btnUm.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnUm);

		JButton btnDois = new JButton("2");
		btnDois.setPreferredSize(new Dimension(75, 75));
		btnDois.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnDois);

		JButton btnTres = new JButton("3");
		btnTres.setPreferredSize(new Dimension(75, 75));
		btnTres.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnTres);

		JButton btnSubtracao = new JButton(SUBTRACAO);
		btnSubtracao.setPreferredSize(new Dimension(75, 75));
		btnSubtracao.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnSubtracao);

		JButton btnZero = new JButton("0");
		btnZero.setPreferredSize(new Dimension(75, 75));
		btnZero.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnZero);

		JButton btnPonto = new JButton(".");
		btnPonto.setPreferredSize(new Dimension(75, 75));
		btnPonto.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnPonto);

		JButton btnIgual = new JButton("=");
		btnIgual.setPreferredSize(new Dimension(75, 75));
		btnIgual.addActionListener(new BotaoOperacaoListener());
		panelComandos.add(btnIgual);

		JButton btnAdicao = new JButton(ADICAO);
		btnAdicao.setPreferredSize(new Dimension(75, 75));
		btnAdicao.addActionListener(new BotaoNumeroListener());
		panelComandos.add(btnAdicao);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Calculadora();

	}

	String getTextoExpressao() {
		String resultado = "";
		for (String e : valores)
			resultado += " " + e;
		return resultado;
	}

	/**
	 * utilizado somente para JButton relacionados aos números
	 * 
	 * @author alcemirsantos
	 */
	class BotaoNumeroListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton fonte = (JButton) e.getSource();
			String valor = fonte.getText();
			atualizarTextExibicao(valor);
		}

		void atualizarTextExibicao(String valor) {
			String atual = txtExibicao.getText();
			txtExibicao.setText(atual + valor);

		}
	}

	private final String ADICAO = "+";
	private final String SUBTRACAO = "-";
	private final String DIVISAO = "/";
	private final String MULTIPLICACAO = "x";

	class BotaoOperacaoListener implements ActionListener {
		double valorAcumulado;

		@Override
		public void actionPerformed(ActionEvent e) {
//			valores = new ArrayList<String>();
//			valores.add(txtExibicao.getText());
			String valor = ((JButton) e.getSource()).getText();
			double resultado;

			switch (valor) {
//			case "+":
//				String valorJaDigitado = txtExibicao.getText();
//				valorAcumulado += Double.parseDouble(valor);
//				break;
//			case "-":
//				break;
//			case "X":
//				break;
//			case "/":
//				break;
			case "=":
				resultado = executaOperacao(txtExibicao.getText());
				txtResultado.setText(String.valueOf(resultado));
				break;
			}

//			atualizarTextExibicao(valor);
		}

		double executaOperacao(String expressao) {
			String[] valores;
			if (expressao.contains(ADICAO)) {
				// somar
				valores = new String[2];
				valores[0] = expressao.substring(0, expressao.indexOf(ADICAO));
				valores[1] = expressao.substring(expressao.indexOf(ADICAO) + 1);
//	TODO			valores = expressao.split(ADICAO);
				return Double.parseDouble(valores[0]) + Double.parseDouble(valores[1]);
			} else if (expressao.contains(SUBTRACAO)) {
				// subtrair
				valores = expressao.split(SUBTRACAO);
				return Double.parseDouble(valores[0]) - Double.parseDouble(valores[1]);
			} else if (expressao.contains(MULTIPLICACAO)) {
				// multiplicar
				valores = expressao.split(MULTIPLICACAO);
				return Double.parseDouble(valores[0]) * Double.parseDouble(valores[1]);
			} else if (expressao.contains(DIVISAO)) {
				// dividir
				valores = expressao.split(DIVISAO);
				return Double.parseDouble(valores[0]) / Double.parseDouble(valores[1]);
			}

			return 0.0;
		}

	}

}
