package Cadenas;

public class cambioIntCharString {
	public static void main(String[] args) {
		int dig = 1;
		char letra = '7';
		String cadena = "1234";
		//int a char
		Character.forDigit(dig,10);
		
		//int a String
		String.valueOf(dig);
		
		//char a int
		Character.getNumericValue(letra);
		
		//char a String
		String.valueOf(letra);
		
		//String a int
		Integer.parseInt(cadena);
		
		//String a char
		cadena.charAt(0);
	}
}
