package de.gbsschulen.swing;

import java.awt.Color;

import javax.swing.*;

public class Swing1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Swing1() {
		this.setSize(500, 400);
		this.setTitle("Mein erstes Swing Fenster");
		this.setBackground(Color.blue);
	}

	public static void main(String[] args) {
		Swing1 sw1 = new Swing1();
		sw1.setVisible(true);
		sw1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
