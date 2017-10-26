/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddPacienteWindow;

/**
 *
 * @author sergio
 */
public class ControlAddPacienteWindow implements ActionListener  {

  private static ControlAddPacienteWindow controlAddPacienteWindow;

   
	
	private AddPacienteWindow addUserWindow;
	private MainControllerWindow controlPadre;
        
        private ControlAddPacienteWindow(MainControllerWindow c){
            super();
            this.controlPadre=c;
            
        }
        
        public static ControlAddPacienteWindow getInstance(MainControllerWindow c){
        if (controlAddPacienteWindow == null) {
			controlAddPacienteWindow = new ControlAddPacienteWindow(c);
		}
		
		controlAddPacienteWindow.addUserWindow = AddPacienteWindow.getInstance(controlAddPacienteWindow);
		
		return controlAddPacienteWindow;
	}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addUserWindow.pacientePanel.btnAceptar){
			if ((!addUserWindow.pacientePanel.textField.getText().isEmpty())) {
				System.out.println("dice que voy a fallar ");
				controlPadre.getMainControl().readWrite.insertarPaciente(
                                                addUserWindow.pacientePanel.textField.getText(), 
						addUserWindow.pacientePanel.textField_1.getText(), 
						addUserWindow.pacientePanel.textField_2.getText(), 
						addUserWindow.pacientePanel.textField_3.getText(), 
						addUserWindow.pacientePanel.textField_4.getText(), 
						Float.parseFloat(addUserWindow.pacientePanel.textField_5.getText()), 
						Float.parseFloat(addUserWindow.pacientePanel.textField_6.getText()), 
						Float.parseFloat(addUserWindow.pacientePanel.textField_7.getText()), 
						Integer.parseInt(addUserWindow.pacientePanel.textField_8.getText()), 
                                                addUserWindow.pacientePanel.textField_9.getText(), 
                                                addUserWindow.pacientePanel.textField_10.getText(), 
                                                addUserWindow.pacientePanel.textField_11.getText()

						);
				controlPadre.getMainControl().readWrite.leerPacientes();
				
				this.addUserWindow.setVisible(false);
				this.controlPadre.getControlListPacienteWindow().updatePacienteTable();
			}
			
		}
		
		if (e.getSource() == addUserWindow.pacientePanel.btnLimpiar) {
			addUserWindow.pacientePanel.clearFields();
		}
		
		if (e.getSource() == addUserWindow.pacientePanel.btnCancelar) {
			addUserWindow.setVisible(false);
		}
		
    }

    public AddPacienteWindow getAddUserWindow() {
        return addUserWindow;
    }

    public void setAddUserWindow(AddPacienteWindow addUserWindow) {
        this.addUserWindow = addUserWindow;
    }
    
}
