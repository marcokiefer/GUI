package de.gbsschulen.layouts.verstehen;

import javax.swing.JDialog;
import javax.swing.JButton;

public class LayoutBox extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LayoutBox() {
		this.setVisible(true);
		this.setSize(450, 450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		
		
		this.setTitle("Mein LayoutBox Fenster");
	}
}
