package ahorcado_main;

import java.awt.EventQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;


import view.FormularioInicio;

/**
 * Hello world!
 *
 */
public class App 
{
	private static FormularioInicio form;
	
    public static void main( String[] args )
    {
    	
    	//Creamos un hashtable con las palabras a utilizar.  
    	Hashtable<String, ArrayList<String>> palabrasDoc = new Hashtable<String, ArrayList<String>>();
		palabrasDoc.put("Superhéroes", new ArrayList<String>(Arrays.asList("spiderman", "hulk", "groot")));

		palabrasDoc.put("Deportes", new ArrayList<String>(Arrays.asList("tenis", "baloncesto", "balomano")));
		
		
		
		//
    
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form = new FormularioInicio();

			

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
