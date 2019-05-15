package MeinProjekt.kiefer;

public class Person {
	private Integer id;
	private String anrede;
	private String vorname;
	private String nachname;
	public Person(Integer _id, String _anrede, String _vorname, String _nachname) {
		super();
		this.id = _id;
		this.anrede = _anrede;
		this.vorname = _vorname;
		this.nachname = _nachname;
	}
	
	public Integer Id() {
		return this.id;
	}
	public String Anrede() {
		return this.anrede;
	}
	public String Vorname () {
		return this.vorname;
	}
	public String Nachname () {
		return this.nachname;
	}
	
	

}
