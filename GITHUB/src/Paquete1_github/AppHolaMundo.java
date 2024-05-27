package Paquete1_github;

import java.util.Scanner;

/**
 * {@link Hola_mundo#muestra()}
 * @author jdepa
 * @version 27/05/2024
 */

public class AppHolaMundo {

	/**
	 * 
	 * @param args main del proyecto:
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);

		
		Hola_mundo alumno1 = new Hola_mundo("Jose", 1);
		Hola_mundo alumno2 = new Hola_mundo("Ana", 2);
		Hola_mundo alumno3 = new Hola_mundo("Marcos", 3);
		
		System.out.print(alumno1 +" " + alumno2 + " " + alumno3);
		
	}
}
