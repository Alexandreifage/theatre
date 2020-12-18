package gestionClasse;

import Personne.Comedien;


public class GestionClasse {
/*	
	public static void creationComedien() {
		 Comedien comedien1 = new Comedien("Henri", "Dussert", 'm', "12/11/1965", "Rue des Bains 46 1205 Genève", "079 477 45 54", "hdussert@gmail.com", ArrayList<spectacle1>, 176);
		 Comedien comedien2 = new Comedien("Georges", "Aebi", 'm', "31/06/1952", "Rue du Lavoir 54 1203 Genève", "077 987 45 47", "gaebi@gmail.com", ArrayList<spectacle1>, 157);
		 Comedien comedien3 = new Comedien("Xavier", "Rappaz", 'm', "23/07/1994", "Rue des Aubépines 117 1206 Genève", "078 567 16 16", "xrappaz@gmail.com", ArrayList<spectacle1>, 158);
		 Comedien comedien4 = new Comedien("Alexandre", "Saudan", 'm', "15/12/1972", "Boulevard Carl-Vogt 5 1207 Genève", "078 345 64 65", "asaudan@gmail.com", ArrayList<spectacle1>, 156);
		 Comedien comedien5 = new Comedien("Josiane", "Théraulaz", 'f', "28/10/1988", "Rue du Diorama 46 1200 Genève", "079 345 76 45", "jtheraulaz@gmail.com", ArrayList<spectacle1>, 182);
		 Comedien comedien6 = new Comedien("Nathalie", "Vonlanthen", 'f', "25/06/1978", "Impasse des Martyrs 72 1215 Genève", "077 098 54 65", "nvonlanthent@gmail.com", ArrayList<spectacle1>, 190);
		 Comedien comedien7 = new Comedien("Rose", "Tinguely", 'f', "19/09/1989", "Quai Grenus 12 1205 Genève", "078 678 96 24", "rtinguely@gmail.com", ArrayList<spectacle1>, 156);
		 Comedien comedien8 = new Comedien("Suzanne", "Maurer", 'f', "16/04/1982", "Rue des Maraîchers 74 1232 Genève", "077 246 24 36", "smaurer@gmail.com", ArrayList<spectacle1>, 176);
		 Comedien comedien9 = new Comedien("Paul", "Berset", 'm', "14/012/1959", "Rue Jacques-Dalcroze 92 1206 Genève", "079 357 47 76", "pberset@gmail.com", ArrayList<spectacle1>, 187);
		 Comedien comedien10 = new Comedien("Gilbert", "Sommaruga", 'm', "01/11/1980", "Rue des Noisetiers 37 1205 Genève", "078 46 35 34", "gsommaruga@gmail.com", ArrayList<spectacle1>, 204);
		 Comedien comedien11 = new Comedien("Youssef", "Rosselat", 'm', "30/10/1966", "Rue de Tivoli 2 1204 Genève", "077 579 56 76", "yrosselat@gmail.com", ArrayList<spectacle1>, 166);
		 Comedien comedien12 = new Comedien("Hanz", "Thorens", 'm', "27/11/1964", "Route de Genève 96 1207 Genève", "077 579 56 87", "hthorens@gmail.com", ArrayList<spectacle1>, 177);
		 Comedien comedien13 = new Comedien("Juliette", "Pasquier", 'f', "28/09/1985", "Rue Branly 93 1205 Genève", "078 735 76 34", "jpasquier@gmail.com", ArrayList<spectacle1>, 176);
		 Comedien comedien14 = new Comedien("Michel", "Galland.", 'm', "04/08/1981", "Rue des Lavoirs 47 1204 Genève", "079 844 25 23", "mgalland@gmail.com", ArrayList<spectacle1>, 165);
		 Comedien comedien15 = new Comedien("Laure", "Fuhamel", 'f', "09/07/1998", "Rue du Colonel Damien 49 1203 Genève", "078 857 65 88", "lfuhamel@gmail.com", ArrayList<spectacle1>, 167);
		 Comedien comedien16 = new Comedien("Josette", "Fonjallaz", 'f', "14/011/1993", "Rue des Merles 11 1202 Genève", "077 266 45 66", "jfonjallaz@gmail.com", ArrayList<spectacle1>, 177);
		 Comedien comedien17 = new Comedien("Charles", "Lefevre", 'm', "26/05/1991", "Rue de la Radio 38 1206 Genève", "078 777 89 90", "clefevre@gmail.com", ArrayList<spectacle1>, 189);
		 Comedien comedien18 = new Comedien("Pierre", "Gilliéron", 'm', "22/07/1985", "Boulevard des Augustins 4 1207 Genève", "077 856 38 28", "pgillieron@gmail.com", ArrayList<spectacle1>, 178);
		 Comedien comedien19 = new Comedien("Romain", "Girardin", 'm', "11/08/1977", "Rue Carmel 84 1205 Genève", "077 875 38 75", "rgirardin@gmail.com", ArrayList<spectacle1>, 169);
		 Comedien comedien20 = new Comedien("Laurent", "Mercier", 'm', "06/04/1977", "Rue de la Grande Armée 56 1205 Genève", "079 356 46 57", "lmercier@gmail.com", ArrayList<spectacle1>, 175);
		 Comedien comedien21 = new Comedien("Adeline", "Barre", 'f', "23/05/1984", "Rue Sismondi 45 1204 Genève", "078 723 76 45", "abarre@gmail.com", ArrayList<spectacle1>, 172);
		 Comedien comedien22 = new Comedien("Adolphe", "Bouvier", 'm', "15/09/1976", "Rue des Eaux-Vives 34 1203 Genève", "077 976 56 76", "abouvier@gmail.com", ArrayList<spectacle1>, 177);
		 Comedien comedien23 = new Comedien("Baptiste", "Gavillet", 'm', "25/04/1965", "Rue Youri Gargarin 56 1205 Genève", "078 874 54 76", "bgavillet@gmail.com", ArrayList<spectacle1>, 171);
		 Comedien comedien24 = new Comedien("Bernard", "Grosjean", 'm', "21/09/2001", "Chemin des Terraux 43 1206 Genève", "077 374 56 87", "bgrosjean@gmail.com", ArrayList<spectacle1>, 172);
		 Comedien comedien25 = new Comedien("Béatrice", "Humbert", 'f', "15/03/1990", "Rue des Luthiers 43 1205 Genève", "078 726 76 87", "bdescombes@gmail.com", ArrayList<spectacle1>, 173);
		 Comedien comedien26 = new Comedien("Bastien", "Jacot-Descombes", 'm', "09/01/1995", "Rue Alfred-Sagan 46 1207 Genève", "078 986 45 66", "b.j-descombre@gmail.com", ArrayList<spectacle1>, 174);
		 Comedien comedien27 = new Comedien("Quentin", "Besse", 'm', "28/12/1978", "Boulevard des Capucines 75 1206 Genève", "077 754 45 57", "qbesse@gmail.com", ArrayList<spectacle1>, 175);
		 Comedien comedien28 = new Comedien("Nicolas", "Martin", 'm', "31/11/1987", "Rue du Levant 76 1205 Genève", "079 564 34 45", "nmartin@gmail.com", ArrayList<spectacle1>, 176);
		 Comedien comedien29 = new Comedien("Nadine", "Badan", 'f', "04/05/2000", "Rue des Carpes 35 1205 Genève", "077 356 67 56", "nbadan@gmail.com", ArrayList<spectacle1>, 177);
		 Comedien comedien30 = new Comedien("Natacha", "Barbey", 'f', "07/03/1972", "Rue des Banques 73 1204 Genève", "079 253 87 89", "nbarbey@gmail.com", ArrayList<spectacle1>, 178);
		 Comedien comedien31 = new Comedien("Henri", "Chapuisat", 'm', "07/02/1985", "Rue de la Corraterie 75 1202 Genève", "079 785 34 98", "hchapuisat@gmail.com", ArrayList<spectacle1>, 179);
		 Comedien comedien32 = new Comedien("Ranya", "Monnard", 'f', "04/12/1997", "Rue Baltringue 56 1203 Genève", "078 834 35 75", "rmonnard@gmail.com", ArrayList<spectacle1>, 170);
		 Comedien comedien33 = new Comedien("Octave", "Cornuz", 'm', "22/07/2005", "Rue des Melèzes 73 1207 Genève", "079 965 65 45", "ocornuz@gmail.com", ArrayList<spectacle1>, 180);
		 Comedien comedien34 = new Comedien("Edwige", "Bujard", 'f', "29/02/1999", "Rue du Rempart de la Cité 4 1205 Genève", "077 673 55 442", "ebujard@gmail.com", ArrayList<spectacle1>, 181);
		 Comedien comedien35 = new Comedien("Salomé", "Vonlanthen", 'f', "19/06/1983", "Rue Georges Mettral 6 1206 Genève", "079 635 32 88", "svonlanthen@gmail.com", ArrayList<spectacle1>, 182);
		 Comedien comedien36 = new Comedien("Olivier", "Wicht", 'm', "15/04/1976", "Rue du Cèdre 34 1205 Genève", "078 864 75 37", "owicht@gmail.com", ArrayList<spectacle1>, 183;
		 Comedien comedien37 = new Comedien("Nancy", "Délèze", 'f', "16/04/1990", "Rue Jacob-Henri 23 1206 Genève", "079 134 66 85", "ndeleze@gmail.com", ArrayList<spectacle1>, 184);
		 Comedien comedien38 = new Comedien("Robert", "Lebreton", 'm', "18/02/1975", "Avenue du Trianon 75 1208 Genève", "079 564 57 59", "rlebreton@gmail.com", ArrayList<spectacle1>, 185);
		 Comedien comedien39 = new Comedien("Sandrine", "Barillon", 'f', "24/03/1992", "Boulevard des Cluses 76 1207 Genève", "079 735 32 67", "sbarillon@gmail.com", ArrayList<spectacle1>, 186);
		 Comedien comedien40 = new Comedien("Edouard", "Huber", 'm', "17/09/1995", "Route de Thônex 44 1206 Genève", "077 985 46 67", "ehuber@gmail.com", ArrayList<spectacle1>, 186);
		 Comedien comedien41 = new Comedien("Carole", "Da Silva", 'm', "06/01/1983", "Rue de la Corraterie 44 1207 Genève", "079 256 38 98", "cdasilva@gmail.com", ArrayList<spectacle1>, 187);
		 Comedien comedien42 = new Comedien("Igor", "Pouchkine", 'm', "06/02/1982", "Rue du Bourg 76 1205 Genève", "078 945 57 54", "ipouchkine@gmail.com", ArrayList<spectacle1>, 188);
		 Comedien comedien43 = new Comedien("Karim", "Leroy", 'm', "03/02/1985", "Rue du Village-Suisse 76 1204 Genève", "078 378 75 55", "kleroy@gmail.com", ArrayList<spectacle1>, 189);
		 Comedien comedien44 = new Comedien("Nathanaël", "Lagarde", 'm', "01/09/1987", "Rue de la Jonction 98 1208 Genève", "079 737 36 74", "nlagarde@gmail.com", ArrayList<spectacle1>, 190);
		 Comedien comedien45 = new Comedien("Carla", "Brun", 'f', "19/11/1938", "Rue des Guimbardes 45 1209 Genève", "077 446 12 66", "cbrun@gmail.com", ArrayList<spectacle1>, 191);
		 Comedien comedien46 = new Comedien("Rafaël", "Maillard", 'm', "12/07/1975", "Rue Albin-Michel 98 1204 Genève", "079 46 34 45", "rmaillard@gmail.com", ArrayList<spectacle1>, 192);
		 Comedien comedien47 = new Comedien("Camille", "Rey", 'f', "17/08/1992", "Rue Zeitoun 23 1205 Genève", "077 767 65 76", "crey@gmail.com", ArrayList<spectacle1>, 194);
		 Comedien comedien48 = new Comedien("Sophie", "Dubois", 'f', "15/03/1967", "Avenue de la Confédération 12 1206 Genève", "078 825 34 65", "sduboist@gmail.com", ArrayList<spectacle1>, 195);
		 Comedien comedien49 = new Comedien("Odette", "Carron", 'f', "15/07/1969", "Rue de la Pallissandre 90 1206 Genève", "079 345 65 76", "ocaron@gmail.com", ArrayList<spectacle1>, 196);
		 Comedien comedien50 = new Comedien("Sabrina", "Bugnon", 'f', "02/07/1986", "Rue des Bouleaux 6 1205 Genève", "078 875 45 75", "sbugnon@gmail.com", ArrayList<spectacle1>, 175);
	
	}	
*/
}
