package de.gbsschulen.layouts.verstehen;

import javax.swing.JDialog;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;

// Flow Layout ist von Links nach Rechts
public class LayoutFlow extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LayoutFlow() {
		
		this.setSize(450, 450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		this.setTitle("Mein LayoutFlow Fenster");
		
		// FlowLayout setzen
		setLayout(new FlowLayout());
		
		// Button erstellen
		JButton links 		= 	new JButton("Links");
		JButton mitte	 	= 	new JButton("Mitte");
		JButton rechts 		=	new JButton("Rechts");
		
		// Buttons hinzufuegen zum Layout
		add(links);
		add(mitte);
		add(rechts);
		// setVisible(true);
		
	}
}
