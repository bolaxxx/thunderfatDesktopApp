/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditCitaWindow;

/**
 *
 * @author sergio
 */
public class ControlEditCitaWindow implements ActionListener{
    private static ControlEditCitaWindow controlEditCitaWindow;
    private MainControllerWindow ControlPadre;
    private EditCitaWindow editCitaWindow;
    
    
    
    private ControlEditCitaWindow(MainControllerWindow c){
        super();
        this.ControlPadre= c;
    }
    public static ControlEditCitaWindow getInstance(MainControllerWindow c){
        if(controlEditCitaWindow==null){
            controlEditCitaWindow = new ControlEditCitaWindow(c);
        }
        controlEditCitaWindow.editCitaWindow = EditCitaWindow.getInstance(controlEditCitaWindow);
        return controlEditCitaWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
