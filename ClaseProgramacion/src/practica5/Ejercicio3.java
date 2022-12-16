package practica5;

import java.util.Scanner;

public class Ejercicio3 {


	
	/*
	 *  Programa que pide por teclado una cadena y una letra, de manera que
	 *  elimina las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
		por pantalla.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena, letra, nuevaCadena="";
		int i, cont=0;
		System.out.printf("Introduzca una cadena: ");
		cadena = teclado.nextLine();
		System.out.printf("Introduzca una letra: ");
		letra = teclado.nextLine();
		for(i=0;i<cadena.length();i++){
				if((cadena.charAt(i)==letra.charAt(0))&&(cont!=3)){
					cont++;
				}
				else{
					nuevaCadena = nuevaCadena + cadena.charAt(i);
				}
		}
		System.out.println(nuevaCadena);
		}
}
