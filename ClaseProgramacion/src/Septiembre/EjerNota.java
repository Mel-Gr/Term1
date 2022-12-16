package Septiembre;

import java.io.InputStream;
import java.util.Scanner;

public class EjerNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = Scanner(System.in);
		System.out.println ("Introduce tu nota: ");
		Float nota = teclado.nextFloat();
		if (nota < 0) {
			System.out.println("Nota no válida");
		}
		else if (nota < 5) {
			System.out.println("Estás suspenso");
		}
		else if (nota < 6) {
			System.out.println("Estás aprobado");
		}
		else if (nota < 7) {
			System.out.println("Tienes un bien");
		}
		else if (nota < 9) {
			System.out.println("Tienes un notable");
		}
		else if (nota < 10) {
			System.out.println("Tienes un sobresaliente");
		}
		else if (nota == 10) {
			System.out.println("Tienes una matrícula de honor");
		}
		else {
			System.out.println("Nota no válida");
		}

	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}

