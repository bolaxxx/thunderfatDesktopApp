/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import model.Paciente;
import view.EditPacienteWindow;

/**
 *
 * @author sergio
 */
public class ControlEditPacienteWindow implements ActionListener{
    private static ControlEditPacienteWindow controlEditPacienteWindow;
	
	private EditPacienteWindow editPacienteWindow;
	private MainControllerWindow controlPadre;
	

    private ControlEditPacienteWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;
	}
	
	public static ControlEditPacienteWindow getInstance(MainControllerWindow c) {
		if (controlEditPacienteWindow == null) {
			controlEditPacienteWindow = new ControlEditPacienteWindow(c);
		}
		
		controlEditPacienteWindow.editPacienteWindow = EditPacienteWindow.getInstance(controlEditPacienteWindow);
		
		return controlEditPacienteWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
// String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password, String complexion
		if (e.getSource() == editPacienteWindow.pacientePanel.btnAceptar){
			int id = editPacienteWindow.getUserEditedID();
			String dni = editPacienteWindow.pacientePanel.textField.getText();
			String nombre = editPacienteWindow.pacientePanel.textField_1.getText();
			String apellidos = editPacienteWindow.pacientePanel.textField_2.getText();
			String telefono = editPacienteWindow.pacientePanel.textField_3.getText();
			String email = editPacienteWindow.pacientePanel.textField_4.getText();
			float peso_actual = Float.parseFloat(editPacienteWindow.pacientePanel.textField_5.getText());
			float peso_objectivo =Float.parseFloat( editPacienteWindow.pacientePanel.textField_6.getText());
			float altura = Float.parseFloat(editPacienteWindow.pacientePanel.textField_7.getText());
			int edad = Integer.parseInt(editPacienteWindow.pacientePanel.textField_8.getText());
			String sexo = editPacienteWindow.pacientePanel.textField_9.getText();
			String password   = editPacienteWindow.pacientePanel.textField_10.getText();
			String complexion  = editPacienteWindow.pacientePanel.textField_11.getText();
                        
			
			Paciente u = controlPadre.getMainControl().thunderfat.getTargetedPaciente(id);
			u.setDni(dni);
                        u.setNombre(nombre);
                        u.setApellidos(apellidos);
                        u.setTelefono(telefono);
			u.setEmail(email);
                        u.setPeso_actual(peso_actual);
                        u.setPeso_objetivo(peso_objectivo);
                        u.setAltura(altura);
                        u.setPassword(password);
                        u.setEdad(edad);
                        u.setSexo(sexo);
			u.setComplexion(complexion);
			
			
			controlPadre.getMainControl().readWrite.editarPaciente(u.getId_paciente(), 
					u.getDni(), u.getNombre(), u.getApellidos(), u.getTelefono(), u.getEmail(), u.getPeso_actual(),u.getPeso_objetivo(), u.getAltura(),u.getEdad(),u.getSexo(),u.getPassword(),u.getComplexion());
			controlPadre.getMainControl().readWrite.leerPacientes();
			
			editPacienteWindow.setVisible(false);
			controlPadre.getControlListPacienteWindow().updatePacienteTable();
		}
		
		if (e.getSource() == editPacienteWindow.pacientePanel.btnLimpiar) {
			editPacienteWindow.pacientePanel.clearFields();
		}
		
		if (e.getSource() == editPacienteWindow.pacientePanel.btnCancelar) {
			editPacienteWindow.setVisible(false);
		}
		
	}
	
	public EditPacienteWindow getEditPacienteWindow(){
		return editPacienteWindow;
	}
    
}
