package kiefer.mvc;

import java.sql.ResultSet;

public interface IModel {
	
	// Übergabe des Ergebnisses
	public ResultSet laden();
	
	
	// Übergabe des Benutzers zum Abspeichern
	public void saveUser(Benutzer b);
	
	

}
