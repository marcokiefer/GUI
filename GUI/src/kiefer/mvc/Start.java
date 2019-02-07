package kiefer.mvc;

public class Start {

	private static Model model;
	private static View view;
	private static Controller controller;
	
	public static void main(String[] args) {

		model = new Model();
		
		view = new View();
		
		controller = new Controller( view, model );
		
		
		

	}

}
