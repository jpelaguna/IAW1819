package es.cj.ejerciciossemanales;

import java.util.Random;

public class Ejercicio05 {

	// Rellena una tabla de 10 números (valores aleatorios del 1 al 6). Reliza una
	// función que devuelva el número que más se repite.

	private static int[] tabla;

	public static void main(String[] args) {

		iniTabla();
		ordenarTabla();

	}

	private static void iniTabla() {
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = new Random().nextInt(10);
		}

	private static void ordenarTabla() {
}
	if (repetidos[i] > mayor)
			mayor = repetidos [i];
	}