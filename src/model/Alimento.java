/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author sergio
 */
public class Alimento {
    private int id_alimento;//
    private String nombre;//
    private String estado ;//
    private float caloria ;//
    private float proteinas;//
    private float grasas;//
    private float hidratos_de_carbono;//
    private float      H20;//	
    private float      NE;//
    private float vitamina_a;//	
    private float vitamina_B1;//
    private float vitamina_B2;//
    private float vitamina_C; //                
    private float Niac;//                        
    private float sodio ;//
    private float potasio;//
    private float calcio ;//
    private float magnesio;//
    private float hierro ;//
    private float cobre;    //
    private float fosforo;//
    private float azufre ;
    private float cloro;//
    private float Fen;//
    private float Ileu	;//
    private float Leu;//
    private float Lis;//
    private float Met;//
    private float Tre;//
    private float Tri;//
    private float Val;//
    private float Acid ;//
    private float AlCAL;//
   
   private  Vector <Receta> receta;

    public Alimento(int id_alimento, String nombre, String estado, float caloria, float proteinas, float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float hierro, float cobre, float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL) {
        this.id_alimento = id_alimento;
        this.nombre = nombre;
        this.estado = estado;
        this.caloria = caloria;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.hidratos_de_carbono = hidratos_de_carbono;
        this.H20 = H20;
        this.NE = NE;
        this.vitamina_a = vitamina_a;
        this.vitamina_B1 = vitamina_B1;
        this.vitamina_B2 = vitamina_B2;
        this.vitamina_C = vitamina_C;
        this.Niac = Niac;
        this.sodio = sodio;
        this.potasio = potasio;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.hierro = hierro;
        this.cobre = cobre;
        this.fosforo = fosforo;
        this.azufre = azufre;
        this.cloro = cloro;
        this.Fen = Fen;
        this.Ileu = Ileu;
        this.Leu = Leu;
        this.Lis = Lis;
        this.Met = Met;
        this.Tre = Tre;
        this.Tri = Tri;
        this.Val = Val;
        this.Acid = Acid;
        this.AlCAL = AlCAL;
        this.receta=new Vector<Receta>();
    }

    public Alimento(int id_alimento) {
        this.id_alimento = id_alimento;
    }

   
    public int getId_alimento() {
        return id_alimento;
    }

