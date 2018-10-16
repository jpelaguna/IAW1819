package es.cj.bucles.datos;

import java.util.Scanner;

public class Ejercicio01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Pedir 10 números. Mostrar la media de los positivos, media de negativos y
		// cantidad de ceros.

		double sumaPositivos = 0, sumaNegativos = 0;
		int contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Nº: ");
			double numero = sc.nextDouble();

			if (numero > 0) {
				// sumaPositivos = sumaPositivos + numero;
				sumaPositivos += numero;
				contadorPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}

		}

		System.out.println("Media positivos: " + (sumaPositivos / contadorPositivos));
		System.out.println("Media negativos: " + (sumaNegativos / contadorNegativos));
		System.out.println("Contador de ceros: " + contadorCeros);

		sc.close();
	}

}
