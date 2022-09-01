package gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Image;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField urlField;
	private JTextField mailField;
	private JTextField nameField;
	private JTextField surnameField;
	private JTextField luField;
	private JLabel creationTimeLabel;

	public SimplePresentationScreen(Student studentData) {
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(620, 274));
		setResizable(false);
		setContentPane(contentPane);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		setLocationRelativeTo(null);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		lblNewLabel_1 = new JLabel("LU");
		
		lblNewLabel_2 = new JLabel("Apellido");
		
		lblNewLabel_3 = new JLabel("Nombre");
		
		lblNewLabel_4 = new JLabel("E-mail");
		
		lblNewLabel_5 = new JLabel("Github URL");
		
		urlField = new JTextField();
		urlField.setEditable(false);
		urlField.setColumns(10);
		
		mailField = new JTextField();
		mailField.setEditable(false);
		mailField.setColumns(10);
		
		nameField = new JTextField();
		nameField.setEditable(false);
		nameField.setColumns(10);
		
		surnameField = new JTextField();
		surnameField.setEditable(false);
		surnameField.setColumns(10);
		
		luField = new JTextField();
		luField.setEditable(false);
		luField.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(urlField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(mailField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(nameField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(surnameField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
						.addComponent(luField, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(luField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(surnameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(mailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(urlField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(lblNewLabel_3)
							.addGap(18)
							.addComponent(lblNewLabel_4)
							.addGap(18)
							.addComponent(lblNewLabel_5)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		tabInformation.setLayout(gl_tabInformation);
		
		JPanel panel = new imagePanel();
		
		creationTimeLabel = new JLabel("New label");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
						.addComponent(creationTimeLabel))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(creationTimeLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		contentPane.setLayout(gl_contentPane);
		
		urlField.setText(studentData.getGithubURL());
		mailField.setText(studentData.getMail());
		nameField.setText(studentData.getFirstName());
		surnameField.setText(studentData.getLastName());
		luField.setText(studentData.getId() + "");
		
        String fecha = DateTimeFormatter.ofPattern("dd/mm/yyyy").format(LocalDateTime.now());
        String dia = DateTimeFormatter.ofPattern("hh:mm").format(LocalDateTime.now()); 
		
		creationTimeLabel.setText("Esta ventana fue generada el " + fecha + " a las " + dia);
		
	}
	
	
	private class imagePanel extends JPanel {
		private Image imagen;
		
		public void paint(Graphics g) {
			imagen = new ImageIcon(getClass().getResource("/images/foto1.jpg")).getImage();
			
			g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
			
			setOpaque(false);
			
			super.paint(g);
		}
	}
}
