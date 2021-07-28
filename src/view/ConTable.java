package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.ConControl;

public class ConTable implements View, Observer{
	private static ConTable ct;
	private static JFrame mf; 
	private static JScrollPane scrollPane;
	private static JTabbedPane tabbedPane;
	private static JTable table;

	private ConTable() {}
	
	public static ConTable getInstance() {
		if (ct == null)
			ct = new ConTable();
		return ct;
	}
	
	@Override
	public void initialize(Object mw) {
		if (mf == null) {
			mf = (JFrame) mw;
			initComponents();		
		}
		display();
	}

	@Override
	public void initComponents() {
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane = new JScrollPane();
		update();
	}

	@Override
	public void display() {
		mf.getContentPane().removeAll();
		mf.getContentPane().setLayout(new BorderLayout(0, 0));
		mf.getContentPane().add(tabbedPane, BorderLayout.CENTER);		
		tabbedPane.addTab("Consultas", null, scrollPane, null);
		scrollPane.setViewportView(table);	
		mf.getContentPane().revalidate();
		mf.getContentPane().repaint();
	}

	@Override
	public void update() {
		if (table == null)
			table = new JTable();
		table.setModel(new DefaultTableModel(
				ConControl.getInstance().tabRows(),
				new String[] {
					"Paciente", "M\u00E9dico", "Data", "Hor\u00E1rio"
				}
			));
	}
}
