/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.EditComidaWindow;

/**
 *
 * @author sergio
 */
public class ControlEditComidaWindow implements ActionListener{
private MainControllerWindow controlPadre;
private static ControlEditComidaWindow controlEditComidaWindow;
private EditComidaWindow editComidaWindow;
private ControlEditComidaWindow (MainControllerWindow c){
    super();
    this.controlPadre=c;
    
}

public static ControlEditComidaWindow getInstance (MainControllerWindow c){
    if(controlEditComidaWindow==null){
        controlEditComidaWindow= new ControlEditComidaWindow(c);
    }
    controlEditComidaWindow.editComidaWindow=EditComidaWindow.getInstance();
    return controlEditComidaWindow;
}
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
