package de.gbsschulen.swing.container;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Uebung_TabbedPane {

	private static void fensterErzeugen() {
		
		JDialog dg = new JDialog();
		
		dg.setTitle( "Panel mit Tabbed-Register" );
		dg.setSize( 650, 400 );
		
		JPanel plRed 	= 	new JPanel();
		JPanel plBlue 	= 	new JPanel();
		JPanel plGreen 	= 	new JPanel();
		JPanel plYellow = 	new JPanel();
		JPanel plPink 	= 	new JPanel();
		JPanel plBlack 	= 	new JPanel();
		
		plRed.setBackground( Color.RED );
		plBlue.setBackground( Color.BLUE );
		plGreen.setBackground( Color.GREEN );
		plYellow.setBackground( Color.YELLOW );
		plPink.setBackground( Color.PINK );
		plBlack.setBackground( Color.BLACK );
		
		// Damit das Register oben steht und beim zusammenschieben nicht untereinander geschoben wird
		JTabbedPane tabpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
		
		tabpane.addTab( "Rot", plRed );
		tabpane.addTab( "Blau", plBlue );
		tabpane.addTab( "Grün", plGreen );
		tabpane.addTab( "Gelb", plYellow );
		tabpane.addTab( "Pink", plPink );
		tabpane.addTab( "Schwarz", plBlack );
		
		//dg.add(tabpane);		// sitzt im Root - Pain
		dg.getContentPane().add(tabpane);
		
		dg.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		fensterErzeugen();

	}

}
