package de.gbsschulen.swing.container;

import java.awt.FlowLayout;

import javax.swing.*;


public class Uebung_Panel {


	private static void erstelleundzeigeGUI() {
		JFrame fr = new JFrame("Panel mit Buttons");
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(500, 200);
		fr.setLocationRelativeTo(null); 						// Setzt das Fenster zentiert
		fr.setVisible(true);
		
		JPanel pl = new JPanel(new FlowLayout());
		fr.setContentPane(pl); 									// Panel in Content Pane fenster setzen (arbeiten immer im Content-Pane)
		
		// Ab jetzt ist das Panel über dem ContentPane und alles was ich danach hinzufüge ist in dem Panel
		JButton bleft = new JButton("Linker-Button");
		JButton bcenter = new JButton("Mittlerer-Button");
		JButton bright = new JButton("Rechter-Button");
		
		// Buttons auf den Panel setzen
		fr.getContentPane().add(bleft);
		fr.getContentPane().add(bcenter);
		fr.getContentPane().add(bright);

		fr.setVisible(true);
	}
	
	
	

	
	
	
	
	
	
	
	public static void main(String[] args) {
		erstelleundzeigeGUI();
	}

}
