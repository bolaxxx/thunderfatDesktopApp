/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author sergio
 */
public class Comida {
   private int id_comida; 
   private Alimento comida;
   private Date Fecha;
   private Time tiempo;
   private Receta receta;
   private  Plan_de_Dieta id_plan_dieta;

    public Comida(int id_comida,Alimento comida, Date Fecha, Time tiempo,Receta id_receta,Plan_de_Dieta id_plan_dieta) {
        this.id_comida=id_comida;
        this.comida = comida;
        this.Fecha = Fecha;
        this.tiempo = tiempo;
        this.receta=id_receta;
        this.id_plan_dieta = id_plan_dieta;
        this.id_plan_dieta.getComidas().add(this); 
    }
    

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public Alimento getComida() {
        return comida;
    }

    public void setComida(Alimento comida) {
        this.comida = comida;
    }

    public Plan_de_Dieta getId_plan_dieta() {
        return id_plan_dieta;
    }

    public void setId_plan_dieta(Plan_de_Dieta id_plan_dieta) {
        this.id_plan_dieta = id_plan_dieta;
    }

  

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Time getTiempo() {
        return tiempo;
    }

    public void setTiempo(Time tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Comida{" + "id_comida=" + id_comida + ", comida=" + comida + ", Fecha=" + Fecha + ", tiempo=" + tiempo + ", id_plan_dieta=" + id_plan_dieta + '}';
    }

   

    

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Comida) {
			if(((Comida) obj).id_comida == this.id_comida) {	
				return true;
			}
		}
		
		return false;
    }
    

   
    
                    
    
}
