/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author sergio
 */
public class AlimentoPanel extends JPanel {
    
    private JLabel lblNombre,lblEstado,lblCalorias,lblProteinas,lblgrasas,lblHidratos,lblH2O,lblNE,lblVitaminaA,lblVitaminaB1,LblVitaminaB2,lblVitaminaC,lblNiac,lblSodio,lblPotasio,lblCalcio,lblMagnesio,lblHierro,lblCobre,lblFosforo,lblAzufre,
            lblCloro,lblFen,lblILeu,lblLeu,lblLis,lblMet,lblTre,lblTri,lblVal,lblAcid,lblAlCAl;
    public JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7,textField_8,textField_9,textField_10,textField_11,textField_12,textField_13,textField_14,textField_15,textField_16,textField_17,textField_18,textField_19,textField_20,
            textField_21,textField_22,textField_23,textField_24,textField_25,textField_26,textField_27,textField_28,textField_29,textField_30,textField_31,textField_32;
     public JButton btnAceptar, btnCancelar,btnLimpiar;
        private Box textVerticalBox;
	private Box labeVerticalBox;
	private JPanel buttonPanel;
    
    /*String nombre, String estado, float caloria, float proteinas, float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, 
            float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float hierro, float cobre, float fosforo, float azufre, 
            float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL
            */
    public AlimentoPanel(){
        
        lblNombre = new JLabel("Nombre");
        lblEstado = new JLabel("Estado");
        lblCalorias = new JLabel("Calorias");
        lblProteinas =new JLabel("Proteinas");
        lblgrasas=new JLabel("grasas");
        lblHidratos=new JLabel("Hidratos de Carbono");
        
        lblH2O=new JLabel("H20");
        lblNE=new JLabel("NE.");
        lblVitaminaA=new JLabel("Vitamina A");
        lblVitaminaB1=new JLabel("Vitamina B1");
        LblVitaminaB2=new JLabel("Vitamina B2");
        lblVitaminaC=new JLabel("Vitamina C");
        lblNiac=new JLabel("Niac");
        lblSodio=new JLabel("Sodio");
        lblPotasio=new JLabel("Potasio");
        lblCalcio=new JLabel("Calcio");
        lblMagnesio=new JLabel("Magnesio");
        lblHierro=new JLabel("Hierro");
        lblCobre=new JLabel("Cobre");
        lblFosforo=new JLabel("Fosforo");
        lblAzufre=new JLabel("Azufre");
        
        lblCloro=new JLabel("Cloro");
        lblFen=new JLabel("Fen");
        lblILeu=new JLabel("Ileu");
        lblLeu=new JLabel("Leu");
        lblLis=new JLabel("Lis");
        lblMet=new JLabel("Met");
        lblTre=new JLabel("Tre");
        lblTri=new JLabel("TRi");
        lblVal=new JLabel("Val");
        lblAcid=new JLabel("ACID");
        lblAlCAl=new JLabel("ALCAL");
        textField=new JTextField();
        textField_1=new JTextField();
        textField_2=new JTextField();
        textField_3=new JTextField();
        textField_4=new JTextField();
        textField_5=new JTextField();
        textField_6=new JTextField();
        textField_7=new JTextField();
        textField_8=new JTextField();
        textField_9=new JTextField();
        textField_10=new JTextField();
        textField_11=new JTextField();
        textField_12=new JTextField();
        textField_13=new JTextField();
        textField_14=new JTextField();
        textField_15=new JTextField();
        textField_16=new JTextField();
        textField_17=new JTextField();
        textField_18=new JTextField();
        textField_19=new JTextField();
        textField_20=new JTextField();
        textField_21=new JTextField();
        textField_22=new JTextField();
        textField_23=new JTextField();
        textField_24=new JTextField();
        textField_25=new JTextField();
        textField_26=new JTextField();
        textField_27=new JTextField();
        textField_28=new JTextField();
        textField_29=new JTextField();
        textField_30=new JTextField();
        textField_31=new JTextField();
       // textField_32=new JTextField();
        this.buttonPanel=new JPanel();
        this.btnAceptar= new JButton("Aceptar");
        this.btnCancelar= new JButton("Cancelar");
        this.btnLimpiar= new JButton ("Limpiar");
        this.setLayout(new BorderLayout());

        this.textVerticalBox = Box.createVerticalBox();
        this.labeVerticalBox = Box.createVerticalBox();

        this.textField.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_1.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_2.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_3.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_4.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_5.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_6.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_7.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_8.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_9.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_10.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_11.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_12.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_13.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_14.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_15.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_16.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_17.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_18.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_19.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_20.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_21.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_22.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_23.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_24.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_25.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_26.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_27.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_28.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_29.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_30.setMaximumSize(new Dimension(2147483647, 20));
        this.textField_31.setMaximumSize(new Dimension(2147483647, 20));
       // this.textField_32.setMaximumSize(new Dimension(2147483647, 20));
        
        
        
         this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_1);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_2);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_3);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_4);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_5);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_6);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_7);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_8);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_9);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_10);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_11);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_12);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_13);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_14);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_15);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_16);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_17);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_18);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_19);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_20);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_21);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_22);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_23);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_24);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_25);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_26);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_27);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_28);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_29);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_30);
            this.textVerticalBox.add(Box.createVerticalGlue());
            this.textVerticalBox.add(this.textField_31);
            this.textVerticalBox.add(Box.createVerticalGlue());
            //this.textVerticalBox.add(this.textField_32);

        /*String nombre, String estado, float caloria, float proteinas, float grasas, float hidratos_de_carbono, float H20, float NE, float vitamina_a, float vitamina_B1, 
            float vitamina_B2, float vitamina_C, float Niac, float sodio, float potasio, float calcio, float magnesio, float hierro, float cobre, float fosforo, float azufre, 
            
            */
        
             this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblNombre);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblEstado);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblCalorias);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblProteinas);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblgrasas);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblHidratos);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblH2O);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblNE);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblVitaminaA);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblVitaminaB1);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.LblVitaminaB2);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblVitaminaC);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblNiac);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblSodio);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblPotasio);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblCalcio);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblMagnesio);
                             this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblHierro);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblCobre);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblFosforo);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblAzufre);
                     this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblCloro);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblFen);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblILeu);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblLeu);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblMet);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblTre);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblTri);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblVal);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblAcid);
                this.labeVerticalBox.add(Box.createVerticalGlue());
		this.labeVerticalBox.add(this.lblAlCAl);
                
                 
                this.buttonPanel.add(this.btnAceptar);
		this.buttonPanel.add(this.btnLimpiar);
		this.buttonPanel.add(this.btnCancelar);
		
		
		this.add(this.textVerticalBox, BorderLayout.CENTER);
		this.add(this.labeVerticalBox, BorderLayout.WEST);
		this.add(this.buttonPanel,BorderLayout.SOUTH);
                
                
                //float cloro, float Fen, float Ileu, float Leu, float Lis, float Met, float Tre, float Tri, float Val, float Acid, float AlCAL

    }
     public void clearFields() {
		this.textField.setText("");
		this.textField_1.setText("");
		this.textField_2.setText("");
                this.textField_3.setText("");
                this.textField_4.setText("");
                this.textField_5.setText("");
                this.textField_6.setText("");
                this.textField_7.setText("");
                this.textField_8.setText("");
                this.textField_9.setText("");
                this.textField_10.setText("");
                this.textField_11.setText("");
              	this.textField_12.setText("");
		this.textField_13.setText("");
		this.textField_14.setText("");
                this.textField_15.setText("");
                this.textField_16.setText("");
                this.textField_17.setText("");
                this.textField_18.setText("");
                this.textField_19.setText("");
                this.textField_20.setText("");
                this.textField_21.setText("");
                this.textField_22.setText("");
                this.textField_23.setText("");
                this.textField_24.setText("");
                this.textField_25.setText("");
                this.textField_26.setText("");
                this.textField_27.setText("");
                this.textField_28.setText("");
                this.textField_29.setText("");
                this.textField_30.setText("");
                this.textField_31.setText("");
                //this.textField_32.setText("");
               
     }
    
}
