package Cadenas;

import java.util.Scanner;

public class gasolinera {
	
	private static double pDiesel = 1.897;
	private static double pGasolina = 1.667;
	private static double total = 0;
	private static double litros = 0;
	
	private static int pedirComb() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Gasolina \n2.Diesel");
		return sc.nextInt();
	}
	private static int pedir(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		return sc.nextInt();
	}
	private static double pedirD(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		return sc.nextDouble();
	}
	private static void llenar50() {
		litros = 50;
		int op = pedirComb();
		if (op == 1) {
			total = pGasolina * litros;
		} else if (op == 2) {
			total = pDiesel * litros;
		}
	}
	private static void repostar() {
		int op = pedirComb();
		if (op == 1) {
			total = pedir("Cuantos euros quieres echar?");
			litros = total/pGasolina;
		} else {
			total = pedir("Cuantos euros quieres echar?");
			litros = total/pDiesel;
		}
	}
	private static void cambPrecio() {
		int op = pedirComb();
		if (op == 1) {
			pGasolina = pedirD("A cuanto quieres poner el precio?");
		} else {
			pDiesel = pedirD("A cuanto quieres poner el precio?");
		}
	}
	private static void ticket(double totalF)  {
		totalF = total-(litros*0.20);
		System.out.println("El precio final es $" + totalF);
		System.out.println("El precio sin descuento es $" + total);
		System.out.println("Los litros echados son " + litros + "L");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		double totalF = 0;
		do {
			opcion = pedir ("1.Echar 50L \n2.Elegir cuantos $ echar \n3.Cambiar precios \n4.Finalizar");
			if (opcion == 1) {
				llenar50();
			} else if (opcion == 2) {
				repostar();
			} else if (opcion == 3) {
				cambPrecio();
			}
		} while (opcion!=4);
		ticket(totalF);
	}

}
