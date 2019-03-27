package de.gbs.mvc;


public class SigninController {
	private SigninView view;
	private SigninModel model;
	
	public SigninController() {
		init();
	}
	private void init() {
		model = new SigninModel();
		view = new SigninView(model);
		view.render();
		//model.datenLaden();
		
		//Anzeige des JFrame
		view.setVisible(true);
	}
}
