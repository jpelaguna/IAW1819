package es.cj.ejerciciossemanales01;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Se solicita leer un n�mero entero positivo y determinar si es un n�mero de 1,2,3 o 4 cifras.
		
		System.out.println("Introduzca un n�mero entero positivo: ");
		int num = sc.nextInt();
		
		if (num >= 0 && num < 10)
			System.out.println("El n�mero tiene 1 cifra.");
		else if (num >= 10 && num < 100)
			System.out.println("El n�mero tiene 2 cifras.");
		else if (num >= 100 && num < 1000)
			System.out.println("El n�mero tiene 3 cifras.");
		else if (num >= 1000 && num < 10000)
			System.out.println("El n�mero tiene 4 cifras.");
		else
			System.out.println("N�mero no v�lido.");

		
		sc.close();
	}

}
