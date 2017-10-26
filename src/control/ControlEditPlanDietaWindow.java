/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditPlanDietaWindow;

/**
 *
 * @author sergio
 */
public class ControlEditPlanDietaWindow implements ActionListener {
    private MainControllerWindow controlPadre;
    private static ControlEditPlanDietaWindow controlEditPlanDietaWindow;
    private EditPlanDietaWindow editPlanDietaWindow;
    
    private ControlEditPlanDietaWindow(MainControllerWindow c){
        super();
        this.controlPadre=c;
    }

    public static ControlEditPlanDietaWindow getInstance(MainControllerWindow c){
        if(controlEditPlanDietaWindow==null){
            
        }
        controlEditPlanDietaWindow.editPlanDietaWindow=EditPlanDietaWindow.getInstance();
        return controlEditPlanDietaWindow;
        
    } 
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
