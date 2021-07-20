import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	public Menu(JFrame mw) {
		
		this.displayMenuBar(mw);
		
	}

	private void displayMenuBar(JFrame mw) {
		
		JMenuBar menuBar = new JMenuBar();
		mw.setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCadastrarPaciente = new JMenuItem("Cadastrar Paciente");
		mntmCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NewPat(mw);
			}
		});
		mnCadastrar.add(mntmCadastrarPaciente);
		
		JMenuItem mntmCadastrarMdico = new JMenuItem("Cadastrar M\u00E9dico");
		mntmCadastrarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new NewDoc(mw);
			}
		});
		mnCadastrar.add(mntmCadastrarMdico);		
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenuItem mntmEfetuarConsulta = new JMenuItem("Efetuar Consulta");
		mnConsultar.add(mntmEfetuarConsulta);
		
		JMenu mnListar = new JMenu("Listar");
		menuBar.add(mnListar);
		
		JMenuItem mntmListarPacientes = new JMenuItem("Listar Pacientes");
		mnListar.add(mntmListarPacientes);
		
		JMenuItem mntmListarConsultas = new JMenuItem("Listar Consultas");
		mnListar.add(mntmListarConsultas);
		
	}
}
