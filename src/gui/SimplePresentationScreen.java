package gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblGithubURL;
	private JTextField textEmail;
	private JLabel lblEmail;
	private JTextField textNombre;
	private JLabel lblNombre;
	private JTextField textApellido;
	private JLabel lblApellido;
	private JTextField textLU;
	private JLabel lblLU;
	private JTextField textGithubURL;
	private JPanel panelFoto;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(755, 334));
		setLocationRelativeTo(null); //Para centrar la ventana frame al iniciarla
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		lblLU = new JLabel("LU");
		lblLU.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		textLU = new JTextField();
		textLU.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textLU.setEditable(false);
		textLU.setColumns(10);
		textLU.setText(""+studentData.getId());
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		textApellido = new JTextField();
		textApellido.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textApellido.setEditable(false);
		textApellido.setColumns(10);
		textApellido.setText(studentData.getLastName());
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		textNombre = new JTextField();
		textNombre.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textNombre.setEditable(false);
		textNombre.setColumns(10);
		textNombre.setText(studentData.getFirstName());
		
		lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textEmail.setEditable(false);
		textEmail.setColumns(10);
		textEmail.setText(studentData.getMail());
		
		lblGithubURL = new JLabel("Github URL");
		lblGithubURL.setFont(new Font("Times New Roman", Font.BOLD, 13));
		
		textGithubURL = new JTextField();
		textGithubURL.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textGithubURL.setEditable(false);
		textGithubURL.setColumns(10);
		textGithubURL.setText(studentData.getGithubURL());
		
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblLU, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblGithubURL, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tabInformation.createSequentialGroup()
									.addComponent(textLU, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
									.addContainerGap())
								.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
									.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
										.addComponent(textGithubURL, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
										.addComponent(textEmail, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
									.addContainerGap()))
							.addGroup(gl_tabInformation.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
								.addContainerGap()))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(1)
							.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 334, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGap(1)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textLU, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLU, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(textGithubURL, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGithubURL, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		//Layout fecha
		
		tabInformation.setLayout(gl_tabInformation);
		
		String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		panelFoto = new JPanel();
		
		JLabel lblTiempo = new JLabel("Esta ventana fue generada el "+fecha+" a las: "+hora);
		lblTiempo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTiempo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTiempo, GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panelFoto, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(panelFoto, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTiempo, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
		);
		panelFoto.setLayout(null);
		
		JLabel lblImagenAlumnado = new JLabel("");
		lblImagenAlumnado.setBounds(0, 0, 273, 248);
		lblImagenAlumnado.setHorizontalAlignment(SwingConstants.CENTER);
		
		//ponerImagen(lblImagenAlumnado, "/images/EmblemaUNS.png"); //Inserta la imagen correspondiente a el emblema de la UNS.
		ponerImagen(lblImagenAlumnado, studentData.getPathPhoto());
		
		panelFoto.add(lblImagenAlumnado);
		contentPane.setLayout(gl_contentPane);
	}
	
	/**
	 * Procedimiento que se encarga de poner la foto guardada en ruta en el label lbl.
	 * @param lbl JLabel donde guardar la imagen.
	 * @param ruta ruta donde es encuentra almacenada la imagen a guardar.
	 */
	private void ponerImagen(JLabel lbl, String ruta) {
		ImageIcon img = new ImageIcon(SimplePresentationScreen.class.getResource(ruta));
		Icon imgLbl = new ImageIcon(img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
		lbl.setIcon(imgLbl);
	}
}
