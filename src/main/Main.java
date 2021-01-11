package main;



import java.util.ArrayList;
import java.util.List;

import Personne.Comedien;
import Personne.MetteurEnScene;

import database.DatabaseConnection;
import database.GestionFauteuil;
import fauteuil.Fauteuil;


import database.GestionSpectacle;
import spectacle.Spectacle;
import swing.AffichageSpectacle;
import swing.HomePage;
import swing.ReservationSpectateur;


public class Main {
	
	public static void main(String[] args) {
	
		Main nm = new Main();
		
		//nm.creerSpectacle();
		
		//nm.retrieveAllFauteuilProcedureSQL();
		//nm.creerFauteuilProcedureSQL();
		HomePage.afficherHomePage();
		//AffichageSpectacle.afficherSpectacle();
		//ReservationSpectateur.afficherSaisieSpectateur();
	}
	
	
	public void creerSpectacle() {
		GestionSpectacle cs = GestionSpectacle.getDb();
		cs.creerSpectacle();
		System.out.println("creerSpectacle");
	}
	
	public void retrieveAllFauteuilProcedureSQL() {
		GestionFauteuil gf = GestionFauteuil.getDb();
		gf.retrieveAllFauteuilProcedureSQL();
		System.out.println("retrieveAllFauteuilProcedureSQL");
	}
	public void creerFauteuilProcedureSQL() {
		GestionFauteuil gf = GestionFauteuil.getDb();
		gf.creationSiegeTest3();
		System.out.println("creationSiegeTest3");
	}
	
}



