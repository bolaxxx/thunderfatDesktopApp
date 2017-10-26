/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MainControllerWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author sergio
 */
public class MainWindow extends JFrame {
    private static MainWindow mw;
    private MainControllerWindow control;
    
    
    private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenu configurationMenu;
	private JMenu PacienteMenu;
	private JMenu windowMenu;
	private JMenu PlanesDietaMenu;
	private JMenu AlimentosMenu;
	public  JMenu citaMenu;
        public  JMenu RecetasMenu;
       // private JPanel eventsPanel;
	private JDesktopPane desktopPane;
	
	public JMenuItem exit;
	public JMenuItem newPaciente;
	public JMenuItem openPacientes;
	public JMenuItem tileWindows;
	
	public JMenuItem cascadeWindows;
	public JMenuItem closeAllWindow;
	public JMenuItem maximizeAllWindow;
	
	public JMenuItem addAlimentoWindow;
	public JMenuItem addPlanDietaWindow;
	public JMenuItem listAlimentoWindow;
        public JMenuItem listPlanDietaWindow;
        public JMenuItem AddCitaWindow;
        public JMenuItem ListCitaWindow;
        public JMenuItem AddRecetaWindow;
        public JMenuItem ListRecetaWindow;
        
    
    
    private MainWindow (MainControllerWindow c){
        super();
				
		this.control = c;
		
		this.menuBar = new JMenuBar();
		this.fileMenu = new JMenu("File");
		this.exit = new JMenuItem("Salir");
		this.PacienteMenu = new JMenu("Paciente");
		this.newPaciente = new JMenuItem("Agregar paciente");
		this.openPacientes = new JMenuItem("Lista de Paciente");
                this.RecetasMenu= new JMenu("Recetas");
		//this.eventsPanel = new JPanel();
		this.desktopPane = new JDesktopPane();
		this.tileWindows = new JMenuItem("Tile Sub-Windows");
		this.windowMenu = new JMenu("Window");
		this.cascadeWindows = new JMenuItem("Cascade Sub-Windows");
		this.closeAllWindow = new JMenuItem("Close All Sub-Windows");
		this.maximizeAllWindow = new JMenuItem("Maximize All Sub-Windows");
		this.PlanesDietaMenu = new JMenu("Planes de  Dieta");
		this.citaMenu = new JMenu("Citas");
		this.configurationMenu = new JMenu("Configuracion");
		this.addAlimentoWindow = new JMenuItem("Agregar Alimento");
		this.AlimentosMenu = new JMenu("Alimento");
		this.addPlanDietaWindow = new JMenuItem("Agregar Plan de dieta ");
		this.listAlimentoWindow = new JMenuItem("Lista Alimento");
                this.AddRecetaWindow=new JMenuItem ("Añadir Receta");
                this.AddCitaWindow=new JMenuItem("Añadir Cita");
                this.listPlanDietaWindow=new JMenuItem("Lista Planes de Dietas");
                this.ListCitaWindow=new JMenuItem(" Lista de Citas");
                this.ListRecetaWindow=new JMenuItem("lista de recetas");

		this.setTitle("ThunderFat DesktopApp");		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH | this.getExtendedState());		
		this.setMinimumSize(new Dimension(800,600));
		this.setLocationRelativeTo(null);		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//this.eventsPanel.setLayout(new BorderLayout(0, 0));		
		
		
		this.exit.addActionListener(this.control);
		this.newPaciente.addActionListener(this.control);
		this.openPacientes.addActionListener(this.control);
		
		this.tileWindows.addActionListener(this.control);
		this.cascadeWindows.addActionListener(this.control);
		this.closeAllWindow.addActionListener(this.control);
		this.maximizeAllWindow.addActionListener(this.control);
		this.citaMenu.addActionListener(this.control);
		this.addAlimentoWindow.addActionListener(this.control);
		this.ListRecetaWindow.addActionListener(this.control);
		this.addPlanDietaWindow.addActionListener(this.control);
		this.listAlimentoWindow.addActionListener(this.control);
		this.AddCitaWindow.addActionListener(this.control);
		this.ListCitaWindow.addActionListener(this.control);
                this.AddRecetaWindow.addActionListener(this.control);
		
		
                
		this.fileMenu.add(this.exit);
		this.PacienteMenu.add(this.newPaciente);
		this.PacienteMenu.add(this.openPacientes);
		this.windowMenu.add(this.maximizeAllWindow);
		this.windowMenu.add(this.tileWindows);
		this.windowMenu.add(this.cascadeWindows);
		this.windowMenu.add(this.closeAllWindow);
		this.PlanesDietaMenu.add(this.addPlanDietaWindow);
		this.PlanesDietaMenu.add(this.listPlanDietaWindow);
                this.citaMenu.add(this.AddCitaWindow);
                this.citaMenu.add(this.ListCitaWindow);
                this.RecetasMenu.add(this.AddRecetaWindow);
                this.RecetasMenu.add(this.ListRecetaWindow);
                
                
                
