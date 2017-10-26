/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlAddAlimentoWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import view.Panel.AlimentoPanel;

/**
 *
 * @author sergio
 */
public class AddAlimentoWindow extends JInternalFrame{
     private static AddAlimentoWindow addAlimentoWindow;
	private ControlAddAlimentoWindow control;

	public AlimentoPanel alimentoPanel;

    public static AddAlimentoWindow getInstance(ControlAddAlimentoWindow c) {
    	if (addAlimentoWindow == null) {
			addAlimentoWindow = new AddAlimentoWindow(c);
		}

		if (addAlimentoWindow.isVisible()) {
			try {
				addAlimentoWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			addAlimentoWindow.setVisible(true);
			addAlimentoWindow.alimentoPanel.clearFields();
		}

		return addAlimentoWindow;
    }

    private AddAlimentoWindow(ControlAddAlimentoWindow c) {
       super("Agregar Alimento", true, true, true, true);
		this.control = c;
		
		this.alimentoPanel = new AlimentoPanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 400));
		this.setMaximumSize(new Dimension(500, 400));
		this.setSize(500, 400);
		
		this.alimentoPanel.btnAceptar.addActionListener(control);
		this.alimentoPanel.btnLimpiar.addActionListener(control);
		this.alimentoPanel.btnCancelar.addActionListener(control);

		this.add(this.alimentoPanel,BorderLayout.CENTER);
    }
    
    
}
