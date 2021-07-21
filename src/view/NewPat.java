package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import controller.PatControl;

public class NewPat {
	
	private static JTextField textField;	
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	
	private static JDateChooser dateChooser;
	
	private static JRadioButton rdbtnSim;
	private static JRadioButton rdbtnNo;
	
	private static GridBagLayout gridBagLayout;
	
	private static GridBagConstraints gbc_lblCadastrarPaciente;
	private static GridBagConstraints gbc_lblNome;
	private static GridBagConstraints gbc_textField;
	private static GridBagConstraints gbc_lblDataDeNascimento;
	private static GridBagConstraints gbc_dateChooser;
	private static GridBagConstraints gbc_lblEndereo;
	private static GridBagConstraints gbc_textField_1;
	private static GridBagConstraints gbc_lblCpf;
	private static GridBagConstraints gbc_textField_2;
	private static GridBagConstraints gbc_lblNAmbulatorial;
	private static GridBagConstraints gbc_textField_3;
	private static GridBagConstraints gbc_lblPossuiPlanoDe;
	private static GridBagConstraints gbc_panel;
	private static GridBagConstraints gbc_lblNomeDoPlano;
	private static GridBagConstraints gbc_textField_4;
	private static GridBagConstraints gbc_panel_1;
	
	private static JLabel lblCadastrarPaciente;
	private static JLabel lblNome;
	private static JLabel lblDataDeNascimento;
	private static JLabel lblEndereo;
	private static JLabel lblCpf;
	private static JLabel lblNAmbulatorial;
	private static JLabel lblPossuiPlanoDe;
	private static JLabel lblNomeDoPlano;
	
	private static JButton btnSalvar;
	private static JButton btnLimpar;
	
	private static JPanel panel;
	private static JPanel panel_1;
	
	public static void displayNewPat(JFrame mw) {
		if(gridBagLayout == null)
			initComponents();
		display(mw);
	}		
	
	private static void initComponents() {
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		lblCadastrarPaciente = new JLabel("Cadastrar Paciente");
		gbc_lblCadastrarPaciente = new GridBagConstraints();
		gbc_lblCadastrarPaciente.insets = new Insets(0, 0, 5, 0);
		gbc_lblCadastrarPaciente.gridx = 2;
		gbc_lblCadastrarPaciente.gridy = 0;
		
		lblNome = new JLabel("Nome");
		gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		
		textField = new JTextField();
		gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		textField.setColumns(10);
		
		lblDataDeNascimento = new JLabel("Data de nascimento");
		gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridx = 1;
		gbc_lblDataDeNascimento.gridy = 2;
		
		dateChooser = new JDateChooser();
		gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 2;
		
		lblEndereo = new JLabel("Endere\u00E7o");
		gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 1;
		gbc_lblEndereo.gridy = 3;
		
		textField_1 = new JTextField();
		gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		textField_1.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 4;
		
		textField_2 = new JTextField();
		gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		textField_2.setColumns(10);
		
		lblNAmbulatorial = new JLabel("N\u00BA ambulatorial");
		gbc_lblNAmbulatorial = new GridBagConstraints();
		gbc_lblNAmbulatorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblNAmbulatorial.gridx = 1;
		gbc_lblNAmbulatorial.gridy = 5;
		
		textField_3 = new JTextField();
		gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		textField_3.setColumns(10);
		
		lblPossuiPlanoDe = new JLabel("Possui plano de sa\u00FAde");
		gbc_lblPossuiPlanoDe = new GridBagConstraints();
		gbc_lblPossuiPlanoDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblPossuiPlanoDe.gridx = 1;
		gbc_lblPossuiPlanoDe.gridy = 6;
		
		panel = new JPanel();
		gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 6;
		
		rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSim.setSelected(true);
				rdbtnNo.setSelected(false);
				textField_4.setEditable(true);
			}
		});
		
		rdbtnNo = new JRadioButton("N\u00E3o");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSim.setSelected(false);
				rdbtnNo.setSelected(true);
				textField_4.setText(null);
				textField_4.setEditable(false);
			}
		});
		rdbtnNo.setSelected(true);
		
		lblNomeDoPlano = new JLabel("Nome do plano de sa\u00FAde");
		gbc_lblNomeDoPlano = new GridBagConstraints();
		gbc_lblNomeDoPlano.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoPlano.gridx = 1;
		gbc_lblNomeDoPlano.gridy = 7;
		
		textField_4 = new JTextField();
		gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 7;
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		panel_1 = new JPanel();
		gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 8;
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatControl.savePat(textField, dateChooser, textField_1, textField_2, textField_3, rdbtnSim, textField_4);
			}
		});
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatControl.clearNewPat(textField, dateChooser, textField_1, textField_2, textField_3, rdbtnNo, textField_4);				
			}
		});
	}
	
	private static void display(JFrame mw) {
		mw.getContentPane().removeAll();		
		mw.getContentPane().setLayout(gridBagLayout);
		mw.getContentPane().add(lblCadastrarPaciente, gbc_lblCadastrarPaciente);
		mw.getContentPane().add(lblNome, gbc_lblNome);
		mw.getContentPane().add(textField, gbc_textField);
		mw.getContentPane().add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		mw.getContentPane().add(dateChooser, gbc_dateChooser);
		mw.getContentPane().add(lblEndereo, gbc_lblEndereo);
		mw.getContentPane().add(textField_1, gbc_textField_1);
		mw.getContentPane().add(lblCpf, gbc_lblCpf);
		mw.getContentPane().add(textField_2, gbc_textField_2);
		mw.getContentPane().add(lblNAmbulatorial, gbc_lblNAmbulatorial);
		mw.getContentPane().add(textField_3, gbc_textField_3);
		mw.getContentPane().add(lblPossuiPlanoDe, gbc_lblPossuiPlanoDe);
		mw.getContentPane().add(panel, gbc_panel);
		panel.add(rdbtnSim);
		panel.add(rdbtnNo);
		mw.getContentPane().add(lblNomeDoPlano, gbc_lblNomeDoPlano);
		mw.getContentPane().add(textField_4, gbc_textField_4);
		mw.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.add(btnSalvar);
		panel_1.add(btnLimpar);
		mw.getContentPane().revalidate();
		mw.getContentPane().repaint();
	}	
}
