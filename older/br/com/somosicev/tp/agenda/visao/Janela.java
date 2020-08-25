package br.com.somosicev.tp.agenda.visao;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;

public class Janela extends JFrame {
	public Janela() {
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
	}

}
