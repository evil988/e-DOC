package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Observer;
import controller.PatControl;

public class PatTable implements View, Table, Observer {
	
	private static JFrame mf;
	
	private static JTabbedPane tabbedPane;
	private static JScrollPane scrollPane;
	private static JTable table;
	
	private static PatTable pt;
	
	private PatTable() {
		
	}
	
	public static PatTable getInstance() {
		if (mf == null) {
			pt = new PatTable();
			PatControl.getInstance().recObs(pt);
		}
		return pt;
	}
	
	public void initialize(Object mw) {
		if(table == null) {
			mf = (JFrame) mw;
			initComponents();
		}
		display();
	}
	
	@Override
	public void initComponents() {
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane = new JScrollPane();
		tableUpdate();
	}
	
	@Override
	public void display() {
		mf.getContentPane().removeAll();
		mf.getContentPane().setLayout(new BorderLayout(0, 0));
		mf.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("Pacientes", null, scrollPane, null);		
		scrollPane.setViewportView(table);
		mf.getContentPane().revalidate();
		mf.getContentPane().repaint();
	}

	@Override
	public void tableUpdate() {
		if (table == null)
			table = new JTable();
		table.setModel(new DefaultTableModel(
				PatControl.getInstance().tabRows(),
				new String[] {
						"Nome", "Data de Nascimento", "Endere\u00E7o", "CPF", "N\u00BA ambulatorial", "Plano de sa\u00FAde?", "Nome do plano de sa\u00FAde"
				}
			));						
	}

	@Override
	public void update() {
		tableUpdate();		
	}
}
