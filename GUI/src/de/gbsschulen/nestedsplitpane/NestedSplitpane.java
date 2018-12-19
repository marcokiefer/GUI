package de.gbsschulen.nestedsplitpane;
import java.awt.Color;
import java.awt.Frame;

// Aufgabe SplitPane Uebung
// 2
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

// 1
public class NestedSplitpane {
	
	public static void main(String[] args) {
		/**
		 * Instanzierung aller Klassen
		 */
		
		//  4 - 6 
		JLabel label1 		= new JLabel("Links oben Horizontal");
		label1.setForeground(Color.magenta);
		JLabel label2 		= new JLabel("Links unten Horizontal");
		label2.setForeground(Color.BLUE);
		JLabel label3 		= new JLabel("Rechts Vertikal");
																	// true = steht dafür, das eine Veränderung sofot angezeigt wird
		JSplitPane splp 	= new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, label1, label2 );
		
		// Aufgabe 9
		splp.setOneTouchExpandable(true);
		splp.setDividerSize(20);
			/**
			 * Das erste SplitPane wird an das zweite übergeben und so, auch deren Inhalt.
			 * Weiterhin wird das dritte Label rechts positioniert								
			 */
		JSplitPane splp2 	= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, splp , label3 );
		
		JFrame jf 			= new JFrame();
		jf.setTitle("Verschachtelte Fenster");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(600, 300);
		//pack();	// Zeigt das minimalste Fenster in Höhe und Breite an
		jf.setLocationRelativeTo(null);
		//jf.add(splp);
		jf.add(splp2);
		jf.setVisible(true);
	}
}
