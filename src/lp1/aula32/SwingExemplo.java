package lp1.aula32;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SwingExemplo {

	
	
	
	public static void main(String[] args) {

		// Cria a janela
		JFrame janela = new JFrame("Hello World Swing");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout());

		JButton button = new JButton("Button 1 (PAGE_START)");
		
		button.addActionListener(new MeuListener());
		
		button.setPreferredSize(new Dimension(200, 100));
		janela.getContentPane().add(button, BorderLayout.PAGE_START);

//		// adicionar um label
//		JLabel lblTexto = new JLabel("Hello World iCEV");
//		// como usar fonts:
//		// https://docs.oracle.com/javase/tutorial/uiswing/components/html.html
//		lblTexto.setFont(new Font("Serif", Font.PLAIN, 44));
//		lblTexto.setForeground(new Color(0xff3300));
//
//		janela.getContentPane().add(new JLabel("label 1"), BorderLayout.LINE_START);
//		janela.getContentPane().add(new JLabel("label 2"), BorderLayout.CENTER);
//		janela.getContentPane().add(new JLabel("label 3"), BorderLayout.LINE_END);
//		janela.getContentPane().add(lblTexto, BorderLayout.PAGE_END);

//		JFileChooser jfc = new JFileChooser();
//		int returnValue = jfc.showOpenDialog(null);
//
//		if (returnValue == JFileChooser.APPROVE_OPTION) {
//			JOptionPane.showMessageDialog(null, jfc.getSelectedFile());
//		}

		// mostrar janela
		janela.pack();
		janela.setVisible(true);

	}

}
