package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PatTable implements View{
	
	private static JTabbedPane tabbedPane;
	private static JScrollPane scrollPane;
	private static JTable table;
	
	private static PatTable pt;
	
	private PatTable() {
		
	}
	
	public static PatTable getInstance() {
		if (tabbedPane == null)
			pt = new PatTable();
		return pt;
	}
	
	public void initialize(JFrame mw) {
		if(table == null)
			initComponents();
		display(mw);
	}
	
	public void initComponents() {
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane = new JScrollPane();
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Nome", "Data de Nascimento", "Endere\u00E7o", "CPF", "N\u00BA ambulatorial", "Plano de sa\u00FAde?", "Nome do plano de sa\u00FAde"
				}
			));
	}
	
	public void display(JFrame mw) {
		mw.getContentPane().removeAll();
		mw.getContentPane().setLayout(new BorderLayout(0, 0));
		mw.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("Pacientes", null, scrollPane, null);		
		scrollPane.setViewportView(table);
		mw.getContentPane().revalidate();
		mw.getContentPane().repaint();
	}

}