    public void setId_alimento(int id_alimento) {
        this.id_alimento = id_alimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getCaloria() {
        return caloria;
    }

    public void setCaloria(float caloria) {
        this.caloria = caloria;
    }

    public float getProteinas() {
        return proteinas;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public float getHidratos_de_carbono() {
        return hidratos_de_carbono;
    }

    public void setHidratos_de_carbono(float hidratos_de_carbono) {
        this.hidratos_de_carbono = hidratos_de_carbono;
    }

    public float getH20() {
        return H20;
    }

    public void setH20(float H20) {
        this.H20 = H20;
    }

    public float getNE() {
        return NE;
    }

    public void setNE(float NE) {
        this.NE = NE;
    }

    public float getVitamina_a() {
        return vitamina_a;
    }

    public void setVitamina_a(float vitamina_a) {
        this.vitamina_a = vitamina_a;
    }

    public float getVitamina_B1() {
        return vitamina_B1;
    }

    public void setVitamina_B1(float vitamina_B1) {
        this.vitamina_B1 = vitamina_B1;
    }

    public float getVitamina_B2() {
        return vitamina_B2;
    }

    public void setVitamina_B2(float vitamina_B2) {
        this.vitamina_B2 = vitamina_B2;
    }

    public float getVitamina_C() {
        return vitamina_C;
    }

    public void setVitamina_C(float vitamina_C) {
        this.vitamina_C = vitamina_C;
    }

    public float getNiac() {
        return Niac;
    }

    public void setNiac(float Niac) {
        this.Niac = Niac;
    }

    public float getSodio() {
        return sodio;
    }

    public void setSodio(float sodio) {
        this.sodio = sodio;
    }

    public float getPotasio() {
        return potasio;
    }

    public void setPotasio(float potasio) {
        this.potasio = potasio;
    }

    public float getCalcio() {
        return calcio;
    }

    public void setCalcio(float calcio) {
        this.calcio = calcio;
    }

    public float getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(float magnesio) {
        this.magnesio = magnesio;
    }

    public float getCobre() {
        return cobre;
    }

    public void setCobre(float cobre) {
        this.cobre = cobre;
    }

    public float getHierro() {
        return hierro;
    }

    public void setHierro(float hierro) {
        this.hierro = hierro;
    }

    public float getFosforo() {
        return fosforo;
    }

    public void setFosforo(float fosforo) {
        this.fosforo = fosforo;
    }

    public float getAzufre() {
        return azufre;
    }

    public void setAzufre(float azufre) {
        this.azufre = azufre;
    }

    public float getCloro() {
        return cloro;
    }

    public void setCloro(float cloro) {
        this.cloro = cloro;
    }

    public float getFen() {
        return Fen;
    }

    public void setFen(float Fen) {
        this.Fen = Fen;
    }

    public float getIleu() {
        return Ileu;
    }

    public void setIleu(float Ileu) {
        this.Ileu = Ileu;
    }

    public float getLeu() {
        return Leu;
    }

    public void setLeu(float Leu) {
        this.Leu = Leu;
    }

    public float getLis() {
        return Lis;
    }

    public void setLis(float Lis) {
        this.Lis = Lis;
    }

    public float getMet() {
        return Met;
    }

    public void setMet(float Met) {
        this.Met = Met;
    }

    public float getTre() {
        return Tre;
    }

    public void setTre(float Tre) {
        this.Tre = Tre;
    }

    public float getTri() {
        return Tri;
    }

    public void setTri(float Tri) {
        this.Tri = Tri;
    }

    public float getVal() {
        return Val;
    }

    public void setVal(float Val) {
        this.Val = Val;
    }

    public float getAcid() {
        return Acid;
    }

    public void setAcid(float Acid) {
        this.Acid = Acid;
    }

    public float getAlCAL() {
        return AlCAL;
    }

    public void setAlCAL(float AlCAL) {
        this.AlCAL = AlCAL;
    }

    

    public Vector<Receta> getReceta() {
        return receta;
    }

    public void setReceta(Vector<Receta> receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return  "id_alimento=" + id_alimento + ", nombre=" + nombre + ", estado=" + estado  ;
    }

    public float getGrasas() {
        return grasas;
    }

    public void setGrasas(float grasas) {
        this.grasas = grasas;
    }

   
  @Override
    public boolean equals(Object obj) {
       if(obj instanceof Alimento) {
			if(((Alimento) obj).id_alimento == this.id_alimento) {	
				return true;
			}
		}
		
		return false;
    }
     public static Vector<String> getTitleList() {
        // //(int id_alimento, String nombre, String estado, float caloria, float proteinas, float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1,
        //float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float hierro, float cobre, float fosforo, float azufre, float cloro,
        //float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL
		Vector<String> vector = new Vector<String>();
		vector.add("Id_alimento");
		vector.add("Nombre");
		vector.add("Estado");
		vector.add("Calorias");
		vector.add("Proteinas");
		vector.add("Grasas");
		vector.add("Hidratos de Carbono");
		vector.add("H2O");
		vector.add("NE");
		vector.add("Vitamina A");
		vector.add("Vitamina B1");
		vector.add("Vitamina B2");
		vector.add("Vitamina C");
		//vector.add("contraseña");
                vector.add("NiaC");
                vector.add("Sodio");
                vector.add("Potasio");
                vector.add("Magnesio");
                vector.add("Hierro");
                vector.add("Cobre");
                vector.add("Fosforo");
                vector.add("Azufre");
                vector.add("Cloro");
                vector.add("Fen");
                vector.add("Ileu");
                vector.add("Leu");
                vector.add("Lis");
                vector.add("Met");
                vector.add("Tre");
                vector.add("Tri");
                vector.add("Val");
                vector.add("ACID");
                vector.add("ALCAL");
                
                
                
                
		
		return vector;
	}

    Object[] getObjectList() {
        // //(int id_alimento, String nombre, String estado, float caloria, float proteinas, float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1,
        //float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float hierro, float cobre, float fosforo, float azufre, float cloro,
        //float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL
        return new Object[]{this.id_alimento,this.nombre, this.estado,this.caloria, this.proteinas,this.grasas,this.hidratos_de_carbono,this.H20,this.NE,this.vitamina_a,this.vitamina_B1,this.vitamina_B2,this.vitamina_C,
        this.Niac,this.sodio,this.potasio,this.calcio,this.magnesio,this.hierro,this.cobre,this.fosforo,this.azufre,this.cloro,this.Fen,this.Ileu,this.Leu,this.Lis,this.Met,this.Tre,this.Tri,this.Val,this.Acid,this.AlCAL};
    }
    
}
