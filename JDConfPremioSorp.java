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

public class JDConfPremioSorp extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantC;
	private JTextField txtPremio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDConfPremioSorp dialog = new JDConfPremioSorp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDConfPremioSorp() {
		setTitle("Configurar premio sorpresa");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 452, 151);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCantC = new JLabel("Numero de clientes");
		lblCantC.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblCantC.setBounds(10, 21, 265, 14);
		contentPanel.add(lblCantC);
		
		JLabel lblPremio = new JLabel("Premio sorpresa");
		lblPremio.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblPremio.setBounds(10, 46, 100, 14);
		contentPanel.add(lblPremio);
		
		txtCantC = new JTextField();
		txtCantC.setBounds(153, 18, 160, 22);
		contentPanel.add(txtCantC);
		txtCantC.setColumns(10);
		
		txtPremio = new JTextField();
		txtPremio.setColumns(10);
		txtPremio.setBounds(153, 44, 160, 20);
		contentPanel.add(txtPremio);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnAceptar.setBounds(331, 17, 89, 22);
		contentPanel.add(btnAceptar);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(331, 42, 89, 22);
		contentPanel.add(btnCerrar);
		
		txtCantC.setText(""+FramePrincipal.numeroClienteSorpresa);
		txtPremio.setText(FramePrincipal.premioSorpresa);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePrincipal.numeroClienteSorpresa = Integer.parseInt(txtCantC.getText());
				FramePrincipal.premioSorpresa = txtPremio.getText();
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}

}
