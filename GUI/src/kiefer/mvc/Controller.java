package kiefer.mvc;

public class Controller {

	private IModel _model;
	private IView _view;
	
	public Controller(IView view, IModel model) {
		System.out.println("Ausgabe Controller");
		this._model = model;
		this._view = view;
		
		
		this._view.visible();
		
	}

}
