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
public class Paciente {
    private int id_paciente;
    private String dni ;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private float peso_actual;
    private float peso_objetivo;
    private float altura;
    private int edad;
    private String sexo ;
    private String password;
    private String complexion;
    private Nutricionista nutricionista;
    private Vector <Cita> citas ;
    private Vector <Plan_de_Dieta> dietas;

    public Paciente(int id_paciente, String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password, String complexion, Nutricionista nutricionista) {
        this.id_paciente = id_paciente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.peso_actual=peso_actual;
        this.peso_objetivo = peso_objetivo;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
        this.password = password;
        this.complexion = complexion;
        this.nutricionista = nutricionista;
        this.citas=new <Cita>Vector ();
        this.dietas=new <Plan_de_Dieta>Vector();
         this.nutricionista.getClientes().add(this);
    }

    public float getPeso_actual() {
        return peso_actual;
    }

    public void setPeso_actual(float peso_actual) {
        this.peso_actual = peso_actual;
    }

    public Paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }
    


   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Nutricionista getNutricionista() {
        return nutricionista;
    }

    public void setNutricionista(Nutricionista nutricionista) {
        this.nutricionista = nutricionista;
    }

   
    

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getPeso_objetivo() {
        return peso_objetivo;
    }

    public void setPeso_objetivo(float peso_objetivo) {
        this.peso_objetivo = peso_objetivo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Vector<Cita> getCitas() {
        return citas;
    }

    public void setCitas(Vector<Cita> citas) {
        this.citas = citas;
    }

    public Vector<Plan_de_Dieta> getDietas() {
        return dietas;
    }

    public void setDietas(Vector<Plan_de_Dieta> dietas) {
        this.dietas = dietas;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id_paciente=" + id_paciente + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", peso_objetivo=" + peso_objetivo + ", altura=" + altura + ", edad=" + edad + ", sexo=" + sexo + ", password=" + password + ", nutricionista=" + nutricionista + ", citas=" + citas + ", dietas=" + dietas + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
       if(obj instanceof Paciente) {
			if(((Paciente) obj).id_paciente == this.id_paciente) {	
				return true;
			}
		}
		
		return false;
    }
    
    public static Vector<String> getTitleList() {
        //id_paciente, String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password
		Vector<String> vector = new Vector<String>();
		vector.add("Id_paciente");
                vector.add("dni");
		vector.add("Nombre");
		vector.add("Apellidos");
		vector.add("Telefono");
		vector.add("Email");
		vector.add("Peso Actual");
		vector.add("Peso Objetivo");
		vector.add("Altura");
		vector.add("Edad");
		vector.add("Sexo");
		vector.add("contraseña");
                vector.add("Complexion");
		
		return vector;
	}

    Object[] getObjectList() {
        // //id_paciente, String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password
        return new Object[]{this.id_paciente,this.dni,this.nombre, this.apellidos,this.telefono, this.email,this.peso_actual,this.peso_objetivo,this.altura,this.edad,this.sexo,this.password,this.complexion};
    }
    
    
}
