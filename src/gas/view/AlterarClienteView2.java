package gas.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class AlterarClienteView2 extends JDialog {

	private final JPanel panelConsCli = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AlterarClienteView2 dialog = new AlterarClienteView2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AlterarClienteView2() {
		
		
		setBounds(100, 100, 599, 578);
		getContentPane().setLayout(new BorderLayout());
		panelConsCli.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(panelConsCli, BorderLayout.CENTER);
		panelConsCli.setLayout(null);
		
		
		JLabel lblConsCli = new JLabel("Codigo");
		lblConsCli.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblConsCli.setBounds(71, 83, 57, 20);
		panelConsCli.add(lblConsCli);
		
		JLabel lblConsCodCli = new JLabel("New label");
		lblConsCodCli.setBounds(138, 88, 46, 14);
		panelConsCli.add(lblConsCodCli);
		
		JLabel lblConsNomeCli = new JLabel("Nome");
		lblConsNomeCli.setBounds(25, 126, 39, 14);
		panelConsCli.add(lblConsNomeCli);
		
		JFormattedTextField txtConsNomeCli = new JFormattedTextField();
		txtConsNomeCli.setBounds(71, 123, 172, 20);
		panelConsCli.add(txtConsNomeCli);
		
		JLabel lblConsSobrenomeCli = new JLabel("Sobrenome");
		lblConsSobrenomeCli.setBounds(253, 126, 70, 14);
		panelConsCli.add(lblConsSobrenomeCli);
		
		JFormattedTextField txtConsSobrenomeCli = new JFormattedTextField();
		txtConsSobrenomeCli.setBounds(325, 123, 172, 20);
		panelConsCli.add(txtConsSobrenomeCli);
		
		JLabel lblConsRuaCli = new JLabel("Rua ");
		lblConsRuaCli.setBounds(25, 215, 39, 14);
		panelConsCli.add(lblConsRuaCli);
		
		JFormattedTextField txtConsRuaCli = new JFormattedTextField();
		txtConsRuaCli.setBounds(71, 212, 293, 20);
		panelConsCli.add(txtConsRuaCli);
		
		JLabel lblConsNumCli = new JLabel("Numero");
		lblConsNumCli.setBounds(374, 215, 46, 14);
		panelConsCli.add(lblConsNumCli);
		
		JFormattedTextField txtConsNumCli = new JFormattedTextField();
		txtConsNumCli.setBounds(422, 212, 75, 20);
		panelConsCli.add(txtConsNumCli);
		
		JLabel lblConsBairroCli = new JLabel("Bairro");
		lblConsBairroCli.setBounds(25, 243, 45, 14);
		panelConsCli.add(lblConsBairroCli);
		
		JFormattedTextField txtConsBairroCli = new JFormattedTextField();
		txtConsBairroCli.setBounds(71, 240, 172, 20);
		panelConsCli.add(txtConsBairroCli);
		
		JLabel lblConsCepCli = new JLabel("CEP");
		lblConsCepCli.setBounds(253, 246, 27, 14);
		panelConsCli.add(lblConsCepCli);
		
		JFormattedTextField txtConsCepCli = new JFormattedTextField();
		txtConsCepCli.setBounds(281, 240, 83, 20);
		panelConsCli.add(txtConsCepCli);
		
		JLabel lblConsTel1Cli = new JLabel("Tel.: 1");
		lblConsTel1Cli.setBounds(37, 338, 51, 14);
		panelConsCli.add(lblConsTel1Cli);
		
		JFormattedTextField txtConsTel1Cli = new JFormattedTextField();
		txtConsTel1Cli.setBounds(87, 335, 156, 20);
		panelConsCli.add(txtConsTel1Cli);
		
		JLabel lblConsTel2Cli = new JLabel("Tel.:2");
		lblConsTel2Cli.setBounds(265, 338, 46, 14);
		panelConsCli.add(lblConsTel2Cli);
		
		JFormattedTextField txtConsTel2Cli = new JFormattedTextField();
		txtConsTel2Cli.setBounds(313, 335, 156, 20);
		panelConsCli.add(txtConsTel2Cli);
		
		JLabel lblConsObsCli = new JLabel("Observa\u00E7\u00F5es");
		lblConsObsCli.setBounds(37, 363, 83, 14);
		panelConsCli.add(lblConsObsCli);
		
		JEditorPane PanelConsObsCli = new JEditorPane();
		PanelConsObsCli.setBounds(37, 388, 460, 63);
		panelConsCli.add(PanelConsObsCli);
		
		JButton btnAltCli = new JButton("ALTERAR");
		btnAltCli.setBounds(266, 484, 110, 44);
		panelConsCli.add(btnAltCli);
		
		JButton btnDesfConsCli = new JButton("DESFAZER");
		btnDesfConsCli.setBounds(150, 484, 93, 44);
		panelConsCli.add(btnDesfConsCli);
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEndereco.setBounds(10, 185, 510, 103);
		panelConsCli.add(panelEndereco);
		
		JPanel panelOutInfor = new JPanel();
		panelOutInfor.setBorder(new TitledBorder(null, "Outras Informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelOutInfor.setBounds(10, 311, 510, 162);
		panelConsCli.add(panelOutInfor);
		
		JPanel panelPessoais = new JPanel();
		panelPessoais.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelPessoais.setBounds(10, 62, 510, 109);
		panelConsCli.add(panelPessoais);
		
		JButton btnConsCli = new JButton("");
		btnConsCli.setIcon(new ImageIcon("C:\\Users\\guilherme.MICROMDC.000\\workspace\\gas\\lupa.png"));
		btnConsCli.setBounds(233, 11, 47, 47);
		panelConsCli.add(btnConsCli);
	}

}
