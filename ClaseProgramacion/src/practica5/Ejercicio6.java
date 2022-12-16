package practica5;

public class Ejercicio6 {

	
	
	/*
	 * Programa que llama a la funci�n pintar(), la cual muestra por pantalla esto:
	 * 1******

	   12*****

       123****

       1234***

       12345**

       123456*

       1234567
       
       Hay 3 errores en el codigo
	 */
	public static void main(String[] args)
	{
	   pintar();
	}
	
	static void pintar(){

	int i,j,k;

	for (i = 1; i <= 7; i++) {
		
	  for (j = 1; j <= i; ++j) {
		  System.out.print(j);
	  }
	      
	  for (k = 6 ; k >= i; k--) {
	     System.out.print("*");
	  }

	  System.out.println("");
	  }
	}

}

