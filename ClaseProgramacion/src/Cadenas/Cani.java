package Cadenas;

import java.util.Scanner;

public class Cani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto");
		String texto = sc.nextLine();
		for (int i = 0; i < texto.length() ; i++) {
			if (i % 2 == 0) {
				System.out.print(Character.toUpperCase(texto.charAt(i))); 
			} else {
				System.out.print(Character.toLowerCase(texto.charAt(i)));
			}
		} 

	}

}
