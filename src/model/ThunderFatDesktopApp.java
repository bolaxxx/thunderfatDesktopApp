/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author sergio
 */
public class ThunderFatDesktopApp {
    
    Vector<Alimento> alimentos;
    Vector<Plan_de_Dieta> planes;
    Vector <Paciente> pacientes ;
    Vector <Comida> comidas;
    Vector <Cita> citas;
    
    Nutricionista currentUser;
    Vector<Nutricionista> nutricionistas;
    Vector<Receta> recetas;


        
        
        // TODO code application logic here

    public ThunderFatDesktopApp() {
        this.alimentos= new Vector<Alimento>();
        this.citas=new Vector<Cita> ();
        this.comidas= new Vector <Comida>();
        this.pacientes=new Vector<Paciente>();
        this.planes=new Vector<Plan_de_Dieta>();
        this.nutricionistas= new Vector<Nutricionista>();
        this.recetas=new Vector<Receta>();
        this.comidas=new Vector<Comida>();
      //  this.currentUser=new Nutricionista();
    }
   
    public String getAlimentosString() {
		String text = "";
		for (Iterator<Alimento> i = this.alimentos.iterator(); i.hasNext();) 
			text += i.next().toString() + ";" + "\n" + ";";
		
		return text;
	}
    public String getCitasString() {
		String text = "";
		for (Iterator<Cita> i = this.citas.iterator(); i.hasNext();) 
			text += i.next().toString() + ";" + "\n" + ";";
		
		return text;
	}
    
    
    public String getPacienteString() {
		String text = "";
		for (Iterator<Paciente> i = this.pacientes.iterator(); i.hasNext();) 
			text += i.next().toString() + ";" + "\n" + ";";
		
		return text;
	}
    
    public Vector<Object[]> getPacientesObjectList() {
		Vector<Object[]> list = new Vector<Object[]>();

		for(Iterator<Paciente> i = pacientes.iterator(); i.hasNext();) {
			list.add(i.next().getObjectList());
		}
		
		return list;
	}
    public Vector<Object[]> getCitasObjectList() {
		Vector<Object[]> list = new Vector<Object[]>();

		for(Iterator<Cita> i = citas.iterator(); i.hasNext();) {
			list.add(i.next().getObjectList());
		}
		
		return list;
	}
    public Vector<Object[]> getAlimentosObjectList() {
		Vector<Object[]> list = new Vector<Object[]>();

		for(Iterator<Alimento> i = alimentos.iterator(); i.hasNext();) {
			list.add(i.next().getObjectList());
		}
		
		return list;
	}
    public Vector<String>getAlimentoStringList(){
        Vector <String> list = new Vector<String>();
        for(Iterator<Alimento> i = alimentos.iterator();i.hasNext();){
        list.add(i.next().toString());    
        }
        return list;
    }
    
    public Vector<Object[]> getPlanesDietasObjectList() {
		Vector<Object[]> list = new Vector<Object[]>();

		for(Iterator<Plan_de_Dieta> i = planes.iterator(); i.hasNext();) {
			list.add(i.next().getObjectList());
		}
		
		return list;
	}
    
    public Vector<Object[]> getRecetasObjectList() {
		Vector<Object[]> list = new Vector<Object[]>();

		for(Iterator<Receta> i = recetas.iterator(); i.hasNext();) {
			list.add(i.next().getObjectList());
		}
		
		return list;
	}
    public String getPlanes_DietasString() {
		String text = "";
		for (Iterator<Plan_de_Dieta> i = this.planes.iterator(); i.hasNext();) 
			text += i.next().toString() + ";" + "\n" + ";";
		
		return text;
	}

    public Vector<Nutricionista> getNutricionistas() {
        return nutricionistas;
    }
    public String getComidasString() {
		String text = "";
		for (Iterator<Comida> i = this.comidas.iterator(); i.hasNext();) 
			text += i.next().toString() + ";" + "\n" + ";";
		
		return text;
	}
    
    
    public boolean addPaciente(int id_paciente, String dni, String nombre, String apellidos, String telefono, String email,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password, String complexion, Nutricionista nutricionista) {
		return this.pacientes.add(new Paciente( id_paciente, dni,  nombre, apellidos,  telefono,email,peso_actual, peso_objetivo,  altura, edad, sexo,  password,complexion,nutricionista));
	}
	
	public boolean addPaciente( String dni, String nombre, String apellidos, String telefono, String email, float peso_actual,float peso_objetivo, float altura, int edad, String sexo, String password, String complexion, Nutricionista nutricionista) {
		return this.pacientes.add(new Paciente(getLastPacienteId(), dni, nombre, apellidos, telefono,email,peso_actual, peso_objetivo, altura, edad, sexo,password,complexion,nutricionista));
	}

