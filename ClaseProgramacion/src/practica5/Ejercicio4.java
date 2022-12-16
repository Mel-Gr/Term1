package practica5;

import java.util.Random;

public class Ejercicio4 {

	
	/*
	 *  Programa que llama a la funcion sumarDigitos(int num), la cual devuelve la suma
	 *  de cada uno de los digitos del valor que se le pasa por parametro
	 */
	public static int sumarDigitos(int num) {
		int suma = 0;
		int aux;
		while(num > 9) {
			aux = num % 10;
			num /= 10;
			suma += aux;
		}
		suma += num;
		return suma;
	}
	
	public static void main(String[] args) {
		int res;
		res = sumarDigitos(1223);
		System.out.println("La suma de los digitos es: " + res);
	}
	
}