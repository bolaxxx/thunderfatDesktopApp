/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditRecetaWindow;

/**
 *
 * @author sergio
 */
public class ControlEditRecetaWindow implements ActionListener{
    private MainControllerWindow controlPadre;
    private static ControlEditRecetaWindow controlEditRecetaWindow;
    private EditRecetaWindow editRecetaWindow;

    private ControlEditRecetaWindow(MainControllerWindow c){
        super();
        this.controlPadre=c;
        
    }
    public static ControlEditRecetaWindow getInstance(MainControllerWindow c){
        if(controlEditRecetaWindow==null){
            controlEditRecetaWindow= new ControlEditRecetaWindow(c);
        }
        controlEditRecetaWindow.editRecetaWindow= EditRecetaWindow.getInstance(controlEditRecetaWindow);
        return controlEditRecetaWindow;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
