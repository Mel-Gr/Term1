package Cadenas;

import java.util.Scanner;

public class P2_NegrilloBongera_Carolina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenida");
		System.out.println("Introduce el texto");
		String texto = sc.nextLine();
		String textoSinAc = texto.toLowerCase().replace('á', 'a').replace('é', 'e').replace('í', 'i').replace('ó', 'o').replace('ú', 'u');
		boolean letra = false;
		int contPalabra = 0;
		int contLetra = 0;
		float contPalabraLarga = 0;
		int letrasPalabraMasLarga = 0;
		String palabraMasLarg ="";
		String letrasNo="";
		int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
		String inverso ="";
		int contChar = 0;
		int contDigit = 0;
		String ascii ="";
		
		for (int i = texto.length()-1; i >= 0; i--) {			
			if (Character.isLetterOrDigit(texto.charAt(i)) && i > 0) {
				letra = true;
				contLetra++;
				if (contLetra == 7) {
					contPalabraLarga++;
				}
				if (contLetra > letrasPalabraMasLarga) {
					letrasPalabraMasLarga = contLetra;
					palabraMasLarg = texto.substring(i,letrasPalabraMasLarga+i);
				}
				if (contPalabra%2==0) {
					ascii = texto.charAt(i)+ascii;
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
				if (contLetra > letrasPalabraMasLarga) {
					letrasPalabraMasLarga = contLetra;
					palabraMasLarg = texto.substring(i,letrasPalabraMasLarga+i);
				}
				if (contPalabra%2!=0) {
					ascii = texto.charAt(i)+ascii;
				}
			}
			
			switch (textoSinAc.charAt(i)) {
			case 'a':
				contA++;
				break;
			case 'e':
				contE++;
				break;
			case 'i':
				contI++;
				break;
			case 'o':
				contO++;
				break;
			case 'u':
				contU++;
				break;
			}
			inverso += texto.charAt(i);
			
			if (Character.isAlphabetic(texto.charAt(i))) {
				contChar++;
			} else if (Character.isDigit(texto.charAt(i))) {
				contDigit++;
			}
		}
		for(int i='a';i<='z'+1;i++) {
			//Supongo que no era necesario, pero he añadido esto para que cuente también si está la ñ o no.
			//He pensado que con que i valga ñ una vez, lo comprueba, y ha sido la forma más directa que he visto.
			if (i=='z'+1) {
				i='ñ';
			}
			boolean stop=false;
			for (int j=0; j<textoSinAc.length() && stop==false;j++) {
	    		if (textoSinAc.charAt(j) == ((char)i) && stop==false) {
	    			stop=true;
	    			}
    		}
			if (stop==false) {
				letrasNo = letrasNo+((char)i)+" ";
    		}
	    }
		
		System.out.println("El texto contiene " + contPalabra + " palabras");
		
		System.out.println("El porcentaje de palabras con más de 6 caracteres es: " + Math.round((contPalabraLarga*100/contPalabra)*100.0)/100.0 + "%");
		
		System.out.println("La palabra mas larga es " + palabraMasLarg + ", tiene: " + letrasPalabraMasLarga + " letras");
		
		if (textoSinAc.contains("programacion")) {
			System.out.println("Sí aparece la palabra programación");
		}else {
			System.out.println("NO aparece la palabra programación");
		}
		
		System.out.println("No aparecen las siguientes letras del abecedario: " + letrasNo);
		
		System.out.println("La vocal a aparece "+ contA + " veces");
		System.out.println("La vocal e aparece "+ contE + " veces");
		System.out.println("La vocal i aparece "+ contI + " veces");
		System.out.println("La vocal o aparece "+ contO + " veces");
		System.out.println("La vocal u aparece "+ contU + " veces");
		
		System.out.println("El texto al revés es: " + inverso);
		
		System.out.println("El texto solo con e: " + texto.replaceAll("[aiouáíóú]", "e").replaceAll("[AIOUÁÍÓÚ]", "E"));
		
		System.out.println("El texto cambiando vocales: " + texto.replaceAll("[eéEÉ]", "3").replaceAll("[iíIÍ]", "1").replaceAll("[oóOÓ]", "0"));
		
		System.out.println("Hay " + (contChar+contDigit) + " caracteres, " + contChar + " son letras y " + contDigit + " son números");
		
		System.out.print("ASCII: ");
		for (int i = 0; i < ascii.length(); i++) {
			System.out.print((int)ascii.charAt(i)+"-");
		}

	}

}
