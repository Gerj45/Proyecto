package visual;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JDGReporte extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDGReporte dialog = new JDGReporte();
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
	public JDGReporte() {
		setTitle("Generar Reporte");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 517, 302);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTipoDR = new JLabel("Tipo de reporte");
		lblTipoDR.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblTipoDR.setBounds(10, 22, 109, 14);
		contentPanel.add(lblTipoDR);
		
		JComboBox cboMarca = new JComboBox();
		cboMarca.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Ventas por marca", "Marcas con venta optima", "Precios en relación al promedio", "Precio promedio, mayor y menor"}));
		cboMarca.setBounds(122, 18, 259, 22);
		contentPanel.add(cboMarca);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(402, 18, 89, 23);
		contentPanel.add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 47, 481, 205);
		contentPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}

}
