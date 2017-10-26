/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainWindow;

/**
 *
 * @author sergio
 */
public class MainControllerWindow implements ActionListener {
    private static MainControllerWindow controlMainWindow;
    private MainControl mainControl;

    
    private MainWindow mainFrame;
    private ControlAddPacienteWindow controladdPacienteWindow;
    private ControlAddRecetaWindow controladdRecetaWindow;
    private ControlAddAlimentoWindow controladdAlimentoWindow;
    private ControlAddCitaWindow controladdCitaWindow;
    private ControlListPacienteWindow controlListPacienteWindow;
    private ControlListCitaWindow controlListCitaWindow;
    private ControlListRecetasWindow controListRecetasWindow;
    private ControlListAlimentosWindow controlListAlimentosWindow;
    private ControlEditPacienteWindow controlEditPacienteWindow;
    private ControlEditAlimentoWindow controlEditAlimentoWindow;
    
    
    private MainControllerWindow (MainControl c){
        
                this.mainControl = c;
		
		this.mainFrame = MainWindow.getInstance(this);
    }

   public static MainControllerWindow getInstance(MainControl c){
       if (controlMainWindow == null) {
			controlMainWindow = new MainControllerWindow(c);
		}
		return controlMainWindow;
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        
		if (e.getSource() == mainFrame.newPaciente) {
			openAddPacienteWindow();
		}
                if(e.getSource()==mainFrame.addAlimentoWindow){
                    openAddAlimentoWindow();
                }
                if(e.getSource()==mainFrame.AddCitaWindow){
                    openAddCitaWindow();
                }
                if(e.getSource()==mainFrame.openPacientes){
                    openListPacienteWindow();
                            }
                if(e.getSource()==mainFrame.AddRecetaWindow){
                    System.out.println("tocaste el boton del menu ");
                    openAddRecetaWindow();
                }
                if(e.getSource()==mainFrame.ListCitaWindow){
                    openListCitaWindow();
                }
                if(e.getSource()==mainFrame.listAlimentoWindow){
                    openListAlimentosWindow();
                }
                if(e.getSource()==mainFrame.ListRecetaWindow){
                    openListRecetasWindow();
                }
    }
       
   
    public  MainWindow getMainFrame() {
        return mainFrame;
    }

   public void openAddPacienteWindow() {

		controladdPacienteWindow = ControlAddPacienteWindow.getInstance(this);
		mainFrame.addDesktopInternalFrame(controladdPacienteWindow.getAddUserWindow());

	}
    public void openAddAlimentoWindow(){
        controladdAlimentoWindow=ControlAddAlimentoWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controladdAlimentoWindow.getAddAlimentoWindow());
    }
    public void openAddCitaWindow(){
        controladdCitaWindow=ControlAddCitaWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controladdCitaWindow.getAddCitaWindow());
    }
    public void openListPacienteWindow(){
        controlListPacienteWindow=ControlListPacienteWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controlListPacienteWindow.getListPacienteWindow());
    }
    public void openAddRecetaWindow(){
    controladdRecetaWindow=ControlAddRecetaWindow.getInstance(this);
    mainFrame.addDesktopInternalFrame(controladdRecetaWindow.getAddRecetaWindow());
    
    }
    
    
    public MainControl getMainControl() {
        return mainControl;
    }

    public void setMainControl(MainControl mainControl) {
        this.mainControl = mainControl;
    }

    private void openListCitaWindow() {
        controlListCitaWindow=ControlListCitaWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controlListCitaWindow.getListCitaWindow());
    }

    private void openListAlimentosWindow() {
       controlListAlimentosWindow=ControlListAlimentosWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controlListAlimentosWindow.getListAlimentosWindow());
    }

    private void openListRecetasWindow() {
        controListRecetasWindow=ControlListRecetasWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controListRecetasWindow.getListRecetaWindow());
    }

    public ControlListPacienteWindow getControlListPacienteWindow() {
        return controlListPacienteWindow;
    }

    public void setControlListPacienteWindow(ControlListPacienteWindow controlListPacienteWindow) {
        this.controlListPacienteWindow = controlListPacienteWindow;
    }

    public ControlListCitaWindow getControlListCitaWindow() {
        return controlListCitaWindow;
    }

    public void setControlListCitaWindow(ControlListCitaWindow controlListCitaWindow) {
        this.controlListCitaWindow = controlListCitaWindow;
    }

    public ControlListRecetasWindow getControListRecetasWindow() {
        return controListRecetasWindow;
    }

    public void setControListRecetasWindow(ControlListRecetasWindow controListRecetasWindow) {
        this.controListRecetasWindow = controListRecetasWindow;
    }

    public ControlListAlimentosWindow getControlListAlimentosWindow() {
        return controlListAlimentosWindow;
    }

    public void setControlListAlimentosWindow(ControlListAlimentosWindow controlListAlimentosWindow) {
        this.controlListAlimentosWindow = controlListAlimentosWindow;
    }
    public void openEditPacienteWindow(	int id_paciente,String dni,String nombre,String apellidos,String telefono,String email,float peso_actual,float peso_objetivo,float altura,int edad,String sexo ,String password,String complexion) {

		controlEditPacienteWindow = ControlEditPacienteWindow.getInstance(this);
		mainFrame.addDesktopInternalFrame(controlEditPacienteWindow
				.getEditPacienteWindow());
		controlEditPacienteWindow.getEditPacienteWindow().setData(id_paciente, dni,nombre, apellidos,telefono, email,peso_actual,peso_objetivo,altura,edad, sexo , password, complexion);

	}
    public void openEditAlimentoWindow(int id_alimento,String nombre,    String estado ,     float caloria ,     float proteinas,     float grasas,     float hidratos_de_carbono,     float      H20,
     float      NE,     float vitamina_a,     float vitamina_B1,     float vitamina_B2,     float vitamina_C,     float Niac,     float sodio ,     float potasio,     float calcio ,
     float magnesio,     float hierro ,     float cobre,     float fosforo,     float azufre ,     float cloro,     float Fen,     float Ileu,     float Leu,     float Lis,     float Met,
     float Tre,     float Tri,    float Val,     float Acid ,     float AlCAL){
        controlEditAlimentoWindow=ControlEditAlimentoWindow.getInstance(this);
        mainFrame.addDesktopInternalFrame(controlEditAlimentoWindow.getEditAlimentoWindow());
        controlEditAlimentoWindow.getEditAlimentoWindow().setData(id_alimento, nombre, estado, caloria, proteinas, grasas, hidratos_de_carbono, H20, NE, vitamina_a, vitamina_B1, vitamina_B2, vitamina_C, Niac, sodio, potasio, calcio, magnesio, hierro, cobre, fosforo, azufre, cloro, Fen, Ileu, Leu, Lis, Met, Tre, Tri, Val, Acid, AlCAL);
        
    }
}
