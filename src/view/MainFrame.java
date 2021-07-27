package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

import controller.Front;

public class MainFrame{
	
	public static void main(String[] args) {
		new MainFrame();
	}
	
	public MainFrame() {
		
		JFrame mw = new JFrame("e-DOC");
		mw.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		mw.setBounds(0, 0, 600, 350);			
			
		JMenuBar menuBar = new JMenuBar();
		mw.setJMenuBar(menuBar);
		
		JMenu mnCadastrar = new JMenu("Cadastrar");
		menuBar.add(mnCadastrar);
		
		JMenuItem mntmCadastrarPaciente = new JMenuItem("Cadastrar Paciente");
		mntmCadastrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(0).RegView(mw);
			}
		});
		mnCadastrar.add(mntmCadastrarPaciente);
		
		JMenuItem mntmCadastrarMdico = new JMenuItem("Cadastrar M\u00E9dico");
		mntmCadastrarMdico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(1).RegView(mw);
			}
		});
		mnCadastrar.add(mntmCadastrarMdico);		
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenuItem mntmEfetuarConsulta = new JMenuItem("Efetuar Consulta");
		mntmEfetuarConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConsultar.add(mntmEfetuarConsulta);
		
		JMenu mnListar = new JMenu("Listar");
		menuBar.add(mnListar);
		
		JMenuItem mntmListarPacientes = new JMenuItem("Listar Pacientes");
		mntmListarPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(0).TabView(mw);
			}
		});
		mnListar.add(mntmListarPacientes);
		
		JMenuItem mntmListarMdicos = new JMenuItem("Listar M\u00E9dicos");
		mntmListarMdicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Front.getFront().redirect(1).TabView(mw);
			}
		});
		mnListar.add(mntmListarMdicos);
		
		JMenuItem mntmListarConsultas = new JMenuItem("Listar Consultas");
		mntmListarConsultas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnListar.add(mntmListarConsultas);
				
		mw.setVisible(true);
		
	}
}
