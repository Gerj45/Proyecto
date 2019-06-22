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

public class JDConfObsquio extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantM;
	private JTextField txtObs;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JDConfObsquio dialog = new JDConfObsquio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDConfObsquio() {
		setTitle("Configurar obsequio");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 575, 148);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblCantM = new JLabel("Cantidad minima de colchones adquiridos");
		lblCantM.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblCantM.setBounds(10, 21, 265, 14);
		contentPanel.add(lblCantM);
		
		JLabel lblObs = new JLabel("Obsequio");
		lblObs.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblObs.setBounds(10, 46, 100, 14);
		contentPanel.add(lblObs);
		
		txtCantM = new JTextField();
		txtCantM.setBounds(274, 18, 160, 22);
		contentPanel.add(txtCantM);
		txtCantM.setColumns(10);
		
		txtObs = new JTextField();
		txtObs.setColumns(10);
		txtObs.setBounds(274, 46, 160, 20);
		contentPanel.add(txtObs);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnAceptar.setBounds(459, 17, 89, 22);
		contentPanel.add(btnAceptar);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		btnCerrar.setBounds(459, 42, 89, 22);
		contentPanel.add(btnCerrar);
		
		txtCantM.setText(""+FramePrincipal.cantidadMinimaObsequiable);
		txtObs.setText(FramePrincipal.obsequio);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procesar();
			}
		});
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
       void procesar(){
    	   FramePrincipal.cantidadMinimaObsequiable = Integer.parseInt(txtCantM.getText());
			FramePrincipal.obsequio = txtObs.getText();
       }
}
