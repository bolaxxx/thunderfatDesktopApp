/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import javax.swing.JOptionPane;
import model.Nutricionista;
import view.LoginWindow;

/**
 *
 * @author sergio
 */
public class ControlLoginWindow implements ActionListener, KeyListener  {
    private static ControlLoginWindow controlLoginWindow;
	
	private LoginWindow loginWindow;
	private MainControl controlPadre;
    

private ControlLoginWindow(MainControl mc){
		super();
		this.controlPadre = mc;
		this.loginWindow = LoginWindow.getInstance(this);
	}
	
	public static ControlLoginWindow getInstance(MainControl mc){
		if (controlLoginWindow == null){
			controlLoginWindow = new ControlLoginWindow(mc);
		}
		
		mc.readWrite.leerNutricionistas();
		
		
		return controlLoginWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == loginWindow.cancelButton) {
			loginWindow.setVisible(false);
		}
		
		if (e.getSource() == loginWindow.acceptButton) {
			validarLogin();
		}
		
	}
	
	public LoginWindow getLoginWindow() {
		return loginWindow;
	}
	
	private void validarLogin(){
		
		if (validarUsuario()) {
			loginWindow.setLoginResponse(true);
			loginWindow.setVisible(false);
		} else {
			JOptionPane.showMessageDialog(loginWindow, "Usuario o contrase�a incorrecto. Intente Nuevamente.","Error en Login",JOptionPane.ERROR_MESSAGE);
			loginWindow.passText.setText("");
			loginWindow.userText.requestFocus();
			loginWindow.userText.selectAll();			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (e.getSource() == loginWindow.userText || e.getSource() == loginWindow.passText || e.getSource() == loginWindow.acceptButton) {
				validarLogin();
			} else {
				loginWindow.setVisible(false);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	private Boolean validarUsuario(){
		char[] correctPassword = {};
		String correctUser = "";
		
		for (Nutricionista e : controlPadre.thunderfat.getNutricionistas()){
			correctPassword = e.getPassword().toCharArray();
			correctUser = e.getDni();
			
			if(correctUser.equals(loginWindow.userText.getText()) && Arrays.equals(loginWindow.passText.getPassword(),correctPassword)){
				controlPadre.thunderfat.  setCurrentUser(e);
				Arrays.fill(correctPassword,'0');
				return true;
			}
			
		}
		
		Arrays.fill(correctPassword,'0');
		return false;
	}
    
}
