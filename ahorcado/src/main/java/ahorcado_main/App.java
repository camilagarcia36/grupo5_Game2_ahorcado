package ahorcado_main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import objects.Ahorcado;
import view.FormularioInicio;
import view.InterfazJuego;

/**
 * Hello world!
 *
 */
public class App 
{
	private static FormularioInicio form;
	private static InterfazJuego interfaz; 
	
    public static void main( String[] args )
    {
    	
    	//Creamos un hashtable con las palabras a utilizar.  
    	Hashtable<String, ArrayList<String>> palabrasDoc = new Hashtable<String, ArrayList<String>>();
		palabrasDoc.put("Superhéroes", new ArrayList<String>(Arrays.asList("spiderman", "hulk", "groot")));
		palabrasDoc.put("Personajes de Videjuegos", new ArrayList<String>(Arrays.asList("mario", "pikachu", "sonic")));
		palabrasDoc.put("Lenguas", new ArrayList<String>(Arrays.asList("ingles", "español", "catalan")));
		palabrasDoc.put("Peliculas", new ArrayList<String>(Arrays.asList("jurassic park", "star wars", "scream")));
		palabrasDoc.put("Deportes", new ArrayList<String>(Arrays.asList("tenis", "baloncesto", "balonmano")));
		
		
		
		//
    
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form = new FormularioInicio();

					form.getBtn().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							/*
							 * Primero, se oculta la ventana de opciones de juego ("form") y se muestra la
							 * ventana del juego ("interfaz")
							 */
							form.setVisible(false);
							interfaz.setVisible(true);

							int intentos;

							/*
							 * se crea una instancia de la clase "Ahorcado", que es la clase que controla la
							 * lógica del juego, y se la pasa a la ventana del juego para que se pueda
							 * iniciar el juego.
							 */
							if (form.getFacil().isSelected()) {
								intentos = 10; // Dificultad facil
							} else if (form.getNormal().isSelected()) {
								intentos = 8; // Dificultad normal
							} else {
								intentos = 6; // Dificultad avanzada
							}

							// Seteamos e iniciamos juego

							interfaz.setJuego(
									new Ahorcado(intentos, (String) form.getComboBox().getSelectedItem(), palabrasDoc));
							interfaz.iniciarJuego();
						}
					});

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz = new InterfazJuego();

					// Evento botón iniciar juego

					interfaz.getInicio().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							form.setVisible(true);
							interfaz.setVisible(false);

						}
					});

					// Evento botón iniciar desde menu

					interfaz.getNewGame().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {

							form.setVisible(true);
							interfaz.setVisible(false);

						}
					});

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
