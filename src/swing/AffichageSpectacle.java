package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Test Actions which are ActionListeners that can be applied to more than one
 * sources. An action can specify the state and functionality of an
 * ActionListener.
 */
@SuppressWarnings("serial")
public class AffichageSpectacle extends JFrame {
	private JTextField tfCount;
	private Integer count = 120;
	ArrayList<JButton> lstBtnSelect = new ArrayList<>();

	/** Constructor to setup the GUI */
	public AffichageSpectacle() {
		// Create the Actions shared by the button and menu-item
		

		//Action countDownAction = new CountDownAction("Count Down", "To count down", new Integer(KeyEvent.VK_D));
		Action resetAction = new ResetAction("Reset", "To reset to zero", new Integer(KeyEvent.VK_R));

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		 

		// frame VIDE
		JPanel panelVide1 = new JPanel();
		panelVide1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelVide1.setPreferredSize(new Dimension(810, 50));
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

		JButton fauteuilA01 = new JButton();
		Action fauteuilA01Action = new CountDownAction(fauteuilA01, "A 01", "Réserver fauteuil A 01", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA01);		
		JButton fauteuilA02 = new JButton();
		Action fauteuilA02Action = new CountDownAction(fauteuilA02, "A 02", "Réserver fauteuil A 02", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA02);
		JButton fauteuilA03 = new JButton();
		Action fauteuilA03Action = new CountDownAction(fauteuilA03,"A 03", "Réserver fauteuil A 03", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA03);
		JButton fauteuilA04 = new JButton();
		Action fauteuilA04Action = new CountDownAction(fauteuilA04,"A 04", "Réserver fauteuil A 04", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA04);
		JButton fauteuilA05 = new JButton();
		Action fauteuilA05Action = new CountDownAction(fauteuilA05,"A 05", "Réserver fauteuil A 05", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA05);
		JButton fauteuilA06 = new JButton();
		Action fauteuilA06Action = new CountDownAction(fauteuilA06,"A 06", "Réserver fauteuil A 06", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA06);
		JButton fauteuilA07 = new JButton();
		Action fauteuilA07Action = new CountDownAction(fauteuilA07,"A 07", "Réserver fauteuil A 07", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA07);
		JButton fauteuilA08 = new JButton();
		Action fauteuilA08Action = new CountDownAction(fauteuilA08,"A 08", "Réserver fauteuil A 08", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA08);
		JButton fauteuilA09 = new JButton();
		Action fauteuilA09Action = new CountDownAction(fauteuilA09,"A 09", "Réserver fauteuil A 09", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA09);
		JButton fauteuilA10 = new JButton();
		Action fauteuilA10Action = new CountDownAction(fauteuilA10,"A 10", "Réserver fauteuil A 10", new Integer(KeyEvent.VK_U));
		rangeeA.add(fauteuilA10);
		
		JButton fauteuilB01 = new JButton();
		Action fauteuilB01Action = new CountDownAction(fauteuilB01,"B 01", "Réserver fauteuil B 01", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB01);
		JButton fauteuilB02 = new JButton();
		Action fauteuilB02Action = new CountDownAction(fauteuilB02,"B 02", "Réserver fauteuil B 02", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB02);
		JButton fauteuilB03 = new JButton();
		Action fauteuilB03Action = new CountDownAction(fauteuilB03,"B 03", "Réserver fauteuil B 03", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB03);
		JButton fauteuilB04 = new JButton();
		Action fauteuilB04Action = new CountDownAction(fauteuilB04,"B 04", "Réserver fauteuil B 04", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB04);
		JButton fauteuilB05 = new JButton();
		Action fauteuilB05Action = new CountDownAction(fauteuilB05,"B 05", "Réserver fauteuil B 05", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB05);
		JButton fauteuilB06 = new JButton();
		Action fauteuilB06Action = new CountDownAction(fauteuilB06,"B 06", "Réserver fauteuil B 06", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB06);
		JButton fauteuilB07 = new JButton();
		Action fauteuilB07Action = new CountDownAction(fauteuilB07,"B 07", "Réserver fauteuil B 07", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB07);
		JButton fauteuilB08 = new JButton();
		Action fauteuilB08Action = new CountDownAction(fauteuilB08,"B 08", "Réserver fauteuil B 08", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB08);
		JButton fauteuilB09 = new JButton();
		Action fauteuilB09Action = new CountDownAction(fauteuilB09,"B 09", "Réserver fauteuil B 09", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB09);
		JButton fauteuilB10 = new JButton();
		Action fauteuilB10Action = new CountDownAction(fauteuilB10,"B 10", "Réserver fauteuil B 10", new Integer(KeyEvent.VK_U));
		rangeeB.add(fauteuilB10);

		JButton fauteuilC01 = new JButton();
		Action fauteuilC01Action = new CountDownAction(fauteuilC01,"C 01", "Réserver fauteuil C 01", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC01);
		JButton fauteuilC02 = new JButton();
		Action fauteuilC02Action = new CountDownAction(fauteuilC02,"C 02", "Réserver fauteuil C 02", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC02);
		JButton fauteuilC03 = new JButton();
		Action fauteuilC03Action = new CountDownAction(fauteuilC03,"C 03", "Réserver fauteuil C 03", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC03);
		JButton fauteuilC04 = new JButton();
		Action fauteuilC04Action = new CountDownAction(fauteuilC04,"C 04", "Réserver fauteuil C 04", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC04);
		JButton fauteuilC05 = new JButton();
		Action fauteuilC05Action = new CountDownAction(fauteuilC05,"C 05", "Réserver fauteuil C 05", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC05);
		JButton fauteuilC06 = new JButton();
		Action fauteuilC06Action = new CountDownAction(fauteuilC06,"C 06", "Réserver fauteuil C 06", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC06);
		JButton fauteuilC07 = new JButton();
		Action fauteuilC07Action = new CountDownAction(fauteuilC07,"C 07", "Réserver fauteuil C 07", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC07);
		JButton fauteuilC08 = new JButton();
		Action fauteuilC08Action = new CountDownAction(fauteuilC08,"C 08", "Réserver fauteuil C 08", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC08);
		JButton fauteuilC09 = new JButton();
		Action fauteuilC09Action = new CountDownAction(fauteuilC09,"C 09", "Réserver fauteuil C 09", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC09);
		JButton fauteuilC10 = new JButton();
		Action fauteuilC10Action = new CountDownAction(fauteuilC10,"C 10", "Réserver fauteuil C 10", new Integer(KeyEvent.VK_U));
		rangeeC.add(fauteuilC10);

		JButton fauteuilD01 = new JButton();
		Action fauteuilD01Action = new CountDownAction(fauteuilD01,"D 01", "Réserver fauteuil D 01", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD01);
		JButton fauteuilD02 = new JButton();
		Action fauteuilD02Action = new CountDownAction(fauteuilD02,"D 02", "Réserver fauteuil D 02", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD02);
		JButton fauteuilD03 = new JButton();
		Action fauteuilD03Action = new CountDownAction(fauteuilD03,"D 03", "Réserver fauteuil D 03", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD03);
		JButton fauteuilD04 = new JButton();
		Action fauteuilD04Action = new CountDownAction(fauteuilD04,"D 04", "Réserver fauteuil D 04", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD04);
		JButton fauteuilD05 = new JButton();
		Action fauteuilD05Action = new CountDownAction(fauteuilD05,"D 05", "Réserver fauteuil D 05", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD05);
		JButton fauteuilD06 = new JButton();
		Action fauteuilD06Action = new CountDownAction(fauteuilD06,"D 06", "Réserver fauteuil D 06", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD06);
		JButton fauteuilD07 = new JButton();
		Action fauteuilD07Action = new CountDownAction(fauteuilD07,"D 07", "Réserver fauteuil D 07", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD07);
		JButton fauteuilD08 = new JButton();
		Action fauteuilD08Action = new CountDownAction(fauteuilD08,"D 08", "Réserver fauteuil D 08", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD08);
		JButton fauteuilD09 = new JButton();
		Action fauteuilD09Action = new CountDownAction(fauteuilD09,"D 09", "Réserver fauteuil D 09", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD09);
		JButton fauteuilD10 = new JButton();
		Action fauteuilD10Action = new CountDownAction(fauteuilD10,"D 10", "Réserver fauteuil D 10", new Integer(KeyEvent.VK_U));
		rangeeD.add(fauteuilD10);

		JButton fauteuilE01 = new JButton();
		Action fauteuilE01Action = new CountDownAction(fauteuilE01,"E 01", "Réserver fauteuil E 01", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE01);
		JButton fauteuilE02 = new JButton();
		Action fauteuilE02Action = new CountDownAction(fauteuilE02,"E 02", "Réserver fauteuil E 02", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE02);
		JButton fauteuilE03 = new JButton();
		Action fauteuilE03Action = new CountDownAction(fauteuilE03,"E 03", "Réserver fauteuil E 03", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE03);
		JButton fauteuilE04 = new JButton();
		Action fauteuilE04Action = new CountDownAction(fauteuilE04,"E 04", "Réserver fauteuil E 04", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE04);
		JButton fauteuilE05 = new JButton();
		Action fauteuilE05Action = new CountDownAction(fauteuilE05,"E 05", "Réserver fauteuil E 05", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE05);
		JButton fauteuilE06 = new JButton();
		Action fauteuilE06Action = new CountDownAction(fauteuilE06,"E 06", "Réserver fauteuil E 06", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE06);
		JButton fauteuilE07 = new JButton();
		Action fauteuilE07Action = new CountDownAction(fauteuilE07,"E 07", "Réserver fauteuil E 07", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE07);
		JButton fauteuilE08 = new JButton();
		Action fauteuilE08Action = new CountDownAction(fauteuilE08,"E 08", "Réserver fauteuil E 08", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE08);
		JButton fauteuilE09 = new JButton();
		Action fauteuilE09Action = new CountDownAction(fauteuilE09,"E 09", "Réserver fauteuil E 09", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE09);
		JButton fauteuilE10 = new JButton();
		Action fauteuilE10Action = new CountDownAction(fauteuilE10,"E 10", "Réserver fauteuil E 10", new Integer(KeyEvent.VK_U));
		rangeeE.add(fauteuilE10);

		JButton fauteuilF01 = new JButton();
		Action fauteuilF01Action = new CountDownAction(fauteuilF01,"F 01", "Réserver fauteuil F 01", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF01);
		JButton fauteuilF02 = new JButton();
		Action fauteuilF02Action = new CountDownAction(fauteuilF02,"F 02", "Réserver fauteuil F 02", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF02);
		JButton fauteuilF03 = new JButton();
		Action fauteuilF03Action = new CountDownAction(fauteuilF03,"F 03", "Réserver fauteuil F 03", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF03);
		JButton fauteuilF04 = new JButton();
		Action fauteuilF04Action = new CountDownAction(fauteuilF04,"F 04", "Réserver fauteuil F 04", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF04);
		JButton fauteuilF05 = new JButton();
		Action fauteuilF05Action = new CountDownAction(fauteuilF05,"F 05", "Réserver fauteuil F 05", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF05);
		JButton fauteuilF06 = new JButton();
		Action fauteuilF06Action = new CountDownAction(fauteuilF06,"F 06", "Réserver fauteuil F 06", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF06);
		JButton fauteuilF07 = new JButton();
		Action fauteuilF07Action = new CountDownAction(fauteuilF07,"F 07", "Réserver fauteuil F 07", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF07);
		JButton fauteuilF08 = new JButton();
		Action fauteuilF08Action = new CountDownAction(fauteuilF08,"F 08", "Réserver fauteuil F 08", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF08);
		JButton fauteuilF09 = new JButton();
		Action fauteuilF09Action = new CountDownAction(fauteuilF09,"F 09", "Réserver fauteuil F 09", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF09);
		JButton fauteuilF10 = new JButton();
		Action fauteuilF10Action = new CountDownAction(fauteuilF10,"F 10", "Réserver fauteuil F 10", new Integer(KeyEvent.VK_U));
		rangeeF.add(fauteuilF10);

		JButton fauteuilG01 = new JButton();
		Action fauteuilG01Action = new CountDownAction(fauteuilG01,"G 01", "Réserver fauteuil G 01", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG01);
		JButton fauteuilG02 = new JButton();
		Action fauteuilG02Action = new CountDownAction(fauteuilG02,"G 02", "Réserver fauteuil G 02", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG02);
		JButton fauteuilG03 = new JButton();
		Action fauteuilG03Action = new CountDownAction(fauteuilG03,"G 03", "Réserver fauteuil G 03", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG03);
		JButton fauteuilG04 = new JButton();
		Action fauteuilG04Action = new CountDownAction(fauteuilG04,"G 04", "Réserver fauteuil G 04", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG04);
		JButton fauteuilG05 = new JButton();
		Action fauteuilG05Action = new CountDownAction(fauteuilG05,"G 05", "Réserver fauteuil G 05", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG05);
		JButton fauteuilG06 = new JButton();
		Action fauteuilG06Action = new CountDownAction(fauteuilG06,"G 06", "Réserver fauteuil G 06", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG06);
		JButton fauteuilG07 = new JButton();
		Action fauteuilG07Action = new CountDownAction(fauteuilG07,"G 07", "Réserver fauteuil G 07", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG07);
		JButton fauteuilG08 = new JButton();
		Action fauteuilG08Action = new CountDownAction(fauteuilG08,"G 08", "Réserver fauteuil G 08", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG08);
		JButton fauteuilG09 = new JButton();
		Action fauteuilG09Action = new CountDownAction(fauteuilG09,"G 09", "Réserver fauteuil G 09", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG09);
		JButton fauteuilG10 = new JButton();
		Action fauteuilG10Action = new CountDownAction(fauteuilG10,"G 10", "Réserver fauteuil G 10", new Integer(KeyEvent.VK_U));
		rangeeG.add(fauteuilG10);

		JButton fauteuilH01 = new JButton();
		Action fauteuilH01Action = new CountDownAction(fauteuilH01,"H 01", "Réserver fauteuil H 01", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH01);
		JButton fauteuilH02 = new JButton();
		Action fauteuilH02Action = new CountDownAction(fauteuilH02,"H 02", "Réserver fauteuil H 02", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH02);
		JButton fauteuilH03 = new JButton();
		Action fauteuilH03Action = new CountDownAction(fauteuilH03,"H 03", "Réserver fauteuil H 03", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH03);
		JButton fauteuilH04 = new JButton();
		Action fauteuilH04Action = new CountDownAction(fauteuilH04,"H 04", "Réserver fauteuil H 04", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH04);
		JButton fauteuilH05 = new JButton();
		Action fauteuilH05Action = new CountDownAction(fauteuilH05,"H 05", "Réserver fauteuil H 05", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH05);
		JButton fauteuilH06 = new JButton();
		Action fauteuilH06Action = new CountDownAction(fauteuilH06,"H 06", "Réserver fauteuil H 06", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH06);
		JButton fauteuilH07 = new JButton();
		Action fauteuilH07Action = new CountDownAction(fauteuilH07,"H 07", "Réserver fauteuil H 07", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH07);
		JButton fauteuilH08 = new JButton();
		Action fauteuilH08Action = new CountDownAction(fauteuilH08,"H 08", "Réserver fauteuil H 08", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH08);
		JButton fauteuilH09 = new JButton();
		Action fauteuilH09Action = new CountDownAction(fauteuilH09,"H 09", "Réserver fauteuil H 09", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH09);
		JButton fauteuilH10 = new JButton();
		Action fauteuilH10Action = new CountDownAction(fauteuilH10,"H 10", "Réserver fauteuil H 10", new Integer(KeyEvent.VK_U));
		rangeeH.add(fauteuilH10);

		JButton fauteuilI01 = new JButton();
		Action fauteuilI01Action = new CountDownAction(fauteuilI01,"I 01", "Réserver fauteuil I 01", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI01);
		JButton fauteuilI02 = new JButton();
		Action fauteuilI02Action = new CountDownAction(fauteuilI02,"I 02", "Réserver fauteuil I 02", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI02);
		JButton fauteuilI03 = new JButton();
		Action fauteuilI03Action = new CountDownAction(fauteuilI02,"I 03", "Réserver fauteuil I 03", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI03);
		JButton fauteuilI04 = new JButton();
		Action fauteuilI04Action = new CountDownAction(fauteuilI04,"I 04", "Réserver fauteuil I 04", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI04);
		JButton fauteuilI05 = new JButton();
		Action fauteuilI05Action = new CountDownAction(fauteuilI05,"I 05", "Réserver fauteuil I 015", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI05);
		JButton fauteuilI06 = new JButton();
		Action fauteuilI06Action = new CountDownAction(fauteuilI06,"I 06", "Réserver fauteuil I 06", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI06);
		JButton fauteuilI07 = new JButton();
		Action fauteuilI07Action = new CountDownAction(fauteuilI07,"I 07", "Réserver fauteuil I 07", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI07);
		JButton fauteuilI08 = new JButton();
		Action fauteuilI08Action = new CountDownAction(fauteuilI08,"I 08", "Réserver fauteuil I 08", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI08);
		JButton fauteuilI09 = new JButton();
		Action fauteuilI09Action = new CountDownAction(fauteuilI09,"I 09", "Réserver fauteuil I 09", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI09);
		JButton fauteuilI10 = new JButton();
		Action fauteuilI10Action = new CountDownAction(fauteuilI10,"I 10", "Réserver fauteuil I 10", new Integer(KeyEvent.VK_U));
		rangeeI.add(fauteuilI10);

		JButton fauteuilJ01 = new JButton();
		Action fauteuilJ01Action = new CountDownAction(fauteuilJ01,"J 01", "Réserver fauteuil J 01", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ01);
		JButton fauteuilJ02 = new JButton();
		Action fauteuilJ02Action = new CountDownAction(fauteuilJ02,"J 02", "Réserver fauteuil J 02", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ02);
		JButton fauteuilJ03 = new JButton();
		Action fauteuilJ03Action = new CountDownAction(fauteuilJ03,"J 03", "Réserver fauteuil J 03", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ03);
		JButton fauteuilJ04 = new JButton();
		Action fauteuilJ04Action = new CountDownAction(fauteuilJ04,"J 04", "Réserver fauteuil J 04", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ04);
		JButton fauteuilJ05 = new JButton();
		Action fauteuilJ05Action = new CountDownAction(fauteuilJ05,"J 05", "Réserver fauteuil J 05", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ05);
		JButton fauteuilJ06 = new JButton();
		Action fauteuilJ06Action = new CountDownAction(fauteuilJ06,"J 06", "Réserver fauteuil J 06", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ06);
		JButton fauteuilJ07 = new JButton();
		Action fauteuilJ07Action = new CountDownAction(fauteuilJ07,"J 07", "Réserver fauteuil J 07", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ07);
		JButton fauteuilJ08 = new JButton();
		Action fauteuilJ08Action = new CountDownAction(fauteuilJ08,"J 08", "Réserver fauteuil J 08", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ08);
		JButton fauteuilJ09 = new JButton();
		Action fauteuilJ09Action = new CountDownAction(fauteuilJ09,"J 09", "Réserver fauteuil J 09", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ09);
		JButton fauteuilJ10 = new JButton();
		Action fauteuilJ10Action = new CountDownAction(fauteuilJ10,"J 10", "Réserver fauteuil J 10", new Integer(KeyEvent.VK_U));
		rangeeJ.add(fauteuilJ10);

		JButton fauteuilK01 = new JButton();
		Action fauteuilK01Action = new CountDownAction(fauteuilK01,"K 01", "Réserver fauteuil K 01", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK01);
		JButton fauteuilK02 = new JButton();
		Action fauteuilK02Action = new CountDownAction(fauteuilK02,"K 02", "Réserver fauteuil K 02", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK02);
		JButton fauteuilK03 = new JButton();
		Action fauteuilK03Action = new CountDownAction(fauteuilK03,"K 03", "Réserver fauteuil K 03", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK03);
		JButton fauteuilK04 = new JButton();
		Action fauteuilK04Action = new CountDownAction(fauteuilK04,"K 04", "Réserver fauteuil K 04", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK04);
		JButton fauteuilK05 = new JButton();
		Action fauteuilK05Action = new CountDownAction(fauteuilK05,"K 05", "Réserver fauteuil K 05", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK05);
		JButton fauteuilK06 = new JButton();
		Action fauteuilK06Action = new CountDownAction(fauteuilK06,"K 06", "Réserver fauteuil K 06", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK06);
		JButton fauteuilK07 = new JButton();
		Action fauteuilK07Action = new CountDownAction(fauteuilK07,"K 07", "Réserver fauteuil K 07", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK07);
		JButton fauteuilK08 = new JButton();
		Action fauteuilK08Action = new CountDownAction(fauteuilK08,"K 08", "Réserver fauteuil K 08", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK08);
		JButton fauteuilK09 = new JButton();
		Action fauteuilK09Action = new CountDownAction(fauteuilK09,"K 09", "Réserver fauteuil K 09", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK09);
		JButton fauteuilK10 = new JButton();
		Action fauteuilK10Action = new CountDownAction(fauteuilK10,"K 10", "Réserver fauteuil K 10", new Integer(KeyEvent.VK_U));
		rangeeK.add(fauteuilK10);

		JButton fauteuilL01 = new JButton();
		Action fauteuilL01Action = new CountDownAction(fauteuilL01,"L 01", "Réserver fauteuil L 01", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL01);
		JButton fauteuilL02 = new JButton();
		Action fauteuilL02Action = new CountDownAction(fauteuilL02,"L 02", "Réserver fauteuil L 02", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL02);
		JButton fauteuilL03 = new JButton();
		Action fauteuilL03Action = new CountDownAction(fauteuilL03,"L 03", "Réserver fauteuil L 03", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL03);
		JButton fauteuilL04 = new JButton();
		Action fauteuilL04Action = new CountDownAction(fauteuilL04,"L 04", "Réserver fauteuil L 04", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL04);
		JButton fauteuilL05 = new JButton();
		Action fauteuilL05Action = new CountDownAction(fauteuilL05,"L 05", "Réserver fauteuil L 05", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL05);
		JButton fauteuilL06 = new JButton();
		Action fauteuilL06Action = new CountDownAction(fauteuilL06,"L 06", "Réserver fauteuil L 06", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL06);
		JButton fauteuilL07 = new JButton();
		Action fauteuilL07Action = new CountDownAction(fauteuilL07,"L 07", "Réserver fauteuil L 07", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL07);
		JButton fauteuilL08 = new JButton();
		Action fauteuilL08Action = new CountDownAction(fauteuilL08,"L 08", "Réserver fauteuil L 08", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL08);
		JButton fauteuilL09 = new JButton();
		Action fauteuilL09Action = new CountDownAction(fauteuilL09,"L 09", "Réserver fauteuil L 09", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL09);
		JButton fauteuilL10 = new JButton();
		Action fauteuilL10Action = new CountDownAction(fauteuilL10,"L 10", "Réserver fauteuil L 10", new Integer(KeyEvent.VK_U));
		rangeeL.add(fauteuilL10);

		JButton btnCountDown = new JButton();
		panelAutresBoutons.add(btnCountDown);
		JButton btnReset = new JButton();
		panelAutresBoutons.add(btnReset);
		// Set actions for buttons
		fauteuilA01.setAction(fauteuilA01Action);
		fauteuilA02.setAction(fauteuilA02Action);
		fauteuilA03.setAction(fauteuilA03Action);
		fauteuilA04.setAction(fauteuilA04Action);
		fauteuilA05.setAction(fauteuilA05Action);
		fauteuilA06.setAction(fauteuilA06Action);
		fauteuilA07.setAction(fauteuilA07Action);
		fauteuilA08.setAction(fauteuilA08Action);
		fauteuilA09.setAction(fauteuilA09Action);
		fauteuilA10.setAction(fauteuilA10Action);

		fauteuilB01.setAction(fauteuilB01Action);
		fauteuilB02.setAction(fauteuilB02Action);
		fauteuilB03.setAction(fauteuilB03Action);
		fauteuilB04.setAction(fauteuilB04Action);
		fauteuilB05.setAction(fauteuilB05Action);
		fauteuilB06.setAction(fauteuilB06Action);
		fauteuilB07.setAction(fauteuilB07Action);
		fauteuilB08.setAction(fauteuilB08Action);
		fauteuilB09.setAction(fauteuilB09Action);
		fauteuilB10.setAction(fauteuilB10Action);

		fauteuilC01.setAction(fauteuilC01Action);
		fauteuilC02.setAction(fauteuilC02Action);
		fauteuilC03.setAction(fauteuilC03Action);
		fauteuilC04.setAction(fauteuilC04Action);
		fauteuilC05.setAction(fauteuilC05Action);
		fauteuilC06.setAction(fauteuilC06Action);
		fauteuilC07.setAction(fauteuilC07Action);
		fauteuilC08.setAction(fauteuilC08Action);
		fauteuilC09.setAction(fauteuilC09Action);
		fauteuilC10.setAction(fauteuilC10Action);

		fauteuilD01.setAction(fauteuilD01Action);
		fauteuilD02.setAction(fauteuilD02Action);
		fauteuilD03.setAction(fauteuilD03Action);
		fauteuilD04.setAction(fauteuilD04Action);
		fauteuilD05.setAction(fauteuilD05Action);
		fauteuilD06.setAction(fauteuilD06Action);
		fauteuilD07.setAction(fauteuilD07Action);
		fauteuilD08.setAction(fauteuilD08Action);
		fauteuilD09.setAction(fauteuilD09Action);
		fauteuilD10.setAction(fauteuilD10Action);

		fauteuilE01.setAction(fauteuilE01Action);
		fauteuilE02.setAction(fauteuilE02Action);
		fauteuilE03.setAction(fauteuilE03Action);
		fauteuilE04.setAction(fauteuilE04Action);
		fauteuilE05.setAction(fauteuilE05Action);
		fauteuilE06.setAction(fauteuilE06Action);
		fauteuilE07.setAction(fauteuilE07Action);
		fauteuilE08.setAction(fauteuilE08Action);
		fauteuilE09.setAction(fauteuilE09Action);
		fauteuilE10.setAction(fauteuilE10Action);

		fauteuilF01.setAction(fauteuilF01Action);
		fauteuilF02.setAction(fauteuilF02Action);
		fauteuilF03.setAction(fauteuilF03Action);
		fauteuilF04.setAction(fauteuilF04Action);
		fauteuilF05.setAction(fauteuilF05Action);
		fauteuilF06.setAction(fauteuilF06Action);
		fauteuilF07.setAction(fauteuilF07Action);
		fauteuilF08.setAction(fauteuilF08Action);
		fauteuilF09.setAction(fauteuilF09Action);
		fauteuilF10.setAction(fauteuilF10Action);

		fauteuilG01.setAction(fauteuilG01Action);
		fauteuilG02.setAction(fauteuilG02Action);
		fauteuilG03.setAction(fauteuilG03Action);
		fauteuilG04.setAction(fauteuilG04Action);
		fauteuilG05.setAction(fauteuilG05Action);
		fauteuilG06.setAction(fauteuilG06Action);
		fauteuilG07.setAction(fauteuilG07Action);
		fauteuilG08.setAction(fauteuilG08Action);
		fauteuilG09.setAction(fauteuilG09Action);
		fauteuilG10.setAction(fauteuilG10Action);

		fauteuilH01.setAction(fauteuilH01Action);
		fauteuilH02.setAction(fauteuilH02Action);
		fauteuilH03.setAction(fauteuilH03Action);
		fauteuilH04.setAction(fauteuilH04Action);
		fauteuilH05.setAction(fauteuilH05Action);
		fauteuilH06.setAction(fauteuilH06Action);
		fauteuilH07.setAction(fauteuilH07Action);
		fauteuilH08.setAction(fauteuilH08Action);
		fauteuilH09.setAction(fauteuilH09Action);
		fauteuilH10.setAction(fauteuilH10Action);

		fauteuilI01.setAction(fauteuilI01Action);
		fauteuilI02.setAction(fauteuilI02Action);
		fauteuilI03.setAction(fauteuilI03Action);
		fauteuilI04.setAction(fauteuilI04Action);
		fauteuilI05.setAction(fauteuilI05Action);
		fauteuilI06.setAction(fauteuilI06Action);
		fauteuilI07.setAction(fauteuilI07Action);
		fauteuilI08.setAction(fauteuilI08Action);
		fauteuilI09.setAction(fauteuilI09Action);
		fauteuilI10.setAction(fauteuilI10Action);

		fauteuilJ01.setAction(fauteuilJ01Action);
		fauteuilJ02.setAction(fauteuilJ02Action);
		fauteuilJ03.setAction(fauteuilJ03Action);
		fauteuilJ04.setAction(fauteuilJ04Action);
		fauteuilJ05.setAction(fauteuilJ05Action);
		fauteuilJ06.setAction(fauteuilJ06Action);
		fauteuilJ07.setAction(fauteuilJ07Action);
		fauteuilJ08.setAction(fauteuilJ08Action);
		fauteuilJ09.setAction(fauteuilJ09Action);
		fauteuilJ10.setAction(fauteuilJ10Action);

		fauteuilK01.setAction(fauteuilK01Action);
		fauteuilK02.setAction(fauteuilK02Action);
		fauteuilK03.setAction(fauteuilK03Action);
		fauteuilK04.setAction(fauteuilK04Action);
		fauteuilK05.setAction(fauteuilK05Action);
		fauteuilK06.setAction(fauteuilK06Action);
		fauteuilK07.setAction(fauteuilK07Action);
		fauteuilK08.setAction(fauteuilK08Action);
		fauteuilK09.setAction(fauteuilK09Action);
		fauteuilK10.setAction(fauteuilK10Action);

		fauteuilL01.setAction(fauteuilL01Action);
		fauteuilL02.setAction(fauteuilL02Action);
		fauteuilL03.setAction(fauteuilL03Action);
		fauteuilL04.setAction(fauteuilL04Action);
		fauteuilL05.setAction(fauteuilL05Action);
		fauteuilL06.setAction(fauteuilL06Action);
		fauteuilL07.setAction(fauteuilL07Action);
		fauteuilL08.setAction(fauteuilL08Action);
		fauteuilL09.setAction(fauteuilL09Action);
		fauteuilL10.setAction(fauteuilL10Action);

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

		menuItem = new JMenuItem(fauteuilA01Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA02Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA03Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA04Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA05Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA06Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA07Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA08Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA09Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilA10Action); // allocate menu-item and set action
		menu.add(menuItem);

		menuItem = new JMenuItem(fauteuilB01Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB02Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB03Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB04Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB05Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB06Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB07Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB08Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB09Action); // allocate menu-item and set action
		menu.add(menuItem);
		menuItem = new JMenuItem(fauteuilB10Action); // allocate menu-item and set action
		menu.add(menuItem);

		//menuItem = new JMenuItem(countDownAction); // allocate menu-item and set action
		menu.add(menuItem);

		menuBar.add(menu);

		// Create the second menu
		menu = new JMenu("Reset");
		menu.setMnemonic(KeyEvent.VK_R);
		menuItem = new JMenuItem(resetAction); // allocate menu-item and set action
		menu.add(menuItem);
		menuBar.add(menu);

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
			--count;
			tfCount.setText(count + "");
			this.btnSiege.setForeground(Color.RED);
			this.btnSiege.setEnabled(false);
			lstBtnSelect.add(this.btnSiege);
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
			count = 120;
			tfCount.setText(count + "");
			for (int i = 0; i < lstBtnSelect.size(); i++) {
				lstBtnSelect.get(i).setEnabled(true);
				lstBtnSelect.get(i).setForeground(Color.BLACK);
			}
		}
	}

	/** The entry main() method */
	public static void main(String[] args) {
		// Run GUI codes in the Event-Dispatching thread for thread safety
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new AffichageSpectacle(); // Let the constructor does the job
			}
		});
	}
}