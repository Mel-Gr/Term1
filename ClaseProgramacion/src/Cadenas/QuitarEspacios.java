package Cadenas;

import java.util.Scanner;

public class QuitarEspacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Quitar los espacios de unn texto
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto");
		String texto = sc.nextLine();
		System.out.println(texto.replace(" ", ""));

	}

}
