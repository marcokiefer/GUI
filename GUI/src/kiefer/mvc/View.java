package kiefer.mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class View extends JFrame implements IView {
	JMenu datei;
	JMenu auswahl;
		// Bei Klick auf Teilnehmer wird das Listenfeld geladen
	JMenuItem teilnehmer;
	
	
	public View () {
		System.out.println("Ausgabe View");
		this.init();
		
	}
	
	private void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(768,680);
		this.setLocationRelativeTo(null);
		this.setTitle("Datenbank Ansicht");
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.getContentPane().setForeground(Color.WHITE);
		// Schrift ändern
		this.setFont(new Font("Verdana", 0, 20));
		//System.out.println(this.getFont().getFontName());
		
		// ********** Grüße des Windows mitgeben **********
		// Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		// this.setSize( screen );
		
		// ********** Fenstergröße nicht veränderbar **********
		// this.setResizable(false);
		
		
		
		this.setLayout(new BorderLayout());
		
		this.menu();
		this.aussehen();
		this.inhalt();
	}
	
	// Menue Datei und Menue Auswahl
	private void menu() {
		JMenuBar bar 	= 	new JMenuBar();
		datei 			= 	new JMenu("Datei");
		auswahl 		= 	new JMenu("Auswahl");
		teilnehmer 		= 	new JMenuItem("Teilnehmer");
		
		datei.setFont(this.getFont());
		auswahl.setFont(this.getFont());
		teilnehmer.setFont(this.getFont());
		
		
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
	
	private void aussehen() {
		JPanel links = new JPanel();
		links.setLayout(new BorderLayout());		// Panel in das Borderlayout
		
		Box box = Box.createVerticalBox();
		
		
		
		
		/**
		 * Linker Bereich
		 * Label-Info-Feld
		 * Listbox
		 */
		JLabel infolistbox = new JLabel("Teilnehmerliste");
		infolistbox.setBorder(setBoarder());
		infolistbox.setFont(this.getFont());
		infolistbox.setSize(200,30);
		box.add(infolistbox);
		
		box.add(box.createVerticalStrut(5));				// 5 Pixel Abstand
	
		
		// String array (test)
		String liste[] = {"Meier","Mueller","Schulze"};
		JList<String> teilnehmerliste = new JList<String>(liste);
		teilnehmerliste.setFont(this.getFont());
		teilnehmerliste.setBorder(setBoarder());						// Rahmen darum setzen
		
		JScrollPane scrollPane = new JScrollPane(teilnehmerliste);		// Teilnehmerliste scrollbar machen
		scrollPane.setAlignmentX(LEFT_ALIGNMENT);						// Linksbündig ausrichten
									
				
		
		// Teilnehmerliste hinzufügen
		box.add(scrollPane);
		box.add(box.createVerticalStrut(5));
		
		
		JButton laden = new JButton("Daten laden");
		laden.setBorder(setBoarder());
		laden.setFont(this.getFont());
		
		// laden.setAlignmentX(Component.LEFT_ALIGNMENT);
		// laden.setAlignmentY(Component.CENTER_ALIGNMENT);
		box.add(laden);
		
		
		links.add(box);
		getContentPane().add(links, BorderLayout.WEST);
	}
	
	private void inhalt( ) {
		// Benutzen des Layout-Containers (GridBagLayout und GridBagConstraints)
		JPanel inhalt = new JPanel();
		
		GridBagLayout gbl = new GridBagLayout();
		inhalt.setLayout(gbl);
		
		Insets default_insets = new Insets(5, 5, 5, 5);
		/**
		 * Einfügen der Komponenten in das GridBagLayout
		 */
		JLabel header = new JLabel("Eingabebereich unserer Ansicht");
		header.setFont(this.getFont());
		
		/**
		 * Vorgehensweise beim Einfügen der Komponenten in das Layout
		 */
		
		addComponent(inhalt, gbl, header, 0, 0, GridBagConstraints.REMAINDER,
				1, GridBagConstraints.WEST, default_insets, 0, 0, 
				GridBagConstraints.HORIZONTAL);
		
		/**
		 * Vorname
		 */
		JLabel vname = new JLabel("Vorname");
		vname.setFont(this.getFont());
		vname.setForeground(Color.BLUE);
		addComponent(inhalt, gbl, vname, 0, 1, GridBagConstraints.REMAINDER,
				1, GridBagConstraints.WEST, default_insets, 0, 0, 
				GridBagConstraints.HORIZONTAL);
		
		/**
		 * Textfeld: Vorname
		 */
		JTextField tfvname = new JTextField("Klaus");
		tfvname.setFont(this.getFont());
		tfvname.setBorder(setBoarder());
		addComponent(inhalt, gbl, tfvname, 0, 2, GridBagConstraints.REMAINDER,
				1, GridBagConstraints.WEST, default_insets, 0, 0, 
				GridBagConstraints.HORIZONTAL);
		
		/**
		 * Nachname
		 */
		JLabel nname = new JLabel("Nachname");
		nname.setFont(this.getFont());
		nname.setForeground(Color.BLUE);
		addComponent(inhalt, gbl, nname, 0, 3, GridBagConstraints.REMAINDER,
				1, GridBagConstraints.WEST, default_insets, 0, 0, 
				GridBagConstraints.HORIZONTAL);
		
		/**
		 * Textfeld: Nachname
		 */
		JTextField tfnname = new JTextField("Müller");
		tfnname.setFont(this.getFont());
		tfnname.setBorder(setBoarder());
		addComponent(inhalt, gbl, tfnname, 0, 4, GridBagConstraints.REMAINDER,
				1, GridBagConstraints.WEST, default_insets, 0, 0, 
				GridBagConstraints.HORIZONTAL);
		
		
		/**
		 * Geburtstag mit 3 Comboboxen
		 * Tag 1,2,3....
		 * Monat Jan, Feb, Mrz, ...
		 * Jar 2000, 1999, 1998 ...
		 */
		/*
		 * Label: GebTag
		 */
		JLabel gebtag = new JLabel("Tag:");
		gebtag.setFont(this.getFont());
		gebtag.setForeground(Color.BLUE);
		addComponent(inhalt, gbl, gebtag, 0, 6, 1, 1, 
				GridBagConstraints.WEST, default_insets, 1, 0, 
				GridBagConstraints.HORIZONTAL);
		/*
		 * Label: GebMonat
		 */
		JLabel gebmonat = new JLabel("Monat:");
		gebmonat.setFont(this.getFont());
		gebmonat.setForeground(Color.BLUE);
		addComponent(inhalt, gbl, gebmonat, 1, 6, 1, 1, 
				GridBagConstraints.WEST, default_insets, 1, 0, 
				GridBagConstraints.HORIZONTAL);
		/*
		 * Label: GebJahr
		 */
		JLabel gebjahr = new JLabel("Monat:");
		gebjahr.setFont(this.getFont());
		gebjahr.setForeground(Color.BLUE);
		addComponent(inhalt, gbl, gebjahr, 2, 6, 1, 1, 
				GridBagConstraints.WEST, default_insets, 1, 0, 
				GridBagConstraints.HORIZONTAL);
		
		
		String [] lisTag = {"1","2","3"};
		String [] lisMonat = {"Jan","Feb","Mrz"};
		String [] lisJahr = {"2000","1999","1998"};
		
		JComboBox<String> cbxtage = new JComboBox<String>(lisTag);
		cbxtage.setFont(this.getFont());
		addComponent(inhalt, gbl, cbxtage, 0, 7, 1, 1, 
				GridBagConstraints.NORTHWEST, default_insets, 1, 0, 
				GridBagConstraints.HORIZONTAL);
		
		JComboBox<String> cbxmonate = new JComboBox<String>(lisMonat);
		cbxmonate.setFont(this.getFont());
		addComponent(inhalt, gbl, cbxmonate, 1, 7, 1, 1, 
				GridBagConstraints.NORTHWEST, default_insets, 1, 0, 
				GridBagConstraints.HORIZONTAL);
		
		JComboBox<String> cbxjahre = new JComboBox<String>(lisJahr);
		cbxjahre.setFont(this.getFont());
		addComponent(inhalt, gbl, cbxjahre, 2, 7, 1, 1, 
				GridBagConstraints.NORTHWEST, default_insets, 1, 0, 
				GridBagConstraints.HORIZONTAL);
		
		
		
		
		this.getContentPane().add(inhalt, BorderLayout.CENTER);
	}
	private void addComponent(Container cont, GridBagLayout gbl,
			 JComponent comp, int x, int y, int width, int height, int anchor,
			    Insets in, double wx, double wy, int fill) {
			GridBagConstraints c = new GridBagConstraints();
			//System.out.println("y: " + y);
			c.weightx = wx;
			c.weighty = wy;
			c.fill = fill;
			c.gridx = x;
			c.gridy = y;
			c.gridwidth = width;
			c.gridheight = height;
			c.insets = in;
			c.anchor = anchor;
			gbl.setConstraints(comp, c);
			cont.add(comp);
	}
	
	
	private Border setBoarder() {					// Methode für den Innenabstand (Border und Padding für die Steuerelement 
		EmptyBorder eBorder = new EmptyBorder(5, 10, 5, 10); // oeben, rechts, unten, links
		LineBorder lBorder = new LineBorder(Color.LIGHT_GRAY);
		return BorderFactory.createCompoundBorder(lBorder,eBorder);
	}
	
	
	@Override
	public void visible() {
		this.setVisible(true);
	}
	
}
