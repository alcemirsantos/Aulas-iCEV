package br.com.somosicev.classes.aula20;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo01Swing implements ActionListener {

	public Exemplo01Swing() {
		JFrame frame = new JFrame("Events");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(new FlowLayout());
		JButton b = new JButton("Click me!");
		b.addActionListener(this);
		frame.getContentPane().add(b);

		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Thank you");
	}

	public static void main(String[] args) {
		new Exemplo01Swing();
	}
	
}
