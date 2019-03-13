package kiefer.mvc;

import java.util.Date;

public class Benutzer {
	private Integer id = 0;
	private String vorname = "";
	private String nachname = "";
	private Date geburtsdatum;
	
	
	public Benutzer(Integer _id,  String _nachname, String _vorname, Date _geburtsdatum) {
		this.id 		= _id;
		this.vorname 	= _vorname;
		this.nachname 	= _nachname;
		this.geburtsdatum = _geburtsdatum;
	}

	public Integer getId() {
		return id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String _vorname) {
		this.vorname = _vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String _nachname) {
		this.nachname = _nachname;
	}

	public Date getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(Date geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	
	
	
	
	
}
