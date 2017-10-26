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
import model.Paciente;
import view.ListCitaWindow;
import view.ListPacienteWindow;
import view.MyTableModel;

/**
 *
 * @author sergio
 */
public class ControlListCitaWindow implements ActionListener, DocumentListener, ItemListener{
       private static ControlListCitaWindow controlListCitaWindow;
	
	private MainControllerWindow controlPadre;
	private ListCitaWindow listCitaWindow;
	
	private ControlListCitaWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;		
	}
	
	public static ControlListCitaWindow getInstance(MainControllerWindow c){
		if (controlListCitaWindow == null) {
			controlListCitaWindow = new ControlListCitaWindow(c);
		}
		
		controlListCitaWindow.listCitaWindow = ListCitaWindow.getInstance(controlListCitaWindow, controlListCitaWindow.getTableModel());
//		controlListUserWindow.updateNewsComboBox();
		
		return controlListCitaWindow;
	}
	

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listCitaWindow.hideFilter) {
			listCitaWindow.toggleShowFilter();
		}
		
		if (e.getSource() == listCitaWindow.addUser) {
			controlPadre.openAddCitaWindow();
		}
		
		if (e.getSource() == listCitaWindow.editUser) {
			//
                        //openEditPacienteWindow();
		}
    }

    private MyTableModel getTableModel() {

		return new MyTableModel(Cita.getTitleList(), controlPadre.getMainControl().thunderfat.getCitasObjectList());
	}
	
	public ListCitaWindow getListPacienteWindow() {
		return listCitaWindow;
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

    public ListCitaWindow getListCitaWindow() {
        return listCitaWindow;
    }
    
}
