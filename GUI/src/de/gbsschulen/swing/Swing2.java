package de.gbsschulen.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

import javafx.scene.control.Label;

public class Swing2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Container c;
	
	JLabel lb;			// Anzeige Box
	
	
	public Swing2 () {
		// Hiermit setzt man eine Referenz auf den Container von JFrame
		c = getContentPane();
		
		// Hier wird ein Layout für den Container festgelegt, hier FlowLayout (=> Fließendes Layout) später mehr
		c.setLayout(new FlowLayout());
		
		// 
		lb = new JLabel("Mein erstes Anzeigefeld: ");
		c.add(lb);
	}


}
