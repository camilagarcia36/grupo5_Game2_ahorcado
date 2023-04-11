package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class FormularioInicio extends JFrame {

	// Atributos

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JRadioButton easy, normal, hard;
		private JComboBox<Object> comboBox;
		private JButton btn;

	/**
	 * Create the frame.
	 */
	public FormularioInicio() {
		setResizable(false);
		setTitle("Ahorcado");
		setBounds(500, 300, 550, 400);
		setVisible(true);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel dificultad = new JLabel("Dificultad");
		

		
		//SE crean los radio button de las dificultades. 
		easy = new JRadioButton("Facil", true);
		normal = new JRadioButton("Normal");
		hard = new JRadioButton("Dificil");
		JLabel categoria = new JLabel("Categoria");
		
		comboBox = new JComboBox<Object>();
		ButtonGroup grupo = new ButtonGroup();
		btn = new JButton("Enviar");

		grupo.add(easy);
		grupo.add(normal);
		grupo.add(hard);

		dificultad.setBounds(53, 56, 69, 15);
		easy.setBounds(115, 78, 109, 23);
		normal.setBounds(115, 104, 109, 23);
		hard.setBounds(115, 130, 109, 23);
		categoria.setBounds(249, 56, 69, 14);
		
		//Los dos tipos de array que hemos creado. 
		comboBox.setModel(
				new DefaultComboBoxModel<Object>(new String[] { "Superhéroes", "Deportes","Personajes de Videjuegos","Lenguas","Peliculas" }));
		comboBox.setBounds(313, 78, 109, 22);
		btn.setBounds(199, 263, 109, 22);

		contentPane.add(dificultad);
		contentPane.add(easy);
		contentPane.add(normal);
		contentPane.add(hard);
		contentPane.add(categoria);
		contentPane.add(comboBox);
		contentPane.add(btn);
	}
	public JRadioButton getFacil() {
		return easy;
	}

	public void setFacil(JRadioButton facil) {
		this.easy = facil;
	}

	public JRadioButton getNormal() {
		return normal;
	}

	public void setNormal(JRadioButton normal) {
		this.normal = normal;
	}

	public JRadioButton getDificil() {
		return hard;
	}

	public void setDificil(JRadioButton dificil) {
		this.hard = dificil;
	}

	public JComboBox<Object> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<Object> comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtn() {
		return btn;
	}
}
