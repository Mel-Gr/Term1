package practica5;

import java.util.Random;

public class Ejercicio5 {

	/*
	 *  Programa que llama a la funcion palabrasEnFrase(String s),la cual devuelve
	 *  el n�mero de palabras que hay en la frase que se le pasa como par�metro
	 */
	
	public static void main(String[] args) {
		String str = "Hola que tal estamos";
		int res = palabrasEnFrase(str);
		System.out.println("En la frase hay este numero de palabras: " + res);
	}

	public static int palabrasEnFrase(String s) {
		int i = 0;
		int r = 0;
		while(i < s.length()) {
			if(s.charAt(i) == ' ') {
				r = r + 1;
			}
			i++;
		}
		return r+1;
	}

	

}
