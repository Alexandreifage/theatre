package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/** Test setting Swing's JComponents properties and appearances */
@SuppressWarnings("serial")
//public class SwingJComponentSetterTest extends JFrame {

public class HomePage extends JFrame {
	

   /** Constructor to setup the GUI */
   public HomePage() {
	   
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      
   // Create a JLabel with text and icon and set its appearances
      JLabel label = new JLabel("Programme de réservation Theâtre", SwingConstants.CENTER);
      label.setFont(new Font(Font.DIALOG, Font.ITALIC, 50));
      label.setOpaque(true);  // needed for JLabel to show the background color
      label.setBackground(Color.BLUE);  // light blue
      label.setForeground(Color.WHITE);                 // foreground text color
      label.setPreferredSize(new Dimension(1500, 80));
      label.setToolTipText("This is a JLabel");  // Tool tip
      cp.add(label);
 
 
      // Create a JButton with text and icon and set its appearances
      JButton buttonReserverSpectacle = new JButton(); // use setter to set text and icon
      buttonReserverSpectacle.setText("Réservation");     
      buttonReserverSpectacle.setVerticalAlignment(SwingConstants.BOTTOM);  // of text and icon
      buttonReserverSpectacle.setHorizontalAlignment(SwingConstants.RIGHT); // of text and icon
      buttonReserverSpectacle.setHorizontalTextPosition(SwingConstants.LEFT); // of text relative to icon
      buttonReserverSpectacle.setVerticalTextPosition(SwingConstants.TOP);    // of text relative to icon
      buttonReserverSpectacle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
      buttonReserverSpectacle.setBackground(new Color(231, 240, 248));
      buttonReserverSpectacle.setForeground(Color.BLUE);
      buttonReserverSpectacle.setPreferredSize(new Dimension(400, 300));
      buttonReserverSpectacle.setToolTipText("This is a JButton");
      buttonReserverSpectacle.setMnemonic(KeyEvent.VK_B);  // can activate via Alt-B (buttons only)
      buttonReserverSpectacle.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	  AffichageSpectacle.afficherSpectacle();
          }
       });
      cp.add(buttonReserverSpectacle);
      
   // Create a JButton with text and icon and set its appearances
      JButton buttonAfficherSpectateur = new JButton(); // use setter to set text and icon
      buttonAfficherSpectateur.setText("Spectateurs"); 
      buttonAfficherSpectateur.setVerticalAlignment(SwingConstants.BOTTOM);  // of text and icon
      buttonAfficherSpectateur.setHorizontalAlignment(SwingConstants.RIGHT); // of text and icon
      buttonAfficherSpectateur.setHorizontalTextPosition(SwingConstants.LEFT); // of text relative to icon
      buttonAfficherSpectateur.setVerticalTextPosition(SwingConstants.TOP);    // of text relative to icon
      buttonAfficherSpectateur.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
      buttonAfficherSpectateur.setBackground(new Color(231, 240, 248));
      buttonAfficherSpectateur.setForeground(Color.BLUE);
      buttonAfficherSpectateur.setPreferredSize(new Dimension(400, 300));
      buttonAfficherSpectateur.setToolTipText("This is a JButton");
      buttonAfficherSpectateur.setMnemonic(KeyEvent.VK_B);  // can activate via Alt-B (buttons only)
      buttonAfficherSpectateur.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
        	AfficherFiltreReservation.afficherFiltreReservation();
          }
       });
      cp.add(buttonAfficherSpectateur);
      
   // Create a JButton with text and icon and set its appearances
      JButton buttonQuitter = new JButton(); // use setter to set text and icon
      buttonQuitter.setText("Quitter");
      buttonQuitter.setVerticalAlignment(SwingConstants.BOTTOM);  // of text and icon
      buttonQuitter.setHorizontalAlignment(SwingConstants.RIGHT); // of text and icon
      buttonQuitter.setHorizontalTextPosition(SwingConstants.LEFT); // of text relative to icon
      buttonQuitter.setVerticalTextPosition(SwingConstants.TOP);    // of text relative to icon
      buttonQuitter.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 40));
      buttonQuitter.setBackground(new Color(231, 240, 248));
      buttonQuitter.setForeground(Color.BLUE);
      buttonQuitter.setPreferredSize(new Dimension(400, 300));
      buttonQuitter.setToolTipText("This is a JButton");
      buttonQuitter.setMnemonic(KeyEvent.VK_B);  // can activate via Alt-B (buttons only)
      buttonQuitter.addActionListener(new ActionListener() {
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
      cp.add(buttonQuitter);

 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Réservation");
      setLocationRelativeTo(null); // center window on the screen
      setSize(1600, 1000);  // or pack()
      setVisible(true);
   }
 
   /** The entry main() method */
   public static void afficherHomePage() {
      // Run the GUI codes on Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new HomePage(); // Let the constructor do the job
         }
      });
   }
}