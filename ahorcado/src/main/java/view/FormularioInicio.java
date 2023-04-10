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
		private JRadioButton facil, normal, dificil;
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
		dificultad.setFont(new Font("Tahoma", Font.BOLD, 11));

		facil = new JRadioButton("Facil", true);
		normal = new JRadioButton("Normal");
		dificil = new JRadioButton("Dificil");
		JLabel categoria = new JLabel("Categoria");
		categoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox = new JComboBox<Object>();
		ButtonGroup grupo = new ButtonGroup();
		btn = new JButton("Enviar");

		grupo.add(facil);
		grupo.add(normal);
		grupo.add(dificil);

		dificultad.setBounds(53, 56, 69, 15);
		facil.setBounds(115, 78, 109, 23);
		normal.setBounds(115, 104, 109, 23);
		dificil.setBounds(115, 130, 109, 23);
		categoria.setBounds(249, 56, 69, 14);
		comboBox.setModel(
				new DefaultComboBoxModel<Object>(new String[] { "Superhéroes", "Deportes" }));
		comboBox.setBounds(313, 78, 109, 22);
		btn.setBounds(199, 263, 109, 22);

		contentPane.add(dificultad);
		contentPane.add(facil);
		contentPane.add(normal);
		contentPane.add(dificil);
		contentPane.add(categoria);
		contentPane.add(comboBox);
		contentPane.add(btn);
	}
	public JRadioButton getFacil() {
		return facil;
	}

	public void setFacil(JRadioButton facil) {
		this.facil = facil;
	}

	public JRadioButton getNormal() {
		return normal;
	}

	public void setNormal(JRadioButton normal) {
		this.normal = normal;
	}

	public JRadioButton getDificil() {
		return dificil;
	}

	public void setDificil(JRadioButton dificil) {
		this.dificil = dificil;
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
