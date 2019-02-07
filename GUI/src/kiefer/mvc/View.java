package kiefer.mvc;

import javax.swing.JFrame;

public class View extends JFrame implements IView {
	
	public View () {
		System.out.println("Ausgabe View");
		init();
		
	}
	
	private void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(768,680);
		this.setLocationRelativeTo(null);
		
		
		
		
		
			
	}
	public void visible() {
		this.setVisible(true);
	}
	
}
