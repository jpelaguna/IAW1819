package es.cj.bucles.datos;

import java.util.Scanner;

public class Tarea01 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Programa que muestre y calcule el producto de los n primeros n�meros impares.
		// Nota: si metes 10, multiplica los 10 primeros n�meros impares.

		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i += 2) {

			resultado = numeros * i;

			System.out.println(resultado);

		}

		sc.close();

	}

}
