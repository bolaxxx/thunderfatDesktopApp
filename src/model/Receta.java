/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Vector;

/**
 *
 * @author sergio
 */
public class Receta {
    private int id_receta;
    private String nombre;
    private Alimento  alimento ;
    private String procedimiento ;

    public Receta(int id_receta,String nombre, Alimento alimento,String procedimiento) {
        this.id_receta = id_receta;
        this.nombre=nombre;
        this.alimento = alimento;
        this.procedimiento=procedimiento;
        alimento.getReceta().add(this);
    }

    public Receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    @Override
    public String toString() {
        return "Receta{" + "id_receta=" + id_receta + ", alimento=" + alimento + ", procedimiento=" + procedimiento + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Receta) {
			if(((Receta) obj).id_receta == this.id_receta) {	
				return true;
			}
		}
		
		return false;
    }
     public static Vector<String> getTitleList() {
        //int id_receta,String nombre, Alimento aliment
		Vector<String> vector = new Vector<String>();
		vector.add("Id Receta ");
		vector.add("Nombre");
		vector.add("Alimento");
		vector.add("Procedimiento");
		
		/*vector.add("Peso Objetivo");
		vector.add("Altura");
		vector.add("Edad");
		vector.add("Sexo");
		//vector.add("contraseña");
                vector.add("Complexion");
		*/
		return vector;
	}

    Object[] getObjectList() {
        ///int id_cita, Nutricionista id_nutricionista, Date fecha, Time hora, Paciente id_paciente
        return new Object[]{this.id_receta,this.nombre, this.alimento.getNombre(),this.procedimiento};
    }
    
}
