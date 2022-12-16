package practica5;

import java.util.Scanner;

public class Ejercicio2 {

	
	/* Programa que pide un numero hasta que introduce 0.
	 * El programa passr� de kilogramos a gramos
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kg;
		
		Scanner in = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduce un numero");
		numero = in.nextInt();
		while (numero != 0) {
		
		System.out.println("Introduce los kg");
		kg = in.nextDouble();

		double gramos = kg * 1000;
		System.out.println(gramos + " Gramos");
		
		System.out.println("Introduce otro numero");
		numero = in.nextInt();
		}
	}
	

}
