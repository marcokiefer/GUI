package de.gbsschulen.anmeldung;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewEingabe extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ViewEingabe () {
	
	System.out.println("Vieweingabe");
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(400,350);
	setLocationRelativeTo(null);
	setTitle("Login Fenster");
	getContentPane().setBackground(Color.LIGHT_GRAY);
	getContentPane().setForeground(Color.WHITE);
	setFont(new Font("Verdana", 0, 20));
	
	
	JPanel pl = new JPanel();
	pl.setLayout(new BoxLayout(pl, BoxLayout.Y_AXIS));
	
	JLabel labelBenutzer = new JLabel("Anmeldename");
	labelBenutzer.setFont(this.getFont());
	pl.add(labelBenutzer);
	
	JTextField labelTextField = new JTextField("");
	labelTextField.setFont(this.getFont());
	pl.add(labelTextField);
	
	JLabel labelPasswort = new JLabel("Passwort");
	labelPasswort.setFont(this.getFont());
	pl.add(labelPasswort);
	
	JPasswordField passwordField = new JPasswordField();
	passwordField.setFont(this.getFont());
	pl.add(passwordField);
	
	JLabel labelPasswortWH = new JLabel("Passwort-WH");
	labelPasswortWH.setFont(this.getFont());
	pl.add(labelPasswortWH);
	
	JPasswordField passwordFieldWH = new JPasswordField();
	passwordFieldWH.setFont(this.getFont());
	pl.add(passwordFieldWH);
	
	JPanel panelButtons = new JPanel();
	panelButtons.setLayout(new FlowLayout(FlowLayout.LEFT));
	JButton button = new JButton("NEU");
	JButton button2 = new JButton("Speichern");
	button.setFont(this.getFont());
	button2.setFont(this.getFont());
	panelButtons.add(button);
	panelButtons.add(button2);
	
	pl.add(panelButtons);
	
	getContentPane().add(pl);
	
	}
	

}
