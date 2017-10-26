/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Alimento;
import model.Cita;
import view.ListAlimentosWindow;
import view.ListCitaWindow;
import view.MyTableModel;

/**
 *
 * @author sergio
 */
public class ControlListAlimentosWindow implements ActionListener, DocumentListener, ItemListener {
     private static ControlListAlimentosWindow controlListAlimentosWindow;
	
	private MainControllerWindow controlPadre;
	private ListAlimentosWindow listAlimentosWindow;
	
	private ControlListAlimentosWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;		
	}
	
	public static ControlListAlimentosWindow getInstance(MainControllerWindow c){
		if (controlListAlimentosWindow == null) {
			controlListAlimentosWindow = new ControlListAlimentosWindow(c);
		}
		
		controlListAlimentosWindow.listAlimentosWindow = ListAlimentosWindow.getInstance(controlListAlimentosWindow, controlListAlimentosWindow.getTableModel());
//		controlListUserWindow.updateNewsComboBox();
		
		return controlListAlimentosWindow;
	}
	

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listAlimentosWindow.hideFilter) {
			listAlimentosWindow.toggleShowFilter();
		}
		
		if (e.getSource() == listAlimentosWindow.addUser) {
			controlPadre.openAddCitaWindow();
		}
		
		if (e.getSource() == listAlimentosWindow.editUser) {
			//
                        openEditAlimentoWindow();
		}
    }

    private MyTableModel getTableModel() {

		return new MyTableModel(Alimento.getTitleList(), controlPadre.getMainControl().thunderfat.getAlimentosObjectList());
	}
	
	

 

    @Override
    public void insertUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListAlimentosWindow getListAlimentosWindow() {
        return listAlimentosWindow;
    }

    private void openEditAlimentoWindow() {
      int id_alimento;
      String nombre;
      String estado ;
      float caloria;
      float proteinas;
      float grasas;
      float hidratos_de_carbono;
      float      H20;
     float      NE;
     float vitamina_a;
     float vitamina_B1;
     float vitamina_B2;
     float vitamina_C;
     float Niac;
     float sodio ;
     float potasio;
     float calcio ;
     float magnesio;
     float hierro ;
     float cobre;
     float fosforo;
     float azufre ;
     float cloro;
     float Fen;
     float Ileu;
     float Leu;
     float Lis;
     float Met;
     float Tre;
     float Tri;
     float Val;
     float Acid ;
     float AlCAL;
		
		if (listAlimentosWindow.getTable().getSelectedRowCount() > 0){
			id_alimento = (int) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 0);
			nombre = (String) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 1);
			estado = (String) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 2);
			caloria = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(),3);
			proteinas = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 4);
			grasas = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 5);
			hidratos_de_carbono = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 6);
			H20 = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 7);
			NE = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 8);
			vitamina_a = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 9);
			vitamina_B1 = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 10);
			vitamina_B2= (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 11);
			vitamina_C = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 12);
			Niac = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 13);
                        sodio = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 14);
			potasio= (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 15);
			calcio = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 16);
			magnesio = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 17);
			hierro = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 18);
			cobre = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 19);
			fosforo = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 20);
			azufre = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 21);
			cloro = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 22);
			Fen = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 23);
			Ileu = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 24);
			Leu = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 25);
			Lis = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 26);
			Met = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 27);
			Tre = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 28);
			Tri = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 29);
			Val = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 30);
			Acid = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 31);
			AlCAL = (float) listAlimentosWindow.getTable().getModel().getValueAt(listAlimentosWindow.getTable().getSelectedRow(), 32);
			
//			
			//float vitamina_a;     float vitamina_B1;     float vitamina_B2;     float vitamina_C;     float Niac;
			
                        controlPadre.openEditAlimentoWindow(id_alimento, nombre, estado, caloria, proteinas, grasas, hidratos_de_carbono, H20, NE, vitamina_a, vitamina_B1, vitamina_B2, vitamina_C, Niac, sodio, potasio, calcio, magnesio, hierro, cobre, fosforo, azufre, cloro, Fen, Ileu, Leu, Lis, Met, Tre, Tri, Val, Acid, AlCAL);
		} else {
			JOptionPane.showMessageDialog(controlPadre.getMainFrame(), "Seleccione alimento a editar.", "Editar Alimento", JOptionPane.INFORMATION_MESSAGE);
		}
    }
    
}
