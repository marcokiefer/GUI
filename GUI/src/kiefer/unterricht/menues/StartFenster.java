package kiefer.unterricht.menues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSplitPane;


public class StartFenster extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JSplitPane splithz;
	MeineMenueBar bar;
	JPanel top;
	JPanel bottom;
	JPanel left;
	JPanel right;
	
	public StartFenster () {
		setTitle("Mein Programm mit Menu");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 		// Funktion zum Schließen
		setSize(768, 680);										// Größe setzen
		setLocationRelativeTo(null);							// Zentrierung des Fensters im Bildschirm
		
		bar = new MeineMenueBar();								// Erzeugt die Menübar
		setJMenuBar(bar);
		
		setTop();												// Methode aufrufen
		setBottom();
		setCenter();
		
		// Einfügen des Top-Bereichs im Fenster
		getContentPane().add(top, BorderLayout.PAGE_START);		// Gebe mir den Hintergrund, schreibe in den Hintergrund folgendes hinein
		// add(comp)		--> verwenden für Frame
		getContentPane().add(splithz, BorderLayout.CENTER);
		getContentPane().add(bottom, BorderLayout.PAGE_END);
		
	}
	
	public void setTop() {
		top = new JPanel();
		JLabel frage 		= new JLabel("Welche Farbe hat die Banana?");
		JRadioButton gelb 	= new JRadioButton("gelb");
		JRadioButton blau 	= new JRadioButton("blau");
		
		top.setLayout(new FlowLayout());							// setzt das JPanel in ein FlowLayout
		
		ButtonGroup gruppe 	= new ButtonGroup();					// Gruppieren
		gruppe.add(gelb);
		gruppe.add(blau);
		
		gelb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				right.setBackground(Color.YELLOW);
				
			}
		});
		blau.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				right.setBackground(Color.BLUE);
				
			}
		});

		// Steuerelemente in das Panel einfügen
		top.add(frage);
		top.add(gelb);
		top.add(blau);
	}
	
	public void setCenter() {
		splithz 		= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);		
		left 			= new JPanel();
		right 			= new JPanel();
		
		JLabel inhalt 	= new JLabel("ohne Inahlt");		
		
		// Steuerelement Combobox
		String cbxliste[] 	= 	{ "Auswahl" , "Herr" , "Frau" , "Divers" };
		
		JComboBox<String> cbxleft = new JComboBox<>(cbxliste);
		cbxleft.setPreferredSize( new Dimension (200, 30) );
		cbxleft.setMaximumRowCount(4);											// Maximaler Inhalt
		
		left.add(cbxleft);
		right.add(inhalt);
		
		splithz.setLeftComponent(left);							
		splithz.setRightComponent(right);
		
		cbxleft.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if ( (Integer) cbxleft.getSelectedIndex() != 0 ){			// Ausschlißen des ersten Eintrag der Combobox
					inhalt.setText ((String) cbxleft.getSelectedItem());		
				}
	
			}
		});
	}
	
	public void setBottom() {
		bottom = new JPanel();
		JLabel impressum 	= new JLabel("Impressum");
		JLabel copyright 	= new JLabel("- Copy-Right -");
		JLabel datum = new JLabel(String.format("%tT", new Date()));
		
		bottom.setLayout(new FlowLayout());
		bottom.add(impressum);
		bottom.add(copyright);
		bottom.add(datum);
	}

	
	
}
