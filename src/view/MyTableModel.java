package view;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1980204535827754171L;

	private Vector<String> columnNames;
	
	private Vector<Object[]> data;
	
	public MyTableModel() {
		super();
		
		columnNames = new Vector<String>();
		
		data = new Vector<Object[]>();

	}

	public MyTableModel(Vector<String> columnNames, Vector<Object[]> data) {
		super();
		this.columnNames = columnNames;
		this.data = data;

		this.fireTableStructureChanged();
	}

	public int getColumnCount() {
		return columnNames.size();
	}

	public int getRowCount() {
		return data.size();
	}

	public String getColumnName(int col) {
		return columnNames.get(col);
	}

	public Object getValueAt(int row, int col) {
		return data.get(row)[col];
	}

	public Class<? extends Object> getColumnClass(int c) {
		return getValueAt(0, c).getClass();
	}


	public boolean isCellEditable(int row, int col) {
		return false;
	}

	public void setValueAt(Object value, int row, int col) {
		data.get(row)[col] = value;
		fireTableCellUpdated(row, col);
	}

}