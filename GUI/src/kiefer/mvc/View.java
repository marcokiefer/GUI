package kiefer.mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class View extends JFrame implements IView {
	JMenu datei;
	JMenu auswahl;
		// Bei Klick auf Teilnehmer wird das Listenfeld geladen
	JMenuItem teilnehmer;
	
	
	public View () {
		System.out.println("Ausgabe View");
		init();
		
	}
	
	private void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(768,680);
		this.setLocationRelativeTo(null);
		this.setTitle("Datenbank Ansicht");
		
		this.setLayout(new BorderLayout());
		
		menu();
		aussehen();
	}
	
	// Menue Datei und Menue Auswahl
	private void menu() {
		JMenuBar bar 	= 	new JMenuBar();
		datei 			= 	new JMenu("Datei");
		auswahl 		= 	new JMenu("Auswahl");
		teilnehmer 		= 	new JMenuItem("Teilnehmer");
		
		auswahl.add(teilnehmer);
		
		bar.add(datei);
		bar.add(auswahl);
		
		this.setJMenuBar(bar);	//einfügen der Menubar
	}
	/**
	 * Umsetzung Borderlayout
	 * Linker Bereich in Panel mit einer List- / Combobox
	 * Rechter Bereich ein Panel mit Labels und Texfelder
	 * Unterer Bereich Buttons Neu, Speicher, Löschen rechtsbündig
	 * 
	 */
	private void aussehen () {
		JPanel links = new JPanel();
		links.setLayout(new BoxLayout(links, BoxLayout.Y_AXIS));		// Panel in das BoxLayout
		/**
		 * Linker Bereich
		 * Label-Info-Feld
		 * Listbox
		 */
		JLabel infolistbox = new JLabel("Teilnehmerliste");
		links.add(infolistbox);
		
		// Rahmen für die Infoleiste
		Border blackline = BorderFactory.createLineBorder(Color.black);
		infolistbox.setBorder(blackline);
		
		// String array (test)
		String liste[] = {"Meier","Mueller","Schulze"};
		
		JList<String> teilnehmerliste = new JList<String>(liste);
		links.add(teilnehmerliste);
		
		
		getContentPane().add(links, BorderLayout.WEST);
	}
	
	@Override
	public void visible() {
		this.setVisible(true);
	}
	
}
