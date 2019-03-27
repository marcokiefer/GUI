package kiefer.mvc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Model implements IModel{

	private Connection con = null;
	
	// Verbindungsdaten
	private String hostname 	= "localhost"; 	//127.0.0.1
	private String port 		= "3306";
	private String dbname 		= "gui";
	private String user 		= "root";
	private String pw			= "mysql";
	private Statement 	stmt 	= null;
	private ResultSet 	rs		= null;
	private String 		_url	= "";

	public Model () {
		_url = "jdbc:mysql://" + hostname + ":" + port + "/" + dbname +
				"?user=" + user + "&" + "password=" +pw;
		this.laden();
	}

	@Override
	public ResultSet laden() {
		// Es wird unbedingt ein TryCatch Block benötigt damit Fehler abgefangen werden
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(_url);
			con.setReadOnly(true);
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT * FROM `gui`.`personen`");
			
			// Testen des Auslesen und der Verbindung
			//	
			//while (rs.next()) {
			//System.out.println(rs.getString(1) + " - " +  rs.getString(2));
			//}	

			System.out.println("Treiber gefunden");
			
		} catch (ClassNotFoundException e) {
			
			System.out.println("Treiber nicht gefunden!");
			System.out.println(e.getMessage());
		
		} catch (SQLException e) {
		
		System.out.println("Verbindung nicht möglich!");
		System.out.println(e.getMessage());
		System.out.println(e.getSQLState());
		System.out.println(e.getErrorCode());
		
		}
		
		return rs;
	}

	@Override
	public void saveUser(Benutzer b) {
		
		
	}
}
