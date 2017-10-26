/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddPlanDietaWindow;

/**
 *
 * @author sergio
 */
public class ControlAddPlanDietaWindow implements ActionListener{
    private MainControllerWindow ControlPadre;
    private static ControlAddPlanDietaWindow  controlAddPlanDietaWindow;
    private AddPlanDietaWindow addPlanDietaWindow;
    
    private ControlAddPlanDietaWindow(MainControllerWindow c){
        super();
        this.ControlPadre=c;
    }
    public static ControlAddPlanDietaWindow getInstance (MainControllerWindow c) {
        if(controlAddPlanDietaWindow==null){
            
            controlAddPlanDietaWindow= new ControlAddPlanDietaWindow(c);
        }
        controlAddPlanDietaWindow.addPlanDietaWindow=AddPlanDietaWindow.getInstance(controlAddPlanDietaWindow);
        return controlAddPlanDietaWindow;
                
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
