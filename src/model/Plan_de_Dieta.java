/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author sergio
 */
public class Plan_de_Dieta {
   private int id_plan_de_dieta;
   private int caloria_max_diarias;
   private Date fecha_Inicio;
   private Date Fecha_fin;
   private  int n_comidas_diarias;
   private Paciente id_paciente;
   private Nutricionista id_nutricionista;
   private Vector<Comida> comidas;

    public Plan_de_Dieta(int id_plan_de_dieta,int caloria_max_diaria,Date fecha_inicio,Date fecha_fin,int n_comidas_diarias,Paciente id_paciente,Nutricionista id_nutricionista) {
        this.id_plan_de_dieta = id_plan_de_dieta;
        this.caloria_max_diarias = caloria_max_diarias;
        this.fecha_Inicio = fecha_Inicio;
        this.Fecha_fin = Fecha_fin;
        this.n_comidas_diarias = n_comidas_diarias;
        this.id_paciente = id_paciente;        
        this.id_nutricionista = id_nutricionista;
        this.comidas=new Vector<Comida>();
        this.id_nutricionista.getDietas().add(this);
        this.id_paciente.getDietas().add(this);
        
    }

    public Plan_de_Dieta(int id_plan_de_dieta) {
        this.id_plan_de_dieta = id_plan_de_dieta;
    }
    

    public Paciente getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Paciente id_paciente) {
        this.id_paciente = id_paciente;
    }

    

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Plan_de_Dieta) {
			if(((Plan_de_Dieta) obj).id_plan_de_dieta == this.id_plan_de_dieta) {	
				return true;
			}
		}
		
		return false;
    }
    
    public Nutricionista getId_nutricionista() {
        return id_nutricionista;
    }

    public void setId_nutricionista(Nutricionista id_nutricionista) {
        this.id_nutricionista = id_nutricionista;
    }

    @Override
    public String toString() {
        return "Plan_de_Dieta{" + "id_plan_de_dieta=" + id_plan_de_dieta + ", caloria_max_diarias=" + caloria_max_diarias + ", fecha_Inicio=" + fecha_Inicio + ", Fecha_fin=" + Fecha_fin + ", n_comidas_diarias=" + n_comidas_diarias + ", id_paciente=" + id_paciente + ", id_nutricionista=" + id_nutricionista + ", comidas=" + comidas + '}';
    }

  

    public int getId_plan_de_dieta() {
        return id_plan_de_dieta;
    }

    public void setId_plan_de_dieta(int id_plan_de_dieta) {
        this.id_plan_de_dieta = id_plan_de_dieta;
    }

    public int getCaloria_max_diarias() {
        return caloria_max_diarias;
    }

    public void setCaloria_max_diarias(int caloria_max_diarias) {
        this.caloria_max_diarias = caloria_max_diarias;
    }

    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_fin() {
        return Fecha_fin;
    }

    public void setFecha_fin(Date Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
    }

    public int getN_comidas_diarias() {
        return n_comidas_diarias;
    }

    public void setN_comidas_diarias(int n_comidas_diarias) {
        this.n_comidas_diarias = n_comidas_diarias;
    }

    public Vector<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(Vector<Comida> comidas) {
        this.comidas = comidas;
    }
   
     public static Vector<String> getTitleList() {
        //int id_plan_de_dieta,int caloria_max_diaria,Date fecha_inicio,Date fecha_fin,int n_comidas_diarias,Paciente id_paciente
		Vector<String> vector = new Vector<String>();
		vector.add("Id plan de dieta ");
		vector.add("Nombre");
		vector.add("Apellidos");
		vector.add("Fecha inicio");
		vector.add("Fecha Fin");
		vector.add("Calorias Maximas Diarias");
		vector.add("Comidas Diarias");
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
        return new Object[]{this.id_plan_de_dieta,this.id_paciente.getNombre(), this.id_paciente.getApellidos(),this.fecha_Inicio, this.Fecha_fin,this.caloria_max_diarias,this.n_comidas_diarias};
    }
    
    
}
