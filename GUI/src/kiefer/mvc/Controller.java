package kiefer.mvc;

public class Controller {

	private Model _model;
	private View _view;
	
	public Controller(View view, Model model) {
		System.out.println("Ausgabe Controller");
		this._model = model;
		this._view = view;
		
	}

}
