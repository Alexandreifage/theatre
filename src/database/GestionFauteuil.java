package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Personne.Comedien;
import Personne.MetteurEnScene;
import fauteuil.Fauteuil;
import spectacle.Spectacle;

public class GestionFauteuil {
	
	// Création de la liste
	public List<Fauteuil> listeAllFauteuil = new ArrayList<>();
	
	private static String URL_CONNECTION =

			"jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass";

	private static Connection connection;
	
	private static final GestionFauteuil db = new GestionFauteuil();

	private GestionFauteuil() {
		db.openConnection();
		System.out.println("Construction du db de GestionSpectacle au premier appel");
	}

	public static GestionFauteuil getDb() {
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
	
	
	
public List<Fauteuil> retrieveAllFauteuilProcedureSQL() {
		
		// mise à zéro du résultat de la requête SQL
		ResultSet rs = null;
		// mise à zéro de la variable stmt qui appartient à la classe Statement qui permet d'exécuter des requêtes SQL
		Statement stmt = null;
		
		
		

		try {
			// procédure de connection
			Class.forName("com.mysql.cj.jdbc.Driver");// fixe
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
			// new stmt
			stmt = connection.createStatement();
			
			// dans la variable String sqlString on met le string : {call getAllInfirmiers ()}
			String sqlString = "{call getAllFauteuil ()}";
			// on exécute la requête stockée dans sqlString puis on enregistre le résultat 
			// (tous les infirmiers présents dans la base de données) dans rs
			rs = stmt.executeQuery(sqlString);

			System.out.println("méthode retrieveAllFauteuilProcedureSQL() de la classe GestionFauteuil");
			
			while (rs.next()) {		

				String numeroFauteuil = rs.getString(2);
				String nomSpectacle = rs.getString(3);
				String date = rs.getString(4);
				String prenom = rs.getString(5);
				String nom = rs.getString(6);
				boolean statut = convertTinyintIntoBollean(rs.getInt(7));
				Fauteuil fauteuil = new Fauteuil(numeroFauteuil, nomSpectacle, date, prenom, nom, statut);
				listeAllFauteuil.add(fauteuil);

			}
			
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
		
		return listeAllFauteuil;
	}

public  void creationSiegeTest1() {
	/*
	Fauteuil fauteuilA01 = new Fauteuil( "A01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	createFauteuilProcedureSQL(fauteuilA01);
	Fauteuil fauteuilA02 = new Fauteuil( "A02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	createFauteuilProcedureSQL(fauteuilA02);
	Fauteuil fauteuilA03 = new Fauteuil( "A03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	createFauteuilProcedureSQL(fauteuilA03);
	
	Fauteuil fauteuilA01 = new Fauteuil( "A01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA02 = new Fauteuil( "A02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA03 = new Fauteuil( "A03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	*/
	Fauteuil fauteuilA04 = new Fauteuil( "A04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA05 = new Fauteuil( "A05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA06 = new Fauteuil( "A06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA07 = new Fauteuil( "A07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA08 = new Fauteuil( "A08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA09 = new Fauteuil( "A09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilA10 = new Fauteuil( "A10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB01 = new Fauteuil( "B01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB02 = new Fauteuil( "B02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB03 = new Fauteuil( "B03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB04 = new Fauteuil( "B04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB05 = new Fauteuil( "B05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB06 = new Fauteuil( "B06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB07 = new Fauteuil( "B07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB08 = new Fauteuil( "B08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB09 = new Fauteuil( "B09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilB10 = new Fauteuil( "B10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC01 = new Fauteuil( "C01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC02 = new Fauteuil( "C02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC03 = new Fauteuil( "C03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC04 = new Fauteuil( "C04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC05 = new Fauteuil( "C05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC06 = new Fauteuil( "C06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC07 = new Fauteuil( "C07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC08 = new Fauteuil( "C08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC09 = new Fauteuil( "C09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilC10 = new Fauteuil( "C10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD01 = new Fauteuil( "D01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD02 = new Fauteuil( "D02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD03 = new Fauteuil( "D03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD04 = new Fauteuil( "D04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD05 = new Fauteuil( "D05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD06 = new Fauteuil( "D06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD07 = new Fauteuil( "D07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD08 = new Fauteuil( "D08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD09 = new Fauteuil( "D09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilD10 = new Fauteuil( "D10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE01 = new Fauteuil( "E01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE02 = new Fauteuil( "E02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE03 = new Fauteuil( "E03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE04 = new Fauteuil( "E04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE05 = new Fauteuil( "E05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE06 = new Fauteuil( "E06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE07 = new Fauteuil( "E07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE08 = new Fauteuil( "E08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE09 = new Fauteuil( "E09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilE10 = new Fauteuil( "E10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF01 = new Fauteuil( "F01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF02 = new Fauteuil( "F02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF03 = new Fauteuil( "F03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF04 = new Fauteuil( "F04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF05 = new Fauteuil( "F05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF06 = new Fauteuil( "F06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF07 = new Fauteuil( "F07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF08 = new Fauteuil( "F08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF09 = new Fauteuil( "F09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilF10 = new Fauteuil( "F10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG01 = new Fauteuil( "G01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG02 = new Fauteuil( "G02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG03 = new Fauteuil( "G03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG04 = new Fauteuil( "G04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG05 = new Fauteuil( "G05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG06 = new Fauteuil( "G06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG07 = new Fauteuil( "G07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG08 = new Fauteuil( "G08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG09 = new Fauteuil( "G09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilG10 = new Fauteuil( "G10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH01 = new Fauteuil( "H01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH02 = new Fauteuil( "H02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH03 = new Fauteuil( "H03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH04 = new Fauteuil( "H04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH05 = new Fauteuil( "H05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH06 = new Fauteuil( "H06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH07 = new Fauteuil( "H07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH08 = new Fauteuil( "H08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH09 = new Fauteuil( "H09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilH10 = new Fauteuil( "H10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI01 = new Fauteuil( "I01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI02 = new Fauteuil( "I02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI03 = new Fauteuil( "I03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI04 = new Fauteuil( "I04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI05 = new Fauteuil( "I05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI06 = new Fauteuil( "I06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI07 = new Fauteuil( "I07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI08 = new Fauteuil( "I08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI09 = new Fauteuil( "I09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilI10 = new Fauteuil( "I10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ01 = new Fauteuil( "J01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ02 = new Fauteuil( "J02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ03 = new Fauteuil( "J03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ04 = new Fauteuil( "J04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ05 = new Fauteuil( "J05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ06 = new Fauteuil( "J06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ07 = new Fauteuil( "J07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ08 = new Fauteuil( "J08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ09 = new Fauteuil( "J09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilJ10 = new Fauteuil( "J10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK01 = new Fauteuil( "K01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK02 = new Fauteuil( "K02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK03 = new Fauteuil( "K03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK04 = new Fauteuil( "K04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK05 = new Fauteuil( "K05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK06 = new Fauteuil( "K06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK07 = new Fauteuil( "K07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK08 = new Fauteuil( "K08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK09 = new Fauteuil( "K09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilK10 = new Fauteuil( "K10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL01 = new Fauteuil( "L01", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL02 = new Fauteuil( "L02", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL03 = new Fauteuil( "L03", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL04 = new Fauteuil( "L04", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL05 = new Fauteuil( "L05", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL06 = new Fauteuil( "L06", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL07 = new Fauteuil( "L07", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL08 = new Fauteuil( "L08", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL09 = new Fauteuil( "L09", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	Fauteuil fauteuilL10 = new Fauteuil( "L10", "La Sirène aux Alouettes", "12.02.2021", null, null, true);
	//createFauteuilProcedureSQL(fauteuilA01);
	//createFauteuilProcedureSQL(fauteuilA02);
	//createFauteuilProcedureSQL(fauteuilA03);
	createFauteuilProcedureSQL(fauteuilA04);
	createFauteuilProcedureSQL(fauteuilA05);
	createFauteuilProcedureSQL(fauteuilA06);
	createFauteuilProcedureSQL(fauteuilA07);
	createFauteuilProcedureSQL(fauteuilA08);
	createFauteuilProcedureSQL(fauteuilA09);
	createFauteuilProcedureSQL(fauteuilA10);
	createFauteuilProcedureSQL(fauteuilB01);
	createFauteuilProcedureSQL(fauteuilB02);
	createFauteuilProcedureSQL(fauteuilB03);
	createFauteuilProcedureSQL(fauteuilB04);
	createFauteuilProcedureSQL(fauteuilB05);
	createFauteuilProcedureSQL(fauteuilB06);
	createFauteuilProcedureSQL(fauteuilB07);
	createFauteuilProcedureSQL(fauteuilB08);
	createFauteuilProcedureSQL(fauteuilB09);
	createFauteuilProcedureSQL(fauteuilB10);
	createFauteuilProcedureSQL(fauteuilC01);
	createFauteuilProcedureSQL(fauteuilC02);
	createFauteuilProcedureSQL(fauteuilC03);
	createFauteuilProcedureSQL(fauteuilC04);
	createFauteuilProcedureSQL(fauteuilC05);
	createFauteuilProcedureSQL(fauteuilC06);
	createFauteuilProcedureSQL(fauteuilC07);
	createFauteuilProcedureSQL(fauteuilC08);
	createFauteuilProcedureSQL(fauteuilC09);
	createFauteuilProcedureSQL(fauteuilC10);
	createFauteuilProcedureSQL(fauteuilD01);
	createFauteuilProcedureSQL(fauteuilD02);
	createFauteuilProcedureSQL(fauteuilD03);
	createFauteuilProcedureSQL(fauteuilD04);
	createFauteuilProcedureSQL(fauteuilD05);
	createFauteuilProcedureSQL(fauteuilD06);
	createFauteuilProcedureSQL(fauteuilD07);
	createFauteuilProcedureSQL(fauteuilD08);
	createFauteuilProcedureSQL(fauteuilD09);
	createFauteuilProcedureSQL(fauteuilD10);
	createFauteuilProcedureSQL(fauteuilE01);
	createFauteuilProcedureSQL(fauteuilE02);
	createFauteuilProcedureSQL(fauteuilE03);
	createFauteuilProcedureSQL(fauteuilE04);
	createFauteuilProcedureSQL(fauteuilE05);
	createFauteuilProcedureSQL(fauteuilE06);
	createFauteuilProcedureSQL(fauteuilE07);
	createFauteuilProcedureSQL(fauteuilE08);
	createFauteuilProcedureSQL(fauteuilE09);
	createFauteuilProcedureSQL(fauteuilE10);
	createFauteuilProcedureSQL(fauteuilF01);
	createFauteuilProcedureSQL(fauteuilF02);
	createFauteuilProcedureSQL(fauteuilF03);
	createFauteuilProcedureSQL(fauteuilF04);
	createFauteuilProcedureSQL(fauteuilF05);
	createFauteuilProcedureSQL(fauteuilF06);
	createFauteuilProcedureSQL(fauteuilF07);
	createFauteuilProcedureSQL(fauteuilF08);
	createFauteuilProcedureSQL(fauteuilF09);
	createFauteuilProcedureSQL(fauteuilF10);
	createFauteuilProcedureSQL(fauteuilG01);
	createFauteuilProcedureSQL(fauteuilG02);
	createFauteuilProcedureSQL(fauteuilG03);
	createFauteuilProcedureSQL(fauteuilG04);
	createFauteuilProcedureSQL(fauteuilG05);
	createFauteuilProcedureSQL(fauteuilG06);
	createFauteuilProcedureSQL(fauteuilG07);
	createFauteuilProcedureSQL(fauteuilG08);
	createFauteuilProcedureSQL(fauteuilG09);
	createFauteuilProcedureSQL(fauteuilG10);
	createFauteuilProcedureSQL(fauteuilH01);
	createFauteuilProcedureSQL(fauteuilH02);
	createFauteuilProcedureSQL(fauteuilH03);
	createFauteuilProcedureSQL(fauteuilH04);
	createFauteuilProcedureSQL(fauteuilH05);
	createFauteuilProcedureSQL(fauteuilH06);
	createFauteuilProcedureSQL(fauteuilH07);
	createFauteuilProcedureSQL(fauteuilH08);
	createFauteuilProcedureSQL(fauteuilH09);
	createFauteuilProcedureSQL(fauteuilH10);
	createFauteuilProcedureSQL(fauteuilI01);
	createFauteuilProcedureSQL(fauteuilI02);
	createFauteuilProcedureSQL(fauteuilI03);
	createFauteuilProcedureSQL(fauteuilI04);
	createFauteuilProcedureSQL(fauteuilI05);
	createFauteuilProcedureSQL(fauteuilI06);
	createFauteuilProcedureSQL(fauteuilI07);
	createFauteuilProcedureSQL(fauteuilI08);
	createFauteuilProcedureSQL(fauteuilI09);
	createFauteuilProcedureSQL(fauteuilI10);
	createFauteuilProcedureSQL(fauteuilJ01);
	createFauteuilProcedureSQL(fauteuilJ02);
	createFauteuilProcedureSQL(fauteuilJ03);
	createFauteuilProcedureSQL(fauteuilJ04);
	createFauteuilProcedureSQL(fauteuilJ05);
	createFauteuilProcedureSQL(fauteuilJ06);
	createFauteuilProcedureSQL(fauteuilJ07);
	createFauteuilProcedureSQL(fauteuilJ08);
	createFauteuilProcedureSQL(fauteuilJ09);
	createFauteuilProcedureSQL(fauteuilJ10);
	createFauteuilProcedureSQL(fauteuilK01);
	createFauteuilProcedureSQL(fauteuilK02);
	createFauteuilProcedureSQL(fauteuilK03);
	createFauteuilProcedureSQL(fauteuilK04);
	createFauteuilProcedureSQL(fauteuilK05);
	createFauteuilProcedureSQL(fauteuilK06);
	createFauteuilProcedureSQL(fauteuilK07);
	createFauteuilProcedureSQL(fauteuilK08);
	createFauteuilProcedureSQL(fauteuilK09);
	createFauteuilProcedureSQL(fauteuilK10);
	createFauteuilProcedureSQL(fauteuilL01);
	createFauteuilProcedureSQL(fauteuilL02);
	createFauteuilProcedureSQL(fauteuilL03);
	createFauteuilProcedureSQL(fauteuilL04);
	createFauteuilProcedureSQL(fauteuilL05);
	createFauteuilProcedureSQL(fauteuilL06);
	createFauteuilProcedureSQL(fauteuilL07);
	createFauteuilProcedureSQL(fauteuilL08);
	createFauteuilProcedureSQL(fauteuilL09);
	createFauteuilProcedureSQL(fauteuilL10);
}

public void creationSiegeTest2() {
	Fauteuil fauteuilA01 = new Fauteuil( "A01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA02 = new Fauteuil( "A02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA03 = new Fauteuil( "A03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA04 = new Fauteuil( "A04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA05 = new Fauteuil( "A05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA06 = new Fauteuil( "A06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA07 = new Fauteuil( "A07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA08 = new Fauteuil( "A08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA09 = new Fauteuil( "A09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilA10 = new Fauteuil( "A10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB01 = new Fauteuil( "B01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB02 = new Fauteuil( "B02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB03 = new Fauteuil( "B03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB04 = new Fauteuil( "B04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB05 = new Fauteuil( "B05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB06 = new Fauteuil( "B06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB07 = new Fauteuil( "B07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB08 = new Fauteuil( "B08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB09 = new Fauteuil( "B09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilB10 = new Fauteuil( "B10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC01 = new Fauteuil( "C01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC02 = new Fauteuil( "C02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC03 = new Fauteuil( "C03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC04 = new Fauteuil( "C04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC05 = new Fauteuil( "C05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC06 = new Fauteuil( "C06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC07 = new Fauteuil( "C07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC08 = new Fauteuil( "C08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC09 = new Fauteuil( "C09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilC10 = new Fauteuil( "C10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD01 = new Fauteuil( "D01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD02 = new Fauteuil( "D02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD03 = new Fauteuil( "D03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD04 = new Fauteuil( "D04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD05 = new Fauteuil( "D05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD06 = new Fauteuil( "D06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD07 = new Fauteuil( "D07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD08 = new Fauteuil( "D08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD09 = new Fauteuil( "D09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilD10 = new Fauteuil( "D10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE01 = new Fauteuil( "E01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE02 = new Fauteuil( "E02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE03 = new Fauteuil( "E03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE04 = new Fauteuil( "E04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE05 = new Fauteuil( "E05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE06 = new Fauteuil( "E06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE07 = new Fauteuil( "E07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE08 = new Fauteuil( "E08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE09 = new Fauteuil( "E09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilE10 = new Fauteuil( "E10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF01 = new Fauteuil( "F01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF02 = new Fauteuil( "F02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF03 = new Fauteuil( "F03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF04 = new Fauteuil( "F04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF05 = new Fauteuil( "F05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF06 = new Fauteuil( "F06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF07 = new Fauteuil( "F07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF08 = new Fauteuil( "F08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF09 = new Fauteuil( "F09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilF10 = new Fauteuil( "F10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG01 = new Fauteuil( "G01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG02 = new Fauteuil( "G02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG03 = new Fauteuil( "G03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG04 = new Fauteuil( "G04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG05 = new Fauteuil( "G05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG06 = new Fauteuil( "G06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG07 = new Fauteuil( "G07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG08 = new Fauteuil( "G08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG09 = new Fauteuil( "G09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilG10 = new Fauteuil( "G10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH01 = new Fauteuil( "H01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH02 = new Fauteuil( "H02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH03 = new Fauteuil( "H03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH04 = new Fauteuil( "H04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH05 = new Fauteuil( "H05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH06 = new Fauteuil( "H06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH07 = new Fauteuil( "H07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH08 = new Fauteuil( "H08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH09 = new Fauteuil( "H09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilH10 = new Fauteuil( "H10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI01 = new Fauteuil( "I01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI02 = new Fauteuil( "I02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI03 = new Fauteuil( "I03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI04 = new Fauteuil( "I04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI05 = new Fauteuil( "I05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI06 = new Fauteuil( "I06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI07 = new Fauteuil( "I07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI08 = new Fauteuil( "I08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI09 = new Fauteuil( "I09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilI10 = new Fauteuil( "I10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ01 = new Fauteuil( "J01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ02 = new Fauteuil( "J02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ03 = new Fauteuil( "J03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ04 = new Fauteuil( "J04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ05 = new Fauteuil( "J05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ06 = new Fauteuil( "J06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ07 = new Fauteuil( "J07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ08 = new Fauteuil( "J08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ09 = new Fauteuil( "J09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilJ10 = new Fauteuil( "J10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK01 = new Fauteuil( "K01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK02 = new Fauteuil( "K02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK03 = new Fauteuil( "K03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK04 = new Fauteuil( "K04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK05 = new Fauteuil( "K05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK06 = new Fauteuil( "K06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK07 = new Fauteuil( "K07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK08 = new Fauteuil( "K08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK09 = new Fauteuil( "K09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilK10 = new Fauteuil( "K10", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL01 = new Fauteuil( "L01", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL02 = new Fauteuil( "L02", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL03 = new Fauteuil( "L03", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL04 = new Fauteuil( "L04", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL05 = new Fauteuil( "L05", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL06 = new Fauteuil( "L06", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL07 = new Fauteuil( "L07", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL08 = new Fauteuil( "L08", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL09 = new Fauteuil( "L09", "Huis clos", "05.03.2021", null, null, true);
	Fauteuil fauteuilL10 = new Fauteuil( "L10", "Huis clos", "05.03.2021", null, null, true);
	createFauteuilProcedureSQL(fauteuilA01);
	createFauteuilProcedureSQL(fauteuilA02);
	createFauteuilProcedureSQL(fauteuilA03);
	createFauteuilProcedureSQL(fauteuilA04);
	createFauteuilProcedureSQL(fauteuilA05);
	createFauteuilProcedureSQL(fauteuilA06);
	createFauteuilProcedureSQL(fauteuilA07);
	createFauteuilProcedureSQL(fauteuilA08);
	createFauteuilProcedureSQL(fauteuilA09);
	createFauteuilProcedureSQL(fauteuilA10);
	createFauteuilProcedureSQL(fauteuilB01);
	createFauteuilProcedureSQL(fauteuilB02);
	createFauteuilProcedureSQL(fauteuilB03);
	createFauteuilProcedureSQL(fauteuilB04);
	createFauteuilProcedureSQL(fauteuilB05);
	createFauteuilProcedureSQL(fauteuilB06);
	createFauteuilProcedureSQL(fauteuilB07);
	createFauteuilProcedureSQL(fauteuilB08);
	createFauteuilProcedureSQL(fauteuilB09);
	createFauteuilProcedureSQL(fauteuilB10);
	createFauteuilProcedureSQL(fauteuilC01);
	createFauteuilProcedureSQL(fauteuilC02);
	createFauteuilProcedureSQL(fauteuilC03);
	createFauteuilProcedureSQL(fauteuilC04);
	createFauteuilProcedureSQL(fauteuilC05);
	createFauteuilProcedureSQL(fauteuilC06);
	createFauteuilProcedureSQL(fauteuilC07);
	createFauteuilProcedureSQL(fauteuilC08);
	createFauteuilProcedureSQL(fauteuilC09);
	createFauteuilProcedureSQL(fauteuilC10);
	createFauteuilProcedureSQL(fauteuilD01);
	createFauteuilProcedureSQL(fauteuilD02);
	createFauteuilProcedureSQL(fauteuilD03);
	createFauteuilProcedureSQL(fauteuilD04);
	createFauteuilProcedureSQL(fauteuilD05);
	createFauteuilProcedureSQL(fauteuilD06);
	createFauteuilProcedureSQL(fauteuilD07);
	createFauteuilProcedureSQL(fauteuilD08);
	createFauteuilProcedureSQL(fauteuilD09);
	createFauteuilProcedureSQL(fauteuilD10);
	createFauteuilProcedureSQL(fauteuilE01);
	createFauteuilProcedureSQL(fauteuilE02);
	createFauteuilProcedureSQL(fauteuilE03);
	createFauteuilProcedureSQL(fauteuilE04);
	createFauteuilProcedureSQL(fauteuilE05);
	createFauteuilProcedureSQL(fauteuilE06);
	createFauteuilProcedureSQL(fauteuilE07);
	createFauteuilProcedureSQL(fauteuilE08);
	createFauteuilProcedureSQL(fauteuilE09);
	createFauteuilProcedureSQL(fauteuilE10);
	createFauteuilProcedureSQL(fauteuilF01);
	createFauteuilProcedureSQL(fauteuilF02);
	createFauteuilProcedureSQL(fauteuilF03);
	createFauteuilProcedureSQL(fauteuilF04);
	createFauteuilProcedureSQL(fauteuilF05);
	createFauteuilProcedureSQL(fauteuilF06);
	createFauteuilProcedureSQL(fauteuilF07);
	createFauteuilProcedureSQL(fauteuilF08);
	createFauteuilProcedureSQL(fauteuilF09);
	createFauteuilProcedureSQL(fauteuilF10);
	createFauteuilProcedureSQL(fauteuilG01);
	createFauteuilProcedureSQL(fauteuilG02);
	createFauteuilProcedureSQL(fauteuilG03);
	createFauteuilProcedureSQL(fauteuilG04);
	createFauteuilProcedureSQL(fauteuilG05);
	createFauteuilProcedureSQL(fauteuilG06);
	createFauteuilProcedureSQL(fauteuilG07);
	createFauteuilProcedureSQL(fauteuilG08);
	createFauteuilProcedureSQL(fauteuilG09);
	createFauteuilProcedureSQL(fauteuilG10);
	createFauteuilProcedureSQL(fauteuilH01);
	createFauteuilProcedureSQL(fauteuilH02);
	createFauteuilProcedureSQL(fauteuilH03);
	createFauteuilProcedureSQL(fauteuilH04);
	createFauteuilProcedureSQL(fauteuilH05);
	createFauteuilProcedureSQL(fauteuilH06);
	createFauteuilProcedureSQL(fauteuilH07);
	createFauteuilProcedureSQL(fauteuilH08);
	createFauteuilProcedureSQL(fauteuilH09);
	createFauteuilProcedureSQL(fauteuilH10);
	createFauteuilProcedureSQL(fauteuilI01);
	createFauteuilProcedureSQL(fauteuilI02);
	createFauteuilProcedureSQL(fauteuilI03);
	createFauteuilProcedureSQL(fauteuilI04);
	createFauteuilProcedureSQL(fauteuilI05);
	createFauteuilProcedureSQL(fauteuilI06);
	createFauteuilProcedureSQL(fauteuilI07);
	createFauteuilProcedureSQL(fauteuilI08);
	createFauteuilProcedureSQL(fauteuilI09);
	createFauteuilProcedureSQL(fauteuilI10);
	createFauteuilProcedureSQL(fauteuilJ01);
	createFauteuilProcedureSQL(fauteuilJ02);
	createFauteuilProcedureSQL(fauteuilJ03);
	createFauteuilProcedureSQL(fauteuilJ04);
	createFauteuilProcedureSQL(fauteuilJ05);
	createFauteuilProcedureSQL(fauteuilJ06);
	createFauteuilProcedureSQL(fauteuilJ07);
	createFauteuilProcedureSQL(fauteuilJ08);
	createFauteuilProcedureSQL(fauteuilJ09);
	createFauteuilProcedureSQL(fauteuilJ10);
	createFauteuilProcedureSQL(fauteuilK01);
	createFauteuilProcedureSQL(fauteuilK02);
	createFauteuilProcedureSQL(fauteuilK03);
	createFauteuilProcedureSQL(fauteuilK04);
	createFauteuilProcedureSQL(fauteuilK05);
	createFauteuilProcedureSQL(fauteuilK06);
	createFauteuilProcedureSQL(fauteuilK07);
	createFauteuilProcedureSQL(fauteuilK08);
	createFauteuilProcedureSQL(fauteuilK09);
	createFauteuilProcedureSQL(fauteuilK10);
	createFauteuilProcedureSQL(fauteuilL01);
	createFauteuilProcedureSQL(fauteuilL02);
	createFauteuilProcedureSQL(fauteuilL03);
	createFauteuilProcedureSQL(fauteuilL04);
	createFauteuilProcedureSQL(fauteuilL05);
	createFauteuilProcedureSQL(fauteuilL06);
	createFauteuilProcedureSQL(fauteuilL07);
	createFauteuilProcedureSQL(fauteuilL08);
	createFauteuilProcedureSQL(fauteuilL09);
	createFauteuilProcedureSQL(fauteuilL10);
}

public  void creationSiegeTest3() {
	Fauteuil fauteuilA01 = new Fauteuil( "A01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA02 = new Fauteuil( "A02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA03 = new Fauteuil( "A03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA04 = new Fauteuil( "A04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA05 = new Fauteuil( "A05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA06 = new Fauteuil( "A06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA07 = new Fauteuil( "A07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA08 = new Fauteuil( "A08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA09 = new Fauteuil( "A09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilA10 = new Fauteuil( "A10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB01 = new Fauteuil( "B01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB02 = new Fauteuil( "B02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB03 = new Fauteuil( "B03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB04 = new Fauteuil( "B04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB05 = new Fauteuil( "B05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB06 = new Fauteuil( "B06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB07 = new Fauteuil( "B07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB08 = new Fauteuil( "B08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB09 = new Fauteuil( "B09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilB10 = new Fauteuil( "B10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC01 = new Fauteuil( "C01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC02 = new Fauteuil( "C02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC03 = new Fauteuil( "C03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC04 = new Fauteuil( "C04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC05 = new Fauteuil( "C05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC06 = new Fauteuil( "C06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC07 = new Fauteuil( "C07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC08 = new Fauteuil( "C08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC09 = new Fauteuil( "C09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilC10 = new Fauteuil( "C10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD01 = new Fauteuil( "D01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD02 = new Fauteuil( "D02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD03 = new Fauteuil( "D03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD04 = new Fauteuil( "D04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD05 = new Fauteuil( "D05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD06 = new Fauteuil( "D06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD07 = new Fauteuil( "D07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD08 = new Fauteuil( "D08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD09 = new Fauteuil( "D09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilD10 = new Fauteuil( "D10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE01 = new Fauteuil( "E01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE02 = new Fauteuil( "E02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE03 = new Fauteuil( "E03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE04 = new Fauteuil( "E04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE05 = new Fauteuil( "E05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE06 = new Fauteuil( "E06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE07 = new Fauteuil( "E07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE08 = new Fauteuil( "E08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE09 = new Fauteuil( "E09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilE10 = new Fauteuil( "E10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF01 = new Fauteuil( "F01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF02 = new Fauteuil( "F02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF03 = new Fauteuil( "F03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF04 = new Fauteuil( "F04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF05 = new Fauteuil( "F05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF06 = new Fauteuil( "F06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF07 = new Fauteuil( "F07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF08 = new Fauteuil( "F08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF09 = new Fauteuil( "F09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilF10 = new Fauteuil( "F10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG01 = new Fauteuil( "G01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG02 = new Fauteuil( "G02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG03 = new Fauteuil( "G03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG04 = new Fauteuil( "G04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG05 = new Fauteuil( "G05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG06 = new Fauteuil( "G06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG07 = new Fauteuil( "G07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG08 = new Fauteuil( "G08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG09 = new Fauteuil( "G09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilG10 = new Fauteuil( "G10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH01 = new Fauteuil( "H01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH02 = new Fauteuil( "H02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH03 = new Fauteuil( "H03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH04 = new Fauteuil( "H04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH05 = new Fauteuil( "H05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH06 = new Fauteuil( "H06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH07 = new Fauteuil( "H07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH08 = new Fauteuil( "H08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH09 = new Fauteuil( "H09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilH10 = new Fauteuil( "H10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI01 = new Fauteuil( "I01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI02 = new Fauteuil( "I02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI03 = new Fauteuil( "I03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI04 = new Fauteuil( "I04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI05 = new Fauteuil( "I05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI06 = new Fauteuil( "I06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI07 = new Fauteuil( "I07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI08 = new Fauteuil( "I08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI09 = new Fauteuil( "I09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilI10 = new Fauteuil( "I10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ01 = new Fauteuil( "J01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ02 = new Fauteuil( "J02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ03 = new Fauteuil( "J03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ04 = new Fauteuil( "J04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ05 = new Fauteuil( "J05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ06 = new Fauteuil( "J06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ07 = new Fauteuil( "J07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ08 = new Fauteuil( "J08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ09 = new Fauteuil( "J09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilJ10 = new Fauteuil( "J10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK01 = new Fauteuil( "K01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK02 = new Fauteuil( "K02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK03 = new Fauteuil( "K03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK04 = new Fauteuil( "K04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK05 = new Fauteuil( "K05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK06 = new Fauteuil( "K06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK07 = new Fauteuil( "K07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK08 = new Fauteuil( "K08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK09 = new Fauteuil( "K09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilK10 = new Fauteuil( "K10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL01 = new Fauteuil( "L01", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL02 = new Fauteuil( "L02", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL03 = new Fauteuil( "L03", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL04 = new Fauteuil( "L04", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL05 = new Fauteuil( "L05", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL06 = new Fauteuil( "L06", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL07 = new Fauteuil( "L07", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL08 = new Fauteuil( "L08", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL09 = new Fauteuil( "L09", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	Fauteuil fauteuilL10 = new Fauteuil( "L10", "Perdues dans Stockholm", "12.03.2021", null, null, true);
	createFauteuilProcedureSQL(fauteuilA01);
	createFauteuilProcedureSQL(fauteuilA02);
	createFauteuilProcedureSQL(fauteuilA03);
	createFauteuilProcedureSQL(fauteuilA04);
	createFauteuilProcedureSQL(fauteuilA05);
	createFauteuilProcedureSQL(fauteuilA06);
	createFauteuilProcedureSQL(fauteuilA07);
	createFauteuilProcedureSQL(fauteuilA08);
	createFauteuilProcedureSQL(fauteuilA09);
	createFauteuilProcedureSQL(fauteuilA10);
	createFauteuilProcedureSQL(fauteuilB01);
	createFauteuilProcedureSQL(fauteuilB02);
	createFauteuilProcedureSQL(fauteuilB03);
	createFauteuilProcedureSQL(fauteuilB04);
	createFauteuilProcedureSQL(fauteuilB05);
	createFauteuilProcedureSQL(fauteuilB06);
	createFauteuilProcedureSQL(fauteuilB07);
	createFauteuilProcedureSQL(fauteuilB08);
	createFauteuilProcedureSQL(fauteuilB09);
	createFauteuilProcedureSQL(fauteuilB10);
	createFauteuilProcedureSQL(fauteuilC01);
	createFauteuilProcedureSQL(fauteuilC02);
	createFauteuilProcedureSQL(fauteuilC03);
	createFauteuilProcedureSQL(fauteuilC04);
	createFauteuilProcedureSQL(fauteuilC05);
	createFauteuilProcedureSQL(fauteuilC06);
	createFauteuilProcedureSQL(fauteuilC07);
	createFauteuilProcedureSQL(fauteuilC08);
	createFauteuilProcedureSQL(fauteuilC09);
	createFauteuilProcedureSQL(fauteuilC10);
	createFauteuilProcedureSQL(fauteuilD01);
	createFauteuilProcedureSQL(fauteuilD02);
	createFauteuilProcedureSQL(fauteuilD03);
	createFauteuilProcedureSQL(fauteuilD04);
	createFauteuilProcedureSQL(fauteuilD05);
	createFauteuilProcedureSQL(fauteuilD06);
	createFauteuilProcedureSQL(fauteuilD07);
	createFauteuilProcedureSQL(fauteuilD08);
	createFauteuilProcedureSQL(fauteuilD09);
	createFauteuilProcedureSQL(fauteuilD10);
	createFauteuilProcedureSQL(fauteuilE01);
	createFauteuilProcedureSQL(fauteuilE02);
	createFauteuilProcedureSQL(fauteuilE03);
	createFauteuilProcedureSQL(fauteuilE04);
	createFauteuilProcedureSQL(fauteuilE05);
	createFauteuilProcedureSQL(fauteuilE06);
	createFauteuilProcedureSQL(fauteuilE07);
	createFauteuilProcedureSQL(fauteuilE08);
	createFauteuilProcedureSQL(fauteuilE09);
	createFauteuilProcedureSQL(fauteuilE10);
	createFauteuilProcedureSQL(fauteuilF01);
	createFauteuilProcedureSQL(fauteuilF02);
	createFauteuilProcedureSQL(fauteuilF03);
	createFauteuilProcedureSQL(fauteuilF04);
	createFauteuilProcedureSQL(fauteuilF05);
	createFauteuilProcedureSQL(fauteuilF06);
	createFauteuilProcedureSQL(fauteuilF07);
	createFauteuilProcedureSQL(fauteuilF08);
	createFauteuilProcedureSQL(fauteuilF09);
	createFauteuilProcedureSQL(fauteuilF10);
	createFauteuilProcedureSQL(fauteuilG01);
	createFauteuilProcedureSQL(fauteuilG02);
	createFauteuilProcedureSQL(fauteuilG03);
	createFauteuilProcedureSQL(fauteuilG04);
	createFauteuilProcedureSQL(fauteuilG05);
	createFauteuilProcedureSQL(fauteuilG06);
	createFauteuilProcedureSQL(fauteuilG07);
	createFauteuilProcedureSQL(fauteuilG08);
	createFauteuilProcedureSQL(fauteuilG09);
	createFauteuilProcedureSQL(fauteuilG10);
	createFauteuilProcedureSQL(fauteuilH01);
	createFauteuilProcedureSQL(fauteuilH02);
	createFauteuilProcedureSQL(fauteuilH03);
	createFauteuilProcedureSQL(fauteuilH04);
	createFauteuilProcedureSQL(fauteuilH05);
	createFauteuilProcedureSQL(fauteuilH06);
	createFauteuilProcedureSQL(fauteuilH07);
	createFauteuilProcedureSQL(fauteuilH08);
	createFauteuilProcedureSQL(fauteuilH09);
	createFauteuilProcedureSQL(fauteuilH10);
	createFauteuilProcedureSQL(fauteuilI01);
	createFauteuilProcedureSQL(fauteuilI02);
	createFauteuilProcedureSQL(fauteuilI03);
	createFauteuilProcedureSQL(fauteuilI04);
	createFauteuilProcedureSQL(fauteuilI05);
	createFauteuilProcedureSQL(fauteuilI06);
	createFauteuilProcedureSQL(fauteuilI07);
	createFauteuilProcedureSQL(fauteuilI08);
	createFauteuilProcedureSQL(fauteuilI09);
	createFauteuilProcedureSQL(fauteuilI10);
	createFauteuilProcedureSQL(fauteuilJ01);
	createFauteuilProcedureSQL(fauteuilJ02);
	createFauteuilProcedureSQL(fauteuilJ03);
	createFauteuilProcedureSQL(fauteuilJ04);
	createFauteuilProcedureSQL(fauteuilJ05);
	createFauteuilProcedureSQL(fauteuilJ06);
	createFauteuilProcedureSQL(fauteuilJ07);
	createFauteuilProcedureSQL(fauteuilJ08);
	createFauteuilProcedureSQL(fauteuilJ09);
	createFauteuilProcedureSQL(fauteuilJ10);
	createFauteuilProcedureSQL(fauteuilK01);
	createFauteuilProcedureSQL(fauteuilK02);
	createFauteuilProcedureSQL(fauteuilK03);
	createFauteuilProcedureSQL(fauteuilK04);
	createFauteuilProcedureSQL(fauteuilK05);
	createFauteuilProcedureSQL(fauteuilK06);
	createFauteuilProcedureSQL(fauteuilK07);
	createFauteuilProcedureSQL(fauteuilK08);
	createFauteuilProcedureSQL(fauteuilK09);
	createFauteuilProcedureSQL(fauteuilK10);
	createFauteuilProcedureSQL(fauteuilL01);
	createFauteuilProcedureSQL(fauteuilL02);
	createFauteuilProcedureSQL(fauteuilL03);
	createFauteuilProcedureSQL(fauteuilL04);
	createFauteuilProcedureSQL(fauteuilL05);
	createFauteuilProcedureSQL(fauteuilL06);
	createFauteuilProcedureSQL(fauteuilL07);
	createFauteuilProcedureSQL(fauteuilL08);
	createFauteuilProcedureSQL(fauteuilL09);
	createFauteuilProcedureSQL(fauteuilL10);
}



public boolean createFauteuilProcedureSQL(Fauteuil fauteuil) {


	CallableStatement stmt = null;
	boolean resultat = false;
	if (fauteuil == null) {
		return false;
	}

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager
				.getConnection("jdbc:mysql://localhost/Theatre?user=javauser" + "&password=javapass");
		//(String nomSpectacle, LocalDate date, String heure, String nomAuteur, MetteurEnScene metteurEnScene, ArrayList<Comedien> lstComedien)
		String sqlString = "{call addFauteuil (?, ?, ?, ?, ?, ?)}";
		stmt = connection.prepareCall(sqlString);
		stmt.setString(1, fauteuil.getNumeroFauteuil());
		stmt.setString(2, fauteuil.getNomSpectacle());
		stmt.setString(3, fauteuil.getDate());
		stmt.setString(4, fauteuil.getPrenom());
		stmt.setString(5, fauteuil.getNom());
		stmt.setInt(6, fauteuil.isReserve() ? 1:0);

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
	System.out.println("Enregistrement du fauteuil " + fauteuil.getNumeroFauteuil() + " réussi dans SQL");

	return resultat;
}

	
private boolean convertTinyintIntoBollean(int tinyint) {
	if (tinyint == 0) {
		return false;
	} else {
		return true;
	}
}

}
