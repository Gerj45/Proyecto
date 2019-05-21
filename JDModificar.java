package visual;

import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JDModificar extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTamano;
	private JTextField txtMaterial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDModificar dialog = new JDModificar();
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
	public JDModificar() {
		setTitle("Modificar Colch\u00F3n");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 502, 204);
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
		
		JLabel lblGarantia = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantia.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblGarantia.setBounds(21, 71, 100, 14);
		contentPanel.add(lblGarantia);
		
		JLabel lblTamano = new JLabel("Tama\u00F1o");
		lblTamano.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblTamano.setBounds(21, 96, 100, 14);
		contentPanel.add(lblTamano);
		
		JLabel lblMaterial = new JLabel("Material");
		lblMaterial.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblMaterial.setBounds(21, 121, 100, 14);
		contentPanel.add(lblMaterial);
		
		JComboBox cboMarca = new JComboBox();
		
		cboMarca.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(160, 18, 160, 22);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(160, 44, 160, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtGarantia = new JTextField();
		txtGarantia.setColumns(10);
		txtGarantia.setBounds(160, 69, 160, 20);
		contentPanel.add(txtGarantia);
		
		txtTamano = new JTextField();
		txtTamano.setColumns(10);
		txtTamano.setBounds(160, 94, 160, 20);
		contentPanel.add(txtTamano);
		
		txtMaterial = new JTextField();
		txtMaterial.setColumns(10);
		txtMaterial.setBounds(160, 119, 160, 20);
		contentPanel.add(txtMaterial);
		
		JButton btnCerrar = new JButton("Cerrar");
		
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(366, 18, 89, 22);
		contentPanel.add(btnCerrar);
		
		txtPrecio.setText(""+ FramePrincipal.precio0);
		txtGarantia.setText(""+ FramePrincipal.garantia0);
		txtTamano.setText(FramePrincipal.tamaño0);
		txtMaterial.setText(FramePrincipal.material0);
		
		JButton btnGrabar = new JButton("Grabar");
		btnGrabar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnGrabar.setBounds(366, 43, 89, 22);
		contentPanel.add(btnGrabar);
		
		cboMarca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int marca = cboMarca.getSelectedIndex();
				
				switch (marca) {
				case 0: {
					txtPrecio.setText(""+ FramePrincipal.precio0);
					txtGarantia.setText(""+ FramePrincipal.garantia0);
					txtTamano.setText(FramePrincipal.tamaño0);
					txtMaterial.setText(FramePrincipal.material0);
				}break;
				case 1: {
					txtPrecio.setText(""+ FramePrincipal.precio1);
					txtGarantia.setText(""+ FramePrincipal.garantia1);
					txtTamano.setText(FramePrincipal.tamaño1);
					txtMaterial.setText(FramePrincipal.material1);
				}break;
				case 2: {
					txtPrecio.setText(""+ FramePrincipal.precio2);
					txtGarantia.setText(""+ FramePrincipal.garantia2);
					txtTamano.setText(FramePrincipal.tamaño2);
					txtMaterial.setText(FramePrincipal.material2);
				}break;
				case 3: {
					txtPrecio.setText(""+ FramePrincipal.precio3);
					txtGarantia.setText(""+ FramePrincipal.garantia3);
					txtTamano.setText(FramePrincipal.tamaño3);
					txtMaterial.setText(FramePrincipal.material3);
				}break;

				default:
				{
					txtPrecio.setText(""+ FramePrincipal.precio4);
					txtGarantia.setText(""+ FramePrincipal.garantia4);
					txtTamano.setText(FramePrincipal.tamaño4);
					txtMaterial.setText(FramePrincipal.material4);
				}break;
				}
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnGrabar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int marca = cboMarca.getSelectedIndex();
				switch (marca) {
				case 0: {
					FramePrincipal.precio0 = Double.parseDouble(txtPrecio.getText());
					FramePrincipal.garantia0 = Integer.parseInt(txtGarantia.getText());
					FramePrincipal.tamaño0 = txtTamano.getText();
					FramePrincipal.material0 = txtMaterial.getText();
					txtPrecio.setText(""+ FramePrincipal.precio0);
					txtGarantia.setText(""+ FramePrincipal.garantia0);
					txtTamano.setText(FramePrincipal.tamaño0);
					txtMaterial.setText(FramePrincipal.material0);
				}break;
				case 1: {
					FramePrincipal.precio1 = Double.parseDouble(txtPrecio.getText());
					FramePrincipal.garantia1 = Integer.parseInt(txtGarantia.getText());
					FramePrincipal.tamaño1 = txtTamano.getText();
					FramePrincipal.material1 = txtMaterial.getText();
					txtPrecio.setText(""+ FramePrincipal.precio1);
					txtGarantia.setText(""+ FramePrincipal.garantia1);
					txtTamano.setText(FramePrincipal.tamaño1);
					txtMaterial.setText(FramePrincipal.material1);
				}break;
				case 2: {
					FramePrincipal.precio2 = Double.parseDouble(txtPrecio.getText());
					FramePrincipal.garantia2 = Integer.parseInt(txtGarantia.getText());
					FramePrincipal.tamaño2 = txtTamano.getText();
					FramePrincipal.material2 = txtMaterial.getText();
					txtPrecio.setText(""+ FramePrincipal.precio2);
					txtGarantia.setText(""+ FramePrincipal.garantia2);
					txtTamano.setText(FramePrincipal.tamaño2);
					txtMaterial.setText(FramePrincipal.material2);
				}break;
				case 3: {
					FramePrincipal.precio3 = Double.parseDouble(txtPrecio.getText());
					FramePrincipal.garantia3 = Integer.parseInt(txtGarantia.getText());
					FramePrincipal.tamaño3 = txtTamano.getText();
					FramePrincipal.material3 = txtMaterial.getText();
					txtPrecio.setText(""+ FramePrincipal.precio3);
					txtGarantia.setText(""+ FramePrincipal.garantia3);
					txtTamano.setText(FramePrincipal.tamaño3);
					txtMaterial.setText(FramePrincipal.material3);
				}break;

				default:
				{
					FramePrincipal.precio4 = Double.parseDouble(txtPrecio.getText());
					FramePrincipal.garantia4 = Integer.parseInt(txtGarantia.getText());
					FramePrincipal.tamaño4 = txtTamano.getText();
					FramePrincipal.material4 = txtMaterial.getText();
					txtPrecio.setText(""+ FramePrincipal.precio4);
					txtGarantia.setText(""+ FramePrincipal.garantia4);
					txtTamano.setText(FramePrincipal.tamaño4);
					txtMaterial.setText(FramePrincipal.material4);
				}break;
				}
				
			}
		});
		
		
	}

}
