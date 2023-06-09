package ahorcado_main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

import view.FormularioInicio;

public class App {

	public static Hashtable<String, ArrayList<String>> palabrasDoc;

	public static void main(String[] args) {

		// Creamos un hashtable con las palabras a utilizar.
		palabrasDoc = new Hashtable<String, ArrayList<String>>();
		palabrasDoc.put("Superhéroes", new ArrayList<String>(Arrays.asList("spiderman", "hulk", "groot")));
		palabrasDoc.put("Personajes de Videjuegos", new ArrayList<String>(Arrays.asList("mario", "pikachu", "sonic")));
		palabrasDoc.put("Lenguas", new ArrayList<String>(Arrays.asList("ingles", "español", "catalan")));
		palabrasDoc.put("Peliculas", new ArrayList<String>(Arrays.asList("cars", "up", "scream")));
		palabrasDoc.put("Deportes", new ArrayList<String>(Arrays.asList("tenis", "baloncesto", "balonmano")));

		// Creamos las ventanas

		try {
			FormularioInicio form = new FormularioInicio();
			form.setVisible(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
