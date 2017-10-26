/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlLoginWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author sergio
 */
public class LoginWindow extends JDialog{
    	private static LoginWindow loginWindow;
	
	private ControlLoginWindow control;
	
	private JLabel userLabel;
	private JLabel passLabel;
	private JPanel labelPanel;
	private JPanel textPanel;
	private JPanel buttonPanel;
	private JPanel loginPanel;
	private ImageIcon imageIcon;
	private Boolean loginResponse;
	
	public JButton acceptButton;
	public JButton cancelButton;
	public JTextField userText;
	public JPasswordField passText;
	public JLabel imageLabel;
	
	
	private LoginWindow(ControlLoginWindow c){
		super();
		this.control = c;
		this.loginResponse = false;
		this.imageIcon = new ImageIcon("./images/convives.jpg");
		this.imageLabel = new JLabel("",imageIcon,JLabel.CENTER);
		this.userLabel = new JLabel("Usuario:");
		this.passLabel = new JLabel("Clave:");
		this.userText = new JTextField();
		this.passText = new JPasswordField();
		this.labelPanel = new JPanel(new BorderLayout());
		this.textPanel = new JPanel(new BorderLayout());
		this.acceptButton = new JButton("Aceptar");
		this.cancelButton = new JButton("Cancelar");
		this.buttonPanel = new JPanel();
		this.loginPanel = new JPanel(new BorderLayout());
				
		this.setMinimumSize(new Dimension(365,365));
		this.setMaximumSize(new Dimension(365,365));
		this.setModal(true);
		this.setLocationRelativeTo(null);	
		this.setTitle("Login" );
		this.setLayout(new BorderLayout());
		
		this.cancelButton.addActionListener(control);
		this.acceptButton.addActionListener(control);
		this.userText.addKeyListener(control);
		this.passText.addKeyListener(control);
		this.acceptButton.addKeyListener(control);
		this.cancelButton.addKeyListener(control);
		
		this.labelPanel.add(this.userLabel,BorderLayout.NORTH);
		this.labelPanel.add(this.passLabel,BorderLayout.SOUTH);
		this.textPanel.add(this.userText,BorderLayout.NORTH);
		this.textPanel.add(this.passText,BorderLayout.SOUTH);
		this.buttonPanel.add(this.acceptButton);
		this.buttonPanel.add(this.cancelButton);
		this.loginPanel.add(this.labelPanel,BorderLayout.WEST);
		this.loginPanel.add(this.textPanel,BorderLayout.CENTER);
		this.loginPanel.add(this.buttonPanel,BorderLayout.SOUTH);
		
		this.add(imageLabel,BorderLayout.CENTER);
		this.add(loginPanel,BorderLayout.SOUTH);
		

	}
	
	public static LoginWindow getInstance(ControlLoginWindow c) {
		if (loginWindow == null) {
			loginWindow = new LoginWindow(c);
		}
		
		return loginWindow;
	}
	
	public Boolean getLoginResponse() {
		return loginResponse;
	}
	
	public void setLoginResponse(Boolean r) {
		loginResponse = r;
	}
    
}
