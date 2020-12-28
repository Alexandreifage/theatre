package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Personne.Comedien;
import Personne.MetteurEnScene;

import spectacle.Spectacle;



public class GestionSpectacle {
	
	

		private static String URL_CONNECTION =

				"jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass";

		private static Connection connection;
		
		private static final GestionSpectacle db = new GestionSpectacle();

		private GestionSpectacle() {
			db.openConnection();
			System.out.println("Construction du db de GestionSpectacle au premier appel");
		}

		public static GestionSpectacle getDb() {
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
	
	public boolean createSpectacleProcedureSQL(Spectacle spectacle) {


		CallableStatement stmt = null;
		boolean resultat = false;
		if (spectacle == null) {
			return false;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
			//(String nomSpectacle, LocalDate date, String heure, String nomAuteur, MetteurEnScene metteurEnScene, ArrayList<Comedien> lstComedien)
			String sqlString = "{call addSpectacle (?, ?, ?, ?, ?, ?, ?, ?)}";
			stmt = connection.prepareCall(sqlString);
			stmt.setString(1, spectacle.getNomSpectacle());
			stmt.setString(2, spectacle.getDate());
			stmt.setString(3, spectacle.getComedien(0).getPrenom() + " " + spectacle.getComedien(0).getNom());
			stmt.setString(4, spectacle.getComedien(1).getPrenom() + " " + spectacle.getComedien(1).getNom());
			stmt.setString(5, spectacle.getComedien(2).getPrenom() + " " + spectacle.getComedien(2).getNom());
			stmt.setString(6, spectacle.getHeure());
			stmt.setString(7, spectacle.getNomAuteur());
			stmt.setString(8, spectacle.getMetteurEnScene().getPrenom() + " " + spectacle.getMetteurEnScene().getNom());
			

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
		System.out.println("Enregistrement du spectacle " + spectacle.getNomSpectacle() + " réussi dans SQL");

		return resultat;
	}
	
public List<Spectacle> retrieveSpectacleProcedureSQL() {
		
		// mise à zéro du résultat de la requête SQL
		ResultSet rs = null;
		// mise à zéro de la variable stmt qui appartient à la classe Statement qui permet d'exécuter des requêtes SQL
		Statement stmt = null;
		// Création de la liste
		List<Spectacle> listeSpectacle = new ArrayList<>();
		
		

		try {
			// procédure de connection
			Class.forName("com.mysql.cj.jdbc.Driver");// fixe
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
			// new stmt
			stmt = connection.createStatement();
			
			// dans la variable String sqlString on met le string : {call getAllInfirmiers ()}
			String sqlString = "{call getAllSpectacle ()}";
			// on exécute la requête stockée dans sqlString puis on enregistre le résultat 
			// (tous les infirmiers présents dans la base de données) dans rs
			rs = stmt.executeQuery(sqlString);

			System.out.println("-----------------------------------------");
			
			while (rs.next()) {		
				
				ArrayList<Comedien> lstComedien = new ArrayList<>();
				
				String[] tabActeur1 = rs.getString(4).split(" ");
				Comedien comedien1 = new Comedien(tabActeur1[0], tabActeur1[1]);
				lstComedien.add(comedien1);
				String[] tabActeur2 = rs.getString(5).split(" ");
				Comedien comedien2 = new Comedien(tabActeur2[0], tabActeur2[1]);
				lstComedien.add(comedien2);
				String[] tabActeur3 = rs.getString(6).split(" ");
				Comedien comedien3 = new Comedien(tabActeur3[0], tabActeur3[1]);
				lstComedien.add(comedien3);
				String[] tabMetteurEnScene = rs.getString(9).split(" ");
				MetteurEnScene metteurEnScene = new MetteurEnScene(tabMetteurEnScene[0], tabMetteurEnScene[1]);
				Spectacle spectacle = new Spectacle(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(7),
						rs.getString(8), metteurEnScene, lstComedien);
				listeSpectacle.add(spectacle);
				
				
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

		return listeSpectacle;
	}
	
	
	public void creerSpectacle() {
		//La Sirène aux Alouettes
		ArrayList<Spectacle> lstSpectacle1 = new ArrayList<Spectacle>();
		ArrayList<Comedien> lstComedien1 = new ArrayList<Comedien>();
		Comedien comedien1 = new Comedien("Josette", "Fonjallaz", 'f', "14/011/1993", "Rue des Merles 11 1202 Genève", "077 266 45 66", "jfonjallaz@gmail.com", lstSpectacle1, 177);
		Comedien comedien2 = new Comedien("Georges", "Aebi", 'm', "31/06/1952", "Rue du Lavoir 54 1203 Genève", "077 987 45 47", "gaebi@gmail.com", lstSpectacle1, 157);
		Comedien comedien3 = new Comedien("Nadine", "Badan", 'f', "04/05/2000", "Rue des Carpes 35 1205 Genève", "077 356 67 56", "nbadan@gmail.com", lstSpectacle1, 177);
		lstComedien1.add(comedien1);
		lstComedien1.add(comedien2);
		lstComedien1.add(comedien3);		
		MetteurEnScene metteurEnScene1 = new MetteurEnScene("Georges", "Mendez", 'm', "13/05/1994", "Rue des Noisetiers 5 1004 Lausanne", "077 447 44 66", "gmendez@gmail.com", lstSpectacle1);		
		Spectacle spectacle1 = new Spectacle("La Sirène aux Alouettes", "12.02.2021", "20h30", "DALLE Irina", metteurEnScene1, lstComedien1);
		createSpectacleProcedureSQL(spectacle1);
		
		//Huis clos
		ArrayList<Spectacle> lstSpectacle2 = new ArrayList<Spectacle>();
		ArrayList<Comedien> lstComedien2 = new ArrayList<Comedien>();
		Comedien comedien4 = new Comedien("Alexandre", "Saudan", 'm', "15/12/1972", "Boulevard Carl-Vogt 5 1207 Genève", "078 345 64 65", "asaudan@gmail.com", lstSpectacle2, 156);
		Comedien comedien5 = new Comedien("Nathalie", "Vonlanthen", 'f', "25/06/1978", "Impasse des Martyrs 72 1215 Genève", "077 098 54 65", "nvonlanthent@gmail.com", lstSpectacle2, 190);
		Comedien comedien6 = new Comedien("Juliette", "Pasquier", 'f', "28/09/1985", "Rue Branly 93 1205 Genève", "078 735 76 34", "jpasquier@gmail.com", lstSpectacle2, 176);
		lstComedien2.add(comedien4);
		lstComedien2.add(comedien5);
		lstComedien2.add(comedien6);
		MetteurEnScene metteurEnScene2 = new MetteurEnScene("Igor", "Stenkov", 'm', "05/05/1967", "Rue du Lavoir 17 1205 Genève", "079 777 16 76", "istenkov@gmail.com", lstSpectacle1);
		Spectacle spectacle2 = new Spectacle("Huis clos", "05.03.2021", "20h30", "Jean-Paul Sartre", metteurEnScene2, lstComedien2);
		createSpectacleProcedureSQL(spectacle2);
		
		//Perdues dans Stockholm
		ArrayList<Spectacle> lstSpectacle3 = new ArrayList<Spectacle>();
		ArrayList<Comedien> lstComedien3 = new ArrayList<Comedien>();
		Comedien comedien7 = new Comedien("Salomé", "Vonlanthen", 'f', "19/06/1983", "Rue Georges Mettral 6 1206 Genève", "079 635 32 88", "svonlanthen@gmail.com", lstSpectacle3, 182);
		Comedien comedien8 = new Comedien("Sandrine", "Barillon", 'f', "24/03/1992", "Boulevard des Cluses 76 1207 Genève", "079 735 32 67", "sbarillon@gmail.com", lstSpectacle3, 186);
		Comedien comedien9 = new Comedien("Rafaël", "Maillard", 'm', "12/07/1975", "Rue Albin-Michel 98 1204 Genève", "079 46 34 45", "rmaillard@gmail.com", lstSpectacle3, 192);
		lstComedien3.add(comedien7);
		lstComedien3.add(comedien8);
		lstComedien3.add(comedien9);
		MetteurEnScene metteurEnScene3 = new MetteurEnScene("Jeanne", "Wütrich", 'f', "23/11/1984", "Rue Dalfon 6 1004 Lausanne", "078 445 56 78", "jwutrich@gmail.com", lstSpectacle1);
		Spectacle spectacle3 = new Spectacle("Perdues dans Stockholm", "12.03.2021", "20h30", "NOTTE Pierre", metteurEnScene3, lstComedien3);
		createSpectacleProcedureSQL(spectacle3);

	}
	
	

}
