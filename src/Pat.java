import java.util.Date;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Pat {
	
	private String nome							= "";
	private Date dataDeNascimento		= null;
	private String endereco					= "";
	private String cpf							=	"";
	private String nAmbulatorial		=	"";
	private boolean possuiPlano			=	false;
	private String nomePlano				= "";
	
	public Pat(JTextField nome, JDateChooser dataDeNascimento, JTextField endereco, JTextField cpf, JTextField nAmbulatorial, JRadioButton possuiPlano, JTextField nomePlano) {
		this.nome							= nome.getText();
		this.dataDeNascimento	= dataDeNascimento.getDate();
		this.endereco					= endereco.getText();
		this.cpf							= cpf.getText();
		this.nAmbulatorial		= nAmbulatorial.getText();
		this.possuiPlano			= possuiPlano.isSelected();
		this.nomePlano				= nomePlano.getText();
	}

}
