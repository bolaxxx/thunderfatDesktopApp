/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import controller.controlaccess.SQLReadWrite;
import javax.swing.UIManager;
import model.ThunderFatDesktopApp;

/**
 *
 * @author sergio
 */


public class MainControl {
   public ThunderFatDesktopApp thunderfat;
    SQLReadWrite readWrite; 
    ControlLoginWindow controlLoginWindow;
    MainControllerWindow controlMainWindow;
    
    public static void main(String[] args) {
		
		try {
		    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		}
		
		MainControl mainControl = new MainControl();
		mainControl.thunderfat = new ThunderFatDesktopApp();	
		mainControl.readWrite = new SQLReadWrite("127.0.0.1", "3306", "thunderfat", "root", "", mainControl);
				
		mainControl.controlLoginWindow = ControlLoginWindow.getInstance(mainControl);
		mainControl.controlLoginWindow.getLoginWindow().setVisible(true);
		
		if (mainControl.controlLoginWindow.getLoginWindow().getLoginResponse()) {		
			mainControl.readWrite.leerPacientes();
			mainControl.readWrite.leerAlimentos();
                        mainControl.readWrite.leerCitas();
                        mainControl.readWrite.leerPlanesDietas();
                        mainControl.readWrite.leerRecetas();
                       // mainControl.readWrite.leerPasos();
                        mainControl.readWrite.leerComidas();
			
			//This part belongs to the MainWindow frame
			mainControl.controlMainWindow = MainControllerWindow.getInstance(mainControl);			
			mainControl.controlMainWindow.getMainFrame().setVisible(true);
		} else {
			System.exit(0);
		}
	}
}
