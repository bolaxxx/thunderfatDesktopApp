/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlEditAlimentoWindow;
import control.ControlEditPacienteWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JInternalFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import view.Panel.AlimentoPanel;
import view.Panel.PacientePanel;

/**
 *
 * @author sergio
 */
public class EditAlimentoWindow extends JInternalFrame {
        private static EditAlimentoWindow editAlimentoWindow;
	private ControlEditAlimentoWindow control;

	private int alimentoEditedID;
	
	public AlimentoPanel alimentoPanel;

	public static EditAlimentoWindow getInstance(ControlEditAlimentoWindow c) {
		if (editAlimentoWindow == null) {
			editAlimentoWindow = new EditAlimentoWindow(c);
		}

		if (editAlimentoWindow.isVisible()) {
			try {
				editAlimentoWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			editAlimentoWindow.setVisible(true);
		}

		return editAlimentoWindow;
	}

	private EditAlimentoWindow(ControlEditAlimentoWindow c) {
		super("Editar Paciente", true, true, true, true);
		this.control = c;
		
		this.alimentoPanel = new AlimentoPanel();

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(500, 300));
		this.setMaximumSize(new Dimension(500, 300));
		this.setSize(500, 300);
		
		this.alimentoPanel.btnAceptar.addActionListener(control);
		this.alimentoPanel.btnLimpiar.addActionListener(control);
		this.alimentoPanel.btnCancelar.addActionListener(control);

		this.add(this.alimentoPanel,BorderLayout.CENTER);
	}
	
	public void setData( int id_alimento,String nombre,    String estado ,     float caloria ,     float proteinas,     float grasas,     float hidratos_de_carbono,     float      H20,
     float      NE,     float vitamina_a,     float vitamina_B1,     float vitamina_B2,     float vitamina_C,     float Niac,     float sodio ,     float potasio,     float calcio ,
     float magnesio,     float hierro ,     float cobre,     float fosforo,     float azufre ,     float cloro,     float Fen,     float Ileu,     float Leu,     float Lis,     float Met,
     float Tre,     float Tri,    float Val,     float Acid ,     float AlCAL){
		this.alimentoEditedID=id_alimento;
                this.alimentoPanel.textField.setText(nombre);
		this.alimentoPanel.textField_1.setText(estado);
		this.alimentoPanel.textField_2.setText(Float.toString(caloria));
		this.alimentoPanel.textField_3.setText(Float.toString(proteinas));
		this.alimentoPanel.textField_4.setText(Float.toString(grasas));
		this.alimentoPanel.textField_5.setText(Float.toString(hidratos_de_carbono));
		this.alimentoPanel.textField_6.setText(Float.toString(H20));
		this.alimentoPanel.textField_7.setText(Float.toString(NE));
		this.alimentoPanel.textField_8.setText(Float.toString(vitamina_a));
		this.alimentoPanel.textField_9.setText(Float.toString(vitamina_B1));
		this.alimentoPanel.textField_10.setText(Float.toString(vitamina_B2));
		this.alimentoPanel.textField_11.setText(Float.toString(vitamina_C));
		this.alimentoPanel.textField_12.setText(Float.toString(Niac));
		this.alimentoPanel.textField_13.setText(Float.toString(sodio));
		this.alimentoPanel.textField_14.setText(Float.toString(potasio));
		this.alimentoPanel.textField_15.setText(Float.toString(calcio));
		this.alimentoPanel.textField_16.setText(Float.toString(magnesio));
		this.alimentoPanel.textField_17.setText(Float.toString(hierro));
		this.alimentoPanel.textField_18.setText(Float.toString(cobre));
		this.alimentoPanel.textField_19.setText(Float.toString(fosforo));
		this.alimentoPanel.textField_20.setText(Float.toString(azufre));
		this.alimentoPanel.textField_21.setText(Float.toString(cloro));
		this.alimentoPanel.textField_22.setText(Float.toString(Fen));
		this.alimentoPanel.textField_23.setText(Float.toString(Ileu));
		this.alimentoPanel.textField_24.setText(Float.toString(Leu));
		this.alimentoPanel.textField_25.setText(Float.toString(Lis));
		this.alimentoPanel.textField_26.setText(Float.toString(Met));
		this.alimentoPanel.textField_27.setText(Float.toString(Tre));
		this.alimentoPanel.textField_28.setText(Float.toString(Tri));
		this.alimentoPanel.textField_29.setText(Float.toString(Val));
		this.alimentoPanel.textField_30.setText(Float.toString(Acid));
		this.alimentoPanel.textField_31.setText(Float.toString(AlCAL));
		
		
	}
	
	public int getAlimentoEditedID(){
		return this.alimentoEditedID;
	}
    
    
}
