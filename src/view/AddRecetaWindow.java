/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlAddAlimentoWindow;
import control.ControlAddRecetaWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.Vector;
import javax.swing.JInternalFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import view.Panel.AlimentoPanel;
import view.Panel.RecetaPanel;

/**
 *
 * @author sergio
 */
public class AddRecetaWindow extends JInternalFrame {
     private static AddRecetaWindow addRecetaWindow;
	private ControlAddRecetaWindow control;

	public RecetaPanel recetaPanel;

    public static AddRecetaWindow getInstance(ControlAddRecetaWindow c,Vector<String> data) {
    	if (addRecetaWindow == null) {
			addRecetaWindow = new AddRecetaWindow(c,data);
                        System.out.println("llego a crear la ventana el error esta en el panel ");
        }

		if (addRecetaWindow.isVisible()) {
			try {
				addRecetaWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			addRecetaWindow.setVisible(true);
			//addRecetaWindow.recetaPanel.clearFields();
		}

		return addRecetaWindow;
    }

    private AddRecetaWindow(ControlAddRecetaWindow c,Vector<String> data) {
       super("Agregar Receta", true, true, true, true);
		this.control = c;
		
		this.recetaPanel = new RecetaPanel(data);

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 400));
		//this.setMaximumSize(new Dimension(500, 400));
		this.setSize(800, 600);
		
		this.recetaPanel.btnAceptar.addActionListener(control);
		//this.recetaPanel.btnLimpiar.addActionListener(control);
		this.recetaPanel.btnCancelar.addActionListener(control);

		this.add(this.recetaPanel,BorderLayout.CENTER);
    }
    
    
}
