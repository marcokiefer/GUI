package de.gbs.mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import kiefer.mvc.Model;

public class SigninView extends JFrame{
	private SigninModel model;
	private JPanel form;
	private JLabel lblheader;
	private JLabel lbluser;
	private JTextField txtuser;
	private JLabel lblpw;
	private JTextField txtpw;
	private JLabel lblpwh;
	private JTextField txtpwh;
	private JButton btnnew;
	private JButton btnsave;
	
	
	public SigninView(SigninModel _model) {
		model = _model;
		init();
	}
	
	private void init() {
		//Voreinstellungen beim Start / JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,475);
		
		setLocationRelativeTo(null);
		setTitle("Registrierung-Formular");
		setFont(new Font("Verdana", 0, 30));
		getContentPane().setBackground(new Color(85, 153, 187));
		getContentPane().setForeground(Color.LIGHT_GRAY);
		form = new JPanel();
	}
	
	public void render() {
		form.setLayout(new BorderLayout());
		formHeader();
		formBody();
		formFooter();
		this.getContentPane().add(form);
	}
	
	// Im BorderLayout der Kopf-Bereich	
	protected void formHeader() {
		lblheader = new JLabel("Bitte ausfüllen");
		lblheader.setFont(this.getFont());
		form.add(lblheader, BorderLayout.PAGE_START);
	}
	
	// Im BorderLayout der Center-Bereich
	protected void formBody() {
		JPanel pancenter = new JPanel();
		// Innenabstand
		pancenter.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		pancenter.setBorder(BorderFactory.createLineBorder(Color.RED));
		// 6 Zeilen + 1 Leerzeile
		pancenter.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		lbluser = new JLabel("Benutzer:");		//, JLabel.LEFT
		gbc.gridx = 0;		// Spalte 1 (Zählung beginnt bei 0)
		gbc.gridy = 0;		// Zeile 0
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.weighty = 0; // ohne zusätzlichen Raum
		pancenter.add(lbluser,gbc);
		lbluser.setFont(this.getFont());
		//lbluser.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
		
		txtuser = new JTextField(20);
		txtuser.setText("chr-pickel@");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weighty = 0; // ohne zusätlichen Raum
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		pancenter.add(txtuser,gbc);
		txtuser.setFont(getFont());
		txtuser.setBackground(getContentPane().getBackground());
		txtuser.setForeground(getContentPane().getForeground());
		txtuser.setPreferredSize(new Dimension(20, 20));
		
		
		lblpw = new JLabel("Passwort:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weighty = 0; 							// ohne zusätlichen Raum
		gbc.fill = GridBagConstraints.NONE;
		pancenter.add(this.lblpw,gbc);
		lblpw.setFont(this.getFont());
		
		//lblpw.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		
		txtpw = new JTextField();
		txtpw.setText("Passwort");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weightx = 1.0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		pancenter.add(txtpw, gbc);
		txtpw.setFont(this.getFont());
		txtpw.setBackground(getContentPane().getBackground());
		txtpw.setForeground(getContentPane().getForeground());
		
		lblpwh = new JLabel("Passwort-Wh:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.NONE;
		pancenter.add(lblpwh, gbc);
		lblpwh.setFont(this.getFont());
		
		txtpwh = new JTextField("Passwort-Wiederholung:");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		pancenter.add(txtpwh, gbc);
		txtpwh.setFont(this.getFont());
		txtpwh.setBackground(getContentPane().getBackground());
		txtpwh.setForeground(getContentPane().getForeground());
		
		JLabel fills = new JLabel(""); // Leerzeile
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.weighty = 1;
		gbc.fill = GridBagConstraints.BOTH;
		pancenter.add(fills, gbc);
		form.add(pancenter, BorderLayout.CENTER);
		
	}
	
	protected void formFooter() {
		JPanel panfooter = new JPanel();
		btnnew = new JButton("Neu");
		btnsave = new JButton("Speichern");
		
		panfooter.add(btnnew);
		btnnew.setFont(this.getFont());
		btnnew.addActionListener(new NewActionListener());
		
		panfooter.add(btnsave);
		btnsave.setFont(this.getFont());
		btnsave.addActionListener(new SaveActionListener());
		
		form.add(panfooter,BorderLayout.PAGE_END);
	}

	class SaveActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			User user = new User("Karlchen", "Schön");
			//model.saveData(user);
		}
	}
	class NewActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("New");
			txtuser.setText("");
			txtpw.setText("");
			txtpwh.setText("");
		}
	}
}
