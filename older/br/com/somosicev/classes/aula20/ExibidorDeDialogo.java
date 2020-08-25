package br.com.somosicev.classes.aula20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Responder a um evento, mostrando um diálogo.
 * 
 * @author alcemirsantos
 *
 */
public class ExibidorDeDialogo implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Obrigado!");
	}

}
