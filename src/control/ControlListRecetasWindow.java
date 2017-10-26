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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Cita;
import model.Receta;
import view.ListCitaWindow;
import view.ListRecetasWindow;
import view.MyTableModel;

/**
 *
 * @author sergio
 */
public class ControlListRecetasWindow implements ActionListener, DocumentListener, ItemListener{
     private static ControlListRecetasWindow controlListRecetasWindow;
	
	private MainControllerWindow controlPadre;
	private ListRecetasWindow listRecetaWindow;
	
	private ControlListRecetasWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;		
	}
	
	public static ControlListRecetasWindow getInstance(MainControllerWindow c){
		if (controlListRecetasWindow == null) {
			controlListRecetasWindow = new ControlListRecetasWindow(c);
		}
		
		controlListRecetasWindow.listRecetaWindow = ListRecetasWindow.getInstance(controlListRecetasWindow, controlListRecetasWindow.getTableModel());
//		controlListUserWindow.updateNewsComboBox();
		
		return controlListRecetasWindow;
	}
	

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listRecetaWindow.hideFilter) {
			listRecetaWindow.toggleShowFilter();
		}
		
		if (e.getSource() == listRecetaWindow.addUser) {
			controlPadre.openAddCitaWindow();
		}
		
		if (e.getSource() == listRecetaWindow.editUser) {
			//
                        //openEditPacienteWindow();
		}
    }

    private MyTableModel getTableModel() {

		return new MyTableModel(Receta.getTitleList(), controlPadre.getMainControl().thunderfat.getRecetasObjectList());
	}
	
	public ListRecetasWindow getListRecetasWindow() {
		return listRecetaWindow;
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

    public ListRecetasWindow getListRecetaWindow() {
        return listRecetaWindow;
    }
    
}
