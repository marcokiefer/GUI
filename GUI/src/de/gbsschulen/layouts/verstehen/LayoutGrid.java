package de.gbsschulen.layouts.verstehen;

import javax.swing.JDialog;
import javax.swing.JButton;

public class LayoutGrid extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LayoutGrid() {
		this.setVisible(true);
		this.setSize(450, 450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		
		
		this.setTitle("Mein LayoutGrid Fenster");
	}
}
