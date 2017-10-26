/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlAddPlanDietaWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import view.Panel.PlanDietaPanel;

/**
 *
 * @author sergio
 */
public class AddPlanDietaWindow  extends JInternalFrame{
    private static AddPlanDietaWindow addPlanDietaWindow;
	private ControlAddPlanDietaWindow control;

	public PlanDietaPanel plandietaPanel;

    public static AddPlanDietaWindow getInstance(ControlAddPlanDietaWindow c) {
       if (addPlanDietaWindow == null) {
			addPlanDietaWindow = new AddPlanDietaWindow(c);
		}

		if (addPlanDietaWindow.isVisible()) {
			try {
				addPlanDietaWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			addPlanDietaWindow.setVisible(true);
			addPlanDietaWindow.plandietaPanel.clearFields();
		}

		return addPlanDietaWindow;
    }
    
     private AddPlanDietaWindow(ControlAddPlanDietaWindow c) {
       super("Agregar Alimento", true, true, true, true);
		this.control = c;
		
		this.plandietaPanel = new PlanDietaPanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 400));
		this.setMaximumSize(new Dimension(500, 400));
		this.setSize(500, 400);
		
		this.plandietaPanel.btnAceptar.addActionListener(control);
		this.plandietaPanel.btnLimpiar.addActionListener(control);
		this.plandietaPanel.btnCancelar.addActionListener(control);

		this.add(this.plandietaPanel,BorderLayout.CENTER);
    }
}
