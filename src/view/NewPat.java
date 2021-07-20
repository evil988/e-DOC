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

public class NewPat {
	
	private JTextField textField;	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private JRadioButton rdbtnSim;
	private JRadioButton rdbtnNo;

	public NewPat(JFrame mw) {
		
		this.displayNewPat(mw);
		
	}

	private void displayNewPat(JFrame mw) {
		
		mw.getContentPane().removeAll();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mw.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblCadastrarPaciente = new JLabel("Cadastrar Paciente");
		GridBagConstraints gbc_lblCadastrarPaciente = new GridBagConstraints();
		gbc_lblCadastrarPaciente.insets = new Insets(0, 0, 5, 0);
		gbc_lblCadastrarPaciente.gridx = 2;
		gbc_lblCadastrarPaciente.gridy = 0;
		mw.getContentPane().add(lblCadastrarPaciente, gbc_lblCadastrarPaciente);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		mw.getContentPane().add(lblNome, gbc_lblNome);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		mw.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
		GridBagConstraints gbc_lblDataDeNascimento = new GridBagConstraints();
		gbc_lblDataDeNascimento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataDeNascimento.gridx = 1;
		gbc_lblDataDeNascimento.gridy = 2;
		mw.getContentPane().add(lblDataDeNascimento, gbc_lblDataDeNascimento);
		
		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.gridx = 2;
		gbc_dateChooser.gridy = 2;
		mw.getContentPane().add(dateChooser, gbc_dateChooser);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		GridBagConstraints gbc_lblEndereo = new GridBagConstraints();
		gbc_lblEndereo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEndereo.gridx = 1;
		gbc_lblEndereo.gridy = 3;
		mw.getContentPane().add(lblEndereo, gbc_lblEndereo);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		mw.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 4;
		mw.getContentPane().add(lblCpf, gbc_lblCpf);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		mw.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNAmbulatorial = new JLabel("N\u00BA ambulatorial");
		GridBagConstraints gbc_lblNAmbulatorial = new GridBagConstraints();
		gbc_lblNAmbulatorial.insets = new Insets(0, 0, 5, 5);
		gbc_lblNAmbulatorial.gridx = 1;
		gbc_lblNAmbulatorial.gridy = 5;
		mw.getContentPane().add(lblNAmbulatorial, gbc_lblNAmbulatorial);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 5;
		mw.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPossuiPlanoDe = new JLabel("Possui plano de sa\u00FAde");
		GridBagConstraints gbc_lblPossuiPlanoDe = new GridBagConstraints();
		gbc_lblPossuiPlanoDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblPossuiPlanoDe.gridx = 1;
		gbc_lblPossuiPlanoDe.gridy = 6;
		mw.getContentPane().add(lblPossuiPlanoDe, gbc_lblPossuiPlanoDe);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 6;
		mw.getContentPane().add(panel, gbc_panel);
		
		rdbtnSim = new JRadioButton("Sim");
		rdbtnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSim.setSelected(true);
				rdbtnNo.setSelected(false);
				textField_4.setEditable(true);
			}
		});
		panel.add(rdbtnSim);
		
		rdbtnNo = new JRadioButton("N\u00E3o");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnSim.setSelected(false);
				rdbtnNo.setSelected(true);
				textField_4.setText(null);
				textField_4.setEditable(false);
			}
		});
		panel.add(rdbtnNo);
		rdbtnNo.setSelected(true);
		
		JLabel lblNomeDoPlano = new JLabel("Nome do plano de sa\u00FAde");
		GridBagConstraints gbc_lblNomeDoPlano = new GridBagConstraints();
		gbc_lblNomeDoPlano.insets = new Insets(0, 0, 5, 5);
		gbc_lblNomeDoPlano.gridx = 1;
		gbc_lblNomeDoPlano.gridy = 7;
		mw.getContentPane().add(lblNomeDoPlano, gbc_lblNomeDoPlano);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 7;
		mw.getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 8;
		mw.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				dateChooser.setCalendar(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				rdbtnNo.doClick();
				textField_4.setText(null);
				
			}
		});
		panel_1.add(btnLimpar);
		
		mw.getContentPane().revalidate();
		mw.getContentPane().repaint();
		
	}
	
}
