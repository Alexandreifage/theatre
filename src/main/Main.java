package main;



import java.util.ArrayList;
import java.util.List;

import Personne.Comedien;
import Personne.MetteurEnScene;

import database.DatabaseConnection;
import fauteuil.Fauteuil;


import database.GestionSpectacle;
import spectacle.Spectacle;
import swing.AffichageSpectacle;


public class Main {
	
	public static void main(String[] args) {
	
		Main nm = new Main();
		
		nm.creerSpectacle();
		AffichageSpectacle.afficherSpectacle();
		
	}
	
	
	public void creerSpectacle() {
		GestionSpectacle cs = GestionSpectacle.getDb();
		cs.creerSpectacle();
		System.out.println("creerSpectacle");
	}
	

	
}



