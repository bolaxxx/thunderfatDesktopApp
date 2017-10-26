/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlAddCitaWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import view.Panel.CitaPanel;

/**
 *
 * @author sergio
 */
public class AddCitaWindow extends JInternalFrame {
     private static AddCitaWindow addCitaWindow;
	private ControlAddCitaWindow control;

	public CitaPanel citaPanel;
    
    public static AddCitaWindow getInstance(ControlAddCitaWindow c) {
    	if (addCitaWindow == null) {
			addCitaWindow = new AddCitaWindow(c);
		}

		if (addCitaWindow.isVisible()) {
			try {
				addCitaWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			addCitaWindow.setVisible(true);
			//addCitaWindow.citaPanel.clearFields();
		}

		return addCitaWindow;
    }

    private AddCitaWindow(ControlAddCitaWindow c) {
       super("Agregar Cita", true, true, true, true);
		this.control = c;
		
		this.citaPanel = new CitaPanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 400));
		this.setMaximumSize(new Dimension(500, 400));
		this.setSize(500, 400);
		
		this.citaPanel.btnAceptar.addActionListener(control);
		//this.citaPanel.btnLimpiar.addActionListener(control);
		this.citaPanel.btnCancelar.addActionListener(control);

		this.add(this.citaPanel,BorderLayout.CENTER);
    }
    
    
}
