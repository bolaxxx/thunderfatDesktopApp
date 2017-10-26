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
import model.Paciente;
import view.ListPacienteWindow;
import view.MyTableModel;

/**
 *
 * @author sergio
 */
public class ControlListPacienteWindow implements ActionListener, DocumentListener, ItemListener {
    
    private static ControlListPacienteWindow controlListPacienteWindow;
	
	private MainControllerWindow controlPadre;
	private ListPacienteWindow listPacienteWindow;
	
	private ControlListPacienteWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;		
	}
	
	public static ControlListPacienteWindow getInstance(MainControllerWindow c){
		if (controlListPacienteWindow == null) {
			controlListPacienteWindow = new ControlListPacienteWindow(c);
		}
		
		controlListPacienteWindow.listPacienteWindow = ListPacienteWindow.getInstance(controlListPacienteWindow, controlListPacienteWindow.getTableModel());
//		controlListUserWindow.updateNewsComboBox();
		
		return controlListPacienteWindow;
	}
	

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == listPacienteWindow.hideFilter) {
			listPacienteWindow.toggleShowFilter();
		}
		
		if (e.getSource() == listPacienteWindow.addUser) {
			controlPadre.openAddPacienteWindow();
		}
		
		if (e.getSource() == listPacienteWindow.editUser) {
			//
                       openEditPacienteWindow();
		}
    }

    private MyTableModel getTableModel() {

		return new MyTableModel(Paciente.getTitleList(), controlPadre.getMainControl().thunderfat.getPacientesObjectList());
	}
	
	public ListPacienteWindow getListPacienteWindow() {
		return listPacienteWindow;
	}
    @Override
    public void insertUpdate(DocumentEvent e) {
       if (e.getDocument() == listPacienteWindow.userText.getDocument()){
			listPacienteWindow.filterUser();
		}
		
		if (e.getDocument() == listPacienteWindow.correoText.getDocument()){
			listPacienteWindow.filterMail();
		}
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
if (e.getDocument() == listPacienteWindow.userText.getDocument()){
			listPacienteWindow.filterUser();
		}
		
		if (e.getDocument() == listPacienteWindow.correoText.getDocument()){
			listPacienteWindow.filterMail();
		}
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        if (e.getDocument() == listPacienteWindow.userText.getDocument()){
			listPacienteWindow.filterUser();
		}
		
		if (e.getDocument() == listPacienteWindow.correoText.getDocument()){
			listPacienteWindow.filterMail();
		}
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       	
    }
    private void openEditPacienteWindow(){
		int id_paciente;
                String dni;
                String nombre;
                String apellidos;
                String telefono;
                String email;
                float peso_actual;
                float peso_objetivo;
                float altura;
                int edad;
                String sexo ;
                String password;
                String complexion;
		
		if (listPacienteWindow.getTable().getSelectedRowCount() > 0){
			id_paciente = (int) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 0);
			dni = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 1);
			nombre = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 2);
			apellidos = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(),3);
			telefono = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 4);
			email = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 5);
			peso_actual = (float) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 6);
			peso_objetivo = (float) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 7);
			altura = (float) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 8);
			edad = (int) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 9);
			sexo = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 10);
			password = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 11);
			complexion = (String) listPacienteWindow.getTable().getModel().getValueAt(listPacienteWindow.getTable().getSelectedRow(), 12);
//			
			
			controlPadre.openEditPacienteWindow(id_paciente, dni,nombre, apellidos,telefono, email,peso_actual,peso_objetivo,altura,edad, sexo , password, complexion);

		} else {
			JOptionPane.showMessageDialog(controlPadre.getMainFrame(), "Seleccione paciente a editar.", "Editar Paciente", JOptionPane.INFORMATION_MESSAGE);
		}
	}
    public void updatePacienteTable(){
		this.listPacienteWindow.updateTable(this.getTableModel());
	}
}
