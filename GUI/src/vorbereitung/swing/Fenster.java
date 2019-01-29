package vorbereitung.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Fenster extends JFrame{
	// Oben
	JPanel panelTop;
	JTextField textField;
	JButton buttonOK;
	
	// Links
	JPanel panelLeft;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	// Mitte
	JTextArea textArea;
	
	public Fenster (){
		// Grundlegende Fenstereigenschaften
		setTitle("Swing-Beispiel");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Hauptpanel
		setLayout(new BorderLayout(5,5));
		
		// Top
		panelTop = new JPanel(new BorderLayout(5,5));
		getContentPane().add(panelTop, BorderLayout.NORTH);
		textField = new JTextField("Bitte irgendwas eingeben");
		panelTop.add(textField);								// Textfeld hinzufuegen
		buttonOK = new JButton("Ok");
		panelTop.add(buttonOK, BorderLayout.EAST);				// Button hinzufuegen
		
	
		// Left
		panelLeft = new JPanel(new GridLayout(3, 2));
		getContentPane().add(panelLeft,BorderLayout.WEST);
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		
		panelLeft.add(button1);
		panelLeft.add(button2);
		panelLeft.add(button3);
		panelLeft.add(button4);
		panelLeft.add(button5);
		
		// Center
		textArea = new JTextArea("Hallo");
		getContentPane().add(textArea, BorderLayout.CENTER);
	
	}
}
