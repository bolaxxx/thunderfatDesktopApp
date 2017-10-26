/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import control.ControlAddComidaWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import view.Panel.ComidaPanel;

/**
 *
 * @author sergio
 */
public class AddComidaWindow extends JInternalFrame {
    private static AddComidaWindow addComidaWindow;
	private ControlAddComidaWindow control;

	public ComidaPanel comidaPanel;

    public static AddComidaWindow getInstance(ControlAddComidaWindow c) {
        if (addComidaWindow == null) {
			addComidaWindow = new AddComidaWindow(c);
		}

		if (addComidaWindow.isVisible()) {
			try {
				addComidaWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			addComidaWindow.setVisible(true);
			addComidaWindow.comidaPanel.clearFields();
		}

		return addComidaWindow;
    }
    private AddComidaWindow(ControlAddComidaWindow c){
        super("Agregar Comida", true, true, true, true);
		this.control = c;
		
		this.comidaPanel = new ComidaPanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 400));
		this.setMaximumSize(new Dimension(500, 400));
		this.setSize(500, 400);
		
		this.comidaPanel.btnAceptar.addActionListener(control);
		this.comidaPanel.btnLimpiar.addActionListener(control);
		this.comidaPanel.btnCancelar.addActionListener(control);

		this.add(this.comidaPanel,BorderLayout.CENTER);
    
    }
}
