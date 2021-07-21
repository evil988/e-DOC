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
import javax.swing.JTextField;

import controller.DocControl;

public class NewDoc{
	
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	
	private static GridBagLayout gbl_panel;
	
	private static GridBagConstraints gbc_lblCadastrarNovoMdico;
	private static GridBagConstraints gbc_lblNome;
	private static GridBagConstraints gbc_textField;
	private static GridBagConstraints gbc_lblCpf;
	private static GridBagConstraints gbc_textField_1;
	private static GridBagConstraints gbc_lblEspecialidade;
	private static GridBagConstraints gbc_textField_2;
	private static GridBagConstraints gbc_lblCrm;
	private static GridBagConstraints gbc_textField_3;
	private static GridBagConstraints gbc_panel_1;
	
	private static JLabel lblCadastrarNovoMdico;
	private static JLabel lblNome;
	private static JLabel lblCpf;
	private static JLabel lblEspecialidade;
	private static JLabel lblCrm;
	private static JPanel panel_1;
	
	private static JButton btnSalvar;
	private static JButton btnLimpar;
	
	public static void displayNewDoc(JFrame mw) {
		if(gbl_panel == null)
			initComponents();
		display(mw);
	}
	
	private static void initComponents() {
		gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {30, 30, 30, 0, 30};
		gbl_panel.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 0, 30};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		lblCadastrarNovoMdico = new JLabel("Cadastrar M\u00E9dico");
		gbc_lblCadastrarNovoMdico = new GridBagConstraints();
		gbc_lblCadastrarNovoMdico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCadastrarNovoMdico.gridx = 2;
		gbc_lblCadastrarNovoMdico.gridy = 0;
		
		lblNome = new JLabel("Nome");
		gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		
		textField = new JTextField();
		gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		textField.setColumns(10);
		
		lblCpf = new JLabel("CPF");
		gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 2;
		
		textField_1 = new JTextField();
		gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		textField_1.setColumns(10);
		
		lblEspecialidade = new JLabel("Especialidade");
		gbc_lblEspecialidade = new GridBagConstraints();
		gbc_lblEspecialidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidade.gridx = 1;
		gbc_lblEspecialidade.gridy = 3;
		
		textField_2 = new JTextField();
		gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		textField_2.setColumns(10);
		
		lblCrm = new JLabel("CRM");
		gbc_lblCrm = new GridBagConstraints();
		gbc_lblCrm.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrm.gridx = 1;
		gbc_lblCrm.gridy = 4;
		
		textField_3 = new JTextField();
		gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		textField_3.setColumns(10);
		
		panel_1 = new JPanel();
		gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 5;
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});	
		panel_1.add(btnSalvar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DocControl.limpar(textField, textField_1, textField_2, textField_3);				
			}
		});		
		panel_1.add(btnLimpar);	
	}
	
	private static void display(JFrame mw) {
		mw.getContentPane().removeAll();
		mw.getContentPane().setLayout(gbl_panel);
		mw.getContentPane().add(lblCadastrarNovoMdico, gbc_lblCadastrarNovoMdico);
		mw.getContentPane().add(lblNome, gbc_lblNome);
		mw.getContentPane().add(textField, gbc_textField);
		mw.getContentPane().add(lblCpf, gbc_lblCpf);
		mw.getContentPane().add(textField_1, gbc_textField_1);
		mw.getContentPane().add(lblEspecialidade, gbc_lblEspecialidade);
		mw.getContentPane().add(textField_2, gbc_textField_2);
		mw.getContentPane().add(lblCrm, gbc_lblCrm);
		mw.getContentPane().add(textField_3, gbc_textField_3);
		mw.getContentPane().add(panel_1, gbc_panel_1);
		mw.getContentPane().revalidate();
		mw.getContentPane().repaint();	
	}	
}
