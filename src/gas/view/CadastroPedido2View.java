package gas.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.Component;

public class CadastroPedido2View extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JFormattedTextField txtQtdProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroPedido2View dialog = new CadastroPedido2View();
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
	public CadastroPedido2View() {
		setBounds(100, 100, 634, 710);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
	
		
		JFormattedTextField txtNomeCli = new JFormattedTextField();
		txtNomeCli.setBounds(33, 139, 230, 20);
		contentPanel.add(txtNomeCli);
		
		JLabel lblNomeCli = new JLabel("Nome ");
		lblNomeCli.setBounds(36, 114, 89, 14);
		contentPanel.add(lblNomeCli);
		
		JLabel lblCadCodigoPedido = new JLabel("Codigo Pedido");
		lblCadCodigoPedido.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadCodigoPedido.setBounds(33, 33, 109, 20);
		contentPanel.add(lblCadCodigoPedido);
		
		JLabel lblCodigoPedido = new JLabel("New label");
		lblCodigoPedido.setBounds(155, 38, 46, 14);
		contentPanel.add(lblCodigoPedido);
		
		JLabel lblTel1Cli = new JLabel("Telefone 1");
		lblTel1Cli.setBounds(33, 170, 59, 14);
		contentPanel.add(lblTel1Cli);
		
		JFormattedTextField txtTel1Cli = new JFormattedTextField();
		txtTel1Cli.setBounds(33, 195, 161, 20);
		contentPanel.add(txtTel1Cli);
		
		JLabel lblTel2Cli = new JLabel("Telefone 2");
		lblTel2Cli.setBounds(204, 170, 59, 14);
		contentPanel.add(lblTel2Cli);
		
		JFormattedTextField txtTel2Cli = new JFormattedTextField();
		txtTel2Cli.setBounds(204, 195, 161, 20);
		contentPanel.add(txtTel2Cli);
		
		JLabel lblEnderecoCli = new JLabel("Endere\u00E7o");
		lblEnderecoCli.setBounds(273, 114, 46, 14);
		contentPanel.add(lblEnderecoCli);
		
		JFormattedTextField txtEnderecoCli = new JFormattedTextField();
		txtEnderecoCli.setBounds(273, 139, 230, 20);
		contentPanel.add(txtEnderecoCli);
		
		JPanel panelInfoCli = new JPanel();
		panelInfoCli.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es do Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInfoCli.setBounds(20, 85, 545, 170);
		contentPanel.add(panelInfoCli);
		
		JLabel lblDescProd = new JLabel("Descri\u00E7\u00E3o");
		lblDescProd.setBounds(36, 358, 89, 14);
		contentPanel.add(lblDescProd);
		
		JFormattedTextField txtDescProd = new JFormattedTextField();
		txtDescProd.setBounds(33, 383, 351, 20);
		contentPanel.add(txtDescProd);
		
		JLabel lblQtdProd = new JLabel("Quantidade");
		lblQtdProd.setBounds(155, 414, 59, 14);
		contentPanel.add(lblQtdProd);
		
		txtQtdProd = new JFormattedTextField();
		txtQtdProd.setBounds(155, 439, 96, 20);
		contentPanel.add(txtQtdProd);
		
		JLabel lblValorProd = new JLabel("Valor Unit.");
		lblValorProd.setBounds(33, 414, 59, 14);
		contentPanel.add(lblValorProd);
		
		JFormattedTextField txtValorProd = new JFormattedTextField();
		txtValorProd.setBounds(36, 439, 109, 20);
		contentPanel.add(txtValorProd);
		
		JList listProd = new JList();
		listProd.setBounds(33, 470, 351, 67);
		contentPanel.add(listProd);
		
		JButton btnAdcProd = new JButton("Adicionar Produto");
		btnAdcProd.setBounds(424, 393, 123, 56);
		contentPanel.add(btnAdcProd);
		
		JPanel panelInfoProd = new JPanel();
		panelInfoProd.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es do Produto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInfoProd.setBounds(20, 339, 545, 250);
		contentPanel.add(panelInfoProd);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSubTotal.setBounds(377, 36, 77, 14);
		contentPanel.add(lblSubTotal);
		
		JFormattedTextField txtSubTotal = new JFormattedTextField();
		txtSubTotal.setBounds(456, 33, 109, 20);
		contentPanel.add(txtSubTotal);
		
		JButton btnCadastrarPed = new JButton("Cadastrar");
		btnCadastrarPed.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarPed.setBounds(392, 600, 111, 49);
		contentPanel.add(btnCadastrarPed);
		
		JButton btnCancelarPed = new JButton("Cancelar");
		btnCancelarPed.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelarPed.setBounds(155, 612, 96, 37);
		contentPanel.add(btnCancelarPed);
		
		
	
	
	}
}
