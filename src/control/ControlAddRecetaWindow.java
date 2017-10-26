/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddRecetaWindow;

/**
 *
 * @author sergio
 */
public class ControlAddRecetaWindow implements ActionListener {
    
     private static ControlAddRecetaWindow controlAddRecetaWindow;
	
	private MainControllerWindow controlPadre;
	private AddRecetaWindow addRecetaWindow;
	
	private ControlAddRecetaWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;		
	}
	
	public static ControlAddRecetaWindow getInstance(MainControllerWindow c){
		if (controlAddRecetaWindow == null) {
			controlAddRecetaWindow = new ControlAddRecetaWindow(c);
                        System.out.println("llego hasta el controlador ");
		
		
		controlAddRecetaWindow.addRecetaWindow = AddRecetaWindow.getInstance(controlAddRecetaWindow, controlAddRecetaWindow.controlPadre.getMainControl().thunderfat.getAlimentoStringList());
//		controlListUserWindow.updateNewsComboBox();
                }
		return controlAddRecetaWindow;
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }

    public AddRecetaWindow getAddRecetaWindow() {
        return addRecetaWindow;
    }
    
}
