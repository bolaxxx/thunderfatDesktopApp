/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlEditCitaWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.sql.Time;
import java.util.Date;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import view.Panel.AlimentoPanel;
import view.Panel.CitaPanel;

/**
 *
 * @author sergio
 */
public class EditCitaWindow extends JInternalFrame {
    private static EditCitaWindow editCitaWindow;
    private ControlEditCitaWindow control;
    public CitaPanel citaPanel;
    private int CitaEditedID;
    
    public static EditCitaWindow getInstance(ControlEditCitaWindow c){
      if (editCitaWindow == null) {
			editCitaWindow = new EditCitaWindow(c);
		}

		if (editCitaWindow.isVisible()) {
			try {
				editCitaWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			editCitaWindow.setVisible(true);
		}

		return editCitaWindow;
    }
    private EditCitaWindow (ControlEditCitaWindow c){
        super("Editar Cita", true, true, true, true);
		this.control = c;
		
		this.citaPanel = new CitaPanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 300));
		this.setMaximumSize(new Dimension(500, 300));
		this.setSize(500, 300);
		
		this.citaPanel.btnAceptar.addActionListener(control);
		//this.citaPanel.btnLimpiar.addActionListener(control);
		this.citaPanel.btnCancelar.addActionListener(control);

		this.add(this.citaPanel,BorderLayout.CENTER);
    
        
    }
    public void setData(int id_cita, int id_nutricionista, Date fecha, Time hora, int id_paciente){
        this.citaPanel.dateChooser.setDate(fecha);
        this.citaPanel.SprinerTime.setValue(hora);
        this.citaPanel.textIDPaciente.setText(String.valueOf(id_paciente));
        CitaEditedID=id_cita;
        
        
    }
    public int getCitaEditedID(){
		return this.CitaEditedID;
	}
}
