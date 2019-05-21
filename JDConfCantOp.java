package visual;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JDConfCantOp extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantOp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDConfCantOp dialog = new JDConfCantOp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDConfCantOp() {
		setTitle("Configurar cantidad óptima de colchones vendidos");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 575, 148);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCantOp = new JLabel("Cantidad minima de colchones adquiridos");
		lblCantOp.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblCantOp.setBounds(10, 21, 265, 14);
		contentPanel.add(lblCantOp);
		
		txtCantOp = new JTextField();
		txtCantOp.setBounds(285, 18, 160, 22);
		contentPanel.add(txtCantOp);
		txtCantOp.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnAceptar.setBounds(459, 17, 89, 22);
		contentPanel.add(btnAceptar);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(459, 42, 89, 22);
		contentPanel.add(btnCerrar);
		
		txtCantOp.setText(""+FramePrincipal.cantidadOptima);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePrincipal.cantidadOptima = Integer.parseInt(txtCantOp.getText());
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

}
