package visual;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JDVender extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDVender dialog = new JDVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public JDVender() {
		setTitle("Vender");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 517, 301);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblMarca.setBounds(21, 21, 100, 14);
		contentPanel.add(lblMarca);
		
		JLabel lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblPrecio.setBounds(21, 46, 100, 14);
		contentPanel.add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblCantidad.setBounds(21, 71, 100, 14);
		contentPanel.add(lblCantidad);
		
		
		JComboBox cboMarca = new JComboBox();
		
		cboMarca.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(110, 18, 160, 22);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(110, 44, 160, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(110, 69, 160, 20);
		contentPanel.add(txtCantidad);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnVender.setBounds(400, 17, 89, 23);
		contentPanel.add(btnVender);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(400, 42, 89, 23);
		contentPanel.add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 96, 468, 155);
		contentPanel.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		txtPrecio.setText(""+ FramePrincipal.precio0);
		
		cboMarca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int marca = cboMarca.getSelectedIndex();
				
				switch (marca) {
				case 0: txtPrecio.setText(""+ FramePrincipal.precio0);break;
				case 1: txtPrecio.setText(""+ FramePrincipal.precio1);break;
				case 2: txtPrecio.setText(""+ FramePrincipal.precio2);break;
				case 3: txtPrecio.setText(""+ FramePrincipal.precio3);break;
				default: txtPrecio.setText(""+ FramePrincipal.precio4);break;
				}
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}

}
