package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import database.GestionSpectacle;
import spectacle.Spectacle;


 
/** Test JTextField, JPasswordField, JFormattedTextField, JTextArea */
@SuppressWarnings("serial")
public class AffichageSpectacle extends JFrame {
 
   // Private variables of the GUI components
   JTextField infoSpectacle1;
   JTextField infoSpectacle2;
   JTextField infoSpectacle3;
   List<Spectacle> listeSpectacle;
   
   /** Constructor to set up all the GUI components */
   public AffichageSpectacle() {
	   
	   GestionSpectacle cs = GestionSpectacle.getDb();
	   listeSpectacle = cs.retrieveSpectacleProcedureSQL();
	   
      // JPanel for the text fields
      JPanel tfPanel = new JPanel(new GridLayout(10, 10, 10, 10));
      tfPanel.setBorder(BorderFactory.createTitledBorder("Reservation de spectacle: "));
      
      
      // Regular text field (Row 1)
      tfPanel.add(new JLabel("  Spectacle n°1 "));
      infoSpectacle1 = new JTextField(10);
      infoSpectacle1.setText(listeSpectacle.get(0).getNomSpectacle() + " | " + listeSpectacle.get(0).getNomAuteur() + " | " + listeSpectacle.get(0).getDate() + " | " + listeSpectacle.get(0).getHeure());
      infoSpectacle1.setEnabled(false);
      tfPanel.add(infoSpectacle1);
      JButton btnreserver1 = new JButton("Reserver");
      btnreserver1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
         	 try {
 			
 				
 				
 			} catch (NumberFormatException e1) {
 				// TODO Auto-generated catch block
 				e1.printStackTrace();
 			} 

          }
       });
      
      //Reservation.afficherReservation();
      tfPanel.add(btnreserver1);
      
     
   // Regular text field (Row 2)
      tfPanel.add(new JLabel("  Spectacle n°1 "));
      infoSpectacle2 = new JTextField(10);
      infoSpectacle2.setText(listeSpectacle.get(1).getNomSpectacle() + " | " + listeSpectacle.get(1).getNomAuteur() + " | " + listeSpectacle.get(1).getDate() + " | " + listeSpectacle.get(1).getHeure());
      infoSpectacle2.setEnabled(false);
      tfPanel.add(infoSpectacle2);
      JButton btnreserver2 = new JButton("Reserver");
      tfPanel.add(btnreserver2);
    
   // Regular text field (Row 2)
      tfPanel.add(new JLabel("  Spectacle n°1 "));
      infoSpectacle3 = new JTextField(10);
      infoSpectacle3.setText(listeSpectacle.get(2).getNomSpectacle() + " | " + listeSpectacle.get(2).getNomAuteur() + " | " + listeSpectacle.get(2).getDate() + " | " + listeSpectacle.get(2).getHeure());
      infoSpectacle3.setEnabled(false);
      tfPanel.add(infoSpectacle3);
      JButton btnreserver3 = new JButton("Reserver");
      tfPanel.add(btnreserver3);
    
     
   
      JButton btnEnregistrer = new JButton("Annuler");
     
      tfPanel.add(btnEnregistrer);
      btnEnregistrer.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        	 try {
			
				
				
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
        	 
        	 System.exit(0);
          
         }
      });
      
      
      

      // Setup the content-pane of JFrame in BorderLayout
      Container cp = this.getContentPane();
      cp.setLayout(new BorderLayout(5, 5));
      cp.add(tfPanel, BorderLayout.NORTH);
     
 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Réservation Spectacle");
      setSize(500, 450);
      setVisible(true);
   }
   
   
  
   public static void afficherSpectacle()
  {
	   
	   
      // Run GUI codes in Event-Dispatching thread for thread safety
	   // classe anonyme
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new AffichageSpectacle();  // Let the constructor do the job
         }
      });
   }
   
   
}