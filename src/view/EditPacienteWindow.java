/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlEditPacienteWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import view.Panel.PacientePanel;

/**
 *
 * @author sergio
 */
public class EditPacienteWindow extends JInternalFrame{
    private static EditPacienteWindow editPacienteWindow;
	private ControlEditPacienteWindow control;

	private int userEditedID;
	
	public PacientePanel pacientePanel;

	public static EditPacienteWindow getInstance(ControlEditPacienteWindow c) {
		if (editPacienteWindow == null) {
			editPacienteWindow = new EditPacienteWindow(c);
		}

		if (editPacienteWindow.isVisible()) {
			try {
				editPacienteWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			editPacienteWindow.setVisible(true);
		}

		return editPacienteWindow;
	}

	private EditPacienteWindow(ControlEditPacienteWindow c) {
		super("Editar Paciente", true, true, true, true);
		this.control = c;
		
		this.pacientePanel = new PacientePanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 300));
		this.setMaximumSize(new Dimension(500, 300));
		this.setSize(500, 300);
		
		this.pacientePanel.btnAceptar.addActionListener(control);
		this.pacientePanel.btnLimpiar.addActionListener(control);
		this.pacientePanel.btnCancelar.addActionListener(control);

		this.add(this.pacientePanel,BorderLayout.CENTER);
	}
	
	public void setData(int id_paciente, String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password, String complexion){
		this.userEditedID=id_paciente;
                this.pacientePanel.textField.setText(dni);
		this.pacientePanel.textField_1.setText(nombre);
		this.pacientePanel.textField_2.setText(apellidos);
		this.pacientePanel.textField_3.setText(telefono);
		this.pacientePanel.textField_4.setText(email);
		this.pacientePanel.textField_5.setText(Float.toString(peso_actual));
		this.pacientePanel.textField_6.setText(Float.toString(peso_objetivo));
		this.pacientePanel.textField_7.setText(Float.toString(altura));
		this.pacientePanel.textField_8.setText(Integer.toString(edad));
		this.pacientePanel.textField_9.setText(sexo);
		this.pacientePanel.textField_10.setText(password);
		this.pacientePanel.textField_11.setText(complexion);
		
	}
	
	public int getUserEditedID(){
		return this.userEditedID;
	}
    
    
}
