package es.cj.ejerciciostablas.datos;

import java.util.Scanner;

public class Ejercicio01 {

	// Leer n números enteros, guardarlos en la tabla y mostrar la media de los
	// positivos,
	// media negativos y el número de ceros.

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cuantos = sc.nextInt();
		int numeros[] = new int[cuantos];
		int sumP, sumaN, contP, contN, contC;
		for (int i = 0; i < cuantos; i++) {
			System.out.println("Num " + i);
			numeros[i] = sc.nextInt();
			if (numeros[i] < 0)
				System.out.println("No válido");
				
			else
				System.out.println();
				
				
		}

	}
}
