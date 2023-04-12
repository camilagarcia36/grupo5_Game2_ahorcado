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
		private int contador;
		private Hashtable<Integer, String[]> imagenes = new Hashtable<Integer, String[]>();

		
		public Ahorcado(int intents, String opcion, Hashtable<String, ArrayList<String>> palabrasDoc) {
			this.palabrasDoc = palabrasDoc;
			this.intentsMax = intents;
			setPalabras(opcion);
			setPalabraSecreta();
			setPalabraSecretaMostrar();
			imagenes.put(10,
					new String[] { "", "img/./intento1.png", "img/./intento2.png", "img/./intento3.png", "img/./intento4.png",
							"img/./intento5.png", "img/./intento6.png", "img/./intento7.png", "img/./intento8.png",
							"img/./intento9.png", "img/./intento10.png" });
			imagenes.put(8, new String[] { "", "img/./intento3.png", "img/./intento4.png", "img/./intento5.png", "img/./intento6.png",
					"img/./intento7.png", "img/./intento8.png", "img/./intento9.png", "img/./intento10.png" });
			imagenes.put(6, new String[] { "", "img/./intento5.png", "img/./intento6.png", "img/./intento7.png", "img/./intento8.png",
					"img/./intento9.png", "img/./intento10.png" });
		}
		
		
		// GETTERS Y SETTERS

		public int getContador() {
			return contador;
		}

		public void setContador(int contador) {
			this.contador = contador;
		}

		public int getLifeNumber() {
			return lifeNumber;
		}

		public ArrayList<String> getPalabras() {
			return palabras;
		}

		public void setPalabras(String opcion) {
			this.palabras = palabrasDoc.get(opcion);
		}

		public String getPalabraSecreta() {
			return palabraSecreta;
		}

		public void setPalabraSecreta() {
			int numero = (int) (Math.random() * palabras.size());

			palabraSecreta = palabras.get(numero).toUpperCase();
		}

		public String[] getImagenes() {
			return imagenes.get((Integer) intentsMax);
		}

		public int getIntents() {
			return intents;
		}

		public String getPalabraSecretaMostrar() {
			String str = "";

			for (int i = 0; i < palabraSecretaMostrar.length; i++) {
				str += palabraSecretaMostrar[i] + " ";
			}
			return str;
		}

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
		
		
		//METODOS
		
		// Método para comprobar si existe la letra y sobrescribe la palabra secreta

		public boolean estaLetra(char letra) {
			boolean letraEsta = false;

			for (int i = 0; i < palabraSecreta.length(); i++) {
				if (palabraSecreta.charAt(i) == letra) {
					palabraSecretaMostrar[i] = letra;
					letraEsta = true;
				}
			}

			contador++;

			if (!letraEsta) {
				intents++;
			}

			return letraEsta;
		}

		// Método para comprobar si se ha resuelto la palabra

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
				pistaValida = true;
				letra = palabraSecreta.charAt((int) (Math.random() * palabraSecreta.length()));

				for (int i = 0; i < palabraSecretaMostrar.length && pistaValida; i++) {
					if (palabraSecretaMostrar[i] == letra) {
						pistaValida = false;
					}
				}
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
		}
	}