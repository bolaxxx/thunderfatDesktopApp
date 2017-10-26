/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Alimento;
import model.Paciente;
import view.EditAlimentoWindow;

/**
 *
 * @author sergio
 */
public class ControlEditAlimentoWindow implements ActionListener{
 private static ControlEditAlimentoWindow controlEditAlimentoWindow;
	
	private EditAlimentoWindow editAlimentoWindow;
	private MainControllerWindow controlPadre;
	

    private ControlEditAlimentoWindow(MainControllerWindow c){
		super();
		this.controlPadre = c;
	}
	
	public static ControlEditAlimentoWindow getInstance(MainControllerWindow c) {
		if (controlEditAlimentoWindow == null) {
			controlEditAlimentoWindow = new ControlEditAlimentoWindow(c);
		}
		
		controlEditAlimentoWindow.editAlimentoWindow = EditAlimentoWindow.getInstance(controlEditAlimentoWindow);
		
		return controlEditAlimentoWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
// String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password, String complexion
		if (e.getSource() == editAlimentoWindow.alimentoPanel.btnAceptar){
                    
                    int id_alimento=editAlimentoWindow.getAlimentoEditedID();
                    String nombre= editAlimentoWindow.alimentoPanel.textField.getText();
                    String estado= editAlimentoWindow.alimentoPanel.textField_1.getText();
                    float caloria = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_2.getText());
                    float proteinas = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_3.getText());
                    float grasas = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_4.getText());
                    float hidratos_de_carbono= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_5.getText());
                    float      H20= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_6.getText());
                    float      NE= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_7.getText());
                    float vitamina_a= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_8.getText());
                    float vitamina_B1= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_9.getText());
                    float vitamina_B2= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_10.getText());
                    float vitamina_C= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_11.getText());
                    float Niac= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_12.getText());
                    float sodio = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_13.getText());
                    float potasio= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_14.getText());
                    float calcio = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_15.getText());
                    float magnesio= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_16.getText());
                    float hierro = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_17.getText());
                    float cobre= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_18.getText());
                    float fosforo= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_19.getText());
                    float azufre = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_20.getText());
                    float cloro= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_21.getText());
                    float Fen= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_22.getText());
                    float Ileu= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_23.getText());
                    float Leu= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_24.getText());
                    float Lis= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_25.getText());
                    float Met= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_26.getText());
                    float Tre= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_27.getText());
                    float Tri= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_28.getText());
                    float Val= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_29.getText());
                    float Acid = Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_30.getText());
                    float AlCAL= Float.parseFloat(editAlimentoWindow.alimentoPanel.textField_31.getText());
			
			
                        
			
			Alimento u = controlPadre.getMainControl().thunderfat.getTargetedAlimento(id_alimento);
			u.setNombre(nombre);
                        u.setEstado(estado);
                        u.setCaloria(caloria);
                        u.setProteinas(proteinas);
                        u.setGrasas(grasas);
                        u.setHidratos_de_carbono(hidratos_de_carbono);
                        u.setH20(H20);
                        u.setNE(NE);
                        u.setVitamina_a(vitamina_a);
                        u.setVitamina_B1(vitamina_B1);
                        u.setVitamina_B2(vitamina_B2);
                        u.setVitamina_C(vitamina_C);
                        u.setNiac(Niac);
                        u.setSodio(sodio);
                        u.setPotasio(potasio);
                        u.setCalcio(calcio);
                        u.setMagnesio(magnesio);
                        u.setHierro(hierro);
                        u.setCobre(cobre);
                        u.setFosforo(fosforo);
                        u.setAzufre(azufre);
                        u.setCloro(cloro);
                        u.setFen(Fen);
                        u.setIleu(Ileu);
                        u.setLeu(Leu);
                        u.setLis(Lis);
                        u.setMet(Met);
                        u.setTre(Tre);
                        u.setTri(Tri);
                        u.setVal(Val);
                        u.setAcid(Acid);
                        u.setAlCAL(AlCAL);
                      
			
			
			controlPadre.getMainControl().readWrite.editarAlimento(u.getId_alimento(), 
					u.getNombre(), u.getEstado(), u.getCaloria(), u.getProteinas(),u.getGrasas() ,u.getHidratos_de_carbono(), u.getH20(),u.getNE(), u.getVitamina_a(),u.getVitamina_B1(),u.getVitamina_B2(),u.getVitamina_C(),
                                        u.getNiac(),u.getSodio(),u.getPotasio(),u.getCalcio(),u.getMagnesio(),u.getCobre(),u.getHierro(),u.getFosforo(),u.getAzufre(),u.getCloro(),u.getFen(),u.getIleu(),u.getLeu(),
                                        u.getLis(),u.getMet(),u.getTre(),u.getTri(),u.getVal(),u.getAcid(),u.getAlCAL());
			controlPadre.getMainControl().readWrite.leerAlimentos();
			
			editAlimentoWindow.setVisible(false);
			controlPadre.getControlListPacienteWindow().updatePacienteTable();
		}
		
		if (e.getSource() == editAlimentoWindow.alimentoPanel.btnLimpiar) {
			editAlimentoWindow.alimentoPanel.clearFields();
		}
		
		if (e.getSource() == editAlimentoWindow.alimentoPanel.btnCancelar) {
			editAlimentoWindow.setVisible(false);
		}
		
	}
	
	public EditAlimentoWindow getEditAlimentoWindow(){
		return editAlimentoWindow;
	}
    
}
