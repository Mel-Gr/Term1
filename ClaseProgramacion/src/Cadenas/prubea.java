package Cadenas;

import java.util.Scanner;

public class prubea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		for (int i= 0; i<3; i++) {
//			System.out.println("Mete algo");
//			if (sc.hasNextInt()) {
//				System.out.println(sc.nextInt());
//			}else {
//				System.out.println("Paso por aquí");
//				System.out.println(sc.nextLine());
//			}
//		}
//		int a = 'a';
//		int e = 'e';
//		int i = 0;
//		int o = 'o';
//		int u = 'u';
//		System.out.println(a);
//		System.out.println(e);
//		System.out.println(i);
//		System.out.println(o);
//		System.out.println(u);
//		int n = '0';
//		
//		System.out.println(Character.isAlphabetic(n));
		
		//contChar = texto.replace(" ", "").replace(":", "").replace(",", "").replace(".", "").replace(";", "").replace("-", "").replace("'", "").replace("¡", "").replace("!", "").replace("¿", "").replace("?", "").replace(")", "").replace("(", "").replace("$", "").replace("€", "").replace("&", "").replace("_", "").replace("*", "").replace("%", "").length();
		
	//	.replace("0", "").replace("1", "").replace("2", "").replace("3", "").replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "")
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenida");
		System.out.println("Introduce el texto");
		boolean letra = false;
		int contPalabra = 0;
		int contLetra = 0;
		int contPalabraLarga = 0;
		int palabraMasLarga = 0;
		String texto = sc.nextLine();
		String masLarg ="";
		String ascii="";
//		System.out.println(texto.indexOf(" "));
//		System.out.println(texto.substring(texto.lastIndexOf(" ")+1));
//		//String texto1 = texto.substring(0, (texto.lastIndexOf(" ")));
//		String texto1=texto;
//		System.out.println(texto1);
//		System.out.println(texto1.lastIndexOf(" "));
//		System.out.println(texto1.substring(texto1.lastIndexOf(" ")+1));
//		String texto2 = texto1.substring(0, (texto1.lastIndexOf(" ")));
//		System.out.println(texto.substring(0, (texto.lastIndexOf(" "))).substring(0,(texto.substring(0, (texto.lastIndexOf(" "))).lastIndexOf(" "))).substring(texto.substring(0, (texto.lastIndexOf(" "))).substring(0, (texto.substring(0, (texto.lastIndexOf(" "))).lastIndexOf(" "))).lastIndexOf(" ")+1));
//		while (texto1.length()>2) {
//			texto1 = texto1.substring(0, (texto1.lastIndexOf(" ")));
//			System.out.println(texto1);
//		}
		for (int i = texto.length()-1; i >= 0; i--) {
			
			if (Character.isLetterOrDigit(texto.charAt(i)) && i > 0) {
				letra = true;
				contLetra++;
				if (contLetra == 7) {
					contPalabraLarga++;
				}
				if (contLetra > palabraMasLarga) {
					palabraMasLarga = contLetra;
					masLarg = texto.substring(i,palabraMasLarga+i);
				}

				if (contPalabra%2==0) {
					ascii = texto.charAt(i)+ascii;
					System.out.println("ascii: " + ascii);
				}
			} else if (!Character.isLetterOrDigit(texto.charAt(i)) && letra) {
				contPalabra++;
				letra =  false;
				contLetra = 0;
			}else if (Character.isLetterOrDigit(texto.charAt(i)) && i == 0) {
				contPalabra++;
				contLetra++;
				if (contLetra == 7) {
					contPalabraLarga++;
				}
				if (contLetra > palabraMasLarga) {
					palabraMasLarga = contLetra;
					masLarg = texto.substring(i,palabraMasLarga+i);
				}
				if (contPalabra%2!=0) {
					ascii = texto.charAt(i)+ascii;
					System.out.println("ascii: " + ascii);
				}
			}

		}    
	    
//		String textoSinAc = texto.replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u');
//		String letrasSi="";
//		String letrasNo="";
//		for(int j='a';j<='z';j++) {
//			int stop=0;
//			for (int i=0; i<textoSinAc.length();i++) {
//	    		if (textoSinAc.charAt(i) == ((char)j) && stop==0) {
//	    			letrasSi = letrasSi + ((char)j);
//	    			stop++;
//	    		} 	    			
//    		}
//			if (stop==0) {
//				letrasNo = letrasNo+((char)j);
//    		}
//	    }
//		
//		System.out.println("las que si " + letrasSi);
//		System.out.println("las que no " + letrasNo);
		
		System.out.println("num palabras " + contPalabra);
		
		System.out.println("num palabras con + 6: " + contPalabraLarga);
		
		System.out.println("La palabra mas larga tiene: " + palabraMasLarga);
		
		System.out.println(masLarg);
	}
	
}
