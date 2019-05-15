package MeinProjekt.kiefer;
import java.util.HashMap;

public class Controller {
	public Model model;
	public View view;
	
	public Controller(View _view, Model _model) {
		this.view = _view;
		this.model = _model;
	}
	
	protected void datenEinspielen() {
		 this.view.datenEinspielen(this.model.getPersonen()); 
	}
	
	 public void starten() {
		 this.view.render();
		 this.datenEinspielen(); 
	 }
}
