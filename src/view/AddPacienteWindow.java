/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Panel.PacientePanel;
import control.ControlAddPacienteWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author sergio
 */
public class AddPacienteWindow extends JInternalFrame {
    
    private static AddPacienteWindow addPacienteWindow;
	private ControlAddPacienteWindow control;

	public PacientePanel pacientePanel;

    public static AddPacienteWindow getInstance(ControlAddPacienteWindow c) {
    	if (addPacienteWindow == null) {
			addPacienteWindow = new AddPacienteWindow(c);
		}

		if (addPacienteWindow.isVisible()) {
			try {
				addPacienteWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			addPacienteWindow.setVisible(true);
			addPacienteWindow.pacientePanel.clearFields();
		}

		return addPacienteWindow;
    }

    private AddPacienteWindow(ControlAddPacienteWindow c) {
       super("Agregar Paciente", true, true, true, true);
		this.control = c;
		
		this.pacientePanel = new PacientePanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 400));
		this.setMaximumSize(new Dimension(500, 400));
		this.setSize(500, 400);
		
		this.pacientePanel.btnAceptar.addActionListener(control);
		this.pacientePanel.btnLimpiar.addActionListener(control);
		this.pacientePanel.btnCancelar.addActionListener(control);

		this.add(this.pacientePanel,BorderLayout.CENTER);
    }
    
}
