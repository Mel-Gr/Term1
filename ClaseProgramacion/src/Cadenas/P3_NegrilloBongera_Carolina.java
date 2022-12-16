package Cadenas;

import java.util.Scanner;

public class P3_NegrilloBongera_Carolina {
	
	private static int numero = 0;
	private static String cadenaNum = "";
	
	private static int pedir(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		while (!sc.hasNextInt()) {
			System.out.println("Por favor introduce un numero entero");
			sc.nextLine();
		}
		return sc.nextInt();
	}
	private static String pedirD () {
		int dig = pedir("Introduce un dígito");
		while (dig<0 || dig>9) {
			dig=pedir("Introduce un dígito");
		}
		return String.valueOf(dig);
	}
	private static boolean esCapicua(int num) {
		return true;
	}
	private static boolean esPrimo(int num) {
		for (int i=2 ; i<num ; i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;	
	}
	private static int siguientePrimo(int num) {
		int i = num+1;
		while (esPrimo(i)==false) {
			i++;
		}
		return i;
	}
	private static void digitos(String cad) {
		System.out.println(cad.length());
	}
	private static void voltea(String cad) {
		for (int i=cad.length()-1 ; i >= 0 ; i--) {
			System.out.print("El numero volteado es" + cad.charAt(i));
		}
	}
	private static void digitoN(String cad) {
		String dig = pedirD();
		for (int i=0 ; i < cad.length() ; i++) {

		}
	}
	private static void posicionDeDigito() {
		
	}
	private static void quitaPorDelante() {
		
	}
	private static void quitaPorDetras() {
		
	}
	private static void pegaPorDelante() {
		
	}
	private static void pegaPorDetras() {
		
	}
	private static void suma() {
		
	}
	private static void masApariciones() {
		
	}
	private static void siAparece(String cad) {
		String dig = pedirD();
		if (cad.contains(dig)) {
			System.out.println("Sí está");
		}else {
			System.out.println("No esta");
		}
	}
	private static void noAparecen() {
		
	}
	private static void cambiarNumero() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido!");
		numero = pedir ("Introduzca el numero: ");
		cadenaNum = String.valueOf(numero);
		int opcion = 0;
		do {
			opcion = pedir("\n1.Capicua \n2.Primo \n3.Siguiente primo \n4.Digitos \n5.Voltear \n6.Digito N \n7.Posicion de digito \n8.Quitar por delante \n9.Quitar por detras \n10.Pegar por delante \n11.Pegar por detras \n12.Sumar \n13.Mas apariciones \n14.Si digito aparece \n15.Digitos no aparecen \n16.Cambiar número \n0.Salir");
			switch (opcion) {
			case 1:
				if (esCapicua(numero) == false) {
					System.out.println("No es capicua");
				} else {
					System.out.println("Es capicua");
				}
				break;
			case 2:
				if (esPrimo(numero) == false) {
					System.out.println("No es primo");
				} else {
					System.out.println("Es primo");
				}
				break;
			case 3:
				System.out.println(siguientePrimo(numero));
				break;
			case 4:
				digitos(cadenaNum);
				break;
			case 5:
				voltea(cadenaNum);
				break;
			case 6:
				digitoN(cadenaNum);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				siAparece(cadenaNum);
				break;
			case 15:
				break;
			case 16:
				break;
			default:
				break;
			}
		} while (opcion != 0);
		System.out.println("Adios!");

	}

}
