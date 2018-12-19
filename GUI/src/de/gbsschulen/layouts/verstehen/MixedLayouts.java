package de.gbsschulen.layouts.verstehen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MixedLayouts extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btnflow;
	LayoutFlow layf;
	
	public MixedLayouts() {
		setTitle("Komplexes Fenster");
		setSize(450, 450);
		
		btnflow = new JButton("Öffne das Flow-Layout");
		btnflow.addActionListener(this);
		add(btnflow);
		
		setVisible(true);	
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnflow) {
			layf = new LayoutFlow();
			layf.setVisible(true); // Achtung wenn in der Klasse setVisible(true) gesetzt ist muss man es zweimal schließen
		}
	}

}
