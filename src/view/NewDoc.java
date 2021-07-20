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

public class NewDoc{
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public NewDoc(JFrame mw) {
		
		this.displayNewDoc(mw);
	}	
	
	private void displayNewDoc(JFrame mw){
				
		mw.getContentPane().removeAll();		
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {30, 30, 30, 0, 30};
		gbl_panel.rowHeights = new int[] {30, 30, 30, 30, 30, 30, 0, 30};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		mw.getContentPane().setLayout(gbl_panel);			
		
		JLabel lblCadastrarNovoMdico = new JLabel("Cadastrar M\u00E9dico");
		GridBagConstraints gbc_lblCadastrarNovoMdico = new GridBagConstraints();
		gbc_lblCadastrarNovoMdico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCadastrarNovoMdico.gridx = 2;
		gbc_lblCadastrarNovoMdico.gridy = 0;
		mw.getContentPane().add(lblCadastrarNovoMdico, gbc_lblCadastrarNovoMdico);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		mw.getContentPane().add(lblNome, gbc_lblNome);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		mw.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 1;
		gbc_lblCpf.gridy = 2;
		mw.getContentPane().add(lblCpf, gbc_lblCpf);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		mw.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEspecialidade = new JLabel("Especialidade");
		GridBagConstraints gbc_lblEspecialidade = new GridBagConstraints();
		gbc_lblEspecialidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidade.gridx = 1;
		gbc_lblEspecialidade.gridy = 3;
		mw.getContentPane().add(lblEspecialidade, gbc_lblEspecialidade);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		mw.getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCrm = new JLabel("CRM");
		GridBagConstraints gbc_lblCrm = new GridBagConstraints();
		gbc_lblCrm.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrm.gridx = 1;
		gbc_lblCrm.gridy = 4;
		mw.getContentPane().add(lblCrm, gbc_lblCrm);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		mw.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 5;
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
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);				
			}
		});		
		panel_1.add(btnLimpar);		
		
		mw.getContentPane().revalidate();
		mw.getContentPane().repaint();	
		
	}
}
