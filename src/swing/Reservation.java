package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Test Actions which are ActionListeners that can be applied to more than one
 * sources. An action can specify the state and functionality of an
 * ActionListener.
 */
@SuppressWarnings("serial")
public class Reservation extends JFrame {
	private JTextField tfCount;
	private int count;

	/** Constructor to setup the GUI */
	public Reservation() {
		// Create the Actions shared by the button and menu-item
		Action fauteuilA01Action = new CountUpAction("A 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA02Action = new CountUpAction("A 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA03Action = new CountUpAction("A 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA04Action = new CountUpAction("A 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA05Action = new CountUpAction("A 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA06Action = new CountUpAction("A 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA07Action = new CountUpAction("A 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA08Action = new CountUpAction("A 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA09Action = new CountUpAction("A 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilA10Action = new CountUpAction("A 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilB01Action = new CountUpAction("B 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB02Action = new CountUpAction("B 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB03Action = new CountUpAction("B 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB04Action = new CountUpAction("B 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB05Action = new CountUpAction("B 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB06Action = new CountUpAction("B 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB07Action = new CountUpAction("B 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB08Action = new CountUpAction("B 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB09Action = new CountUpAction("B 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilB10Action = new CountUpAction("B 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilC01Action = new CountUpAction("C 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC02Action = new CountUpAction("C 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC03Action = new CountUpAction("C 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC04Action = new CountUpAction("C 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC05Action = new CountUpAction("C 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC06Action = new CountUpAction("C 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC07Action = new CountUpAction("C 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC08Action = new CountUpAction("C 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC09Action = new CountUpAction("C 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilC10Action = new CountUpAction("C 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilD01Action = new CountUpAction("D 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD02Action = new CountUpAction("D 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD03Action = new CountUpAction("D 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD04Action = new CountUpAction("D 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD05Action = new CountUpAction("D 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD06Action = new CountUpAction("D 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD07Action = new CountUpAction("D 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD08Action = new CountUpAction("D 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD09Action = new CountUpAction("D 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilD10Action = new CountUpAction("D 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilE01Action = new CountUpAction("E 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE02Action = new CountUpAction("E 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE03Action = new CountUpAction("E 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE04Action = new CountUpAction("E 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE05Action = new CountUpAction("E 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE06Action = new CountUpAction("E 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE07Action = new CountUpAction("E 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE08Action = new CountUpAction("E 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE09Action = new CountUpAction("E 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilE10Action = new CountUpAction("E 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilF01Action = new CountUpAction("F 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF02Action = new CountUpAction("F 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF03Action = new CountUpAction("F 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF04Action = new CountUpAction("F 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF05Action = new CountUpAction("F 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF06Action = new CountUpAction("F 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF07Action = new CountUpAction("F 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF08Action = new CountUpAction("F 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF09Action = new CountUpAction("F 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilF10Action = new CountUpAction("F 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilG01Action = new CountUpAction("G 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG02Action = new CountUpAction("G 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG03Action = new CountUpAction("G 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG04Action = new CountUpAction("G 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG05Action = new CountUpAction("G 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG06Action = new CountUpAction("G 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG07Action = new CountUpAction("G 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG08Action = new CountUpAction("G 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG09Action = new CountUpAction("G 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilG10Action = new CountUpAction("G 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilH01Action = new CountUpAction("H 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH02Action = new CountUpAction("H 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH03Action = new CountUpAction("H 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH04Action = new CountUpAction("H 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH05Action = new CountUpAction("H 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH06Action = new CountUpAction("H 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH07Action = new CountUpAction("H 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH08Action = new CountUpAction("H 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH09Action = new CountUpAction("H 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilH10Action = new CountUpAction("H 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilI01Action = new CountUpAction("I 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI02Action = new CountUpAction("I 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI03Action = new CountUpAction("I 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI04Action = new CountUpAction("I 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI05Action = new CountUpAction("I 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI06Action = new CountUpAction("I 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI07Action = new CountUpAction("I 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI08Action = new CountUpAction("I 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI09Action = new CountUpAction("I 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilI10Action = new CountUpAction("I 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilJ01Action = new CountUpAction("J 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ02Action = new CountUpAction("J 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ03Action = new CountUpAction("J 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ04Action = new CountUpAction("J 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ05Action = new CountUpAction("J 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ06Action = new CountUpAction("J 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ07Action = new CountUpAction("J 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ08Action = new CountUpAction("J 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ09Action = new CountUpAction("J 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilJ10Action = new CountUpAction("J 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilK01Action = new CountUpAction("K 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK02Action = new CountUpAction("K 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK03Action = new CountUpAction("K 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK04Action = new CountUpAction("K 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK05Action = new CountUpAction("K 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK06Action = new CountUpAction("K 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK07Action = new CountUpAction("K 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK08Action = new CountUpAction("K 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK09Action = new CountUpAction("K 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilK10Action = new CountUpAction("K 10", "To count up", new Integer(KeyEvent.VK_U));

		Action fauteuilL01Action = new CountUpAction("L 01", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL02Action = new CountUpAction("L 02", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL03Action = new CountUpAction("L 03", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL04Action = new CountUpAction("L 04", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL05Action = new CountUpAction("L 05", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL06Action = new CountUpAction("L 06", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL07Action = new CountUpAction("L 07", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL08Action = new CountUpAction("L 08", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL09Action = new CountUpAction("L 09", "To count up", new Integer(KeyEvent.VK_U));
		Action fauteuilL10Action = new CountUpAction("L 10", "To count up", new Integer(KeyEvent.VK_U));

		Action countDownAction = new CountDownAction("Count Down", "To count down", new Integer(KeyEvent.VK_D));
		Action resetAction = new ResetAction("Reset", "To reset to zero", new Integer(KeyEvent.VK_R));

		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		 

		// frame VIDE
		JPanel panelVide1 = new JPanel();
		panelVide1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelVide1.setPreferredSize(new Dimension(800, 50));
		panelVide1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(panelVide1);
		// frame pour boutons rangée A
		JPanel rangeeA = new JPanel();
		rangeeA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeA.setPreferredSize(new Dimension(800, 30));
		rangeeA.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeA);
		// frame pour boutons rangée B
		JPanel rangeeB = new JPanel();
		rangeeB.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeB.setPreferredSize(new Dimension(800, 30));
		rangeeB.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeB);
		// frame pour boutons rangée C
		JPanel rangeeC = new JPanel();
		rangeeC.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeC.setPreferredSize(new Dimension(800, 30));
		rangeeC.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeC);
		// frame pour boutons rangée D
		JPanel rangeeD = new JPanel();
		rangeeD.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeD.setPreferredSize(new Dimension(800, 30));
		rangeeD.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeD);
		// frame pour boutons rangée E
		JPanel rangeeE = new JPanel();
		rangeeE.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeE.setPreferredSize(new Dimension(800, 30));
		rangeeE.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeE);
		// frame pour boutons rangée F
		JPanel rangeeF = new JPanel();
		rangeeF.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeF.setPreferredSize(new Dimension(800, 30));
		rangeeF.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeF);
		// frame pour boutons rangée G
		JPanel rangeeG = new JPanel();
		rangeeG.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeG.setPreferredSize(new Dimension(800, 30));
		rangeeG.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeG);
		// frame pour boutons rangée H
		JPanel rangeeH = new JPanel();
		rangeeH.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeH.setPreferredSize(new Dimension(800, 30));
		rangeeH.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeH);
		// frame pour boutons rangée I
		JPanel rangeeI = new JPanel();
		rangeeI.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeI.setPreferredSize(new Dimension(800, 30));
		rangeeI.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeI);
		// frame pour boutons rangée J
		JPanel rangeeJ = new JPanel();
		rangeeJ.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeJ.setPreferredSize(new Dimension(800, 30));
		rangeeJ.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeJ);
		// frame pour boutons rangée K
		JPanel rangeeK = new JPanel();
		rangeeK.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeK.setPreferredSize(new Dimension(800, 30));
		rangeeK.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeK);
		// frame pour boutons rangée L
		JPanel rangeeL = new JPanel();
		rangeeL.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		rangeeL.setPreferredSize(new Dimension(800, 30));
		rangeeL.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(rangeeL);
		// frame VIDE 2
		JPanel panelVide2 = new JPanel();
		panelVide2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelVide2.setPreferredSize(new Dimension(800, 50));
		panelVide2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(panelVide2);
		// frame pour autres boutons
		JPanel panelAutresBoutons = new JPanel();
		panelAutresBoutons.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		panelAutresBoutons.setPreferredSize(new Dimension(800, 50));
		panelAutresBoutons.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		cp.add(panelAutresBoutons);

		// Create buttons
		panelAutresBoutons.add(new JLabel("Nombre de places restantes:"));

		tfCount = new JTextField("120", 4);
		tfCount.setHorizontalAlignment(JTextField.RIGHT);
		panelAutresBoutons.add(tfCount);

		JButton fauteuilA01 = new JButton();
		rangeeA.add(fauteuilA01);
		JButton fauteuilA02 = new JButton();
		rangeeA.add(fauteuilA02);
		JButton fauteuilA03 = new JButton();
		rangeeA.add(fauteuilA03);
		JButton fauteuilA04 = new JButton();
		rangeeA.add(fauteuilA04);
		JButton fauteuilA05 = new JButton();
		rangeeA.add(fauteuilA05);
		JButton fauteuilA06 = new JButton();
		rangeeA.add(fauteuilA06);
		JButton fauteuilA07 = new JButton();
		rangeeA.add(fauteuilA07);
		JButton fauteuilA08 = new JButton();
		rangeeA.add(fauteuilA08);
		JButton fauteuilA09 = new JButton();
		rangeeA.add(fauteuilA09);
		JButton fauteuilA10 = new JButton();
		rangeeA.add(fauteuilA10);

		JButton fauteuilB01 = new JButton();
		rangeeB.add(fauteuilB01);
		JButton fauteuilB02 = new JButton();
		rangeeB.add(fauteuilB02);
		JButton fauteuilB03 = new JButton();
		rangeeB.add(fauteuilB03);
		JButton fauteuilB04 = new JButton();
		rangeeB.add(fauteuilB04);
		JButton fauteuilB05 = new JButton();
		rangeeB.add(fauteuilB05);
		JButton fauteuilB06 = new JButton();
		rangeeB.add(fauteuilB06);
		JButton fauteuilB07 = new JButton();
		rangeeB.add(fauteuilB07);
		JButton fauteuilB08 = new JButton();
		rangeeB.add(fauteuilB08);
		JButton fauteuilB09 = new JButton();
		rangeeB.add(fauteuilB09);
		JButton fauteuilB10 = new JButton();
		rangeeB.add(fauteuilB10);

		JButton fauteuilC01 = new JButton();
		rangeeC.add(fauteuilC01);
		JButton fauteuilC02 = new JButton();
		rangeeC.add(fauteuilC02);
		JButton fauteuilC03 = new JButton();
		rangeeC.add(fauteuilC03);
		JButton fauteuilC04 = new JButton();
		rangeeC.add(fauteuilC04);
		JButton fauteuilC05 = new JButton();
		rangeeC.add(fauteuilC05);
		JButton fauteuilC06 = new JButton();
		rangeeC.add(fauteuilC06);
		JButton fauteuilC07 = new JButton();
		rangeeC.add(fauteuilC07);
		JButton fauteuilC08 = new JButton();
		rangeeC.add(fauteuilC08);
		JButton fauteuilC09 = new JButton();
		rangeeC.add(fauteuilC09);
		JButton fauteuilC10 = new JButton();
		rangeeC.add(fauteuilC10);

		JButton fauteuilD01 = new JButton();
		rangeeD.add(fauteuilD01);
		JButton fauteuilD02 = new JButton();
		rangeeD.add(fauteuilD02);
		JButton fauteuilD03 = new JButton();
		rangeeD.add(fauteuilD03);
		JButton fauteuilD04 = new JButton();
		rangeeD.add(fauteuilD04);
		JButton fauteuilD05 = new JButton();
		rangeeD.add(fauteuilD05);
		JButton fauteuilD06 = new JButton();
		rangeeD.add(fauteuilD06);
		JButton fauteuilD07 = new JButton();
		rangeeD.add(fauteuilD07);
		JButton fauteuilD08 = new JButton();
		rangeeD.add(fauteuilD08);
		JButton fauteuilD09 = new JButton();
		rangeeD.add(fauteuilD09);
		JButton fauteuilD10 = new JButton();
		rangeeD.add(fauteuilD10);

		JButton fauteuilE01 = new JButton();
		rangeeE.add(fauteuilE01);
		JButton fauteuilE02 = new JButton();
		rangeeE.add(fauteuilE02);
		JButton fauteuilE03 = new JButton();
		rangeeE.add(fauteuilE03);
		JButton fauteuilE04 = new JButton();
		rangeeE.add(fauteuilE04);
		JButton fauteuilE05 = new JButton();
		rangeeE.add(fauteuilE05);
		JButton fauteuilE06 = new JButton();
		rangeeE.add(fauteuilE06);
		JButton fauteuilE07 = new JButton();
		rangeeE.add(fauteuilE07);
		JButton fauteuilE08 = new JButton();
		rangeeE.add(fauteuilE08);
		JButton fauteuilE09 = new JButton();
		rangeeE.add(fauteuilE09);
		JButton fauteuilE10 = new JButton();
		rangeeE.add(fauteuilE10);

		JButton fauteuilF01 = new JButton();
		rangeeF.add(fauteuilF01);
		JButton fauteuilF02 = new JButton();
		rangeeF.add(fauteuilF02);
		JButton fauteuilF03 = new JButton();
		rangeeF.add(fauteuilF03);
		JButton fauteuilF04 = new JButton();
		rangeeF.add(fauteuilF04);
		JButton fauteuilF05 = new JButton();
		rangeeF.add(fauteuilF05);
		JButton fauteuilF06 = new JButton();
		rangeeF.add(fauteuilF06);
		JButton fauteuilF07 = new JButton();
		rangeeF.add(fauteuilF07);
		JButton fauteuilF08 = new JButton();
		rangeeF.add(fauteuilF08);
		JButton fauteuilF09 = new JButton();
		rangeeF.add(fauteuilF09);
		JButton fauteuilF10 = new JButton();
		rangeeF.add(fauteuilF10);

		JButton fauteuilG01 = new JButton();
		rangeeG.add(fauteuilG01);
		JButton fauteuilG02 = new JButton();
		rangeeG.add(fauteuilG02);
		JButton fauteuilG03 = new JButton();
		rangeeG.add(fauteuilG03);
		JButton fauteuilG04 = new JButton();
		rangeeG.add(fauteuilG04);
		JButton fauteuilG05 = new JButton();
		rangeeG.add(fauteuilG05);
		JButton fauteuilG06 = new JButton();
		rangeeG.add(fauteuilG06);
		JButton fauteuilG07 = new JButton();
		rangeeG.add(fauteuilG07);
		JButton fauteuilG08 = new JButton();
		rangeeG.add(fauteuilG08);
		JButton fauteuilG09 = new JButton();
		rangeeG.add(fauteuilG09);
		JButton fauteuilG10 = new JButton();
		rangeeG.add(fauteuilG10);

		JButton fauteuilH01 = new JButton();
		rangeeH.add(fauteuilH01);
		JButton fauteuilH02 = new JButton();
		rangeeH.add(fauteuilH02);
		JButton fauteuilH03 = new JButton();
		rangeeH.add(fauteuilH03);
		JButton fauteuilH04 = new JButton();
		rangeeH.add(fauteuilH04);
		JButton fauteuilH05 = new JButton();
		rangeeH.add(fauteuilH05);
		JButton fauteuilH06 = new JButton();
		rangeeH.add(fauteuilH06);
		JButton fauteuilH07 = new JButton();
		rangeeH.add(fauteuilH07);
		JButton fauteuilH08 = new JButton();
		rangeeH.add(fauteuilH08);
		JButton fauteuilH09 = new JButton();
		rangeeH.add(fauteuilH09);
		JButton fauteuilH10 = new JButton();
		rangeeH.add(fauteuilH10);

		JButton fauteuilI01 = new JButton();
		rangeeI.add(fauteuilI01);
		JButton fauteuilI02 = new JButton();
		rangeeI.add(fauteuilI02);
		JButton fauteuilI03 = new JButton();
		rangeeI.add(fauteuilI03);
		JButton fauteuilI04 = new JButton();
		rangeeI.add(fauteuilI04);
		JButton fauteuilI05 = new JButton();
		rangeeI.add(fauteuilI05);
		JButton fauteuilI06 = new JButton();
		rangeeI.add(fauteuilI06);
		JButton fauteuilI07 = new JButton();
		rangeeI.add(fauteuilI07);
		JButton fauteuilI08 = new JButton();
		rangeeI.add(fauteuilI08);
		JButton fauteuilI09 = new JButton();
		rangeeI.add(fauteuilI09);
		JButton fauteuilI10 = new JButton();
		rangeeI.add(fauteuilI10);

		JButton fauteuilJ01 = new JButton();
		rangeeJ.add(fauteuilJ01);
		JButton fauteuilJ02 = new JButton();
		rangeeJ.add(fauteuilJ02);
		JButton fauteuilJ03 = new JButton();
		rangeeJ.add(fauteuilJ03);
		JButton fauteuilJ04 = new JButton();
		rangeeJ.add(fauteuilJ04);
		JButton fauteuilJ05 = new JButton();
		rangeeJ.add(fauteuilJ05);
		JButton fauteuilJ06 = new JButton();
		rangeeJ.add(fauteuilJ06);
		JButton fauteuilJ07 = new JButton();
		rangeeJ.add(fauteuilJ07);
		JButton fauteuilJ08 = new JButton();
		rangeeJ.add(fauteuilJ08);
		JButton fauteuilJ09 = new JButton();
		rangeeJ.add(fauteuilJ09);
		JButton fauteuilJ10 = new JButton();
		rangeeJ.add(fauteuilJ10);

		JButton fauteuilK01 = new JButton();
		rangeeK.add(fauteuilK01);
		JButton fauteuilK02 = new JButton();
		rangeeK.add(fauteuilK02);
		JButton fauteuilK03 = new JButton();
		rangeeK.add(fauteuilK03);
		JButton fauteuilK04 = new JButton();
		rangeeK.add(fauteuilK04);
		JButton fauteuilK05 = new JButton();
		rangeeK.add(fauteuilK05);
		JButton fauteuilK06 = new JButton();
		rangeeK.add(fauteuilK06);
		JButton fauteuilK07 = new JButton();
		rangeeK.add(fauteuilK07);
		JButton fauteuilK08 = new JButton();
		rangeeK.add(fauteuilK08);
		JButton fauteuilK09 = new JButton();
		rangeeK.add(fauteuilK09);
		JButton fauteuilK10 = new JButton();
		rangeeK.add(fauteuilK10);

		JButton fauteuilL01 = new JButton();
		rangeeL.add(fauteuilL01);
		JButton fauteuilL02 = new JButton();
		rangeeL.add(fauteuilL02);
		JButton fauteuilL03 = new JButton();
		rangeeL.add(fauteuilL03);
		JButton fauteuilL04 = new JButton();
		rangeeL.add(fauteuilL04);
		JButton fauteuilL05 = new JButton();
		rangeeL.add(fauteuilL05);
		JButton fauteuilL06 = new JButton();
		rangeeL.add(fauteuilL06);
		JButton fauteuilL07 = new JButton();
		rangeeL.add(fauteuilL07);
		JButton fauteuilL08 = new JButton();
		rangeeL.add(fauteuilL08);
		JButton fauteuilL09 = new JButton();
		rangeeL.add(fauteuilL09);
		JButton fauteuilL10 = new JButton();
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

		btnCountDown.setAction(countDownAction);
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

		menuItem = new JMenuItem(countDownAction); // allocate menu-item and set action
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
		/** Constructor */
		public CountDownAction(String name, String shortDesc, Integer mnemonic) {
			super(name);
			putValue(SHORT_DESCRIPTION, shortDesc);
			putValue(MNEMONIC_KEY, mnemonic);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			--count;
			tfCount.setText(count + "");
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
			count = 0;
			tfCount.setText(count + "");
		}
	}

	/** The entry main() method */
	public static void main(String[] args) {
		// Run GUI codes in the Event-Dispatching thread for thread safety
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Reservation(); // Let the constructor does the job
			}
		});
	}
}