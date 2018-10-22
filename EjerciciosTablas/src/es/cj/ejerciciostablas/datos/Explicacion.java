package es.cj.ejerciciostablas.datos;

public class Explicacion {

	public static void main(String[] args) {

		// los corchetes muestran las dimensiones de la tabla. +3 suele ser inmanejable
		
		int tabla [][] = new int [10][10];
		
		// fila 2, columna 1 = 3
		
		tabla [2][1] = 3;
		
		// vector
		
		int tabla2 [] = {1,2,3};
		
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println(tabla2[i] + " ");
		}
		
		for (int i = 0; i < tabla2.length; i++) {
			tabla2[i] = tabla2[i] * tabla2[i];
		}
		
		System.out.println();
		
		String cadena [] = {"Hola", "que", "tal"};
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i] + " ");
		}
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
		
	}
		
}
