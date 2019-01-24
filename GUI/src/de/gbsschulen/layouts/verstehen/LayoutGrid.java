package de.gbsschulen.layouts.verstehen;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.GridLayout;
import javax.swing.JButton;

public class LayoutGrid extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LayoutGrid() {
		this.setTitle("Mein LayoutGrid Fenster");
		
		setLayout(new GridLayout(3, 2));
		
		this.setSize(550, 450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		
		getContentPane().add(new JLabel("Gib Deinen Namen ein: "));
		getContentPane().add(new JTextField());
		
		getContentPane().add(new JLabel("Gib eine Zahl ein auch ein Komma usw: "));
		getContentPane().add(new JTextField());
		
		getContentPane().add(new JLabel("Ich will dein Passwort haben, gib es ein: "));
		getContentPane().add(new JPasswordField());
		
		// this.setVisible(true);
	}
}
