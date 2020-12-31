package swing;

import javax.swing.*;

import database.GestionFauteuil;
import fauteuil.Fauteuil;
import spectacle.Spectacle;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Test Actions which are ActionListeners that can be applied to more than one
 * sources. An action can specify the state and functionality of an
 * ActionListener.
 */
@SuppressWarnings("serial")
public class Reservation extends JFrame {
	private JTextField tfCount;
	private Integer count = 120;
	ArrayList<JButton> lstBtnSelect = new ArrayList<>();
	ArrayList<Fauteuil> listeFauteuil = new ArrayList<>();
	private Spectacle spectacleEnCours;

	/** Constructor to setup the GUI */
	public Reservation(Spectacle spectacle) {
		// Create the Actions shared by the button and menu-item
		recupererSiege(spectacle);
		this.spectacleEnCours = spectacle;

		//Action countDownAction = new CountDownAction("Count Down", "To count down", new Integer(KeyEvent.VK_D));
		Action resetAction = new ResetAction("Annuler", "annuler", new Integer(KeyEvent.VK_R));

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		 

		// frame VIDE
		JPanel panelVide1 = new JPanel();
		panelVide1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelVide1.setPreferredSize(new Dimension(810, 50));
		JLabel titre = new JLabel(spectacle.getNomSpectacle()+ "  "+ spectacle.getDate()+ "  " +spectacle.getHeure());
		panelVide1.add(titre);
		panelVide1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(panelVide1);
		// frame pour boutons rangée A
		JPanel rangeeA = new JPanel();
		rangeeA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeA.setPreferredSize(new Dimension(810, 30));
		rangeeA.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeA);
		// frame pour boutons rangée B
		JPanel rangeeB = new JPanel();
		rangeeB.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeB.setPreferredSize(new Dimension(810, 30));
		rangeeB.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeB);
		// frame pour boutons rangée C
		JPanel rangeeC = new JPanel();
		rangeeC.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeC.setPreferredSize(new Dimension(810, 30));
		rangeeC.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeC);
		// frame pour boutons rangée D
		JPanel rangeeD = new JPanel();
		rangeeD.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeD.setPreferredSize(new Dimension(810, 30));
		rangeeD.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeD);
		// frame pour boutons rangée E
		JPanel rangeeE = new JPanel();
		rangeeE.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeE.setPreferredSize(new Dimension(810, 30));
		rangeeE.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeE);
		// frame pour boutons rangée F
		JPanel rangeeF = new JPanel();
		rangeeF.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeF.setPreferredSize(new Dimension(810, 30));
		rangeeF.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeF);
		// frame pour boutons rangée G
		JPanel rangeeG = new JPanel();
		rangeeG.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeG.setPreferredSize(new Dimension(810, 30));
		rangeeG.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeG);
		// frame pour boutons rangée H
		JPanel rangeeH = new JPanel();
		rangeeH.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeH.setPreferredSize(new Dimension(810, 30));
		rangeeH.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeH);
		// frame pour boutons rangée I
		JPanel rangeeI = new JPanel();
		rangeeI.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeI.setPreferredSize(new Dimension(810, 30));
		rangeeI.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeI);
		// frame pour boutons rangée J
		JPanel rangeeJ = new JPanel();
		rangeeJ.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeJ.setPreferredSize(new Dimension(810, 30));
		rangeeJ.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeJ);
		// frame pour boutons rangée K
		JPanel rangeeK = new JPanel();
		rangeeK.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeK.setPreferredSize(new Dimension(810, 30));
		rangeeK.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeK);
		// frame pour boutons rangée L
		JPanel rangeeL = new JPanel();
		rangeeL.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeL.setPreferredSize(new Dimension(810, 30));
		rangeeL.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeL);
		// frame VIDE 2
		JPanel panelVide2 = new JPanel();
		panelVide2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelVide2.setPreferredSize(new Dimension(810, 50));
		panelVide2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(panelVide2);
		// frame pour autres boutons
		JPanel panelAutresBoutons = new JPanel();
		panelAutresBoutons.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelAutresBoutons.setPreferredSize(new Dimension(810, 50));
		panelAutresBoutons.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(panelAutresBoutons);

		// Create buttons
		panelAutresBoutons.add(new JLabel("Nombre de places restantes:"));

		tfCount = new JTextField(count.toString(), 4);
		tfCount.setHorizontalAlignment(JTextField.RIGHT);
		panelAutresBoutons.add(tfCount);
		
		for (int i = 0; i < listeFauteuil.size(); i++) {
			Fauteuil f = listeFauteuil.get(i);
			JButton btnFauteuil = new JButton();
			Action fauteuilAction = new CountDownAction(btnFauteuil, f.getNumeroFauteuil(), "Réserver fauteuil " + f.getNumeroFauteuil(), new Integer(KeyEvent.VK_U));
			btnFauteuil.setAction(fauteuilAction);
			btnFauteuil.setEnabled(f.isReserve());
		
			if (f.getNumeroFauteuil().charAt(0) == 'A') {
				rangeeA.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'B') {
				rangeeB.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'C') {
				rangeeC.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'D') {
				rangeeD.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'E') {
				rangeeE.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'F') {
				rangeeF.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'G') {
				rangeeG.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'H') {
				rangeeH.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'I') {
				rangeeI.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'J') {
				rangeeJ.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'K') {
				rangeeK.add(btnFauteuil);
			}
			if (f.getNumeroFauteuil().charAt(0) == 'L') {
				rangeeL.add(btnFauteuil);
			}
			
		}

		
		JButton btnReset = new JButton();
		panelAutresBoutons.add(btnReset);

		//btnCountDown.setAction(countDownAction);
		btnReset.setAction(resetAction);

		// Create menu-bar
		JMenuBar menuBar = new JMenuBar();
		JMenu menu;
		JMenuItem menuItem;
		;

		// Create the first menu
		menu = new JMenu("Count");
		menu.setMnemonic(KeyEvent.VK_C);

		setJMenuBar(menuBar); // "this" JFrame sets menu-bar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Scène");
		setSize(1600, 1000);
		setVisible(true);
	}

	/**
	 * Action inner classes
	 */
	public class CountUpAction extends AbstractAction {
		/** Constructor */
		public CountUpAction(String name, String shortDesc, Integer mnemonic) {
			super(name);
			putValue(SHORT_DESCRIPTION, shortDesc);
			putValue(MNEMONIC_KEY, mnemonic);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			++count;
			tfCount.setText(count + "");
			
		}
	}

	public class CountDownAction extends AbstractAction {
		JButton btnSiege;
		/** Constructor */
		public CountDownAction(JButton btnSiege, String name, String shortDesc, Integer mnemonic) {
			super(name);
			this.btnSiege = btnSiege;
			putValue(SHORT_DESCRIPTION, shortDesc);
			putValue(MNEMONIC_KEY, mnemonic);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			count--;
			//tfCount.setText(count + "");
			//this.btnSiege.setForeground(Color.RED);
			this.btnSiege.setEnabled(false);
			lstBtnSelect.add(this.btnSiege);
			ReservationSpectateur.afficherSaisieSpectateur(spectacleEnCours.getNomSpectacle(), this.btnSiege.getText());
			
			
		}
	}

	public class ResetAction extends AbstractAction {
		/** Constructor */
		public ResetAction(String name, String shortDesc, Integer mnemonic) {
			super(name);
			putValue(SHORT_DESCRIPTION, shortDesc);
			putValue(MNEMONIC_KEY, mnemonic);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			

		}
	}
	
	public int compterPlacesDisponibles() {
		int nbrPlacesDispo = 0;
		for (int i = 0 ; i < listeFauteuil.size(); i++) {
			if (listeFauteuil.get(i).isReserve()) {
				nbrPlacesDispo = nbrPlacesDispo + 1;
			}
		}
		
		return nbrPlacesDispo;
	}
	
	public  void recupererSiege(Spectacle spectacle) {
		
		GestionFauteuil gf = GestionFauteuil.getDb();
		
		List<Fauteuil> lstAllFauteuil = gf.retrieveAllFauteuilProcedureSQL();
		
		for (int i = 0; i < lstAllFauteuil.size(); i++) {	
			Fauteuil f = lstAllFauteuil.get(i);
			if (f.getNomSpectacle().equals(spectacle.getNomSpectacle()) && f.getDate().equals(spectacle.getDate())) {
				listeFauteuil.add(f);
			}		
		}
		count = compterPlacesDisponibles();
	}

	/** The entry main() method */
	public static void afficherReservation(Spectacle spectacle) {
		
		// Run GUI codes in the Event-Dispatching thread for thread safety
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Reservation(spectacle); // Let the constructor does the job
			}
		});
	}
}