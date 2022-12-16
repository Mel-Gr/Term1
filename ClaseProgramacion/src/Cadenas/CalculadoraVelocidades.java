package Cadenas;

import java.util.Scanner;

public class CalculadoraVelocidades {
	
	private static int pedir (String a) {
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		return sc.nextInt();
	}
	private static int velKmHora (int dist, int tiempo) {
		return ((dist/1000)/(tiempo/60));
	}
	private static int velMS (int dist, int tiempo) {
		return dist / (tiempo*60);
	}
	private static String medio (int velKm) {
		if (velKm<100) {
			return ("Ha ido en coche");
		} else if (velKm < 300) {
			return ("Ha ido en tren");
		} else {
			return ("Ha ido en avion");
		}
	}
	private static int horasRestantes (int kmRestantes, int velKm) {
		return kmRestantes/velKm;
	}
	private static double consumo (int dist) {
		return (5.1732*(dist/1000) / 100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pedir distancia recorrida en metros; el tiempo empleado en minutos. Mostrar velocidad en Km/h y en m/s. Mostrar en qué ha ido: <100km/h coche <300Km/h tren, si no, avión. Cuanto tiempo tardo en recorrer X km a la velocidad que nos ha salido. SOLO si he ido en coche cuanta gasolina si cada 100km consume 5,1732.
		int dist = pedir ("Introduce la distancia en metros");
		int tiempo = pedir ("Introduce el tiempo en minutos");
		System.out.println(velKmHora (dist, tiempo) + "Km/h");
		System.out.println(velMS(dist,tiempo) + "m/s");
		System.out.println(medio (velKmHora (dist, tiempo)));
		int kmRestantes = pedir ("¿cuantos km quedan aun?");
		System.out.println("Quedan " + horasRestantes (kmRestantes, velKmHora (dist, tiempo)) + " horas");
		System.out.println("Ha consumido " + consumo(dist) + "l");

	}

}
