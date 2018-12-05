package de.gbsschulen.awt;
import java.awt.*;


public class ErstesAwtFenster {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("Mein erstes AWT Fenster");
		
		
		f.setSize(450, 300);					// Größe des Fensters setzen
		f.setBounds(300, 300, 450, 300);		// Gibt ein Recheck wieter mit Position (Position Left, Position Top, Größe Breite, Größe Höhe) 
		
		f.setVisible(true);						// Fenster sichtbar machen		

	}

}
