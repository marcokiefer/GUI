package de.gbsschulen.anmeldung;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame fr;
	
	public ViewLogin () {
		System.out.println("Viewlogin geladen");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,200);
		setLocationRelativeTo(null);
		setTitle("Login Fenster");
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setForeground(Color.WHITE);
		setFont(new Font("Verdana", 0, 20));
		
		
		JPanel pl = new JPanel();
		pl.setLayout(new BoxLayout(pl, BoxLayout.Y_AXIS));
		
		JLabel labelBenutzer = new JLabel("Benutzer");
		labelBenutzer.setFont(this.getFont());
		pl.add(labelBenutzer);
		
		JTextField labelTextField = new JTextField("");
		//JPanel p =new JPanel();
		//labelTextField.setBorder(new EmptyBorder(10, 10, 10, 10));
		labelTextField.setFont(this.getFont());
		pl.add(labelTextField);
		
		JLabel labelPasswort = new JLabel("Passwort");
		labelPasswort.setFont(this.getFont());
		pl.add(labelPasswort);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setFont(this.getFont());
		pl.add(passwordField);
		
		JButton button = new JButton("Anmelden");
		button.setFont(this.getFont());
		pl.add(button);
		
		getContentPane().add(pl);
		
		
	
		
		
		
	}
	
}
