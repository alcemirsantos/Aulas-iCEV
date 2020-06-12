package br.com.somosicev.classes.aula20;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exemplo01Swing {


	public static void main(String[] args) {
		// criando a janela
		JFrame janela = new JFrame("Events");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setando o layout da janela
		janela.getContentPane().setLayout(new FlowLayout());
		
		// criando e configurando o botão
		JButton b = new JButton("Me clique!");
		b.addActionListener(new ExibidorDeDialogo());
		
		// adicionando o botão à janela
		janela.getContentPane().add(b);

		// organizando e exibindo a janela.
		janela.pack();
		janela.setVisible(true);
		
	}
	
}
