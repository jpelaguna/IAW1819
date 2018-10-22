package es.cj.bucles.datos;

import java.util.Scanner;

// Programa que muestre y calcule el producto de los n primeros números impares.

public class Ejercicio03 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num = sc.nextInt();

		for (int i = 1; i <= num; i += 2) {
			num = num * i;
		}
		
		System.out.println("Producto total: " + num);
		sc.close();
	}
}