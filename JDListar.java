package visual;

import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JDListar extends JDialog {

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
			JDListar dialog = new JDListar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDListar() {
		setTitle("Listado de colchones");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setBounds(100, 100, 503, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 466, 235);
		contentPanel.add(scrollPane);
		
		JTextArea txtS = new JTextArea();
		txtS.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(245+7, 267, 89, 23);
		contentPanel.add(btnListar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(153-7, 267, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
