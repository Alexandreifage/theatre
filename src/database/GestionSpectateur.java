package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Personne.Spectateur;



public class GestionSpectateur {
	
	private static String URL_CONNECTION =

			"jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass";

	private static Connection connection;
	
	private static final GestionSpectateur db = new GestionSpectateur();

	private GestionSpectateur() {
		db.openConnection();
		System.out.println("Construction du db de GestionSpectacle au premier appel");
	}

	public static GestionSpectateur getDb() {
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
	
	public boolean createReservationSpectateurProcedureSQL(Spectateur spectateur) {


		CallableStatement stmt = null;
		boolean resultat = false;
		if (spectateur == null) {
			return false;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
			
			String sqlString = "{call addSpectateur (?, ?, ?, ?)}";
			stmt = connection.prepareCall(sqlString);
			stmt.setString(1, spectateur.getPrenom());
			stmt.setString(2, spectateur.getNom());
			stmt.setString(3, spectateur.getSpectacleReserve());
			stmt.setString(4, spectateur.getFauteuilReserve());
			
			System.out.println(spectateur.getSpectacleReserve());
			System.out.println(spectateur.getFauteuilReserve());

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
		System.out.println(spectateur.getPrenom() +" "+spectateur.getNom() + " a reserve le fauteuil " + spectateur.getFauteuilReserve() + " pour le spectacle: " + spectateur.getSpectacleReserve());

		return resultat;
	}
	
public List<Spectateur> retrieveAllSpectateurProcedureSQL() {
		
		// mise à zéro du résultat de la requête SQL
		ResultSet rs = null;
		// mise à zéro de la variable stmt qui appartient à la classe Statement qui permet d'exécuter des requêtes SQL
		Statement stmt = null;
		// Création de la liste
		List<Spectateur> listeAllSpectateur = new ArrayList<>();
		
		

		try {
			// procédure de connection
			Class.forName("com.mysql.cj.jdbc.Driver");// fixe
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
			// new stmt
			stmt = connection.createStatement();
			
			// dans la variable String sqlString on met le string : {call getAllInfirmiers ()}
			String sqlString = "{call getAllSpectateur ()}";
			// on exécute la requête stockée dans sqlString puis on enregistre le résultat 
			// (tous les infirmiers présents dans la base de données) dans rs
			rs = stmt.executeQuery(sqlString);
			// pour parcourir rs 
			while (rs.next()) {
				// création des new
				Spectateur SpectateurRetrieve = new Spectateur(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));

				listeAllSpectateur.add(SpectateurRetrieve);

			}
			System.out.println();
			System.out.println("Liste de tous les spectateurs de la base de données via Stored Procedure SQL");
			System.out.println("----------------------------------------------------------------------------");
			for (int i = 0; i < listeAllSpectateur.size(); i++) {
				
				System.out.print(listeAllSpectateur.get(i).getPrenom() + " ");
				System.out.print(listeAllSpectateur.get(i).getNom() + " ");
				System.out.print(listeAllSpectateur.get(i).getSpectacleReserve() + " ");
				System.out.print(listeAllSpectateur.get(i).getFauteuilReserve() + " ");
			}
			System.out.println("-----------------------------------------");
			System.out.println();

			rs.close();
			stmt.close();

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
		System.out.println("");

		return listeAllSpectateur;
	}
	
	


}
