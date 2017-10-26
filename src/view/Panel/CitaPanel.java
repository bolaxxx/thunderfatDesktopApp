/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.JDatePanelImpl;    
import org.jdatepicker.impl.UtilDateModel;


/**
 *
 * @author sergio
 */
public class CitaPanel extends JPanel {
    JDatePickerImpl datePicker;
    JLabel lblFecha;
    JLabel lblHora;
    JLabel lblPaciente;
   public  JTextField textIDPaciente;
   public  JSpinner SprinerTime;
    private Box textVerticalBox;
    private Box labeVerticalBox;
    private  JPanel buttonPanel;
    public  JButton btnAceptar;
    public  JButton btnCancelar;
    public JDateChooser dateChooser;
    public CitaPanel() {
        
        
        this.lblFecha=new JLabel("Fecha");
        this.lblHora= new JLabel("Hora");
        this.lblPaciente=new JLabel("Id Paciente");
        this.textIDPaciente=new JTextField();
         this.buttonPanel=new JPanel();
        this.btnAceptar= new JButton("Aceptar");
        this.btnCancelar= new JButton("Cancelar");
        this.dateChooser=new JDateChooser(new Date());
        
        this.textVerticalBox= Box.createVerticalBox();
        this.labeVerticalBox=Box.createVerticalBox();
        this.SprinerTime = new JSpinner( new SpinnerDateModel() );
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(this.SprinerTime, "HH:mm:ss");
        this.textIDPaciente.setMaximumSize(new Dimension(2147483647, 20));
        this.dateChooser.setMaximumSize(new Dimension(2147483647, 20));
        this.SprinerTime.setMaximumSize(new Dimension(2147483647, 20));
        SprinerTime.setEditor(timeEditor);
        SprinerTime.setValue(new Date());
        
        this.textVerticalBox.add(this.dateChooser);
        this.textVerticalBox.add(Box.createVerticalGlue());
        this.textVerticalBox.add(this.SprinerTime);
        this.textVerticalBox.add(Box.createVerticalGlue());
        this.textVerticalBox.add(this.textIDPaciente);
        this.textVerticalBox.add(Box.createVerticalGlue());
        this.labeVerticalBox.add(this.lblFecha);
        this.labeVerticalBox.add(Box.createVerticalGlue());
        this.labeVerticalBox.add(this.lblHora);
        this.labeVerticalBox.add(Box.createVerticalGlue());
        this.labeVerticalBox.add(this.lblPaciente);
        this.labeVerticalBox.add(Box.createVerticalGlue());
        
        this.setLayout(new BorderLayout());
		this.add(this.labeVerticalBox,BorderLayout.EAST);
                this.add(this.textVerticalBox,BorderLayout.CENTER);
		this.buttonPanel.add(btnAceptar, BorderLayout.EAST);
		this.buttonPanel.add(btnCancelar, BorderLayout.WEST);
                this.add(this.buttonPanel,BorderLayout.SOUTH);
    }
    
    
    
    
}
