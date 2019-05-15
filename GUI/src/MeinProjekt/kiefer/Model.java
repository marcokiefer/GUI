package MeinProjekt.kiefer;

import java.util.HashMap;

public class Model {

	private HashMap<String, Person> personen;

	public Model() {
		super();
		 personen = new HashMap<String, Person>();
		 personen.put("1", new Person(1, "Herr","Hans","Peter"));
		 personen.put("2", new Person(2, "Frau","Gitte","Franke"));
		 personen.put("3", new Person(3, "Herr","Gert","Klausen"));
	}
	
	public HashMap<String, Person> getPersonen() {
		return personen;
	}
	
	
	
}