       /**
        *  METODO PARA AÑADIR DESDE LA BASE DE DATOS
        * @param id_alimento
        * @param nombre
        * @param estado
        * @param caloria
        * @param proteinas
        * @param grasas
        * @param hidratos_de_carbono
        * @param H20
        * @param NE
        * @param vitamina_a
        * @param vitamina_B1
        * @param vitamina_B2
        * @param vitamina_C
        * @param Niac
        * @param sodio
        * @param potasio
        * @param calcio
        * @param magnesio
        * @param hierro
        * @param cobre
        * @param fosforo
        * @param azufre
        * @param cloro
        * @param Fen
        * @param Ileu
        * @param Leu
        * @param Lis
        * @param Met
        * @param Tre
        * @param Tri
        * @param Val
        * @param Acid
        * @param AlCAL
        * @return 
        */
         public boolean addAlimento (int id_alimento, String nombre, String estado, float caloria, float proteinas, float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float hierro, float cobre, float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL) {
		return this.alimentos.add(new Alimento(id_alimento, nombre,  estado, caloria,proteinas,grasas,hidratos_de_carbono,H20, NE,vitamina_a,vitamina_B1,vitamina_B2,vitamina_C, Niac, sodio, potasio, calcio, magnesio, hierro, cobre,  fosforo, azufre, cloro, Fen,  Ileu,  Leu, Lis, Met, Tre,  Tri,  Val,  Acid,  AlCAL));
	}
	/**
         *  
         * 
         * @param nombre
         * @param estado
         * @param caloria
         * @param proteinas
         * @param grasas
         * @param hidratos_de_carbono
         * @param H20
         * @param NE
         * @param vitamina_a
         * @param vitamina_B1
         * @param vitamina_B2
         * @param vitamina_C
         * @param Niac
         * @param sodio
         * @param potasio
         * @param calcio
         * @param magnesio
         * @param cobre
         * @param hierro
         * @param fosforo
         * @param azufre
         * @param cloro
         * @param Fen
         * @param Ileu
         * @param Leu
         * @param Lis
         * @param Met
         * @param Tre
         * @param Tri
         * @param Val
         * @param Acid
         * @param AlCAL
         * @return 
         */
	 public boolean addNuevoAlimento ( String nombre, String estado, float caloria, float proteinas,float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float cobre, float hierro, float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL){
		return this.alimentos.add(new Alimento( getLastAlimentoId(), nombre,  estado, caloria,proteinas,grasas,hidratos_de_carbono,H20, NE,vitamina_a,vitamina_B1,vitamina_B2,vitamina_C, Niac, sodio, potasio, calcio, magnesio, hierro, cobre,  fosforo, azufre, cloro, Fen,  Ileu,  Leu, Lis, Met, Tre,  Tri,  Val,  Acid,  AlCAL));
	}
         /**
          * 
          * @param id_nutricionista
          * @param nombre
          * @param apellidos
          * @param dni
          * @param email
          * @param telefono
          * @param password
          * @return 
          */
          public boolean addNutricionista (int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono, String password) {
		return this.nutricionistas.add(new Nutricionista(id_nutricionista,  nombre,  apellidos, dni, email, telefono, password));
	}
          /**
           * metodo para añadir a memoria y a la base de datos 
           * @param id_plan_de_dieta
           * @param caloria_max_diarias
           * @param fecha_Inicio
           * @param Fecha_fin
           * @param n_comidas_diarias
           * @param id_paciente
           * @param id_nutricionista
           * @param comidas
           * @return 
           */
             public boolean addPlandeDieta (int id_plan_de_dieta, int caloria_max_diarias, Date fecha_Inicio, Date Fecha_fin, int n_comidas_diarias, Paciente id_paciente, Nutricionista id_nutricionista) {
		return this.planes.add(new Plan_de_Dieta( id_plan_de_dieta,caloria_max_diarias, fecha_Inicio,  Fecha_fin, n_comidas_diarias,id_paciente,id_nutricionista));
	}
             /**
              * metodo para añadir desde la base de datos 
              * @param id_plan_de_dieta
              * @param caloria_max_diarias
              * @param fecha_Inicio
              * @param Fecha_fin
              * @param n_comidas_diarias
              * @param id_paciente
              * @param id_nutricionista
              * @return 
              */
              public boolean addPlandeDieta (int caloria_max_diarias, Date fecha_Inicio, Date Fecha_fin, int n_comidas_diarias, Paciente id_paciente, Nutricionista id_nutricionista) {
		return this.planes.add(new Plan_de_Dieta( getLastPlanDietaId(),caloria_max_diarias, fecha_Inicio,  Fecha_fin, n_comidas_diarias,id_paciente,id_nutricionista));
	}
             /**
              * metodo para añadir desde base de datos citas
              * @param id_cita
              * @param nutricionista
              * @param fecha
              * @param hora
              * @param paciente
              * @return 
              */
               public boolean addCita (int id_cita,Nutricionista nutricionista, Date fecha, Time hora,Paciente paciente) {
		return this.citas.add(new Cita(id_cita,nutricionista, fecha,hora,paciente ));
	}
                /**
                 *  metodo para añadir a la base de datos y a memoria 
                 * @param nutricionista
                 * @param fecha
                 * @param hora
                 * @param paciente
                 * @return 
                 */
               
