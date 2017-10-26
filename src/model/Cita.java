/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author sergio
 */
public class Cita {
   private int id_cita;
    private Nutricionista id_nutricionista;
    private Date fecha;
    private Time hora;
   private  Paciente id_paciente;

    public Cita(int id_cita, Nutricionista id_nutricionista, Date fecha, Time hora, Paciente id_paciente) {
        this.id_cita = id_cita;
        this.id_nutricionista = id_nutricionista;
        
        this.fecha = fecha;
        this.hora = hora;
        this.id_paciente = id_paciente;
        this.id_paciente.getCitas().add(this);
        this.id_nutricionista.getCitas().add(this);
    }

    public Cita(int id_cita, Date fecha, Time hora) {
        this.id_cita = id_cita;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId_cita() {
        return id_cita;
    }

    public void setId_cita(int id_cita) {
        this.id_cita = id_cita;
    }
    

    

    public Nutricionista getId_nutricionista() {
        return id_nutricionista;
    }

    public void setId_nutricionista(Nutricionista id_nutricionista) {
        this.id_nutricionista = id_nutricionista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Paciente getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Paciente id_paciente) {
        this.id_paciente = id_paciente;
    }

    @Override
    public String toString() {
        return "Cita{" + "id_cita=" + id_cita + ", id_nutricionista=" + id_nutricionista + ", fecha=" + fecha + ", hora=" + hora + ", id_paciente=" + id_paciente + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Cita) {
			if(((Cita) obj).id_cita == this.id_cita) {	
				return true;
			}
		}
		
		return false;
    }
    
    
     public static Vector<String> getTitleList() {
        //id_paciente, String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password
		Vector<String> vector = new Vector<String>();
		vector.add("Id_cita");
		vector.add("Nombre");
		vector.add("Apellidos");
		vector.add("Fecha");
		vector.add("Hora");
		vector.add("id_paciente");
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
        return new Object[]{this.id_cita,this.id_paciente.getNombre(), this.id_paciente.getApellidos(),this.fecha, this.hora,this.id_paciente.getId_paciente()};
    }
    
}
