package swing;

//https://stackoverflow.com/questions/26031383/how-to-filter-jtable-with-respect-to-a-specific-column/26031896

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Personne.Spectateur;
import database.GestionFauteuil;
import database.GestionSpectateur;
import fauteuil.Fauteuil;
import spectacle.Spectacle;

public class AfficherFiltreReservation {

    
     
   

    private List<Spectateur> spe = new ArrayList<>();
    private JTable table;
    private JComboBox filterBy;
    private JTextField filterText;
    
    
    public AfficherFiltreReservation() {
    	
    	
    	recupererSpectateur();
    	
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }
               
                //new
                GestionSpectateur gs = GestionSpectateur.getDb();
        		
        		List<Spectateur> lstAllSpectateur = gs.retrieveAllSpectateurProcedureSQL();
        		
        		 DefaultTableModel model = new DefaultTableModel(new Object[]{"Prénom", "Nom", "Spectacle", "Fauteuil"}, 0);
        		 
        		for (int i = 0; i < lstAllSpectateur.size(); i++) {	
        			Spectateur spe = lstAllSpectateur.get(i);
        			model.addRow(new Object[]{spe.getPrenom(), spe.getNom(), spe.getSpectacleReserve(), spe.getFauteuilReserve()});
        			System.out.println("++++");
        			System.out.println(spe.getPrenom());
        			System.out.println(("++++"));
        			}	
        		
        		 table = new JTable(model);
                 table.setRowSorter(new TableRowSorter<TableModel>(model));
                // fin new
        		
        		 /*
        		// ancien
                DefaultTableModel model = new DefaultTableModel(new Object[]{"Prénom", "Nom", "Spectacle", "Fauteuil"}, 0);
                model.addRow(new Object[]{"Paul", "Chatenou", "La Sirène aux Alouettes", "A01"});
                model.addRow(new Object[]{"Georges", "Luthi", "Huis clos", "F04"});
                model.addRow(new Object[]{"Jean", "Carroz", "La Sirène aux Alouettes", "F05"});
                model.addRow(new Object[]{"Robert", "Delon", "Perdues dans Stockholm", "L10"});
                

                table = new JTable(model);
                table.setRowSorter(new TableRowSorter<TableModel>(model));
              //fin ancien
                */

                JPanel filterPane = new JPanel(new GridBagLayout());
                filterBy = new JComboBox(new Object[]{"Aucun filtre", "Filtrer par prénom", "Filtrer par nom", "Filtrer par spectacle", "Filtrer par fauteuil"});
                filterText = new JTextField(20);
                filterPane.add(filterBy);
                filterPane.add(filterText);
                
                filterBy.setSelectedIndex(0);
                filterBy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        updateFilter();
                    }
                });

                filterText.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        updateFilter();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        updateFilter();
                    }
                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        updateFilter();
                    }
                });

                
                JFrame frame = new JFrame("Réservations");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(filterPane, BorderLayout.NORTH);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
            }
        });
        
    }
    protected void updateFilter() {
        Object selected = filterBy.getSelectedItem();
        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) table.getRowSorter();
        String text = "(?i)" + filterText.getText();
        if ("Aucun filtre".equals(selected)) {
            sorter.setRowFilter(null);
        } else {
            int col = -1;
            if ("Filtrer par prénom".equals(selected)) {
                col = 0;
            } else if ("Filtrer par nom".equals(selected)) {
                col = 1;
            } else if ("Filtrer par spectacle".equals(selected)) {
                col = 2;
            } else if ("Filtrer par fauteuil".equals(selected)) {
                col = 3;
            }
            sorter.setRowFilter(RowFilter.regexFilter(text, col));
        }
    }
    
public  void recupererSpectateur() {
		
		GestionSpectateur gs = GestionSpectateur.getDb();
		
		List<Spectateur> lstAllSpectateur = gs.retrieveAllSpectateurProcedureSQL();
		
		for (int i = 0; i < lstAllSpectateur.size(); i++) {	
			Spectateur spe = lstAllSpectateur.get(i);
			System.out.println(spe.getPrenom());
			System.out.println(spe.getNom());
			System.out.println(spe.getSpectacleReserve());
			System.out.println(spe.getFauteuilReserve());
			}		
		}
/** The entry main() method */
public static void afficherFiltreReservation() {
   // Run the GUI codes on Event-Dispatching thread for thread safety
   SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
         new AfficherFiltreReservation(); // Let the constructor do the job
      }
   });
}
	}

