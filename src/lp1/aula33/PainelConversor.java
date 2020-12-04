package lp1.aula33;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import lp1.aula32.MeuListener;

public class PainelConversor extends JPanel {

	private static PainelConversor instancia;
	private JTextField textField;

	public String getText() {
		return textField.getText();
	}

	private PainelConversor() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		this.setPreferredSize(new Dimension(500, 100));
		JLabel lblNewLabel = new JLabel("Temperatura em ºF:");
		this.add(lblNewLabel);

		textField = new JTextField();
		this.add(textField);
		textField.setColumns(10);

		List<String> a = new ArrayList();
		a.add("as ");
		a.add("wer");
		a.forEach((String s) -> {
			System.out.println(s);
		});

		JButton btnNewButton = new JButton("Converter");

		btnNewButton.addActionListener(new MeuListener());

		this.add(btnNewButton);
	}

	public static PainelConversor getInstancia() {
		if (instancia == null)
			instancia = new PainelConversor();
		return instancia;
	}

}
