package de.gbsschulen.layouts.verstehen;

import javax.swing.JDialog;
import javax.swing.plaf.basic.BasicBorders.ButtonBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class LayoutBox extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public LayoutBox() {
		this.setTitle("Mein LayoutBox Fenster");
		this.setSize(450, 450);
		this.setLocationRelativeTo(null);
		this.setModal(true);
		
		// Übergeben des Fensters
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
		
		JButton btn1 = new JButton();
		btn1.setText("Button1 im Box Layout");
		JButton btn2 = new JButton();
		btn2.setText("Button2 im Box Layout");
		JButton btn3 = new JButton();
		btn3.setText("Button3 im Box Layout");
		
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(btn3);
		
		// this.setVisible(true);
	}
}
