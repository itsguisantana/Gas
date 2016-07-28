package gas.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import javax.swing.JTextField;

public class ConsultarPedido extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConsultarPedido dialog = new ConsultarPedido();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConsultarPedido() {
		setBounds(100, 100, 731, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		
		JList list = new JList();
		list.setBounds(30, 163, 440, 283);
		contentPanel.add(list);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(524, 187, 154, 50);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(524, 162, 60, 14);
		contentPanel.add(lblTotal);
		
		JLabel lblValorPago = new JLabel("VALOR PAGO");
		lblValorPago.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValorPago.setBounds(524, 266, 124, 14);
		contentPanel.add(lblValorPago);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(524, 291, 154, 50);
		contentPanel.add(textField_1);
		
		JLabel lblTroco = new JLabel("TROCO");
		lblTroco.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTroco.setBounds(524, 370, 124, 14);
		contentPanel.add(lblTroco);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(524, 395, 154, 50);
		contentPanel.add(textField_2);
		
		JButton btnFinaliza = new JButton("FINALIZA");
		btnFinaliza.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinaliza.setBounds(554, 484, 124, 50);
		contentPanel.add(btnFinaliza);
		
		JLabel lblCodigoPedido = new JLabel("CODIGO PEDIDO:");
		lblCodigoPedido.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCodigoPedido.setBounds(30, 108, 148, 14);
		contentPanel.add(lblCodigoPedido);
		
	
	}
}
