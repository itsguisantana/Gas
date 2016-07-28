package gas.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class CadastroProduto2View extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CadastroProduto2View dialog = new CadastroProduto2View();
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
	public CadastroProduto2View() {
			
		
		setBounds(100, 100, 640, 560);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCadProdCod = new JLabel("Codigo");
		lblCadProdCod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadProdCod.setBounds(20, 77, 46, 14);
		contentPanel.add(lblCadProdCod);
		
		JFormattedTextField txtCadProdCod = new JFormattedTextField();
		txtCadProdCod.setBounds(20, 102, 128, 20);
		contentPanel.add(txtCadProdCod);
		
		JLabel lblCadProdNome = new JLabel("Nome");
		lblCadProdNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadProdNome.setBounds(186, 77, 46, 14);
		contentPanel.add(lblCadProdNome);
		
		JFormattedTextField txtCadProdNome = new JFormattedTextField();
		txtCadProdNome.setBounds(186, 102, 251, 20);
		contentPanel.add(txtCadProdNome);
		
		JLabel lblCadDescProd = new JLabel("Descri\u00E7\u00E3o");
		lblCadDescProd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadDescProd.setBounds(22, 182, 63, 14);
		contentPanel.add(lblCadDescProd);
		
		JFormattedTextField txtCadDescProd = new JFormattedTextField();
		txtCadDescProd.setBounds(22, 207, 415, 20);
		contentPanel.add(txtCadDescProd);
		
		JLabel lblCadFornProd = new JLabel("Fornecedor");
		lblCadFornProd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadFornProd.setBounds(187, 240, 63, 14);
		contentPanel.add(lblCadFornProd);
		
		JFormattedTextField txtCadFornProd = new JFormattedTextField();
		txtCadFornProd.setBounds(186, 265, 251, 20);
		contentPanel.add(txtCadFornProd);
		
		JLabel lblCadValorUnitProd = new JLabel("Valor Unit.");
		lblCadValorUnitProd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCadValorUnitProd.setBounds(22, 238, 63, 14);
		contentPanel.add(lblCadValorUnitProd);
		
		JFormattedTextField txtCadValorUnitProd = new JFormattedTextField();
		txtCadValorUnitProd.setBounds(22, 265, 138, 20);
		contentPanel.add(txtCadValorUnitProd);
		
		JButton btnCadProd = new JButton("Cadastrar");
		btnCadProd.setSelectedIcon(null);
		btnCadProd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadProd.setBounds(349, 401, 106, 45);
		contentPanel.add(btnCadProd);
		
		JPanel panelinfoprod = new JPanel();
		panelinfoprod.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelinfoprod.setBounds(10, 163, 445, 207);
		contentPanel.add(panelinfoprod);
		
		JButton btnCadDesfProd = new JButton("Desfazer");
		btnCadDesfProd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadDesfProd.setBounds(250, 401, 89, 45);
		contentPanel.add(btnCadDesfProd);
		
		JLabel lblImagtem = new JLabel("IMAGEM");
		lblImagtem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblImagtem.setBounds(528, 268, 46, 14);
		contentPanel.add(lblImagtem);
		
		JButton btnAdcImagem = new JButton("Adicionar Imagem");
		btnAdcImagem.setBounds(465, 350, 144, 20);
		contentPanel.add(btnAdcImagem);	}
		
	
	}

