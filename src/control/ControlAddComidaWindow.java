/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddComidaWindow;

/**
 *
 * @author sergio
 */
public class ControlAddComidaWindow implements ActionListener {
    private MainControllerWindow ControlPadre;
    private static ControlAddComidaWindow controlAddComidaWindow;
    private AddComidaWindow addComidaWindow;

    private ControlAddComidaWindow(MainControllerWindow c){
        super();
        this.ControlPadre=c;
    }
    public static ControlAddComidaWindow getInstance(MainControllerWindow c){
        if(controlAddComidaWindow==null){
            controlAddComidaWindow=  new ControlAddComidaWindow(c);
        }
        controlAddComidaWindow.addComidaWindow=AddComidaWindow.getInstance(controlAddComidaWindow);
        return controlAddComidaWindow;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
