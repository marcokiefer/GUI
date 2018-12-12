package de.gbschulen.uebung.fenstertypen;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class Fenstertypen {
	public static void main(String[] args) {
		new FramFenster();
		new WindowFenster();
		new DialogFenster();
	}
}

class FramFenster extends JFrame {
	public FramFenster() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("JFrame-Fenster");
		this.add(new JLabel("Mein eigenes JFrame-Fenster mit Label"));
		this.setVisible(true);
		// this.setExtendedState(JFrame.MAXIMIZED_BOTH);			// Vollbildmodus
	}
}

class WindowFenster extends JWindow {
	public WindowFenster() {
		this.setSize(450, 400);
		this.setLocationRelativeTo(null);
		this.add(new JLabel("Mein eigenes Window-Fenster ohne Titelleiste"));
		this.setVisible(true);
	}
}

class DialogFenster extends JDialog {
	public DialogFenster() {
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setTitle("JDialog-Fenster");
		this.add(new JLabel("Ein Dialogfenster z.B. für Speichern unter"));
		this.setVisible(true);
	}
}
