package kiefer.mvc;

public class Start {

	private static IModel model;
	private static IView view;
	private static Controller controller;
	
	public static void main(String[] args) {

		model = new Model();
		view = new View();
		controller = new Controller( view, model );
		
		
		
		

	}

}
