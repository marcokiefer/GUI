package kiefer.unterricht.menues;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MeineMenueBar extends JMenuBar{ 	// Menübar abgeleitet von JMenuBar
	// Menü besteht aus verschiedensten Bereichen
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu datei;
	JMenu einfuegen;
	
	
	// Erzeugen des Menus beim ausfüren der Klasse
	public MeineMenueBar() {
		setDatei();
		setEinfuegen();
	}
	
	
	// Funktionen/Methoden für die einzelnen Menüpunkte
	
	// Erstellen des Menus "Datei"
	public void setDatei() {
		datei = new JMenu("Datei"); 		// Datei steht somit im Label
		add(datei);							// Fügt die 
	}
	// Erstellen des Menus "Einfuegen"
	public void setEinfuegen() {
		einfuegen = new JMenu("Einfügen");
		add(einfuegen);
	}
	
	
	
}
