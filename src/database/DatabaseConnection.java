package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fauteuil.Fauteuil;




public class DatabaseConnection {

	private static String URL_CONNECTION =

			"jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass";

	private static Connection connection;
	private static final DatabaseConnection db = new DatabaseConnection();

	private DatabaseConnection() {
		db.openConnection();
		System.out.println("Construction du db au premier appel");
	}

	public static DatabaseConnection getDb() {
		return db;
	}

	@Override
	public String toString() {
		return String.format("Je suis le DataBaseConnection : %s", super.toString());

	}

	// méthode connection
	private static Connection openConnection() {
		if (connection == null) {
			// créér la connection

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
			} catch (ClassNotFoundException cnfe) {
				connection = null;
			} catch (SQLException sqle) {
				connection = null;
			}
		}
		return connection;

	}
	
	public boolean createSeanceProcedureSQL(Fauteuil fauteuil) {

		CallableStatement stmt = null;
		boolean resultat = false;
		if (fauteuil == null) {
			return false;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Hopital?user=javauser" + "&password=javapass");

			String sqlString = "{call addFauteuil (?, ?, ?, ?, ?, ?)}";
			stmt = connection.prepareCall(sqlString);
			stmt.setString(1, fauteuil.getNumeroFauteuil());
			stmt.setString(2, fauteuil.getNomSpectacle());
			stmt.setString(3, fauteuil.getDate());
			stmt.setString(4, fauteuil.getPrenom());
			stmt.setString(5, fauteuil.getNom());
			stmt.setInt(3, convertBooleanToInt(fauteuil.isReserve()));
			

			resultat = stmt.execute();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
		}
		System.out.println("Enregistrement des fauteuils " + fauteuil.getNom() + " réussi dans SQL");

		return resultat;
	}
	
	public boolean createFauteuilSeanceProcedureSQL(Fauteuil fauteuil) {

		CallableStatement stmt = null;
		boolean resultat = false;
		if (fauteuil == null) {
			return false;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Hopital?user=javauser" + "&password=javapass");

			String sqlString = "{call addFauteuil (?, ?, ?, ?, ?, ?)}";
			stmt = connection.prepareCall(sqlString);
			stmt.setString(1, fauteuil.getNumeroFauteuil());
			stmt.setString(2, fauteuil.getNomSpectacle());
			stmt.setString(3, fauteuil.getDate());
			stmt.setString(4, fauteuil.getPrenom());
			stmt.setString(5, fauteuil.getNom());
			stmt.setInt(3, convertBooleanToInt(fauteuil.isReserve()));
			

			resultat = stmt.execute();

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			}
		}
		System.out.println("Enregistrement des fauteuils " + fauteuil.getNom() + " réussi dans SQL");

		return resultat;
	}
	
	private int convertBooleanToInt(boolean booleanToConvert) {
		if (booleanToConvert) {
			return 1;
		} else {
			return 0;

		}
	}
	
}
