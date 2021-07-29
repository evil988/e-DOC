package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

import controller.Front;

public class MainFrame implements View{
	private static JFrame mw;
	private static JMenuBar menuBar;
	private static JMenu mnCadastrar;
	private static JMenuItem mntmCadastrarPaciente;
	private static JMenuItem mntmCadastrarMdico;
	private static JMenu mnConsultar;
	private static JMenuItem mntmEfetuarConsulta;
	private static JMenu mnListar;
	private static JMenuItem mntmListarPacientes;
	private static JMenuItem mntmListarMdicos;
	private static JMenuItem mntmListarConsultas;
	
	public static void main(String[] args) {
		new MainFrame();
	}	
	
	private MainFrame() {
		initialize(mw);
	}

	@Override
	public void initialize(Object mw) {
		initComponents();
		display();
		
	}

	@Override
	public void initComponents() {
		mw = new JFrame("e-DOC");
		menuBar = new JMenuBar();
		mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		mntmCadastrarPaciente = new JMenuItem("Cadastrar Paciente");
		mntmCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(0).regView(mw);
			}
		});
		mnCadastrar.add(mntmCadastrarPaciente);
		mntmCadastrarMdico = new JMenuItem("Cadastrar M\u00E9dico");
		mntmCadastrarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(1).regView(mw);
			}
		});
		mnCadastrar.add(mntmCadastrarMdico);
		mnConsultar = new JMenu("Consulta");
		menuBar.add(mnConsultar);
		mntmEfetuarConsulta = new JMenuItem("Marcar Consulta");
		mntmEfetuarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(2).regView(mw);
			}
		});
		mnConsultar.add(mntmEfetuarConsulta);
		mnListar = new JMenu("Listar");
		menuBar.add(mnListar);
		mntmListarPacientes = new JMenuItem("Listar Pacientes");
		mntmListarPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(0).tabView(mw);
			}
		});
		mnListar.add(mntmListarPacientes);
		mntmListarMdicos = new JMenuItem("Listar M\u00E9dicos");
		mntmListarMdicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(1).tabView(mw);
			}
		});
		mnListar.add(mntmListarMdicos);
		mntmListarConsultas = new JMenuItem("Listar Consultas");
		mntmListarConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(2).tabView(mw);
			}
		});
		mnListar.add(mntmListarConsultas);
	}

	@Override
	public void display() {
		mw.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		mw.setBounds(0, 0, 600, 350);
		mw.setJMenuBar(menuBar);
		mw.setVisible(true);		
	}
}
