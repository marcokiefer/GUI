package de.gbsschulen.layouts.verstehen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixedLayouts extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton 		btnflow;
	JButton 		btnborder;
	JButton 		btnbox;
	JButton			btngrd;
	
	LayoutFlow 		layf;
	LayoutBorder 	laybrd;
	LayoutBox		laybox;
	LayoutGrid      laygrd;
	
	public MixedLayouts() {
		setTitle("Komplexes Fenster");
		setSize(450, 450);
		setLocationRelativeTo(null);
		
		btnborder = new JButton("Öffne das BORDER-Layout");
		btnborder.addActionListener(this);
		
		btnflow = new JButton("Öffne das FLOW-Layout");
		btnflow.addActionListener(this);
		
		btnbox = new JButton("Öffne das BOX-Layout");
		btnbox.addActionListener(this);
		
		btngrd = new JButton("Öffne das GRID-Layout");
		btngrd.addActionListener(this);
		
		
		JPanel main = new JPanel();		// Viereckige Fläche (Container)
		main.add(btnborder);
		main.add(btnflow);
		main.add(btnbox);
		main.add(btngrd);
		getContentPane().add(main);		// 
		
		setVisible(true);	
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnborder) {
			laybrd = new LayoutBorder();
			laybrd.setVisible(true); // Achtung wenn in der Klasse setVisible(true) gesetzt ist muss man es zweimal schließen
			
		}
		if (e.getSource() == this.btnflow) {
			layf = new LayoutFlow();
			layf.setVisible(true); 
			
		}
		if (e.getSource() == this.btnbox) {
			laybox = new LayoutBox();
			laybox.setVisible(true); 
			
		}
		if (e.getSource() == this.btngrd) {
			laygrd = new LayoutGrid();
			laygrd.setVisible(true); 
			
		}
	}
}
