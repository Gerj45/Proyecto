package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FramePrincipal extends JFrame {
	
	// Datos mínimos del primer colchón
	public static String marca0 = "Suavestar";
	public static double precio0 = 499.0;
	public static int garantia0 = 7;
	public static String tamaño0 = "1 1/2 Plaza";
	public static String material0 = "Tela Tricot Acolchada";
	// Datos mínimos del segundo colchón
	public static String marca1 = "Springwall";
	public static double precio1 = 679.0;
	public static int garantia1 = 10;
	public static String tamaño1 = "2 Plazas";
	public static String material1 = "Tejido de Punto con Algodón Orgánico";
	// Datos mínimos del tercer colchón
	public static String marca2 = "Paraiso";
	public static double precio2 = 479.0;
	public static int garantia2 = 5;
	public static String tamaño2 = "1 1/2 Plazas";
	public static String material2 = "Tejido de Punto";
	// Datos mínimos del cuarto colchón
	public static String marca3 = "Drimer";
	public static double precio3 = 749.0;
	public static int garantia3 = 4;
	public static String tamaño3 = "Queen";
	public static String material3 = "Jacquard";
	// Datos mínimos del quinto colchón
	public static String marca4 = "Cisne";
	public static double precio4 = 389.0;
	public static int garantia4 = 2;
	public static String tamaño4 = "1 1/2 Plazas";
	public static String material4 = "Tejido de Punto";
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Cantidad óptima de colchones vendidos
	public static int cantidadOptima = 10;
	// Cantidad mínima de colchones adquiridos para acceder al obsequio
	public static int cantidadMinimaObsequiable = 3;
	// Obsequio por cantidad mínima de colchones adquiridos
	public static String obsequio = "USB";
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 5;
	// Premio sorpresa
	public static String premioSorpresa = "Un polo";
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrincipal frame = new FramePrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setTitle("Tienda 1.0");
		setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 421);
		
		/*PEQUEÑO BORDE GRIS*/
		getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.gray));
		
		/*Creacion de la barra de menu*/
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		/*Elementos menu*/
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		menuBar.add(mnArchivo);
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		menuBar.add(mnMantenimiento);
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		menuBar.add(mnVentas);
		JMenu mnConfiguracion = new JMenu("Configuraci\u00F3n");
		mnConfiguracion.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		menuBar.add(mnConfiguracion);
		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setBackground(Color.WHITE);
		mnAyuda.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		menuBar.add(mnAyuda);
		
		/*Items de mnArchivo*/
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.setForeground(Color.RED);
		mntmSalir.setBackground(Color.WHITE);
		mntmSalir.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		mnArchivo.add(mntmSalir);
		
		/*Items de mnMantenimiento*/
		JMenuItem mntmConsultarColchn = new JMenuItem("Consultar Colch\u00F3n");
		mntmConsultarColchn.setForeground(Color.RED);
		mntmConsultarColchn.setBackground(Color.WHITE);
		mntmConsultarColchn.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		mnMantenimiento.add(mntmConsultarColchn);
		JMenuItem mntmModificarColchon = new JMenuItem("Modificar colch\u00F3n");
		mntmModificarColchon.setForeground(Color.RED);
		mntmModificarColchon.setBackground(Color.WHITE);
		mntmModificarColchon.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		mnMantenimiento.add(mntmModificarColchon);
		JMenuItem mntmListarColchones = new JMenuItem("Listar colchones");
		mntmListarColchones.setForeground(Color.RED);
		mntmListarColchones.setBackground(Color.WHITE);
		mntmListarColchones.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		mnMantenimiento.add(mntmListarColchones);
		
		
		/*Items de mnVentas*/
		JMenuItem mntmVender = new JMenuItem("Vender");
		mntmVender.setForeground(Color.RED);
		mntmVender.setBackground(Color.WHITE);
		mntmVender.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		mnVentas.add(mntmVender);
		JMenuItem mntmGenerarReportes = new JMenuItem("Generar reportes");
		mntmGenerarReportes.setForeground(Color.RED);
		mntmGenerarReportes.setBackground(Color.WHITE);
		mntmGenerarReportes.setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
		mnVentas.add(mntmGenerarReportes);
		
		/*
		 * Items de mnConfiguracion
		 */
		JMenuItem mntmDescuentos = new JMenuItem("Configurar descuentos");
		mntmDescuentos.setForeground(Color.RED);
		mntmDescuentos.setBackground(Color.WHITE);
		mntmDescuentos.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		mnConfiguracion.add(mntmDescuentos);
		JMenuItem mntmObsequio = new JMenuItem("Configurar obsequio");
		mntmObsequio.setForeground(Color.RED);
		mntmObsequio.setBackground(Color.WHITE);
		mntmObsequio.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		mnConfiguracion.add(mntmObsequio);
		JMenuItem mntmCantidadptima = new JMenuItem("Configurar cantidad \u00F3ptima de colchones vendidos");
		mntmCantidadptima.setForeground(Color.RED);
		mntmCantidadptima.setBackground(Color.WHITE);
		mntmCantidadptima.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		mnConfiguracion.add(mntmCantidadptima);
		JMenuItem mntmPremioSorpresa = new JMenuItem("Configurar premio sorpresa");
		mntmPremioSorpresa.setForeground(Color.RED);
		mntmPremioSorpresa.setBackground(Color.WHITE);
		mntmPremioSorpresa.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		mnConfiguracion.add(mntmPremioSorpresa);
		
		/*Items de mnAyuda*/
		JMenuItem mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.setForeground(Color.RED);
		mntmAcercaDeTienda.setBackground(Color.WHITE);
		mntmAcercaDeTienda.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		mnAyuda.add(mntmAcercaDeTienda);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Opcion salir
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Opcion consultar colchon
		mntmConsultarColchn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDConsultar consulta = new JDConsultar();
				consulta.setVisible(true);
			}
		});
		
		//Opcion modificar colchon
		mntmModificarColchon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDModificar modificacion = new JDModificar();
				modificacion.setVisible(true);
			}
		});
		
		//Opcion listar colchon
		mntmListarColchones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDListar lista = new JDListar();
				lista.setVisible(true);
			}
		});
		
		//Opcion vender colchon
		mntmVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDVender venta = new JDVender();
				venta.setVisible(true);
			}
		});
		
		//Opcion generar reportes
		mntmGenerarReportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDGReporte reporte = new JDGReporte();
				reporte.setVisible(true);
			}
		});
		
		//Opcion configuracion decuento
		mntmDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDConfDescuento confDesc = new JDConfDescuento();
				confDesc.setVisible(true);
			}
		});
		
		//Opcion configuracion de obsequio
		mntmObsequio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDConfObsquio confObs = new JDConfObsquio();
				confObs.setVisible(true);
			}
		});
		
		//Opcion cantidad optima
		mntmCantidadptima.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDConfCantOp confCantOp = new JDConfCantOp();
				confCantOp.setVisible(true);
			}
		});
		
		//Opcion premio sorpresa
		mntmPremioSorpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDConfPremioSorp confCantPremioSorp = new JDConfPremioSorp();
				confCantPremioSorp.setVisible(true);
			}
		});
		
		//Opcion acerca de
		mntmAcercaDeTienda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDAcercaDe acercaDe = new JDAcercaDe();
				acercaDe.setVisible(true);
			}
		});
		
	}

}

