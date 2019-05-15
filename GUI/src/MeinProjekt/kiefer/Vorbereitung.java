package MeinProjekt.kiefer;

public class Vorbereitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(view, model);
		controller.starten();
	}
}
