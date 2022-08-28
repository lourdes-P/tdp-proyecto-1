package gui;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

// imports para date & time
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	
	
	// componentes que agrego
	private GroupLayout gl_tabInformation;
	private JTextField txtF_LU;
	private JTextField txtF_Apellido;
	private JTextField txtF_Nombre;
	private JTextField txtF_Email;
	private JTextField txtF_GithubURL;
	private JLabel lblNewLabel;
	private JLabel lblApellido;
	private JLabel lblNombre;
	private JLabel lblEmail;
	private JLabel lblGithubUrl;
	private JLabel lbl_foto;
	
	private JPanel panelDateTime;
	private JLabel lbl_DateTime;
	
	
	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		initialize();
	}
	
	private void initialize() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 260));
		setResizable(false);
		setContentPane(contentPane);
		
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 182);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 200));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		// obtengo el tiempo
		
		
		lblNewLabel = new JLabel("LU");
		
		lblApellido = new JLabel("Apellido");
		
		lblNombre = new JLabel("Nombre");
		
		lblEmail = new JLabel("E-mail");
		
		lblGithubUrl = new JLabel("Github URL");
		
		lbl_foto = new JLabel("");
		lbl_foto.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
		lbl_foto.setBounds(470, 50, 100, 100);
		contentPane.add(lbl_foto);
		
		txtF_LU = new JTextField();
		txtF_LU.setText(""+ studentData.getId());
		txtF_LU.setEditable(false);
		txtF_LU.setColumns(10);
		
		txtF_Apellido = new JTextField();
		txtF_Apellido.setText(studentData.getLastName());
		txtF_Apellido.setEditable(false);
		txtF_Apellido.setColumns(10);
		
		txtF_Nombre = new JTextField();
		txtF_Nombre.setText(studentData.getFirstName());
		txtF_Nombre.setEditable(false);
		txtF_Nombre.setColumns(10);
		
		txtF_Email = new JTextField();
		txtF_Email.setText(studentData.getMail());
		txtF_Email.setEditable(false);
		txtF_Email.setColumns(10);
		
		txtF_GithubURL = new JTextField();
		txtF_GithubURL.setText(studentData.getGithubURL());
		txtF_GithubURL.setEditable(false);
		txtF_GithubURL.setColumns(10);
		
		gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtF_LU, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(txtF_Apellido, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(txtF_Nombre, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(txtF_Email, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_tabInformation.createSequentialGroup()
							.addComponent(lblGithubUrl, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(txtF_GithubURL, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtF_LU, Alignment.LEADING))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtF_Apellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtF_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(txtF_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblGithubUrl, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtF_GithubURL, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane);
		
		
		// Fecha y hora de creación de ventana.
		panelDateTime = new JPanel();
		panelDateTime.setBorder(null);
		panelDateTime.setBounds(5, 192, 584, 24);
		contentPane.add(panelDateTime);
		panelDateTime.setLayout(null);
		lbl_DateTime = new JLabel("Esta ventana fue generada el "+ ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ " a las: " + ZonedDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) );
		lbl_DateTime.setBounds(10, 0, 564, 25);
		panelDateTime.add(lbl_DateTime);
		
		
	}
}
