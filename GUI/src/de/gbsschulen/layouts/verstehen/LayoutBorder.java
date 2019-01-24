package de.gbsschulen.layouts.verstehen;

import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;

public class LayoutBorder extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LayoutBorder() {
		this.setTitle("Mein LayoutBorder Fenster");
		setLayout(new BorderLayout(5,5));		// 5,5 für die Abstände
		getContentPane().setBackground(new java.awt.Color(210,150,160));			// Color.BlACK
		
		this.setSize(450, 450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		
		JButton btntop     = new JButton("Oben -> Norden -> P-Start");
		// Um mit Zeilenumbrüchen arbeiten zu können
		// kann man einfach anstatt einem Text ein HTML Tag einsetzen
		JButton btnleft    = new JButton("<html> Links -> <br> Westen -> <br> L-Start");
		// Schließenden Tag macht er automatisch
		
		JButton btncenter  = new JButton("Mittig automatische Restfüllung");
		JButton btnright   = new JButton("<html> Rechts -> <br> Osten -> <br> R-Start");
		JButton btnbottom  = new JButton("Unten -> Süden -> P-End");
		
		add( btntop,    BorderLayout.PAGE_START );			// Borderlayout.NORTH
		add( btnleft,   BorderLayout.LINE_START );			// Borderlayout.EAST
		add( btncenter, BorderLayout.CENTER );			
		add( btnright,  BorderLayout.LINE_END );			// Borderlayout.WEST
		add( btnbottom, BorderLayout.PAGE_END );			// Borderlayout.SOUTH
		
		
		// this.setVisible(true);
	}
}
