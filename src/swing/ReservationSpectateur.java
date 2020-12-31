package swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import Personne.Spectateur;
import database.GestionFauteuil;
import database.GestionSpectateur;

/** Test JTextField, JPasswordField, JFormattedTextField, JTextArea */
@SuppressWarnings("serial")
public class ReservationSpectateur extends JFrame {
 
   // Private variables of the GUI components
   JTextField nom;
   JTextField prenom;
   JTextField tfSpectacleReserve;
   JTextField tfFauteuilReserve;
  
    
   /** Constructor to set up all the GUI components */
   public ReservationSpectateur(String spectacleReserve, String fauteuilReserve) {
      // JPanel for the text fields
      JPanel tfPanel = new JPanel(new GridLayout(10, 10, 10, 10));
      tfPanel.setBorder(BorderFactory.createTitledBorder("Saisie nouvelle reservation: "));
 
   // Regular text field (Row 2)
      tfPanel.add(new JLabel("  Prénom: "));
      prenom = new JTextField(10);
      tfPanel.add(prenom);
    
   // Regular text field (Row 2)
      tfPanel.add(new JLabel("  Nom: "));
      nom = new JTextField(10);
      tfPanel.add(nom);
    
      // Regular text field (Row 2)
      tfPanel.add(new JLabel("  Spectacle: "));
      tfSpectacleReserve = new JTextField(10);
      tfSpectacleReserve.setText(spectacleReserve);
      tfSpectacleReserve.setEnabled(false);
      tfPanel.add(tfSpectacleReserve);
     
   // Regular text field (Row 2)
      tfPanel.add(new JLabel("  Fauteuil réservé: "));
      tfFauteuilReserve = new JTextField(10);
      tfFauteuilReserve.setText(fauteuilReserve);
      tfFauteuilReserve.setEnabled(false);
      tfPanel.add(tfFauteuilReserve);
     
      
   
      JButton btnEnregistrer = new JButton("Enregister reservation");
     
      tfPanel.add(btnEnregistrer);
      btnEnregistrer.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        	 try {
				Spectateur spectateur = new Spectateur(prenom.getText(), nom.getText(), tfSpectacleReserve.getText(), tfFauteuilReserve.getText());
				System.out.println(spectateur);
				createReservationSpectateurProcedureSQL(spectateur);
				updateFauteuilProcedureSQL(spectacleReserve, fauteuilReserve);
				
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	 
        	 dispose();
          
         }
      });
      
      
      

      // Setup the content-pane of JFrame in BorderLayout
      Container cp = this.getContentPane();
      cp.setLayout(new BorderLayout(5, 5));
      cp.add(tfPanel, BorderLayout.NORTH);
     
 
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
      setTitle("Nouvelle Réservation");
      setSize(500, 400);
      setVisible(true);
      
      
   }
   
   public void createReservationSpectateurProcedureSQL(Spectateur spectateur) {
		GestionSpectateur gs = GestionSpectateur.getDb();
		gs.createReservationSpectateurProcedureSQL(spectateur);
	}
  
   public void updateFauteuilProcedureSQL(String spectacleReserve, String fauteuilReserve) {
		GestionFauteuil gf = GestionFauteuil.getDb();
		gf.updateFauteuilProcedureSQL(spectacleReserve, fauteuilReserve);
	}
 
  
   public static void afficherSaisieSpectateur(String spectacleReserve, String fauteuilReserve)
  {
      // Run GUI codes in Event-Dispatching thread for thread safety
	   // classe anonyme
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new ReservationSpectateur(spectacleReserve, fauteuilReserve);  // Let the constructor do the job
         }
      });
   }
}