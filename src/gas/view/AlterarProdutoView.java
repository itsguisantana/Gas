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
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class AlterarProdutoView extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AlterarProdutoView dialog = new AlterarProdutoView();
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AlterarProdutoView() {
		
		setBounds(100, 100, 640, 560);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAltCod = new JLabel("Codigo");
		lblAltCod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltCod.setBounds(20, 77, 46, 14);
		contentPanel.add(lblAltCod);
		
		JFormattedTextField txtAltCod = new JFormattedTextField();
		txtAltCod.setBounds(20, 102, 128, 20);
		contentPanel.add(txtAltCod);
		
		JLabel lblAltNome = new JLabel("Nome");
		lblAltNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltNome.setBounds(186, 77, 46, 14);
		contentPanel.add(lblAltNome);
		
		JFormattedTextField txtAltNome = new JFormattedTextField();
		txtAltNome.setBounds(186, 102, 251, 20);
		contentPanel.add(txtAltNome);
		
		JLabel lblAltDesc = new JLabel("Descri\u00E7\u00E3o");
		lblAltDesc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltDesc.setBounds(22, 182, 63, 14);
		contentPanel.add(lblAltDesc);
		
		JFormattedTextField txtAltDesc = new JFormattedTextField();
		txtAltDesc.setBounds(22, 207, 415, 20);
		contentPanel.add(txtAltDesc);
		
		JLabel lblAltForn = new JLabel("Fornecedor");
		lblAltForn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltForn.setBounds(187, 240, 63, 14);
		contentPanel.add(lblAltForn);
		
		JFormattedTextField txtAltForn = new JFormattedTextField();
		txtAltForn.setBounds(186, 265, 251, 20);
		contentPanel.add(txtAltForn);
		
		JLabel lblAltValorUnit = new JLabel("Valor Unit.");
		lblAltValorUnit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAltValorUnit.setBounds(22, 238, 63, 14);
		contentPanel.add(lblAltValorUnit);
		
		JFormattedTextField txtAltValorUnit = new JFormattedTextField();
		txtAltValorUnit.setBounds(22, 265, 138, 20);
		contentPanel.add(txtAltValorUnit);
		
		JButton btnAltProd = new JButton("Alterar");
		btnAltProd.setSelectedIcon(null);
		btnAltProd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAltProd.setBounds(296, 401, 106, 45);
		contentPanel.add(btnAltProd);
		
		JPanel panelinfoprod = new JPanel();
		panelinfoprod.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelinfoprod.setBounds(10, 163, 445, 207);
		contentPanel.add(panelinfoprod);
		
		JButton btnDesfProd = new JButton("Desfazer");
		btnDesfProd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDesfProd.setBounds(197, 401, 89, 45);
		contentPanel.add(btnDesfProd);
		
		JLabel lblImagtem = new JLabel("IMAGEM");
		lblImagtem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblImagtem.setBounds(515, 239, 46, 14);
		contentPanel.add(lblImagtem);
		
		JButton btnConsProd = new JButton("");
		btnConsProd.setIcon(new ImageIcon("C:\\Users\\guilherme.MICROMDC.000\\workspace\\gas\\lupa.png"));
		btnConsProd.setBounds(270, 0, 50, 50);
		contentPanel.add(btnConsProd);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 624, 50);
		contentPanel.add(panel);
		
		JButton btnAdcImagem = new JButton("Adicionar Imagem");
		btnAdcImagem.setBounds(465, 350, 144, 20);
		contentPanel.add(btnAdcImagem);	}
}
