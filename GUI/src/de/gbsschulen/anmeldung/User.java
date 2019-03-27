package de.gbsschulen.anmeldung;

public class User {
	private Integer id = 0;
	private String benutzer ="";
	private String passwort ="";
	public User(Integer id, String benutzer, String passwort) {
		super();
		this.id = id;
		this.benutzer = benutzer;
		this.passwort = passwort;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBenutzer() {
		return benutzer;
	}
	public void setBenutzer(String benutzer) {
		this.benutzer = benutzer;
	}
	public String getPasswort() {
		return passwort;
	}
	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
}
