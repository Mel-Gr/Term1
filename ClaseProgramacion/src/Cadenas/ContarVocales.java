package Cadenas;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Contar cuantas vocales hay en un texto
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto");
		String texto = sc.nextLine();
		byte cont = 0;
		for (int i = 0; i < texto.length() ; i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
				cont++;
			}
		} 
		System.out.println(cont);

	}

}
