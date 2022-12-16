package Cadenas;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P4_NegrilloBongera_Carolina {
	
	static DecimalFormat decForm = new DecimalFormat("#,###,###.##");
	private static double saldo = 2000;
	private static double cambio = 1.08;
	private static byte opCuenta = 0;
	
	private static double pedir(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		double num = 0;
		do {
			while (!sc.hasNextDouble()) {
				System.out.println("Por favor introduce un numero entero");
				sc.nextLine();
			}
			num = sc.nextDouble();
			sc.nextLine();
			if (num < 0) {
				System.out.println("No puedes introducir numeros negativos");
			}
		}while (num<0);
		return num;
	}
	private static byte pedirB(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		byte num = 0;
		do {
			while (!sc.hasNextByte()) {
				System.out.println("Por favor introduce un numero entero");
				sc.nextLine();
			}
			num = sc.nextByte();
			sc.nextLine();
			if (num < 0) {
				System.out.println("No puedes introducir numeros negativos");
			}
		}while (num<0);
		return num;
	}
	private static void tipoCuenta() {
		do {
			opCuenta = pedirB ("1.Cuenta joven \n2.Cuenta sin nomina \n3.Cuenta nomina");
			if (opCuenta > 3 || opCuenta < 1) {
				System.out.println("Opción no válida");
			}
		}while (opCuenta > 3 || opCuenta < 1);
	}
	private static void cambioEuDol() {
		double camb = pedir("Indique el cambio $-€ (introduzca 0 si no desea modificar)");
		if (camb != 0) {
			cambio = camb;
		}
	}
	private static double sacar() {
		double cant = pedir("Introduce cuanto dinero quieres retirar");
		double antiguo = saldo;
		if (cant <= saldo) {
			saldo -= cant;
		}
		return antiguo;
	}
	private static double ingresar() {
		double cant = pedir("Introduce cuanto dinero quieres ingresar");
		double antiguo = saldo;
		saldo += cant;
		return antiguo;
	}
	private static double pagoTarjeta() {
		double cant = pedir("Introduce cuanto dinero quieres pagar con la tarjeta");
		double antiguo = saldo;
		if (opCuenta == 2) {
			saldo -= cant + (cant*0.03);
		}else if (opCuenta == 3) {
			if (cant >= (saldo*0.25)) {
				saldo -= cant - (cant*0.02);
			}else {
				saldo -= cant;
			}
		}
		return antiguo;
	}
	private static void consultarSaldo() {
		System.out.println("El saldo en euros es " + (decForm.format (saldo)) +"€");
		System.out.println("El saldo en dolares es " + (decForm.format (saldo*cambio)) + "$\n---------------------------- \n");
		
	}
	private static double consultarBeneficios() {
		return saldo*Math.pow(1.05, 5);
	}
	private static void ticket (double x) {
		System.out.println("El saldo antiguo es "+ (decForm.format (x)) +"€");
		System.out.println("El nuevo saldo es " + (decForm.format (saldo)) + "€");
		System.out.println("---------------------------- \n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido! \nIndique su tipo de cuenta:");
		tipoCuenta();
		cambioEuDol();
		byte opcion = 0;
		do {
			opcion = pedirB ("1.Sacar dinero \n2.Ingresar dinero \n3.Pago con tarjeta \n4.Consultar saldo \n5.Calcular beneficios \n6.Salir");
			switch (opcion) {
			case 1:
				ticket(sacar());
				break;
			case 2:
				ticket(ingresar());
				break;
			case 3:
				if (opCuenta==1) {
					System.out.println("No está disponible\n----------------------------\n");
				} else {
					ticket(pagoTarjeta());		
				}
				break;
			case 4:
				consultarSaldo();
				break;
			case 5:
				if (opCuenta==1) {
					System.out.println("Con su saldo actual de " + (decForm.format (saldo)) + " los beneficios en 5 años serian " + (decForm.format (consultarBeneficios())) + "\n----------------------------\n");
				} else {
					System.out.println("No está disponible\n----------------------------\n");				
				}
				break;
			default:
				break;
			}
		}while (opcion != 6);
		
	}
	

}
