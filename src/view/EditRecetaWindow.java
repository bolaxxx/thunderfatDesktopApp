/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlEditRecetaWindow;
import control.MainControllerWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.Vector;
import javax.swing.JInternalFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import view.Panel.CitaPanel;
import view.Panel.RecetaPanel;

/**
 *
 * @author sergio
 */
public class EditRecetaWindow extends JInternalFrame{
    private ControlEditRecetaWindow Control;
    private static EditRecetaWindow editRecetaWindow;
    public RecetaPanel recetaPanel;
    private int IDRecetaEdited;
    
    private EditRecetaWindow (ControlEditRecetaWindow control,Vector<String> lista){
             super("Editar Cita", true, true, true, true);
		
		 this.Control=control;
		this.recetaPanel = new RecetaPanel(lista);

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 300));
		this.setMaximumSize(new Dimension(500, 300));
		this.setSize(500, 300);
		
		this.recetaPanel.btnAceptar.addActionListener(control);
		//this.citaPanel.btnLimpiar.addActionListener(control);
		this.recetaPanel.btnCancelar.addActionListener(control);

		this.add(this.recetaPanel,BorderLayout.CENTER);
    
        
       
        
    }
    public static EditRecetaWindow getInstance (ControlEditRecetaWindow c, Vector<String> lista){
        if (editRecetaWindow == null) {
			editRecetaWindow = new EditRecetaWindow(c,lista);
		}

		if (editRecetaWindow.isVisible()) {
			try {
				editRecetaWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			editRecetaWindow.setVisible(true);
		}

		return editRecetaWindow;
    }
}
