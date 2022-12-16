package practica5;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*
	 * Programa que, recibiendo dos strings de entrada y el genero del beb�, devuelve el nombre recomendado para el beb�
	 * El nombre se calcula cogiendo la mitad de los nombres de los padres, y concatenandolos en diferente orden, segun el hijo.
	 * Ejemplo:
	 * Daneille y John con hija genera JODANI
	 * Danielle y John con hijo generan DANIJO
	 */
	// Hay 2 errores
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		 System.out.print("Nombre del primer familiar ");
		 String name1 = s.nextLine();
		 System.out.print("Nombre del segundo familiar ");
		 String name2 = s.nextLine();
		 System.out.print("Sexo del beb�? M o F ");
		 String gender = s.nextLine();

		 String mitad1 = sacarMitadNombre(name1);
		 String mitad2 = sacarMitadNombre(name2);
		 String nombre = "";
		 if(gender.toLowerCase().startsWith("m")){
		 nombre = mitad2 + mitad1;
		 } else {
		 nombre = mitad1 + mitad2;
		 }
		 System.out.println("Nombre sugerido: " + nombre.toUpperCase()); 

	}
	
	public static String sacarMitadNombre(String nombre) {
		 int indiceMedio = (nombre.length() + 1) / 2;
		 String mitad = nombre.substring(0, indiceMedio);
		 return mitad;
		 }

}
