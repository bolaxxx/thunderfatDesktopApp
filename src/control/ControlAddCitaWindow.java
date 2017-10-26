/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddCitaWindow;

/**
 *
 * @author sergio
 */
public class ControlAddCitaWindow implements ActionListener {
    
     private static ControlAddCitaWindow controlAddCitaWindow;

   
	
	private AddCitaWindow addCitaWindow;
	private MainControllerWindow controlPadre;
        
        private ControlAddCitaWindow(MainControllerWindow c){
            super();
            this.controlPadre=c;
            
        }
        
        public static ControlAddCitaWindow getInstance(MainControllerWindow c){
        if (controlAddCitaWindow == null) {
			controlAddCitaWindow = new ControlAddCitaWindow(c);
		}
		
		controlAddCitaWindow.addCitaWindow = AddCitaWindow.getInstance(controlAddCitaWindow);
		
		return controlAddCitaWindow;
        }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public AddCitaWindow getAddCitaWindow() {
        return addCitaWindow;
    }

    public void setAddCitaWindow(AddCitaWindow addCitaWindow) {
        this.addCitaWindow = addCitaWindow;
    }
    
}