		//this.configurationMenu.add(this.PacienteMenu);
		//this.configurationMenu.add(this.PlanesDietaMenu);	
		this.AlimentosMenu.add(this.addAlimentoWindow);
		this.AlimentosMenu.add(this.listAlimentoWindow);
		this.menuBar.add(this.fileMenu);
		this.menuBar.add(this.AlimentosMenu);
                this.menuBar.add(this.citaMenu);
		
                this.menuBar.add(this.PacienteMenu);
                this.menuBar.add(this.RecetasMenu);
		this.menuBar.add(this.PlanesDietaMenu);
                this.menuBar.add(this.configurationMenu);	
		this.menuBar.add(this.windowMenu);
		
		this.setJMenuBar(this.menuBar);		
		this.add(this.desktopPane,BorderLayout.CENTER);		
		//this.add(this.eventsPanel, BorderLayout.EAST);
   
    
    }
    
    
    public static MainWindow  getInstance(MainControllerWindow c){
         if (mw == null) {
			mw = new MainWindow(c);
		} else {
			mw.requestFocus();
		}
		
		return mw;
        
    }
    
    
    public void addDesktopInternalFrame(JInternalFrame internalFrame) {

		JInternalFrame  internalFrameArray[] = this.desktopPane.getAllFrames();
		boolean exist = false; 
		
		for (int i = 0; i < internalFrameArray.length;i++) {
			if (internalFrameArray[i] == internalFrame) {
				exist = true;
			}
		}
		
		if (!exist) {
			this.desktopPane.add(internalFrame);						
		}		
		
		try {
			internalFrame.setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public void maximizeAllSubWindows(){
		JInternalFrame jif = this.desktopPane.getSelectedFrame();
		for (JInternalFrame internalFrame: this.desktopPane.getAllFrames()) {
			try {
				internalFrame.setMaximum(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		}
		try {
			jif.setSelected(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
	
	public void closeAllSubWindows(){
		this.desktopPane.removeAll();
		this.desktopPane.repaint();
	}
	
	private void maximizeAllSubWindowsMaxiized(){
		for (JInternalFrame internalFrame: this.desktopPane.getAllFrames()) {
			try {
				if (internalFrame.isMaximum()) {
					internalFrame.setMaximum(false);
					internalFrame.setMaximum(true);
				}
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void tile(int layer) {
		JInternalFrame[] frames = desktopPane.getAllFramesInLayer(layer);
		if (frames.length == 0)
			return;

		tile(frames, desktopPane.getBounds());
	}

	public void tile() {
		JInternalFrame[] frames = desktopPane.getAllFrames();
		if (frames.length == 0)
			return;

		tile(frames, desktopPane.getBounds());
	}

	private void tile(JInternalFrame[] frames, Rectangle dBounds) {
		int cols = (int) Math.sqrt(frames.length);
		int rows = (int) (Math.ceil(((double) frames.length) / cols));
		int lastRow = frames.length - cols * (rows - 1);
		int width, height;

		if (lastRow == 0) {
			rows--;
			height = dBounds.height / rows;
		} else {
			height = dBounds.height / rows;
			if (lastRow < cols) {
				rows--;
				width = dBounds.width / lastRow;
				for (int i = 0; i < lastRow; i++) {
					frames[cols * rows + i].setBounds(i * width, rows * height,
							width, height);
				}
			}
		}

		width = dBounds.width / cols;
		for (int j = 0; j < rows; j++) {
			for (int i = 0; i < cols; i++) {
				frames[i + j * cols].setBounds(i * width, j * height, width,
						height);
			}
		}
	}
	
	public void cascade(int layer ) {
	    JInternalFrame[] frames = desktopPane.getAllFramesInLayer( layer );
	    if ( frames.length == 0) return;
	 
	    cascade( frames, desktopPane.getBounds(), 24 );
	}
	public void cascade() {
	    JInternalFrame[] frames = desktopPane.getAllFrames();
	    if ( frames.length == 0) return;
	 
	    cascade( frames, desktopPane.getBounds(), 24 );
	}
	private void cascade( JInternalFrame[] frames, Rectangle dBounds, int separation ) {
	    int margin = frames.length*separation + separation;
	    int width = dBounds.width - margin;
	    int height = dBounds.height - margin;
	    for ( int i = 0; i < frames.length; i++) {
	        frames[i].setBounds( separation + dBounds.x + i*separation,
	                             separation + dBounds.y + i*separation,
	                             width, height );
	    }
	}
	
	public void maximizeSubWindow(JInternalFrame internalFrame) {
		try {
			internalFrame.setMaximum(true);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}
}
