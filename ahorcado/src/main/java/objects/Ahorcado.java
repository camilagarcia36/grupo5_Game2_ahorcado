package objects;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JButton;

public class Ahorcado {

	// Atributos

	private ArrayList<String> palabras;
	private Hashtable<String, ArrayList<String>> palabrasDoc = new Hashtable<String, ArrayList<String>>();
	private int lifeNumber = 5;
	private String palabraSecreta;
	private char[] palabraSecretaMostrar;
	private int intents = 0;
	private int intentsMax;

	private Hashtable<Integer, String[]> imagenes = new Hashtable<Integer, String[]>();

	public Ahorcado(int intents, String opcion, Hashtable<String, ArrayList<String>> palabrasDoc) {
		this.palabrasDoc = palabrasDoc;
		this.intentsMax = intents;
		setPalabras(opcion);
		setPalabraSecreta();
		setPalabraSecretaMostrar();

		/*
		 * el primer elemento del hashtable es una clave de 10 y un array de 11 rutas de
		 * inmagenes, el primer elemento del array es una cadena vacía porque el primer
		 * intento no tiene imagen asociada. Las siguientes diez cadenas de caracteres
		 * contienen rutas a las img.
		 */

		imagenes.put(10,
				new String[] { "", "img/./intento1.png", "img/./intento2.png", "img/./intento3.png",
						"img/./intento4.png", "img/./intento5.png", "img/./intento6.png", "img/./intento7.png",
						"img/./intento8.png", "img/./intento9.png", "img/./intento10.png" });
		imagenes.put(8,
				new String[] { "", "img/./intento3.png", "img/./intento4.png", "img/./intento5.png",
						"img/./intento6.png", "img/./intento7.png", "img/./intento8.png", "img/./intento9.png",
						"img/./intento10.png" });
		imagenes.put(6, new String[] { "", "img/./intento5.png", "img/./intento6.png", "img/./intento7.png",
				"img/./intento8.png", "img/./intento9.png", "img/./intento10.png" });
	}

	// GETTERS Y SETTERS
	public ArrayList<String> getPalabras() {
		return palabras;
	}

	public int getLifeNumber() {
		return lifeNumber;
	}

	// establecemos el valor del atributo palabras, recibe como parámetro un String
	// y utiliza la tabla hash 'palabrasDoc' para obtener el valor
	// correspondiente al parametro y asignarlo al atributo palabras.

	public void setPalabras(String opcion) {
		this.palabras = palabrasDoc.get(opcion);
	}

	public String getPalabraSecreta() {
		return palabraSecreta;
	}

	// genera una palabra secreta aleatoria a partir de la lista de palabras
	// almacenadas en el atributo palabras y signa el valor obtenido al atributo
	// palabraSecreta.
	public void setPalabraSecreta() {
		int numero = (int) (Math.random() * palabras.size());

		palabraSecreta = palabras.get(numero).toUpperCase();
	}

	/*
	 * devuelve un array de las rutas de las imágenes que se utilizan para
	 * representar los fallosen el juego. El array lo obtenemos a partir del
	 * hashtable imagenes, utilizando el valor del atributo intentsMax como clave.
	 */
	public String[] getImagenes() {
		return imagenes.get((Integer) intentsMax);
	}

	public int getIntents() {
		return intents;
	}

	/*
	 * devuelve un String con la palabra secreta actual, mostrando las letras
	 * adivinadas y las que faltan por adivinar
	 */

	public String getPalabraSecretaMostrar() {
		String str = "";

		for (int i = 0; i < palabraSecretaMostrar.length; i++) {
			str += palabraSecretaMostrar[i] + " ";
		}
		return str;
	}

	// Recorre la longitud de la palabra y muestra guiones en funcion de la
	// longitud.
	public void setPalabraSecretaMostrar() {
		char[] str = new char[palabraSecreta.length()];

		for (int i = 0; i < palabraSecreta.length(); i++) {
			str[i] = '_';
		}
		this.palabraSecretaMostrar = str;
	}

	public Hashtable<String, ArrayList<String>> getPalabrasDoc() {
		return palabrasDoc;
	}

	public int getIntentsMax() {
		return intentsMax;
	}

	// METODOS

	// Método para comprobar si existe la letra y sobrescribe la palabra secreta

	public boolean estaLetra(char letra) {
		boolean letraEsta = false;

		// se utiliza para devolver el carácter que se encuentra en la posición
		// especificada de la palabra secreta.
		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (palabraSecreta.charAt(i) == letra) {
				palabraSecretaMostrar[i] = letra;
				letraEsta = true;
			}
		}

		if (!letraEsta) {
			intents++;
		}

		return letraEsta;
	}

	// Método para comprobar si se ha resuelto la palabra, recorre la palabra y
	// comprueba cuantos guiones hay.
	public boolean palabraSecretaDesvelada() {
		boolean guiones = true;
		for (int i = 0; i < palabraSecretaMostrar.length && guiones; i++) {
			if (palabraSecretaMostrar[i] == '_') {
				guiones = false;
			}
		}
		return guiones;
	}

	// Método para intentar resolver la palabra

	public void intentoResolver(String showInputDialog) {
		if (showInputDialog.equalsIgnoreCase(palabraSecreta)) {
			for (int i = 0; i < palabraSecretaMostrar.length; i++) {
				palabraSecretaMostrar[i] = palabraSecreta.charAt(i);
			}
		} else {
			intents++;
		}
	}

	// Método para que te proporcione una pista que será una letra de la palabra
	// secreta

	public void ejecutarPista(JButton[] array) {
		lifeNumber--;
		boolean pistaValida;
		char letra;

		do {
			// selecciona una letra aleatoria de la palabra secreta mediante el uso de la
			// clase Math y un método para generar números aleatorios.
			pistaValida = true;
			letra = palabraSecreta.charAt((int) (Math.random() * palabraSecreta.length()));

			// se usa un bucle para verificar si la letra ya está presente en la palabra
			// secreta

			for (int i = 0; i < palabraSecretaMostrar.length && pistaValida; i++) {
				if (palabraSecretaMostrar[i] == letra) {
					pistaValida = false;
				}
			}
			/*
			 * verifica si la letra seleccionada no ha sido adivinada aún,si la letra ya
			 * está en la palabra entonces se selecciona una nueva letra aleatoria.
			 * una vez que se ha seleccionado una letra valida,se reemplaza la letra en la
			 * palabra secreta.
			 */

		} while (!pistaValida);

		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (palabraSecreta.charAt(i) == letra) {
				palabraSecretaMostrar[i] = letra;
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i].getText().charAt(0) == letra) {
				array[i].setEnabled(false);
			}
		}
		// Finalmente, el método deshabilita el botón de letra correspondiente a la
		// letra de la pista

	}
}