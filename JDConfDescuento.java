package visual;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDConfDescuento extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtDesc1;
	private JTextField txtDesc2;
	private JTextField txtDesc3;
	private JTextField txtDesc4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDConfDescuento dialog = new JDConfDescuento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDConfDescuento() {
		setTitle("Configurar porcentajes de descuentos");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 502, 204);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblDesc1 = new JLabel("1 a 5 unidades");
		lblDesc1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblDesc1.setBounds(21, 21, 100, 14);
		contentPanel.add(lblDesc1);
		
		JLabel lblDesc2 = new JLabel("6 a 10 unidades");
		lblDesc2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblDesc2.setBounds(21, 46, 100, 14);
		contentPanel.add(lblDesc2);
		
		JLabel lblDesc3 = new JLabel("11 a 15 unidades");
		lblDesc3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblDesc3.setBounds(21, 71, 100, 14);
		contentPanel.add(lblDesc3);
		
		JLabel lblDesc4 = new JLabel("Mas de 15 unidades");
		lblDesc4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblDesc4.setBounds(21, 96, 100, 14);
		contentPanel.add(lblDesc4);
		
		
		txtDesc1 = new JTextField();
		txtDesc1.setBounds(160, 18, 160, 22);
		contentPanel.add(txtDesc1);
		txtDesc1.setColumns(10);
		
		txtDesc2 = new JTextField();
		txtDesc2.setColumns(10);
		txtDesc2.setBounds(160, 44, 160, 20);
		contentPanel.add(txtDesc2);
		
		txtDesc3 = new JTextField();
		txtDesc3.setColumns(10);
		txtDesc3.setBounds(160, 69, 160, 20);
		contentPanel.add(txtDesc3);
		
		txtDesc4 = new JTextField();
		txtDesc4.setColumns(10);
		txtDesc4.setBounds(160, 94, 160, 20);
		contentPanel.add(txtDesc4);
		
		JLabel lblSimbol = new JLabel("%");
		lblSimbol.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblSimbol.setBounds(330, 18, 100, 14);
		contentPanel.add(lblSimbol);
		JLabel lblSimbo2 = new JLabel("%");
		lblSimbo2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblSimbo2.setBounds(330, 44, 100, 14);
		contentPanel.add(lblSimbo2);
		JLabel lblSimbo3 = new JLabel("%");
		lblSimbo3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblSimbo3.setBounds(330, 69, 100, 14);
		contentPanel.add(lblSimbo3);
		JLabel lblSimbo4 = new JLabel("%");
		lblSimbo4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblSimbo4.setBounds(330, 96, 100, 14);
		contentPanel.add(lblSimbo4);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnAceptar.setBounds(366, 18, 89, 22);
		contentPanel.add(btnAceptar);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(366, 43, 89, 22);
		contentPanel.add(btnCerrar);
		
		txtDesc1.setText(""+FramePrincipal.porcentaje1); 
		txtDesc2.setText(""+FramePrincipal.porcentaje2); 
		txtDesc3.setText(""+FramePrincipal.porcentaje3); 
		txtDesc4.setText(""+FramePrincipal.porcentaje4); 
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FramePrincipal.porcentaje1 = Double.parseDouble(txtDesc1.getText());
				FramePrincipal.porcentaje2 = Double.parseDouble(txtDesc2.getText());
				FramePrincipal.porcentaje3 = Double.parseDouble(txtDesc3.getText());
				FramePrincipal.porcentaje4 = Double.parseDouble(txtDesc4.getText());
				txtDesc1.setText(""+FramePrincipal.porcentaje1); 
				txtDesc2.setText(""+FramePrincipal.porcentaje2); 
				txtDesc3.setText(""+FramePrincipal.porcentaje3); 
				txtDesc4.setText(""+FramePrincipal.porcentaje4);
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}

}
