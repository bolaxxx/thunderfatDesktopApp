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
import model.Paciente;
import view.ListPacienteWindow;
import view.ListPlanesDietasWindow;
import view.MyTableModel;

/**
 *
 * @author sergio
 */
public class ControlListPlanesDietaWindow implements ActionListener, DocumentListener, ItemListener  {
    private MainControllerWindow controlPadre;
    private static ControlListPlanesDietaWindow  controlListPlanesDietaWindow;
    private ListPlanesDietasWindow  listPlanesDietasWindow;
    private ControlListPlanesDietaWindow(MainControllerWindow c){
        super();
        this.controlPadre=c;
        
    }
    
    public static ControlListPlanesDietaWindow getInstance(MainControllerWindow c){
       if (controlListPlanesDietaWindow == null) {
			controlListPlanesDietaWindow = new ControlListPlanesDietaWindow(c);
		}
		
		controlListPlanesDietaWindow.listPlanesDietasWindow = ListPlanesDietasWindow.getInstance(controlListPlanesDietaWindow, controlListPlanesDietaWindow.getTableModel());
//		controlListUserWindow.updateNewsComboBox();
		
		return controlListPlanesDietaWindow;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    private MyTableModel getTableModel() {

		return new MyTableModel(Paciente.getTitleList(), controlPadre.getMainControl().thunderfat.getPacientesObjectList());
	}
	
	public ListPlanesDietasWindow getListPacienteWindow() {
		return listPlanesDietasWindow;
	}
}
