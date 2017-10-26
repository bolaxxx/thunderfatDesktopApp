/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.Objects;
import java.util.Vector;

/**
 *
 * @author sergio
 */
public class Nutricionista {
    int id_nutricionista;
    String nombre;
    String apellidos;
    String dni;
    String email;
    String telefono;
    String password;
    private Vector <Paciente> clientes ;
    Vector <Cita> citas;
    Vector<Plan_de_Dieta> dietas;


    public Nutricionista(int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono, String password) {
        this.id_nutricionista = id_nutricionista;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.clientes=new Vector<Paciente>();
        this.citas=new Vector<Cita>();
        this.dietas=new Vector<Plan_de_Dieta>();
       
    }

    public Vector<Plan_de_Dieta> getDietas() {
        return dietas;
    }

    public void setDietas(Vector<Plan_de_Dieta> dietas) {
        this.dietas = dietas;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Nutricionista(int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono, String password, Vector<Paciente> clientes, Vector<Cita> citas) {
        this.id_nutricionista = id_nutricionista;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.clientes = clientes;
        this.citas = citas;
        
    }
    

    
   

   

    public int getId_nutricionista() {
        return id_nutricionista;
    }

    public void setId_nutricionista(int id_nutricionista) {
        this.id_nutricionista = id_nutricionista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }



    public Vector <Paciente> getClientes() {
        return clientes;
    }

    public void setClientes(Vector<Paciente> clientes) {
        this.clientes = clientes;
    }

    public Vector<Cita> getCitas() {
        return citas;
    }

    public void setCitas(Vector<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Nutricionista{" + "id_nutricionista=" + id_nutricionista + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", email=" + email + ", telefono=" + telefono +  ", clientes=" + clientes + ", citas=" + citas + '}';
    }

  

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Nutricionista) {
			if(((Nutricionista) obj).id_nutricionista == this.id_nutricionista) {	
				return true;
			}
		}
		
		return false;
    }
    
}
