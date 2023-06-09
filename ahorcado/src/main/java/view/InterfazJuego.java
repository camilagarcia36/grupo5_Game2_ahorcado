package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import objects.Ahorcado;

public class InterfazJuego extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, menu, palabra, lifes, palabra_secreta, botones, imagenes;
	private JButton[] array = new JButton[27];
	private JTextField textPalabra;
	private JLabel pistas = new JLabel(), colgado = new JLabel();

	private FormularioInicio form = new FormularioInicio();
	private Ahorcado juego;

	private JButton inicio, resolver, pista;

	private JMenuItem newGame, numIntentos, addDoc;

	public InterfazJuego() {

		// este bloque de código define la estructura visual del juego
		setResizable(false);
		setTitle("Ahorcado");
		setBounds(410, 200, 750, 710);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Barra de menú

		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenu.add(menuArchivo);
		JMenu ayuda = new JMenu("Ayuda");
		barraMenu.add(ayuda);
		JMenuItem comoJugar = new JMenuItem("Como jugar");
		ayuda.add(comoJugar);
		JMenuItem acercaDe = new JMenuItem("Acerca de");
		ayuda.add(acercaDe);

		newGame = new JMenuItem("Nuevo juego");
		menuArchivo.add(newGame);

		JMenuItem salir = new JMenuItem("Salir");
		menuArchivo.add(salir);

		setNumIntentos(new JMenuItem("Intentos: 0"));
		menuArchivo.add(getNumIntentos());
		menu = new JPanel();
		palabra = new JPanel();
		lifes = new JPanel();
		botones = new JPanel();
		imagenes = new JPanel();
		palabra_secreta = new JPanel();
		inicio = new JButton("Iniciar juego");
		pista = new JButton("Pista!");
		resolver = new JButton("Resolver");

		textPalabra = new JTextField();

		menu.setBounds(10, 10, 378, 161);
		menu.setLayout(null);
		inicio.setBounds(10, 16, 358, 57);
		resolver.setBounds(10, 84, 358, 66);
		menu.add(inicio);
		menu.add(resolver);
		menu.setBorder(new TitledBorder(null, "Menu", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		palabra.setBounds(10, 182, 378, 189);
		palabra.setBorder(new LineBorder(new Color(0, 0, 0)));
		palabra.setLayout(null);
		lifes.setBounds(10, 11, 358, 64);
		lifes.setBorder(new EmptyBorder(0, 0, 0, 0));
		lifes.add(pistas);
		pista.setBounds(137, 80, 105, 23);
		palabra.add(pista);
		palabra.add(lifes);
		palabra_secreta.setBounds(10, 114, 358, 64);
		palabra_secreta.setLayout(null);
		textPalabra.setBounds(21, 21, 314, 32);
		textPalabra.setEditable(false);
		textPalabra.setBackground(Color.BLACK);
		textPalabra.setForeground(Color.WHITE);
		textPalabra.setHorizontalAlignment(SwingConstants.CENTER);
		palabra_secreta.add(textPalabra);
		palabra_secreta.setBorder(
				new TitledBorder(null, "Palabra Secreta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		palabra.add(palabra_secreta);

		botones.setBounds(10, 382, 378, 272);
		botones.setBorder(new TitledBorder(null, "Teclado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		botones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		imagenes.setBounds(400, 21, 326, 595);
		imagenes.setBorder(new EmptyBorder(0, 0, 0, 0));
		imagenes.setBorder(new LineBorder(new Color(0, 0, 0)));
		imagenes.add(colgado);

		contentPane.add(menu);
		contentPane.add(palabra);
		contentPane.add(botones);
		contentPane.add(imagenes);

		// LISTENERS

		// Evento botón iniciar juego

		ActionListener eventoBoton = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				form.setVisible(true);
				setVisible(false);
			}
		};

		getInicio().addActionListener(eventoBoton);
		getNewGame().addActionListener(eventoBoton);

		// El ActionListener del menú "Como jugar" muestra una
		// ventana emergente que explica las reglas del juego.
		comoJugar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Tienes 5 pistas.\nPulsando las teclas de abajo indicas la letra que quieres, si fallas cuenta como error si aciertas se muestra la letra.\nEn todo momento tienes el boton resolver si sabes la palabra.");
			}
		});

		// Listener de acerca de

		acercaDe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Desarrollada por Marc y Camila");
			}
		});

		// Listener para cerrar la aplicación

		salir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});

		// Listener confirmación de pista y ejecución de esta misma

		pista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/* comprueba la cantidad de pistas y pregunta si quieres utilizar alguna. */
				if (JOptionPane.showConfirmDialog(contentPane,
						"Estas seguro de perder una pista? (pistas restantes " + juego.getLifeNumber() + ")") == 0) {
					juego.ejecutarPista(array);
					textPalabra.setText(juego.getPalabraSecretaMostrar());

					if (juego.getLifeNumber() != 0) {
						pistas.setIcon(new ImageIcon(new ImageIcon("img/./pista" + juego.getLifeNumber() + ".png")
								.getImage().getScaledInstance(350, 55, Image.SCALE_SMOOTH)));
					} else {
						pistas.setIcon(new ImageIcon(new ImageIcon("img/./sinpistas.png").getImage()
								.getScaledInstance(350, 55, Image.SCALE_SMOOTH)));
						pista.setEnabled(false);
					}

					fin();
				}
			}
		});

		// Listener para resolver la palabra secreta

		resolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				juego.intentoResolver(JOptionPane.showInputDialog("La palabra es: "));
				textPalabra.setText(juego.getPalabraSecretaMostrar()); 

				colgado.setIcon(new ImageIcon(new ImageIcon(juego.getImagenes()[juego.getIntents()]).getImage()
						.getScaledInstance(310, 525, Image.SCALE_SMOOTH)));
				fin();
			}
		});

		addBotones();
	}

	// METODOS

	// Metodo para añadir los botones a la interfaz (teclado)

	private void addBotones() {
		//Creamos dinamicamente los botones, y se agregan al contenedor 'botones' 
		int aux = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != 14) {
				array[i] = new JButton("" + (char) (65 + aux));
				aux++;
			} else {
				array[i] = new JButton("Ñ");
			}

			//se les asigna una letra del alfabeto o la letra "Ñ", dependiendo de la posición del índice
			array[i].setEnabled(false);

			// se agrega un ActionListener a cada botón

			array[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton) e.getSource();
					btn.setEnabled(false);

					if (juego.estaLetra(btn.getText().charAt(0))) {
						textPalabra.setText(juego.getPalabraSecretaMostrar());
					}
					colgado.setIcon(new ImageIcon(new ImageIcon(juego.getImagenes()[juego.getIntents()]).getImage()
							.getScaledInstance(310, 525, Image.SCALE_SMOOTH)));

					fin();
				}
			});

			botones.add(array[i]);
		}
	}


	// Método para iniciar el juego con variables default

	public void iniciarJuego() {
		getNumIntentos().setText("Intentos: " + juego.getIntents());
		textPalabra.setText(juego.getPalabraSecretaMostrar());
		resolver.setEnabled(true);
		pista.setEnabled(true);

		pistas.setIcon(new ImageIcon(
				new ImageIcon("img/./pista5.png").getImage().getScaledInstance(350, 55, Image.SCALE_SMOOTH)));
		colgado.setIcon(null);

		for (int i = 0; i < array.length; i++) {
			array[i].setEnabled(true);
		}

	}

	// Método para cuando finaliza el juego

	private void fin() {
		getNumIntentos().setText("Intentos: " + juego.getIntents());
		if (juego.palabraSecretaDesvelada()) {
			JOptionPane.showMessageDialog(null, "Has ganado!!");
			deshabilitarBotones();
		} else if (juego.getIntents() == juego.getIntentsMax()) {
			JOptionPane.showMessageDialog(null, "Has perdido!!");
			deshabilitarBotones();
		}
	}

	// Método para deshabilitar los botones que no puedes volver a usar

	private void deshabilitarBotones() {
		resolver.setEnabled(false);
		pista.setEnabled(false);
		for (int i = 0; i < array.length; i++) {
			array[i].setEnabled(false);
		}
	}

	// GETTERS Y SETTERS
	// Getters y Setters

	public Ahorcado getJuego() {
		return juego;
	}

	public void setJuego(Ahorcado juego) {
		this.juego = juego;
	}

	public JButton getInicio() {
		return inicio;
	}

	public JMenuItem getNewGame() {
		return newGame;
	}

	public JMenuItem getAddDoc() {
		return addDoc;
	}

	public JMenuItem getNumIntentos() {
		return numIntentos;
	}

	public void setNumIntentos(JMenuItem numIntentos) {
		this.numIntentos = numIntentos;
	}
}