package de.gbs.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import de.gbsschulen.anmeldung.User;

public class SigninModel {
	private Connection con;
	private String hostname 		="localhost";
	private String port				="3306";
	private String dbname 			="gui";
	private String user				="root";
	private String password			="";
	
	private ResultSet rs;
	private Statement stmt;
	private String _url;		
	
	
	public SigninModel() { //URL String für den Treiber
			_url="jdbc:mysql://"+hostname+":"+
			port+"/"+dbname+"?"+"user="+user+"&"+"password="+password;
			System.out.printf(_url);
	}

	public void datenLaden() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(_url);
			con.setReadOnly(true);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM personen;";
			rs=stmt.executeQuery(query);
		
			//con.close();
			
		} catch (ClassNotFoundException e) {
			
		} catch (SQLException e) {
			
		}
	
	}
	public void saveData(User user) {
		System.out.println("Save-Data");
		String query = "INSERT INTO user (`username`,`password`) VALUES (?,?)";
		
		try {
			con = DriverManager.getConnection(_url);
			con.setReadOnly(true);
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1,  user.getBenutzer());
			preparedStmt.setString(2,  user.getPasswort());
			preparedStmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
