package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewCon implements View{
	private static JFrame mf;	
	private static GridBagLayout gridBagLayout;
	private static JLabel lblMarcarConsulta;
	private static GridBagConstraints gbc_lblMarcarConsulta;
	private static JLabel lblPaciente;
	private static GridBagConstraints gbc_lblPaciente;
	private static JComboBox comboBox;
	private static GridBagConstraints gbc_comboBox;
	private static JLabel lblMdico;
	private static GridBagConstraints gbc_lblMdico;
	private static JComboBox comboBox_1;
	private static GridBagConstraints gbc_comboBox_1;
	private static JPanel panel;
	private static GridBagConstraints gbc_panel;
	private static JButton btnSalvar;
	private static JButton btnLimpar;
	
	private static NewCon nc;
	
	private NewCon() {}
	
	public static NewCon getInstance() {
		if (nc == null)
			nc = new NewCon();
		return nc;
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
		gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 30, 15, 30, 30};
		gridBagLayout.rowHeights = new int[] {30, 30, 30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		lblMarcarConsulta = new JLabel("Marcar consulta");
		gbc_lblMarcarConsulta = new GridBagConstraints();
		gbc_lblMarcarConsulta.insets = new Insets(0, 0, 5, 0);
		gbc_lblMarcarConsulta.gridx = 3;
		gbc_lblMarcarConsulta.gridy = 0;
		
		lblPaciente = new JLabel("Paciente");
		gbc_lblPaciente = new GridBagConstraints();
		gbc_lblPaciente.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaciente.gridx = 1;
		gbc_lblPaciente.gridy = 1;
		
		comboBox = new JComboBox();
		gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 1;
		
		lblMdico = new JLabel("M\u00E9dico");
		gbc_lblMdico = new GridBagConstraints();
		gbc_lblMdico.insets = new Insets(0, 0, 5, 5);
		gbc_lblMdico.gridx = 1;
		gbc_lblMdico.gridy = 2;
		
		comboBox_1 = new JComboBox();
		gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 2;
		
		panel = new JPanel();
		gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 3;
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnSalvar);	
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnLimpar);
	}

	@Override
	public void display() {
		mf.getContentPane().removeAll();
		mf.getContentPane().setLayout(gridBagLayout);
		mf.getContentPane().add(lblMarcarConsulta, gbc_lblMarcarConsulta);
		mf.getContentPane().add(lblPaciente, gbc_lblPaciente);
		mf.getContentPane().add(comboBox, gbc_comboBox);
		mf.getContentPane().add(lblMdico, gbc_lblMdico);
		mf.getContentPane().add(comboBox_1, gbc_comboBox_1);
		mf.getContentPane().add(panel, gbc_panel);
		mf.getContentPane().revalidate();
		mf.getContentPane().repaint();		
	}
}
