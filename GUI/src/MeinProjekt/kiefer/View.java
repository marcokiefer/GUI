package MeinProjekt.kiefer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class View extends JFrame {
	
	private JMenuBar mbar;
	private JMenu datei;
	private JMenu auswahl;
	private JMenuItem teilnehmer;
	private JMenuItem printer;
	private JMenuItem pdf;
	private HashMap<String, Person> personen;
	private JPanel panleft;
	private JPanel panright;
	private JSplitPane splitpane;
	private JComboBox cbxpersonen;
	private JTextField txtanrede;
	private JTextField txtvorname;
	private JTextField txtnachname;
	private JButton buttonLaden;
	private JTextField txtButton;
	

	public View() {
		super("Meine Kontaktliste");
		init();
	}

	public void render() {
		System.out.println("View render");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(768, 680);
		this.setFont(new Font("Verdana", 0, 20));
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}

	public void datenEinspielen(HashMap<String, Person> _personen) {
		this.personen = _personen;
		// personen = new JComboBox(personen)
		for (Person p : personen.values()) {
			System.out.println(p.Vorname());
			System.out.println(p.Nachname());
			cbxpersonen.addItem(p.Nachname());
			txtanrede.setText(p.Anrede());
			txtvorname.setText(p.Vorname());
			txtnachname.setText(p.Nachname());

		}
		cbxpersonen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				personLaden();
			}
		});
	}

	public void personLaden() {
		String wert = Integer.toString((cbxpersonen.getSelectedIndex() + 1));
		Person s = personen.get(wert);
		System.out.println(", Person: " + (String) s.Nachname());
		txtanrede.setText((String) s.Anrede());
		txtvorname.setText((String) s.Vorname());
		txtnachname.setText((String) s.Nachname());
	}

	private void init() {
		this.setLayout(new BorderLayout());
		menu();
		ansicht();
	}

	private void menu() {
		mbar = new JMenuBar();
		datei = new JMenu("Datei");
		teilnehmer = new JMenuItem("Kontakte");
		auswahl = new JMenu("Drucken");
		printer = new JMenuItem("Drucker");
		pdf = new JMenuItem("PDF");
		datei.add(teilnehmer);
		auswahl.add(printer);
		auswahl.add(pdf);
		mbar.add(datei);
		mbar.add(auswahl);
		setJMenuBar(mbar);
	}

	public void ansicht() {
		splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		left();
		right();
		getContentPane().add(splitpane);
	}

	private void left() {
		panleft = new JPanel();
		panleft.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		buttonLaden = new JButton("Laden");
		
		
		// panleft.add(Box.createHorizontalGlue());
		// panleft.add(Box.createRigidArea(new Dimension(10, 0)));
		panleft.setBackground(Color.red);
		LineBorder lBorder = new LineBorder(new Color(100, 100, 100));
		cbxpersonen = new JComboBox();
		cbxpersonen.setBorder(lBorder);
		cbxpersonen.setFont(this.getFont());
		panleft.add(cbxpersonen);
		panleft.add(buttonLaden);
		
		buttonLaden.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ausgabe();
			}
			
		});
		
		splitpane.setLeftComponent(panleft);
	}

	private void right() {
		panright = new JPanel();
		EmptyBorder eBorder = new EmptyBorder(5, 15, 5, 15);
		LineBorder lBorder = new LineBorder(new Color(100, 100, 100));
		txtanrede = new JTextField();
		txtanrede.setFont(this.getFont());
		txtanrede.setBorder(BorderFactory.createCompoundBorder(lBorder, eBorder));
		txtvorname = new JTextField();
		txtvorname.setFont(this.getFont());
		txtvorname.setBorder(BorderFactory.createCompoundBorder(lBorder, eBorder));
		txtnachname = new JTextField();
		txtnachname.setFont(this.getFont());
		txtnachname.setBorder(BorderFactory.createCompoundBorder(lBorder, eBorder));
		panright.add(txtanrede);
		panright.add(txtvorname);
		panright.add(txtnachname);
		panright.setBackground(Color.yellow);
		splitpane.setRightComponent(panright);
		
	}
	private void ausgabe() {
		System.out.println("Button gedrückt");
		
	}

}