               public boolean addCita (Nutricionista nutricionista, Date fecha, Time hora,Paciente paciente) {
		return this.citas.add(new Cita(getLastCitaId(),nutricionista, fecha,hora,paciente ));
	}
               
               public boolean addComida(int id_comida,Alimento comida, Date Fecha, Time tiempo,Receta receta, Plan_de_Dieta id_plan_dieta){
              return this.comidas.add(new Comida( id_comida, comida,  Fecha, tiempo, receta,id_plan_dieta)) ;
                      }
               
       /**
        * 
        * @return 
        */       
    private int getLastPacienteId() {
        int i = 0;
		for(Paciente e : this.pacientes) {
			if(e.getId_paciente() >= i)
				i = e.getId_paciente()+1;
		}
		return i;
    }
    /**
     * 
     * @return 
     */
    private int getLastAlimentoId() {
       int i = 0;
		for(Alimento e : this.alimentos) {
			if(e.getId_alimento() >= i)
				i = e.getId_alimento()+1;
		}
		return i;
    }
    /**
     * 
     * @return 
     */
    private int getLastCitaId() {
       int i = 0;
		for(Cita e : this.citas) {
			if(e.getId_cita() >= i)
				i = e.getId_cita()+1;
		}
		return i;
    }/**
     * 
     * @return 
     */
    private int getLastComidaId(){
        int i = 0;
        for(Comida e: this.comidas){
            if(e.getId_comida()>=1)
                i=e.getId_comida()+1;
        }
        return i;
    }/**
     * 
     * @return 
     */
    private int getLastRecetaId(){
        int i =0;
        for (Receta e:this.recetas){
            if(e.getId_receta()>=1)
                i=e.getId_receta()+i;
        }
        return i;
    }
    /**
     * 
     * @return 
     */
   
    
    private int getLastPlanDietaId(){
        int i=0;
        for (Plan_de_Dieta e:this.planes){
            if(e.getId_plan_de_dieta()>=i)
                i=e.getId_plan_de_dieta()+1;
        }
        return i;
    }
    public Receta getTargetedReceta(int id_receta){
        Receta recetaBuscada =new Receta(id_receta);
        for (Receta u:this.recetas){
            if(u.equals(recetaBuscada)){
                return u ;
               
            }
        }
        return null ;
    }
            public Plan_de_Dieta getTargetedPlanDieta(int id_plan ){
                Plan_de_Dieta dietabuscada= new Plan_de_Dieta(id_plan);
            for (Plan_de_Dieta u : this.planes){
                if(u.equals(dietabuscada)){
                    return u ;
                }
                
            }
            return null ;
            }
            
    public Comida getTargetedComida(int comida,int id_plan) {
        Comida list = new Comida(comida,null,null,null,null,this.getTargetedPlanDieta(id_plan));
		
			for (Comida u: this.comidas){
                            if(u.equals(list)){
                                return u;
                        
                            }
						
			}
		
		return null;
    }
    
   public Nutricionista getTargetedNutricionista(int id_dietista){
      Nutricionista nutricionidataBuscado= new Nutricionista(id_dietista,null,null,null,null,null,null);
      
		
		for (Nutricionista u : this.nutricionistas){
			if (u.equals(nutricionidataBuscado)) {
				return u;
			}
		}
		return null;
   }
    public void borrarAlimentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vector<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(Vector<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Vector<Plan_de_Dieta> getPlanes() {
        return planes;
    }

    public void setPlanes(Vector<Plan_de_Dieta> planes) {
        this.planes = planes;
    }

    public Vector<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Vector<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public Vector<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(Vector<Comida> comidas) {
        this.comidas = comidas;
    }

    public Vector<Cita> getCitas() {
        return citas;
    }

    public void setCitas(Vector<Cita> citas) {
        this.citas = citas;
    }

    public Nutricionista getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Nutricionista currentUser) {
        this.currentUser = currentUser;
    }

    public void borrarPlanesDietas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Paciente getTargetedPaciente(int id_paciente) {
      Paciente pacienteBuscado =new Paciente( id_paciente);
      
      for(Paciente u: this.pacientes){
          if (u.equals(pacienteBuscado)){
              return u;
          }
      }
        return null;
    }

    public void borrarCitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void borrarPaso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void borrarrecetas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void borrarNutricionistas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean  addReceta(int id_receta,String nombre ,Alimento alimento, String procedimiento) {
        return this.recetas.add(new Receta(id_receta, nombre,alimento,procedimiento)) ;
    }

    

    public Alimento getTargetedAlimento(int id_alimento) {
        Alimento alimentoBuscado= new Alimento (id_alimento);
        for (Alimento u :this.alimentos){
            if (u.equals(alimentoBuscado)){
                return u ;
            }

       }return null; 
       
    }

    

    
   
    
	}
        
        


