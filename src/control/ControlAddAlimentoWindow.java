/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddAlimentoWindow;

/**
 *
 * @author sergio
 */
public class ControlAddAlimentoWindow implements ActionListener{
    private static ControlAddAlimentoWindow controlAddAlimentoWindow;

   
	
	private AddAlimentoWindow addAlimentoWindow;
	private MainControllerWindow controlPadre;
        
        private ControlAddAlimentoWindow(MainControllerWindow c){
            super();
            this.controlPadre=c;
            
        }
        
        public static ControlAddAlimentoWindow getInstance(MainControllerWindow c){
        if (controlAddAlimentoWindow == null) {
			controlAddAlimentoWindow = new ControlAddAlimentoWindow(c);
		}
		
		controlAddAlimentoWindow.addAlimentoWindow = AddAlimentoWindow.getInstance(controlAddAlimentoWindow);
		
		return controlAddAlimentoWindow;
	}
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AddAlimentoWindow getAddAlimentoWindow() {
        return addAlimentoWindow;
    }

    public void setAddUserWindow(AddAlimentoWindow addAlimentoWindow) {
        this.addAlimentoWindow = addAlimentoWindow;
    }

   
    
}
