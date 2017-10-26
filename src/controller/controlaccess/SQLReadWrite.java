/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.controlaccess;

import control.MainControl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import model.Paciente;

/**
 *
 * @author sergio
 */
public class SQLReadWrite implements ReadWriteInterface{
	private MainControl controlPadre;
	private Connection conexion;
	private String ip;
	private String user;
	private String pass;
	
	/**
	 * Metodo para mostrar los errores de SQL
	 * 
	 * @param e
	 */
	private void MensajeExcepcion(Exception e)
	{
		
		String mensaje = e.getMessage();
		
		if (e instanceof SQLException) {
			SQLException sqlE = (SQLException)e;
			
			mensaje = "SQLException: " + mensaje + "\n" + "SQLState: " + sqlE.getSQLState();
			
			JOptionPane.showMessageDialog(null, mensaje, "Error de Conexion", JOptionPane.ERROR_MESSAGE);

		} else {
			e.printStackTrace();
		}
	}
	
	/**
	 * Constructor de la clase
	 * 
	 * @param ip
	 * @param puerto
	 * @param base
	 * @param user
	 * @param pass
	 * @param controlPadre
	 */
	public SQLReadWrite(String ip, String puerto, String base, String user, String pass, MainControl controlPadre) {
		super();
		this.controlPadre = controlPadre;
		this.ip = "jdbc:mysql://" + ip + ":" + puerto + "/" + base;
		this.user = user;  
		this.pass = pass;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			MensajeExcepcion(e);
		}
	}
	
	/**
	 * Abre la conexion segun los parametros del constructor
	 */
	private void abrirConexion() {

		try {
			conexion = DriverManager.getConnection(ip, user, pass);
		} catch (SQLException e) {
			MensajeExcepcion(e);
		}
	}
	
	/**
	 * Cierra la conexion de la base de datos
	 */
	private void cerrarConexion() {

		try {
			conexion.close();
		} catch (Exception e) {
			
			MensajeExcepcion(e);

		}
	}

    @Override
    public void leerAlimentos() {
        abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM `alimento`");
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarAlimentos();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.addAlimento(r.getInt(1), 
							r.getString(2), 
							r.getString(3), 
							r.getFloat(4), 
							r.getFloat(5),
                                                        r.getFloat(6),
                                                        r.getFloat(7),
                                                        r.getFloat(8),
                                                        r.getFloat(9),
                                                        r.getFloat(10),
                                                        r.getFloat(11),
                                                        r.getFloat(12),
                                                        r.getFloat(13),
                                                        r.getFloat(14),
                                                        r.getFloat(15),
                                                        r.getFloat(16),
                                                        r.getFloat(17),
                                                        r.getFloat(18),
                                                        r.getFloat(19),
                                                        r.getFloat(20),
                                                        r.getFloat(21),
                                                        r.getFloat(22),
                                                        r.getFloat(23),
                                                        r.getFloat(24),
                                                        r.getFloat(25),
                                                        r.getFloat(26),
                                                        r.getFloat(27),
                                                        r.getFloat(28),
                                                        r.getFloat(29),
                                                        r.getFloat(30),
                                                        r.getFloat(31),
                                                        r.getFloat(32),
                                                        r.getFloat(33));
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
		}
    }

    @Override
    public void leerAlimento(int id_alimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarAlimento(int id_alimento, String nombre, String estado, float caloria, float proteinas,float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float cobre, float hierro, float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarAlimento(int id_alimento, String nombre, String estado, float caloria, float proteinas, float grasas,float hidratos_de_carbono, float H20,
            float NE, float vitamina_a, float vitamina_B1, float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float cobre, float hierro,
            float fosforo, float azufre, float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL) {
        abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("UPDATE `alimento` SET `nombre`=?,`estado`=?,`calorias`=?,`proteinas`=?,`grasas`=?,`hidratos_carbono`=?,`h20`=?,`ne`=?,`vitamina_a`=?,`vitamina_b1`=?,`vitamina_b2`=?,`vitamina_c`=?,`niac`=?,`sodio`=?,`potasio`=?,`calcio`=?,`magnesio`=?,`hierro`=?,`cobre`=?,`fosforo`=?,`azufre`=?,`cloro`=?,`fen`=?,`ileu`=?,`leu`=?,`lis`=?,`met`=?,`tre`=?,`tri`=?,`val`=?,`acid`=?,`alcal`=? WHERE id_alimento=?;");
                                  prepstmt.setString(1,nombre);     		 		
                                  prepstmt.setString(2,estado);     		 		
                                  prepstmt.setFloat(3,caloria);     		
                                  prepstmt.setFloat(4,proteinas);     		
                                  prepstmt.setFloat(5,grasas);     		
                                  prepstmt.setFloat(6,hidratos_de_carbono);     		
                                  prepstmt.setFloat(7,H20);     		
                                  prepstmt.setFloat(8,NE);     		
                                  prepstmt.setFloat(9,vitamina_a);     		
                                  prepstmt.setFloat(10,vitamina_B1);     		
                                  prepstmt.setFloat(11,vitamina_B2);     		
                                  prepstmt.setFloat(12,vitamina_C);     		
                                  prepstmt.setFloat(13,Niac);     		
                                  prepstmt.setFloat(14,sodio);     		
                                  prepstmt.setFloat(15,potasio);     		
                                  prepstmt.setFloat(16,calcio);     		
                                  prepstmt.setFloat(17,magnesio);     		
                                  prepstmt.setFloat(18,cobre);     		
                                  prepstmt.setFloat(19,hierro);     		
                                  prepstmt.setFloat(20,fosforo);     		
                                  prepstmt.setFloat(21,azufre);     		
                                  prepstmt.setFloat(22,cloro);     		
                                  prepstmt.setFloat(23,Fen);     		
                                  prepstmt.setFloat(24,Ileu);     		
                                  prepstmt.setFloat(25,Leu);     		
                                  prepstmt.setFloat(26,Lis);     		
                                  prepstmt.setFloat(27,Met);     		
                                  prepstmt.setFloat(28,Tre);     		
                                  prepstmt.setFloat(29,Tri);     		
                                  prepstmt.setFloat(30,Val);     		
                                  prepstmt.setFloat(31,Acid);     		
                                  prepstmt.setFloat(32,AlCAL);     		
                                  		
                                  prepstmt.setInt(33,id_alimento);     		
				
                                 int i= prepstmt.executeUpdate();
				// prepstmt.executeQuery();
				
				
				
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
		}    }
    

    @Override
    public void insertarPaciente( String dni, String nombre, String apellidos, String telefono,String email , float peso_actual,float peso_objetivo
            , float altura, int edad, String sexo, String password,String complexion) {
     System.out.println("llego a la consulta insert paciente ");
        abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("INSERT INTO paciente( dni, nombre, apellidos, telefono, email, peso_actual, peso_objetivo, altura, edad, sexo, contraseña, complexion, id_nutricionista) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
				
                                
				//prepstmt.setInt(1, controlPadre.thunderfat.getLastPacienteId());
				prepstmt.setString(1, dni);
				prepstmt.setString(2, nombre);
				prepstmt.setString(3, apellidos);
				prepstmt.setString(4, telefono);
				prepstmt.setString(5, email);
				prepstmt.setFloat(6, peso_actual);
				prepstmt.setFloat(7, peso_objetivo);
				prepstmt.setFloat(8, altura);
				prepstmt.setInt(9, edad);
				prepstmt.setString(10, sexo);
				prepstmt.setString(11, password);
				prepstmt.setString(12, complexion);
				prepstmt.setInt(13, controlPadre.thunderfat.getCurrentUser().getId_nutricionista());
				

				
				prepstmt.executeUpdate();
				
				
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
		}
		
	}  
    

    

    @Override
    public void leerPacientes(int id_nutricionista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leerPaciente(int id_paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarNutricionista(int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarNutricionista(int id_nutricionista, String nombre, String apellidos, String dni, String email, String telefono, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarCita(int id_nutricionista, int id_paciente, Date fehca, Time hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarCita(int id_nutricionista, int id_paciente, Date fehca, Time hora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leerCitas() {
        abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM `citas`WHERE id_nutricionista="+controlPadre.thunderfat.getCurrentUser().getId_nutricionista());
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarCitas();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.addCita(r.getInt(3), 
							   controlPadre.thunderfat.getTargetedNutricionista(r.getInt(4)), 
							r.getDate(1), 
							r.getTime(2), 
							
                                                       controlPadre.thunderfat.getTargetedPaciente(r.getInt(5)) 
                                                      //int id_cita,Nutricionista nutricionista, Date fecha, Time hora,Paciente paciente
                                                       );
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
		}
    }

    @Override
    public void insertarPlanDieta(int id_plan_de_dieta, int caloria_max_diarias, Date fecha_Inicio, Date Fecha_fin, int n_comidas_diarias, int id_paciente, int id_nutricionista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarPlanDieta(int id_plan_de_dieta, int caloria_max_diarias, Date fecha_Inicio, Date Fecha_fin, int n_comidas_diarias, int id_paciente, int id_nutricionista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leerPlanDieta(int id_paciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leerPlanesDietas() {
             abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM `plan_de_dieta`WHERE id_nutricionista="+controlPadre.thunderfat.getCurrentUser().getId_nutricionista());
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarPlanesDietas();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.addPlandeDieta(r.getInt(1), 
							r.getInt(2), 
							r.getDate(3), 
							r.getDate(4), 
							r.getInt(5),
                                                       controlPadre.thunderfat.getTargetedPaciente(r.getInt(6)) ,
                                                         controlPadre.thunderfat.getTargetedNutricionista(r.getInt(7))
                                                       );
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
		}
        
            }

    @Override
    public void leerDetallePlanDieta(int id_plan_de_dieta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void leerAimentosPlanDieta(int id_paln_de_dieta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertarAlimentoPlanDieta(int id_alimento, Date fecha, Time hora, int id_plan_de_dieta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarAlimentoPlanDieta(int id_alimento, Date fecha, Time hora, int id_plan_de_dieta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void leerPacientes() {
      abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM `paciente` WHERE `id_nutricionista`="+controlPadre.thunderfat.getCurrentUser().getId_nutricionista());
				ResultSet r = prepstmt.executeQuery();
				
				controlPadre.thunderfat.getPacientes().clear();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.getPacientes().add(new Paciente(r.getInt(1), 
							r.getString(2), 
							r.getString(3), 
							r.getString(4), 
							r.getString(5),
                                                        r.getString(6),
                                                        r.getFloat(7),
                                                        r.getFloat(8),
                                                        r.getFloat(9),
                                                        r.getInt(10),
                                                        r.getString(11),
                                                        r.getString(12),
                                                        r.getString(13),
                                                        controlPadre.thunderfat.getTargetedNutricionista(r.getInt(14))
                                                        
                                        ));
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();  
                }
    }

    public void leerNutricionistas() {
            abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM nutricionista");
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarNutricionistas();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.addNutricionista(r.getInt(1), 
							r.getString(2), 
							r.getString(3), 
							r.getString(4), 
							r.getString(5),
                                                        r.getString(6),
                                                        r.getString(7)
                                                        );
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
    }
		

		
    }	   

    /*@Override
    public void leerPasos() {
         abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM paso");
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarPaso();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.addPaso(r.getInt(1), 
							r.getString(2), 
							controlPadre.thunderfat.getTargetedReceta(r.getInt(3))
							
                                                        );
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
    }
    }
*/
    @Override
    public void leerRecetas() {
         abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM receta");
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarrecetas();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2)+"-" + r.getString(3));
					controlPadre.thunderfat.addReceta(r.getInt(1), 
							r.getString(2), 
							controlPadre.thunderfat.getTargetedAlimento(r.getInt(3)),
							r.getString(4)
                                                        );
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
    }
    }

    @Override
    public void leerComidas() {
        abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("SELECT * FROM comidas");
				ResultSet r = prepstmt.executeQuery();
				
				//controlPadre.thunderfat.borrarAlimentos();
				
				while (r.next()) {
					System.out.println(r.getInt(1) + " - " + r.getString(2));
					controlPadre.thunderfat.addComida(r.getInt(1),
                                                controlPadre.thunderfat.getTargetedAlimento(r.getInt(2)), 
							r.getDate(3), 
							r.getTime(4), 
							controlPadre.thunderfat.getTargetedReceta(r.getInt(5)),
                                                        controlPadre.thunderfat.getTargetedPlanDieta(r.getInt(6))
                                                        );
				}
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
    }
    }

    @Override
    public void editarPaciente(int id_paciente, String dni, String nombre, String apellidos, String telefono, String email, float peso_actual, float peso_objetivo, float altura, 
            int edad, String sexo, String password, String complexion) {
abrirConexion();
		
		try {
			if (!this.conexion.isClosed()) {
				PreparedStatement prepstmt = conexion.prepareStatement("UPDATE paciente SET dni=?, nombre=?, apellidos=?,telefono=?, email=? ,peso_actual=?,peso_objetivo=? ,altura=?,edad=?,sexo=?,contraseña=?,complexion=? WHERE id_paciente=? AND id_nutricionista=?;");
                                  prepstmt.setString(1,dni);     		
                                  prepstmt.setString(2,nombre);     		
                                  prepstmt.setString(3,apellidos);     		
                                  prepstmt.setString(4,telefono);     		
                                  prepstmt.setString(5,email);     		
                                  prepstmt.setFloat(6,peso_actual);     		
                                  prepstmt.setFloat(7,peso_objetivo);     		
                                  prepstmt.setFloat(8,altura);     		
                                  prepstmt.setInt(9,edad);     		
                                  prepstmt.setString(10,sexo);     		
                                  prepstmt.setString(11,password);     		
                                  prepstmt.setString(12,complexion);     		
                                  prepstmt.setInt(13,id_paciente);     		
                                  prepstmt.setInt(14,controlPadre.thunderfat.getCurrentUser().getId_nutricionista());     		
				
                                 int i= prepstmt.executeUpdate();
				// prepstmt.executeQuery();
				
				
				
			}
		} catch (Exception e) {
			MensajeExcepcion(e);
		} finally {
			cerrarConexion();
		}    }

    
}
