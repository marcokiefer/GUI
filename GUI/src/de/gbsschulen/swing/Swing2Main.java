package de.gbsschulen.swing;

import javax.swing.JFrame;

public class Swing2Main {

		public static void main(String[] args) {
			Swing2 sw2 = new Swing2();
			
			sw2.setTitle("Titel Swing 2");
			sw2.setSize(500,400);
			
			sw2.setVisible(true);
			sw2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

}

