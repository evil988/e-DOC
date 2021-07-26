package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Front;

public class DocTable implements View{
	private static JFrame mf;
	
	private static JTabbedPane tabbedPane;
	private static JScrollPane scrollPane;
	private static JTable table;
	
	private static DocTable dc;
	
	private DocTable() {
		
	}
	
	public static DocTable getInstance() {
		if (tabbedPane == null)
			dc = new DocTable();
		return dc;
	}
	
	public void initialize(Object mw) {
		if(table == null) {
			mf = (JFrame) mw;
			initComponents();
		}
		display();
	}
	
	public void initComponents() {
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane = new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
				Front.getFront().getDocControl().tabRows(),
				new String[] {
					"Nome", "CPF", "Especialidade", "CRM"
				}
			));
	}
	
	public void display() {
		mf.getContentPane().removeAll();
		mf.getContentPane().setLayout(new BorderLayout(0, 0));
		mf.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("M\u00E9dicos", null, scrollPane, null);		
		scrollPane.setViewportView(table);
		mf.getContentPane().revalidate();
		mf.getContentPane().repaint();
	}

}
