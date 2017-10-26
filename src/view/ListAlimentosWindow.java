/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ControlListAlimentosWindow;
import control.ControlListCitaWindow;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.border.BevelBorder;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sergio
 */
public class ListAlimentosWindow extends JInternalFrame {
      private static ListAlimentosWindow listAlimentosWindow;
	private ControlListAlimentosWindow control;
	
	private JLabel filterLabel;
	private JLabel pacienteLabel;
	private JPanel labelPanel;
	private JLabel correoLabel;
	private JPanel textPanel;
	private JPanel filterPanel;
	private JPanel optionPanel;
	private JScrollPane tablePanel;
	private JTable table;
	private MyTableModel modelUsers;
	private TableRowSorter<MyTableModel> sorterUsers;
	private JPanel buttonPanel;
	private JPanel userPanel;
	
	public JTextField userText;
//	public JComboBox<String> userTypeComboBox;
	public JTextField correoText;
	public JButton hideFilter;
	public JButton editUser;
	public JButton addUser;
        
         private ListAlimentosWindow(ControlListAlimentosWindow c, MyTableModel m){
             
         super("Lista Alimentos",true,true,true,true);
		this.control = c;				
		
		this.tablePanel = new JScrollPane();
		this.filterLabel = new JLabel("Filtros",JLabel.CENTER);
		this.filterPanel = new JPanel(new BorderLayout());
		this.optionPanel = new JPanel(new BorderLayout());
		this.hideFilter = new JButton("Hide/Show Filter");
		this.buttonPanel = new JPanel();
		this.addUser = new JButton("Agregar");
		this.editUser = new JButton("Edit");
		this.pacienteLabel = new JLabel("Usuario:");
		this.userText = new JTextField();
//		this.userTypeComboBox = new JComboBox<String>();
		this.labelPanel = new JPanel(new BorderLayout());
		this.correoLabel = new JLabel("Correo:");
		this.correoText = new JTextField();
		this.textPanel = new JPanel(new BorderLayout());
		this.userPanel = new JPanel(new BorderLayout());
		this.updateTable(m);		
		
		this.filterPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		this.setMinimumSize(new Dimension(640,480));
		this.setSize(640, 480);
		this.filterPanel.setVisible(false);
		
		this.addUser.addActionListener(control);
		this.editUser.addActionListener(control);
		this.hideFilter.addActionListener(control);
		this.userText.getDocument().addDocumentListener(control);
		this.correoText.getDocument().addDocumentListener(control);
//		this.userTypeComboBox.addItemListener(control);
		
		this.labelPanel.add(pacienteLabel,BorderLayout.CENTER);
		this.labelPanel.add(correoLabel,BorderLayout.SOUTH);
//		this.userPanel.add(userTypeComboBox,BorderLayout.EAST);
		this.userPanel.add(userText,BorderLayout.CENTER);
		this.textPanel.add(userPanel,BorderLayout.CENTER);		
		this.textPanel.add(correoText,BorderLayout.SOUTH);		
		this.buttonPanel.add(this.addUser);
		this.buttonPanel.add(this.editUser);
		this.filterPanel.add(this.filterLabel,BorderLayout.NORTH);
		this.filterPanel.add(this.labelPanel,BorderLayout.WEST);
		this.filterPanel.add(this.textPanel,BorderLayout.CENTER);
		this.optionPanel.add(this.hideFilter,BorderLayout.NORTH);
		this.optionPanel.add(this.filterPanel,BorderLayout.CENTER);
		this.optionPanel.add(this.buttonPanel,BorderLayout.SOUTH);
		
		this.add(this.optionPanel,BorderLayout.NORTH);
		this.add(this.tablePanel,BorderLayout.CENTER);
	}
	
	public static ListAlimentosWindow getInstance(ControlListAlimentosWindow c, MyTableModel m){
		if (listAlimentosWindow == null){
			listAlimentosWindow = new ListAlimentosWindow(c,m);
		}
		
		if (listAlimentosWindow.isVisible()) {
			try {
				listAlimentosWindow.setSelected(true);
			} catch (PropertyVetoException e) {
				e.printStackTrace();
			}
		} else {
			listAlimentosWindow.setVisible(true);
		}	
		
		return listAlimentosWindow;
	}
	
	public void updateTable(MyTableModel m) {
		this.modelUsers = m;		
		this.table = new JTable(this.modelUsers);
		this.sorterUsers = new TableRowSorter<MyTableModel>(this.modelUsers);				
		this.table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.table.setRowSorter(sorterUsers);
		this.table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//		this.table.getColumnModel().getColumn(4).setMaxWidth(300);
		this.table.getColumnModel().getColumn(0).setMaxWidth(300);
		this.tablePanel.setViewportView(table);
	}
	
	public void toggleShowFilter(){		
		if (this.filterPanel.isVisible()) {
			this.filterPanel.setVisible(false);
		} else {
			this.filterPanel.setVisible(true);
		}
	}
	
	public JTable getTable(){
		return table;
	}
	
	public void filterUser() {
        RowFilter<MyTableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(userText.getText(), 2);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorterUsers.setRowFilter(rf);
    }
	
	public void filterMail() {
        RowFilter<MyTableModel, Object> rf = null;
        //If current expression doesn't parse, don't update.
        try {
            rf = RowFilter.regexFilter(correoText.getText(), 3);
        } catch (java.util.regex.PatternSyntaxException e) {
            return;
        }
        sorterUsers.setRowFilter(rf);
    }
    
    
}
