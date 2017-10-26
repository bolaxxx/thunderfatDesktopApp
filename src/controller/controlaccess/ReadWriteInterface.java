/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controlaccess;

import java.sql.Time;
import java.util.Date;



/**
 *
 * @author sergio
 */
public interface ReadWriteInterface {
    /**
	 * Leer todos los alimentos 
	 */
	public void leerAlimentos();
	
	/**
	 * ver  un alimento
	 * 
     * @param id_alimento
	 
	 */
	public void leerAlimento(int id_alimento);
        /**
         * 
         * insertar un nuevo elemento 
         * 
         * 
     * @param id_alimento        
     * @param nombre        
     * @param estado        
     * @param caloria        
     * @param proteinas        
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
        */
        
        public void insertarAlimento (int id_alimento, String nombre, String estado, float caloria, float proteinas,float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float cobre, float hierro, float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL);
        
        /**
         *  editar los parametros de un alimento 
         * 
         * 
         * @param id_alimento
         * @param nombre
         * @param estado
         * @param caloria
         * @param proteinas
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
         */
        
        public void editarAlimento(int id_alimento, String nombre, String estado, float caloria, float proteinas,float grasas ,float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float cobre, float hierro, float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL);
        
	
	/**
	 * Insertar un nuevo paciente  
	 * 
     * @param id_paciente
     * @param dni
     * @param nombre
     * @param apellidos
     * @param emaail
     * @param telefono
     * @param peso_objetivo
     * @param altura
     * @param edad
     * @param sexo
     * @param password
     
	
	 */
	public void insertarPaciente ( String dni, String nombre, String apellidos, String telefono,String emaail,float peso_actual, float peso_objetivo, float altura, int edad, String sexo, String password,String complexion);
	
        
/**
 * 
 * @param id_paciente
 * @param dni
 * @param nombre
 * @param apellidos
 * @param telefono
 * @param email
 * @param peso_actual
 * @param peso_objetivo
 * @param altura
 * @param edad
 * @param sexo
 * @param password
 * @param complexion 
 */

        public void editarPaciente(int id_paciente , String dni, String nombre, String apellidos, String telefono ,String email ,float peso_actual,float peso_objetivo, float altura, int edad, String sexo, String password,String complexion);
        /**
	
	 */	/**
	 * Leer todos los Pacientes de un nutricionista
     * @param id_nutricionista
	 */
        
        
        
	public void leerPacientes (int id_nutricionista);
        /**
         *  Leer ficha Paciente
         * 
         * 
     * @param id_paciente        
        */
        
        
        
        public void leerPaciente(int id_paciente );
	
	/**
	 * Insertar un Nutricionista 
	 *
     * @param id_nutricionista
     * @param nombre
     * @param apellidos
     * @param dni
     * @param email
     * @param telefono
     * @param password
	 */
	public void insertarNutricionista(int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono,String password);
	
	/**
	 * editar  un nutricionista
	 * 
     * @param id_nutricionista
     * @param nombre
     * @param apellidos
     * @param dni
     * @param email
     * @param telefono
     * @param password
	
	 */
        
        public void editarNutricionista(int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono,String password);
        /**
         * 
         * @param id_nutricionista
         * @param id_paciente
         * @param fehca
         * @param hora 
         */
	public void insertarCita(int id_nutricionista, int id_paciente,Date fehca,Time hora);
        
        /**
         * 
         * @param id_nutricionista
         * @param id_paciente
         * @param fehca
         * @param hora 
         */
        public void editarCita(int id_nutricionista, int id_paciente,Date fehca,Time hora);
        
        /**
         * 
         * @param id_nutricionista 
         */
        public void leerCitas();
        
        /**
         * insertar un nuevo plan de dieta
         * 
         * 
         * 
     * @param id_plan_de_dieta
     * @param caloria_max_diarias
     * @param fecha_Inicio
     * @param Fecha_fin
     * @param n_comidas_diarias
     * @param id_paciente
     * @param id_nutricionista
         */
        public void insertarPlanDieta(int id_plan_de_dieta, int caloria_max_diarias, Date fecha_Inicio, Date Fecha_fin, int n_comidas_diarias,int id_paciente,int  id_nutricionista);
       
        /**
         * 
         * @param id_plan_de_dieta
         * @param caloria_max_diarias
         * @param fecha_Inicio
         * @param Fecha_fin
         * @param n_comidas_diarias 
     * @param id_paciente 
     * @param id_nutricionista 
         */
        public void editarPlanDieta(int id_plan_de_dieta, int caloria_max_diarias, Date fecha_Inicio, Date Fecha_fin, int n_comidas_diarias,int id_paciente,int  id_nutricionista);
        
        /**
        * leer  los planes de dieta de un Usuario
         * @param id_paciente 
         */
        public void leerPlanDieta(int id_paciente);
        
    /**
     *leeer todos los  planes de dieta  realizaedos por un nutricionista 
     * @param id_nutricionista
     */
    public void leerPlanesDietas();
    
    
    /**
     *  
     * @param id_plan_de_dieta 
     */
    public void leerDetallePlanDieta(int id_plan_de_dieta );
    /**
     * 
     * @param id_paln_de_dieta 
     */
    public void leerAimentosPlanDieta(int id_paln_de_dieta);
    /**
     * 
     * @param id_alimento
     * @param fecha
     * @param hora
     * @param id_plan_de_dieta 
     */
    public void insertarAlimentoPlanDieta(int id_alimento, Date fecha, Time hora,int id_plan_de_dieta);
   /**
    * 
    * @param id_alimento
    * @param fecha
    * @param hora
    * @param id_plan_de_dieta 
    */ 
    public void editarAlimentoPlanDieta(int id_alimento, Date fecha, Time hora,int id_plan_de_dieta);
    /**
     * 
     * 
     */
   
    
    public void leerRecetas();
    
    public void leerComidas();
    
    
}
