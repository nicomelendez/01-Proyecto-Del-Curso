package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import clases.Persona;
import clases.TMPersona;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class Form_Persona {

	private JFrame frmGestinDePersonal;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private Persona oPersona = new Persona();
	private JTextField textFieldNroHijos;
	private JTextField textFieldDia;
	private JTextField textFieldMes;
	private JTextField textFieldAnio;
	private ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();
	private JTable table;
	private TMPersona oModelo;
	private JTextField textFieldBuscador;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form_Persona window = new Form_Persona();
					window.frmGestinDePersonal.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Form_Persona() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestinDePersonal = new JFrame();
		frmGestinDePersonal.setResizable(false);
		frmGestinDePersonal.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 10));
		frmGestinDePersonal.getContentPane().setBackground(new Color(222, 222, 192));
		frmGestinDePersonal.setIconImage(Toolkit.getDefaultToolkit().getImage(Form_Persona.class.getResource("/img/Logo.png")));
		frmGestinDePersonal.setTitle("LISTA-APP");
		frmGestinDePersonal.setBounds(100, 100, 1064, 470);
		frmGestinDePersonal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestinDePersonal.getContentPane().setLayout(null);
		
		JLabel lblErrorDeBusqueda = new JLabel("No existe una persona con ese ID");
		lblErrorDeBusqueda.setVisible(false);
		lblErrorDeBusqueda.setForeground(new Color(255, 0, 0));
		lblErrorDeBusqueda.setBounds(508, 62, 273, 24);
		frmGestinDePersonal.getContentPane().add(lblErrorDeBusqueda);
		
		JLabel lblErrorDeDatos = new JLabel("ERROR, INGRESASTE UN CAMPO INCORRECTO");
		lblErrorDeDatos.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblErrorDeDatos.setVisible(false);
		lblErrorDeDatos.setForeground(new Color(255, 0, 0));
		lblErrorDeDatos.setBounds(38, 354, 283, 24);
		frmGestinDePersonal.getContentPane().add(lblErrorDeDatos);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelNombre.setBounds(28, 161, 83, 31);
		frmGestinDePersonal.getContentPane().add(labelNombre);
		
		JLabel labelApellido = new JLabel("Apellido");
		labelApellido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelApellido.setBounds(28, 198, 83, 31);
		frmGestinDePersonal.getContentPane().add(labelApellido);
		
		JLabel lblDepartamento = new JLabel("Departamento");
		lblDepartamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDepartamento.setBounds(28, 235, 113, 31);
		frmGestinDePersonal.getContentPane().add(lblDepartamento);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(174, 169, 137, 19);
		frmGestinDePersonal.getContentPane().add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(175, 206, 136, 19);
		frmGestinDePersonal.getContentPane().add(textFieldApellido);
		textFieldApellido.setColumns(10);
		
		
		JLabel lblNroDeHijos = new JLabel("Nro. de hijos");
		lblNroDeHijos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNroDeHijos.setBounds(28, 276, 113, 31);
		frmGestinDePersonal.getContentPane().add(lblNroDeHijos);
		
		textFieldNroHijos = new JTextField();
		textFieldNroHijos.setColumns(10);
		textFieldNroHijos.setBounds(175, 284, 137, 19);
		frmGestinDePersonal.getContentPane().add(textFieldNroHijos);
		
		JComboBox comboBoxDepartamentos = new JComboBox();
		comboBoxDepartamentos.setToolTipText("");
		comboBoxDepartamentos.setModel(new DefaultComboBoxModel(new String[] {"Elige un departamento", "Artigas", "Canelones", "Cerro Largo", "Colonia", "Durazno", "Flores", "Florida", "Lavalleja", "Maldonado", "Montevideo", "Paysandú", "Río Negro", "Rivera", "Rocha", "Salto", "San José", "Soriano", "Tacuarembó", "Treinta y Tres"}));
		comboBoxDepartamentos.setBounds(176, 242, 137, 21);
		frmGestinDePersonal.getContentPane().add(comboBoxDepartamentos);
		
		
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaDeNacimiento.setBounds(28, 317, 147, 31);
		frmGestinDePersonal.getContentPane().add(lblFechaDeNacimiento);
		
		textFieldDia = new JTextField();
		textFieldDia.setColumns(10);
		textFieldDia.setBounds(175, 325, 34, 19);
		frmGestinDePersonal.getContentPane().add(textFieldDia);
		
		textFieldMes = new JTextField();
		textFieldMes.setColumns(10);
		textFieldMes.setBounds(225, 325, 34, 19);
		frmGestinDePersonal.getContentPane().add(textFieldMes);
		
		textFieldAnio = new JTextField();
		textFieldAnio.setColumns(10);
		textFieldAnio.setBounds(277, 325, 34, 19);
		frmGestinDePersonal.getContentPane().add(textFieldAnio);
		
		JLabel lblNewLabel = new JLabel("/");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(214, 326, 45, 13);
		frmGestinDePersonal.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(269, 328, 45, 13);
		
		
		
		frmGestinDePersonal.getContentPane().add(lblNewLabel_1);
		JButton btnGuardarPersona = new JButton("Guardar");
		btnGuardarPersona.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					lblErrorDeDatos.setVisible(false);
					
					String nombre = textFieldNombre.getText();
					String apellido = textFieldApellido.getText();
					
					
					String departamento = (String)comboBoxDepartamentos.getSelectedItem();
					
					byte hijos = (byte)Integer.parseInt(textFieldNroHijos.getText());
					int dia = Integer.parseInt(textFieldDia.getText());
					int mes = Integer.parseInt(textFieldMes.getText());
					int anio = Integer.parseInt(textFieldAnio.getText());
					
					LocalDate fechaNacimiento = LocalDate.of(anio,mes,dia);
					
					oPersona.agregarPersonal(nombre, apellido, departamento,hijos,fechaNacimiento);
					
					listaDePersonas = oPersona.getListaDePersonas();
					oModelo = new TMPersona(listaDePersonas);
					table.setModel(oModelo);
					
					textFieldNombre.setText(null);
					textFieldApellido.setText(null);
					comboBoxDepartamentos.setSelectedItem("Elige un departamento");
					textFieldNroHijos.setText(null);
					textFieldDia.setText(null);
					textFieldMes.setText(null);
					textFieldAnio.setText(null);
					
				}catch(Exception error) {
					lblErrorDeDatos.setVisible(true);
				}
				
			}
		});
		btnGuardarPersona.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardarPersona.setBounds(225, 382, 86, 21);
		frmGestinDePersonal.getContentPane().add(btnGuardarPersona);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(193, 193, 136));
		panel_1.setBounds(1, 0, 1064, 52);
		frmGestinDePersonal.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel labelTitulo = new JLabel("BIENVENIDO A LISTA-APP");
		labelTitulo.setBounds(398, 0, 265, 52);
		panel_1.add(labelTitulo);
		labelTitulo.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 104, 52);
		frmGestinDePersonal.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese los datos de la persona");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_2.setBounds(20, 116, 327, 35);
		frmGestinDePersonal.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ingrese un ID:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(393, 84, 138, 25);
		frmGestinDePersonal.getContentPane().add(lblNewLabel_3);
		
		textFieldBuscador = new JTextField();
		textFieldBuscador.setBounds(504, 87, 264, 19);
		frmGestinDePersonal.getContentPane().add(textFieldBuscador);
		textFieldBuscador.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {					
					int buscarPorID = Integer.parseInt(textFieldBuscador.getText());
					listaDePersonas = oPersona.buscarPersona(buscarPorID);
					if( listaDePersonas!=null ) {
						
						lblErrorDeBusqueda.setVisible(false);
						oModelo = new TMPersona(listaDePersonas);
						table.setModel(oModelo);				
						
					}else {
						listaDePersonas = oPersona.getListaDePersonas();
						oModelo = new TMPersona(listaDePersonas);
						table.setModel(oModelo);		
						lblErrorDeBusqueda.setVisible(true);
						
					}
				}catch(Exception error) {
					lblErrorDeBusqueda.setVisible(true);
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBuscar.setBounds(775, 86, 85, 21);
		frmGestinDePersonal.getContentPane().add(btnBuscar);
		
		JButton btnNewButton = new JButton("Borrar filtro");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblErrorDeBusqueda.setVisible(false);
				textFieldBuscador.setText(null);
				listaDePersonas = oPersona.getListaDePersonas();
				oModelo = new TMPersona(listaDePersonas);
				table.setModel(oModelo);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(870, 85, 121, 21);
		frmGestinDePersonal.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(350, 127, 674, 276);
		frmGestinDePersonal.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.BOLD, 13));
		scrollPane.setViewportView(table);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nombre", "Apellido", "Departamento", "Hijos", "Fecha Nacimiento"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		
		
		
	}
}
