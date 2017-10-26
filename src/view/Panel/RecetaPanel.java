/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 *
 * @author sergio
 */
public class RecetaPanel extends JPanel {
     public JTextField textField;
     public JTextArea textField_1;
     
     private JLabel lblNombre,lblProcedimiento,lblAlimento;
     public JList listaAlimentos;
     public JButton btnAceptar, btnCancelar;
     private Box textVerticalBox;
     private Box labeVerticalBox;
     private JPanel buttonPanel;
     public JPanel listapanel;
     public JPanel cajatexto,cajanombre;
     JScrollPane scrollPane;
     public RecetaPanel ( Vector<String> data){
         super();
         this.lblNombre=new JLabel("Nombre");
         this.lblProcedimiento= new JLabel("Procedimiento");
         this.btnAceptar=new JButton("Aceptar");
         this.btnCancelar=new JButton("Cancelar");
         this.listaAlimentos= new JList(data);
         this.textField= new JTextField();
         this.textField_1=new JTextArea();
         this.buttonPanel= new JPanel();
         this.lblAlimento=new JLabel("Selecione el alimento al que pertenece esta receta");
         this.listapanel=new JPanel();
         this.cajanombre= new JPanel();
         this.cajatexto = new JPanel();
         this.setLayout(new BorderLayout());
         
         this.textField.setMaximumSize(new Dimension(2147483647, 20));
         this.textField_1.setMaximumSize(new Dimension(2147483647, 100));
         this.textField_1.setLineWrap(true);
         this.textVerticalBox = Box.createVerticalBox();
         this.labeVerticalBox = Box.createVerticalBox();
          scrollPane = new JScrollPane();

scrollPane.setViewportView(listaAlimentos);
         
      /*   this.textVerticalBox.add(Box.createVerticalGlue());
	 this.textVerticalBox.add(this.textField);
         this.textVerticalBox.add(Box.createVerticalGlue());
	this.textVerticalBox.add(this.textField_1);
        this.textVerticalBox.add(Box.createVerticalGlue());
        
        this.labeVerticalBox.add(Box.createVerticalGlue());
        this.labeVerticalBox.add(this.lblNombre);
        this.labeVerticalBox.add(Box.createVerticalGlue());
        this.labeVerticalBox.add(this.lblProcedimiento);

                this.labeVerticalBox.add(Box.createVerticalGlue());
                */
      this.lblAlimento.setSize(2147483647,100);
      this.lblAlimento.setForeground(Color.red);
                this.cajanombre.setLayout(new BorderLayout());
                this.cajatexto.setLayout(new BorderLayout());
                this.cajanombre.add(this.lblNombre,BorderLayout.WEST);
                this.cajanombre.add(this.textField,BorderLayout.CENTER);
                this.cajatexto.add(this.lblProcedimiento,BorderLayout.WEST);
                this.cajatexto.add(this.textField_1,BorderLayout.CENTER);
                this.listapanel.setLayout(new BorderLayout());
                  this.listapanel.add(this.lblAlimento, BorderLayout.NORTH);
         this.listapanel.add(this.scrollPane, BorderLayout.CENTER);
       
         
         //this.listapanel.add(this.listaAlimentos);
         this.buttonPanel.add(this.btnAceptar);
	 this.buttonPanel.add(this.btnCancelar);
         
     //int id_receta,String nombre, Alimento alimento,String procedimiento
    //this.textVerticalBox = Box.createVerticalBox();
     //654465464zthis.labeVerticalBox = Box.createVerticalBox();
     this.add(this.cajanombre, BorderLayout.NORTH);
     this.add(this.cajatexto, BorderLayout.CENTER);
		this.add(this.labeVerticalBox, BorderLayout.WEST);
		this.add(this.listapanel, BorderLayout.EAST);
		this.add(this.buttonPanel,BorderLayout.SOUTH);
                this.setVisible(true);
     
     
     }
         
    
}
