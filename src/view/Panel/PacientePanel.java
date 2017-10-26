/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sergio
 */
public class PacientePanel extends JPanel {
    
        public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
        public  JTextField textField_10;
        public  JTextField textField_11;
        
        
        private JLabel lblNombre,lblComplexion,lblContrasea,lblApellidos,lblTelefono,lblEmail,lblSexo,lblPesoObjetivo,lblPesoActual,lblEdad,lblAltura,lblDNI;
        public JButton btnAceptar, btnCancelar,btnLimpiar;
        private Box textVerticalBox;
	private Box labeVerticalBox;
	public JPanel buttonPanel;
        

   public PacientePanel( ){
       		
                     buttonPanel=new JPanel();
		 lblNombre = new JLabel("Nombre");
                 lblApellidos = new JLabel("Apellidos");
                 lblTelefono = new JLabel("Telefono");
                 lblEmail = new JLabel("Email");
                 lblPesoObjetivo = new JLabel("Peso Objetivo");
                 lblPesoActual = new JLabel("Peso Actual");
                 lblAltura = new JLabel("Altura");
                 lblSexo = new JLabel("Sexo");
                 lblContrasea = new JLabel("Contrase\u00F1a");
                 lblComplexion = new JLabel("Complexion");
                 lblDNI= new JLabel("DNI");
                 lblEdad= new JLabel("Edad");
                 btnAceptar= new JButton("Aceptar");
                 btnCancelar= new JButton("Cancelar");
                 btnLimpiar= new JButton ("Limpiar");
                 
		 textField = new JTextField();
                 textField_1 = new JTextField();
                 textField_2 = new JTextField();
                 textField_3 = new JTextField();
                 textField_4 = new JTextField();
                 textField_5 = new JTextField();
                 textField_6 = new JTextField();
                 textField_7 = new JTextField();
                 textField_8 = new JTextField();
                 textField_9 = new JTextField();
                 textField_10 = new JTextField();
                 textField_11 = new JTextField();
                
		
		
		this.setLayout(new BorderLayout());

		this.textVerticalBox = Box.createVerticalBox();
		this.labeVerticalBox = Box.createVerticalBox();
		
                this.textField.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_1.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_2.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_3.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_4.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_5.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_6.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_7.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_8.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_9.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_10.setMaximumSize(new Dimension(2147483647, 20));
                this.textField_11.setMaximumSize(new Dimension(2147483647, 20));
                
                
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_1);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_2);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_3);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_4);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_5);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_6);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_7);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_8);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_9);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_10);
                this.textVerticalBox.add(Box.createVerticalGlue());
		this.textVerticalBox.add(this.textField_11);
                
                /*
                i
                */
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblDNI);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblNombre);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblApellidos);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblTelefono);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblEmail);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblPesoActual);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblPesoObjetivo);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblAltura);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblEdad);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblSexo);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblContrasea);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblComplexion);
                this.labeVerticalBox.add(Box.createVerticalGlue());
                
                this.buttonPanel.add(this.btnAceptar);
		this.buttonPanel.add(this.btnLimpiar);
		this.buttonPanel.add(this.btnCancelar);
		
		
		this.add(this.textVerticalBox, BorderLayout.CENTER);
		this.add(this.labeVerticalBox, BorderLayout.WEST);
		this.add(this.buttonPanel,BorderLayout.SOUTH);
                
   }
    
    public void clearFields() {
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
                this.textField_3.setText("");
                this.textField_4.setText("");
                this.textField_5.setText("");
                this.textField_6.setText("");
                this.textField_7.setText("");
                this.textField_8.setText("");
                this.textField_9.setText("");
                this.textField_10.setText("");
                this.textField_11.setText("");
	
    }
    
}
