package visual;

import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;


public class JDAcercaDe extends JDialog {

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
			JDAcercaDe dialog = new JDAcercaDe();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDAcercaDe() {
		setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		setTitle("Acerca de Tienda");
		setBounds(100, 100, 490, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTienda = new JLabel("Tienda 1.0");
		lblTienda.setBounds(196, 12, 100, 28);
		lblTienda.setFont(new Font("Microsoft JhengHei", Font.BOLD, 20));
		contentPanel.add(lblTienda);
		
		JLabel lineaHorizontal = new JLabel("_________________________________________________________________");
		lineaHorizontal.setBounds(56, 51, 390, 14);
		contentPanel.add(lineaHorizontal);
		
		JLabel lblAutores = new JLabel("Autores");
		lblAutores.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblAutores.setBounds(213, 88, 56, 14);
		contentPanel.add(lblAutores);
		
		JLabel lblAnthony = new JLabel("Alejandro Anaya");
		lblAnthony.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblAnthony.setBounds(195, 117, 117, 14);
		contentPanel.add(lblAnthony);
		
		JLabel lblAnnie = new JLabel("Annie Miguel");
		lblAnnie.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblAnnie.setBounds(196, 142, 100, 14);
		contentPanel.add(lblAnnie);
		
		JLabel lblMelanie = new JLabel("Melanie Molina");
		lblMelanie.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblMelanie.setBounds(196, 167, 100, 14);
		contentPanel.add(lblMelanie);
		
		JLabel lblJosep = new JLabel("Josep Villena");
		lblJosep.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblJosep.setBounds(213, 196, 56, 14);
		contentPanel.add(lblJosep);
		
		JLabel lblGonzalo = new JLabel("Gonzalo Cadenas");
		lblGonzalo.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
		lblGonzalo.setBounds(182, 223, 114, 14);
		contentPanel.add(lblGonzalo);
		
	}
}
